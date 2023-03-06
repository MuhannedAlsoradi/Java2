
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ThirdWindow extends JFrame implements ActionListener {
    JLabel label5 = new JLabel("Admin Section");
    JButton b4 = new JButton("Add Assistant");
    JButton b5 = new JButton("View Assistant");
    JButton b6 = new JButton("Logout");

    public ThirdWindow() {
        super("3");
        setLocation(460, 100);
        setSize(300, 300);
        setLayout(null);
        Container c3 = getContentPane();
        label5.setBounds(100, 10, 100, 20);
        b4.setBounds(80, 40, 130, 20);
        b5.setBounds(80, 80, 130, 20);
        b6.setBounds(80, 120, 130, 20);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        c3.add(label5);
        c3.add(b4);
        c3.add(b5);
        c3.add(b6);
    }

    FifthWindow fifthWindow = new FifthWindow();
    FourthWindow fourthWindow = new FourthWindow();
    SecondWindow secondWindow = new SecondWindow();

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == b4) {
            fourthWindow.setVisible(true);
            this.setVisible(false);
        } else if (e.getSource() == b5) {
            fifthWindow.setVisible(true);
        } else if (e.getSource() == b6) {
            setVisible(false);
            secondWindow.setVisible(true);

        }

    }
}
