import java.awt.*;
import javax.swing.*;

class GUIExample extends JFrame {
    GUIExample() {
        super("GUI Example");
        JButton button1 = new JButton("Login1");
        JButton button2 = new JButton("Login2");
        JButton button3 = new JButton("Login3");
        JButton button4 = new JButton("Login4");
        JButton button5 = new JButton("Login5");
        getContentPane().add(button1, BorderLayout.NORTH);
        getContentPane().add(button2, BorderLayout.SOUTH);
        getContentPane().add(button3, BorderLayout.CENTER);
        getContentPane().add(button4, BorderLayout.EAST);
        getContentPane().add(button5, BorderLayout.WEST);
        setSize(300, 400);
        setLocation(200, 100);
        setVisible(true);

    }

    public static void main(String[] args) {
        new GUIExample();
    }
}