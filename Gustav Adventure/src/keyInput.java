import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class keyInput implements KeyListener {
    boolean up, down, left, right;
    static String state = "up";

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        char keyboard = e.getKeyChar();

        if(keyboard == 'w'){
            up = true;
            Player.chararacter(state);
        }
        if(keyboard == 'a'){
            left = true;
            state = "left";
        }
        if(keyboard == 's'){
            down = true;
            state = "down";
        }
        if(keyboard == 'd'){
            right = true;
            state = "right";
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        char keyboard = e.getKeyChar();

        if(keyboard == 'w'){
            up = false;
        }
        if(keyboard == 'a'){
            left = false;
        }
        if(keyboard == 's'){
            down = false;
        }
        if(keyboard == 'd'){
            right = false;
        }
    }
}
