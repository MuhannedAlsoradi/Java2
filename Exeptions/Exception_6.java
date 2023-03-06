import javax.swing.JOptionPane;

class Exception_6 {
    public static void methodE() {
        while (true) {
            String s = JOptionPane.showInputDialog(null, "Enter a number");
            try {
                int no = Integer.parseInt(s);
                break;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Enter a valid number", "Alert", 0);
            }

        }
    }

    public static void main(String[] args) {
        methodE();
    }
}
