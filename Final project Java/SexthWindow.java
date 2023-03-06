
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class SexthWindow extends JFrame implements ActionListener {
    Container c = getContentPane();
    JLabel label1 = new JLabel("Assistant Login");
    JLabel label2 = new JLabel("Name:");
    JLabel label3 = new JLabel("Password:");
    JTextField textField1 = new JTextField(30);
    JPasswordField textField2 = new JPasswordField(30);
    JButton button1 = new JButton("Login");
    JButton button2 = new JButton("Back");

    public SexthWindow() {
        super("6");
        setSize(400, 300);
        setLocation(460, 100);
        setLayout(null);
        label1.setBounds(100, 10, 100, 20);
        label2.setBounds(20, 40, 100, 20);
        label3.setBounds(20, 70, 100, 20);
        textField1.setBounds(130, 40, 150, 20);
        textField2.setBounds(130, 80, 150, 20);
        button1.setBounds(100, 130, 100, 30);
        button2.setBounds(220, 130, 90, 20);
        c.add(label1);
        c.add(label2);
        c.add(label3);
        c.add(textField1);
        c.add(textField2);
        c.add(button1);
        c.add(button2);
        button1.addActionListener(this);
        button2.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            for (int i = 0; i < UserClass.list1.size(); i++) {
                if ((textField1.getText().equals(UserClass.list1.get(i)[1]))
                        && (textField2.getText().equals(UserClass.list1.get(i)[2]))) {
                    SevenWindow sevenWindow = new SevenWindow();
                    sevenWindow.setVisible(true);
                    setVisible(false);
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "Unable to login!");
                }
            }

        } else if (e.getSource() == button2) {
            setVisible(false);
            MainWindow mainWindow = new MainWindow();
            mainWindow.setVisible(true);

        }
    }

}
