import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends JFrame {
    Container c;
    JButton b;

    class Clicker implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == b)
                JOptionPane.showMessageDialog(null, "Hello");
        }
    }

    public MyFrame() {
        c = getContentPane();
        c.setLayout(new FlowLayout());
        b = new JButton("GO!");
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == b)
                    JOptionPane.showMessageDialog(null, "Hello");
            }
        });
        c.add(b);
        setSize(300, 100);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyFrame();
    }
}
