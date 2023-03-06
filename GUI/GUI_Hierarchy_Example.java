import java.awt.*;
import javax.swing.*;

class GUIHierarchy extends JFrame {
    JPanel yllwJPanel, grnJPanel, bluJPanel;

    public GUIHierarchy() {
        yllwJPanel = new JPanel();
        yllwJPanel.setBackground(Color.YELLOW);
        yllwJPanel.setBorder(BorderFactory.createTitledBorder("The Main Panel"));

        grnJPanel = new JPanel();
        grnJPanel.setBackground(Color.green);
        grnJPanel.setBorder(BorderFactory.createTitledBorder("The Upper Panel"));
        grnJPanel.setPreferredSize(new Dimension(180, 150));
        JLabel label = new JLabel("This is label");
        grnJPanel.add(label);

        bluJPanel = new JPanel();
        bluJPanel.setBackground(Color.BLUE);
        bluJPanel.setPreferredSize(new Dimension(180, 150));

        JCheckBox checkBox = new JCheckBox("Is Nice");
        yllwJPanel.add(grnJPanel);
        yllwJPanel.add(bluJPanel);
        yllwJPanel.add(checkBox);
        setContentPane(yllwJPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(250, 400);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new GUIHierarchy();
    }
}
