import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class SevenWindow extends JFrame implements ActionListener {
    Container c = getContentPane();
    JLabel label1 = new JLabel("Assistant Section");
    JButton button1 = new JButton("Add Student");
    JButton button2 = new JButton("View Student");
    JButton button3 = new JButton("Edit Student");
    JButton button4 = new JButton("Delete Student");
    JButton button5 = new JButton("Logout");

    public SevenWindow() {
        super("7");
        setSize(400, 300);
        setLayout(null);
        setLocation(460, 100);
        label1.setBounds(140, 10, 100, 20);
        button1.setBounds(40, 40, 130, 20);
        button2.setBounds(200, 40, 130, 20);
        button3.setBounds(40, 70, 130, 20);
        button4.setBounds(200, 70, 130, 20);
        button5.setBounds(130, 100, 130, 20);
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        c.add(label1);
        c.add(button1);
        c.add(button2);
        c.add(button3);
        c.add(button4);
        c.add(button5);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            EightWindow eightWindow = new EightWindow();
            eightWindow.setVisible(true);
            setVisible(false);
        } else if (e.getSource() == button5) {
            setVisible(false);
            MainWindow mainWindow = new MainWindow();
            mainWindow.setVisible(true);
        } else if (e.getSource() == button2) {
            NineWindow nineWindow = new NineWindow();
            nineWindow.setVisible(true);
        } else if (e.getSource() == button3) {
            TenWindow tenWindow = new TenWindow();
            tenWindow.setVisible(true);
            this.setVisible(false);
        } else if (e.getSource() == button4) {
            DeleteWindow deleteWindow = new DeleteWindow();
            deleteWindow.setVisible(true);
        }
    }
}
