import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;

public class Player{
    Panel panel;
    int playerX;
    int playerY;
    int playerSpeed;
    keyInput keyboard;
    static BufferedImage img;

    public Player(Panel panel, keyInput keyboard){
        this.panel = panel;
        this.keyboard = keyboard;

        defaultPosition();
    }

    public static void chararacter(String state){
        try{
            if(state.equals("up"))img = ImageIO.read(Player.class.getResourceAsStream("iddle.png"));
            else img = ImageIO.read(Player.class.getResourceAsStream("jongsun-lee-t-klL0oHX8Y-unsplash.jpg"));;
        }catch (Exception e){

        }
    }
    public void defaultPosition(){
        playerX = 120;
        playerY = 120;
        playerSpeed = 2;
    }
    public void draw(Graphics2D rndr){
        rndr.drawImage(img, playerX, playerY, 64, 64,null);
    }
    public void update(){
        if(keyboard.up){
            playerY = playerY - playerSpeed;
        }
        else if(keyboard.down){
            playerY = playerY + playerSpeed;
        }
        else if(keyboard.left){
            playerX = playerX - playerSpeed;
        }
        else if(keyboard.right){
            playerX = playerX + playerSpeed;
        }
    }
}