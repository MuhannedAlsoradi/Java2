import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class SecondWindow extends JFrame implements ActionListener {

    JLabel label2 = new JLabel("Admin Login");
    JLabel label3 = new JLabel("Name:");
    JLabel label4 = new JLabel("Password:");
    JTextField textField1 = new JTextField(30);
    JPasswordField textField2 = new JPasswordField(30);
    JButton b3 = new JButton("Login");
    JButton b4 = new JButton("Back");

    public SecondWindow() {
        super("2");
        setLayout(null);
        setSize(300, 300);
        setLocation(460, 100);
        Container c2 = getContentPane();
        label2.setBounds(100, 10, 100, 20);
        label3.setBounds(20, 40, 100, 20);
        label4.setBounds(20, 70, 100, 20);
        textField1.setBounds(130, 40, 100, 20);
        textField2.setBounds(130, 80, 100, 20);
        b3.setBounds(100, 130, 100, 20);
        b4.setBounds(160, 180, 100, 20);
        c2.add(label2);
        b3.addActionListener(this);
        b4.addActionListener(this);
        c2.add(label3);
        c2.add(label4);
        c2.add(textField1);
        c2.add(textField2);
        c2.add(b3);
        c2.add(b4);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b3) {
            if ((textField1.getText().toString().equals("admin"))
                    && (textField2.getText().toString().equals("admin123"))) {
                ThirdWindow thirdWindow = new ThirdWindow();
                MainWindow mainWindow = new MainWindow();
                mainWindow.setVisible(false);
                this.setVisible(false);
                thirdWindow.setVisible(true);

            }

        } else if (e.getSource() == b4) {
            setVisible(false);
            MainWindow mainWindow = new MainWindow();
            mainWindow.setVisible(true);
        }
    }
}