
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MainWindow extends JFrame implements ActionListener {
    JLabel label1 = new JLabel("Student Report");
    JButton b1 = new JButton("Admin Login");
    JButton b2 = new JButton("Assistant Login");
    Container c = getContentPane();

    public MainWindow() {
        super("1");
        setLayout(null);
        setLocation(460, 100);
        setSize(300, 300);
        setVisible(true);
        label1.setBounds(100, 10, 100, 20);
        b1.setBounds(80, 40, 130, 20);
        b2.setBounds(80, 80, 130, 20);
        b1.addActionListener(this);
        b2.addActionListener(this);
        c.add(label1);
        c.add(b1);
        c.add(b2);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            SecondWindow secondWindow = new SecondWindow();
            secondWindow.setVisible(true);
            this.setVisible(false);

        } else if (e.getSource() == b2) {
            SexthWindow sexthWindow = new SexthWindow();
            sexthWindow.setVisible(true);
            this.setVisible(false);
        }
    }

    public static void main(String[] args) {
        new MainWindow();
    }

}