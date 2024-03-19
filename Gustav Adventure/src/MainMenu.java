import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu implements ActionListener {
    JFrame mainMenu = new JFrame();
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();
    JPanel panel4 = new JPanel();

    JButton play = new JButton();
    public static boolean enterGame;

    public MainMenu(){
        mainMenu.setSize(1295,1000);
        mainMenu.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainMenu.setVisible(true);
        mainMenu.setResizable(false);
        mainMenu.setFocusable(true);

        play.setLayout(new BorderLayout());
        play.setPreferredSize(new Dimension(600,200));
        play.setBackground(Color.green);
        play.addActionListener(this);


        panel1.setSize(800, 200);
        panel1.add(play, BorderLayout.SOUTH);
        panel1.setBackground(Color.BLACK);

        mainMenu.add(panel1, BorderLayout.CENTER);
        mainMenu.add(panel2, BorderLayout.SOUTH);
        mainMenu.add(panel3, BorderLayout.NORTH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == play){
            enterGame = true;
            mainMenu.setVisible(false);
        }
    }
}
