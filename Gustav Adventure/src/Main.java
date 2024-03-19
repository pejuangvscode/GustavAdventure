import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Panel panel = new Panel();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setResizable(false);
        frame.setTitle("GUSTAV ADVENTURE");

        frame.pack();
        frame.setVisible(true);

        panel.gameThread();

        MainMenu mainMenu = new MainMenu();
    }
}