import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel implements Runnable{
    private static final int width = 1280;
    private static final int height = 960;
    Thread thread;
    keyInput keyboard = new keyInput();
    Player player = new Player(this, keyboard);
    public Panel() {
        this.setPreferredSize(new Dimension(width, height));
        this.setBackground(Color.BLACK);
        this.addKeyListener(keyboard);
        this.setFocusable(true);
    }
    public void runGame(){

    }
    public void gameThread(){
        thread = new Thread(this);
        thread.start();
    }

    public void paintComponent(Graphics render){
        super.paintComponent(render);

        Graphics2D rndr = (Graphics2D)render;
        player.draw(rndr);
        rndr.dispose();
    }

    public void update(){
        player.update();
    }

    @Override
    public void run() {
        double interval = 1000000000/60;
        double delta = 0.0;
        long lastTime = System.nanoTime();
        long currentTime;
        long timer = 0;
        long drawCount = 0;

        while(thread != null){
            currentTime = System.nanoTime();
            delta = delta + (currentTime - lastTime)/interval;
            timer = timer + (currentTime - lastTime);
            lastTime = currentTime;

            if(delta >= 1) {
                update();
                repaint();
                delta--;
            }

            if(timer >= 1000000000){
                timer = 0;
            }
        }
    }
}
