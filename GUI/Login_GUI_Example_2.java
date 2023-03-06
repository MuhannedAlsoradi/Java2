import javax.swing.*;
import java.awt.*;

class LoginGUI2 extends JFrame {
    JPanel panel = new JPanel();
    ;

    LoginGUI2() {
        setSize(300, 300);
        setLocation(300, 620);
        setContentPane(panel);
        setLayout(new FlowLayout());
        JButton button = new JButton("login");
        button.setBackground(Color.YELLOW);
        button.setToolTipText("press here to login");
        button.setEnabled(true);
        button.setForeground(Color.BLUE);
        JLabel label = new JLabel("Username :");
        JTextField field = new JTextField(12);
        panel.add(label);
        panel.add(field);
        panel.add(button);
        setVisible(true);
    }
    public static void main(String[] args) {
        new LoginGUI2();
    }
}
