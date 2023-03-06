
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class FourthWindow extends JFrame implements ActionListener {
    JLabel label1 = new JLabel("Add Assistant");
    JLabel label2 = new JLabel("Name:");
    JLabel label3 = new JLabel("Password:");
    JLabel label4 = new JLabel("Email:");
    JLabel label5 = new JLabel("Contact No:");
    Container c = getContentPane();
    JTextField textField1 = new JTextField(40);
    JPasswordField textField2 = new JPasswordField(40);
    JTextField textField3 = new JTextField(40);
    JTextField textField4 = new JTextField(40);
    JButton jButton1 = new JButton("Add Assistant");
    JButton jButton2 = new JButton("Back");

    public FourthWindow() {
        super("4");
        setSize(300, 300);
        setLocation(460, 100);
        setLayout(null);
        label1.setBounds(100, 10, 100, 20);
        label2.setBounds(20, 40, 100, 20);
        label3.setBounds(20, 70, 100, 20);
        label4.setBounds(20, 100, 100, 20);
        label5.setBounds(20, 130, 100, 20);
        textField1.setBounds(130, 40, 120, 20);
        textField2.setBounds(130, 70, 120, 20);
        textField3.setBounds(130, 100, 120, 20);
        textField4.setBounds(130, 130, 120, 20);
        jButton1.setBounds(80, 160, 130, 30);
        jButton2.setBounds(150, 200, 80, 25);
        jButton1.addActionListener(this);
        jButton2.addActionListener(this);
        c.add(label1);
        c.add(label2);
        c.add(label3);
        c.add(label4);
        c.add(label5);
        c.add(textField1);
        c.add(textField2);
        c.add(textField3);
        c.add(textField4);
        c.add(jButton1);
        c.add(jButton2);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jButton1) {

            if (((textField1.getText().isEmpty()) && (textField2.getText().isEmpty())
                    && (textField3.getText().isEmpty())
                    && (textField4.getText().isEmpty()))) {
                JOptionPane.showMessageDialog(null, "Sorry!, unable to add assistant");

            } else if ((!(textField1.getText().isEmpty()) &&
                    !(textField2.getText().isEmpty())
                    && !(textField3.getText().isEmpty())
                    && !(textField4.getText().isEmpty()))) {
                String[] s = new String[5];
                s[0] = UserClass.id + "";
                s[1] = textField1.getText();
                s[2] = textField2.getText();
                s[3] = textField3.getText();
                s[4] = textField4.getText();
                UserClass.list1.add(s);
                JOptionPane.showMessageDialog(null, "Assistant added successfully!");
            } else {
                JOptionPane.showMessageDialog(null, "Sorry!, unable to add assistant");

            }

        } else if (e.getSource() == jButton2) {
            this.setVisible(false);
            ThirdWindow thirdWindow = new ThirdWindow();
            thirdWindow.setVisible(true); 
        }
    }

}
