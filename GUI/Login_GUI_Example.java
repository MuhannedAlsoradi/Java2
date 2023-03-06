import java.awt.*;
import javax.swing.*;

class LoginGUI {
    JFrame frame;
    LoginGUI() {
        frame = new JFrame("Login frame");
        Container pane = frame.getContentPane();
        JButton button = new JButton("login");
        button.setBackground(Color.YELLOW);
        button.setToolTipText("press here to login");
        button.setEnabled(true);
        button.setForeground(Color.BLUE);
        JLabel label = new JLabel("Username :");
        JTextField field = new JTextField(12);
        pane.add(label);
        pane.add(field);
        pane.add(button);
        frame.setLayout(new FlowLayout());
        frame.setLocation(300, 300);
        frame.setSize(300, 300);
        frame.pack();
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new LoginGUI();
    }
}
