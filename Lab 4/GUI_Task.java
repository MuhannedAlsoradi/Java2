import javax.swing.*;
import java.awt.*;


class GUITask extends JFrame {
    GUITask(){
        super("GUI LOGIN EXAMPLE");
        JLabel label = new JLabel("Username :");
        JTextField field = new JTextField(12);
        JButton button = new JButton("Login");
        getContentPane().add(label);
        getContentPane().add(field);
        getContentPane().add(button);
        setSize(400,400);
        setLayout(new FlowLayout());
        setLocation(200, 300);
        setVisible(true);
    }
    public static void main(String[] args) {
        new GUITask();
    }
}
