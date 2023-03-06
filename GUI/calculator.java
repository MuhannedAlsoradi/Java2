import javax.swing.*;
import java.awt.*;

class Calculator extends JFrame {

    String s[] = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "/", "*", "+", "-", ".", "%" };
    JButton buttons[] = new JButton[16];
    JButton submiButton = new JButton("Submitt");
    JPanel p1, p2, p3;

    Calculator() {
p1.setBackground(getForeground());
JCheckBox jCheckBox;

        for (int i = 0; i < 16; i++) {
            buttons[i] = new JButton(s[i]);
            p1.add(buttons[i]);
        }
        JTextArea textArea = new JTextArea();
        p1.setLayout(new GridLayout());
        p2.setLayout(new BorderLayout());
        p2.add(p1, BorderLayout.CENTER);
        p2.add(submiButton, BorderLayout.SOUTH);
        p2.add(textArea, BorderLayout.SOUTH);
        getContentPane().add(p2);
        setVisible(true);
        setSize(400, 600);
    

    }

    public static void main(String[] args) {
        new Calculator();
    }
}
