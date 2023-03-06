import java.awt.event.*;
import java.awt.*;

import javax.swing.*;

class GUI extends JFrame implements ActionListener {
    Container c;
    JLabel label1, label2, label3, label4;
    JTextField textField1, textField2, textField3;
    JRadioButton jRadioButton1, jRadioButton2;
    JButton b1;
    ButtonGroup bg;

    public GUI() {
        c = getContentPane();
        b1 = new JButton("Compute");
        JLabel label1 = new JLabel("First");
        JLabel label2 = new JLabel("Second");
        JLabel label3 = new JLabel("Operation");
        JLabel label4 = new JLabel("result");
        textField1 = new JTextField(20);
        textField2 = new JTextField(20);
        textField3 = new JTextField(20);
        jRadioButton1 = new JRadioButton("Addition");
        jRadioButton2 = new JRadioButton("Substraction");
        textField1.setBounds(100, 20, 60, 20);
        textField2.setBounds(100, 60, 60, 20);
        textField3.setBounds(100, 140, 60, 20);
        label1.setBounds(20, 20, 60, 20);
        label2.setBounds(20, 60, 60, 20);
        label3.setBounds(20, 100, 60, 20);
        label4.setBounds(20, 140, 60, 20);
        jRadioButton1.setBounds(100, 100, 60, 20);
        jRadioButton2.setBounds(180, 100, 60, 20);
        b1.setBounds(120, 170, 200, 20);
        bg = new ButtonGroup();
        bg.add(jRadioButton1);
        bg.add(jRadioButton2);
        c.add(label1);
        c.add(label2);
        c.add(label3);
        c.add(label4);
        c.add(textField1);
        c.add(textField2);
        c.add(textField3);
        c.add(jRadioButton1);
        c.add(jRadioButton2);
        c.add(b1);
        setLayout(null);
        setVisible(true);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (jRadioButton1.isSelected()) {
                    textField3.setText(
                            Float.parseFloat(textField1.getText()) + Float.parseFloat(textField2.getText()) + "");

                } else if(jRadioButton2.isSelected()){
                    textField3.setText(
                            Float.parseFloat(textField1.getText()) - Float.parseFloat(textField2.getText()) + "");

                }
                else {

                }

            }
        });

    }

    public static void main(String[] args) {
        new GUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}