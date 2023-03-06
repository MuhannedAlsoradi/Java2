import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class EightWindow extends JFrame implements ActionListener {
    String[] dates = { "sunday 8-10", "sunday 10-12", "monday 12-2", "tuesday 12-2", "wednsday 8-10",
            "thursday 10-12" };
    Container c = getContentPane();
    JLabel label0 = new JLabel("Add Student");
    JLabel label1 = new JLabel("Name:");
    JLabel label2 = new JLabel("Facutly:");
    JLabel label3 = new JLabel("Course:");
    JLabel label4 = new JLabel("ID:");
    JLabel label5 = new JLabel("Level:");
    JLabel label6 = new JLabel("Class:");
    JLabel label7 = new JLabel("Lab Time:");
    JTextField textField1 = new JTextField();
    JTextField textField2 = new JTextField();
    JTextField textField3 = new JTextField();
    JTextField textField4 = new JTextField();
    JTextField textField5 = new JTextField();
    JTextField textField6 = new JTextField();
    JComboBox<String> comboBox = new JComboBox<String>(dates);
    JButton button1 = new JButton("Add Student");
    JButton button2 = new JButton("Back");

    public EightWindow() {
        super("8");
        setSize(300, 600);
        setLocation(460, 100);
        setLayout(null);
        label0.setBounds(100, 10, 100, 20);
        label1.setBounds(20, 40, 100, 20);
        label2.setBounds(20, 70, 100, 20);
        label3.setBounds(20, 100, 100, 20);
        label4.setBounds(20, 130, 100, 20);
        label5.setBounds(20, 160, 100, 20);
        label6.setBounds(20, 190, 100, 20);
        label7.setBounds(20, 220, 100, 20);
        textField1.setBounds(120, 40, 150, 20);
        textField2.setBounds(120, 70, 150, 20);
        textField3.setBounds(120, 100, 150, 20);
        textField4.setBounds(120, 130, 150, 20);
        textField5.setBounds(120, 160, 150, 20);
        textField6.setBounds(120, 190, 150, 20);
        comboBox.setBounds(120, 220, 150, 20);
        button1.setBounds(75, 470, 150, 20);
        button2.setBounds(100, 500, 100, 20);
        button1.addActionListener(this);
        button2.addActionListener(this);
        c.add(label0);
        c.add(label1);
        c.add(label2);
        c.add(label3);
        c.add(label4);
        c.add(label5);
        c.add(label6);
        c.add(label7);
        c.add(textField1);
        c.add(textField2);
        c.add(textField3);
        c.add(textField4);
        c.add(textField5);
        c.add(textField6);
        c.add(comboBox);
        c.add(button1);
        c.add(button2);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            if (textField1.getText().length() > 0 && textField2.getText().length() > 0
                    && textField3.getText().length() > 0 && textField4.getText().length() > 0
                    && textField5.getText().length() > 0 && textField6.getText().length() > 0) {
                String[] s = new String[8];
                s[0] = UserClass.rollNo + "";
                s[1] = textField1.getText();
                s[2] = textField2.getText();
                s[3] = textField3.getText();
                s[4] = textField4.getText();
                s[5] = textField5.getText();
                s[6] = textField5.getText();
                s[7] = comboBox.getSelectedItem() + "";
                UserClass.list2.add(s);
                JOptionPane.showMessageDialog(null, "Student added successfully!");

            }
        } else if (e.getSource() == button2) {
            this.setVisible(false);
            SevenWindow sevenWindow = new SevenWindow();
            sevenWindow.setVisible(true);

        }
    }
}
