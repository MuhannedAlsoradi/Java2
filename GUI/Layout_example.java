import javax.swing.*;
import java.awt.*;

class LayoutDemo extends JFrame {
    Container c;

    LayoutDemo() {
        JButton b1 = new JButton("b1");
        JButton b2 = new JButton("b2");
        JButton b3 = new JButton("b3");
        JButton b4 = new JButton("b4");
        JButton b5 = new JButton("b5");
        c = getContentPane();
        setLayout(null);
        // c.add(b1,BorderLayout.EAST);
        // c.add(b2,BorderLayout.WEST);
        // c.add(b3,BorderLayout.NORTH);
        // c.add(b4,BorderLayout.SOUTH);
        b5.setBounds(50, 150, 200, 50);
        c.add(b5);
     
        pack();
        setBounds(20, 150, 200, 50);
    }

    public static void main(String[] args) {
        JFrame f = new LayoutDemo();
        f.setVisible(true);
    }
}
