import java.awt.Color;

import javax.swing.JFrame;

class MyFirstFrame extends JFrame {
    MyFirstFrame() {
        super("Application");
        setSize(400, 400);
        setLocation(700, 300);
        setVisible(true);

    }

    public static void main(String[] args) {
        JFrame f1 = new MyFirstFrame();
        JFrame f2 = new MyFirstFrame();
        f2.setLocation(1120, 300);
        JFrame f3 = f1;
        f3.getContentPane().setBackground(Color.RED);
        f2.getContentPane().setBackground(Color.YELLOW);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
