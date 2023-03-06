
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

class NineWindow extends JFrame {
    String[] columns = { "Rollno", "Name", "Factully", "Course", "ID", "Level", "Class", "Lab Time" };

    JTable table = new JTable();
    DefaultTableModel model = (DefaultTableModel) table.getModel();

    public NineWindow() {
        super("9");
        add(new JScrollPane(table));
        setSize(550, 300);
        setLocation(460, 100);
        model.setColumnIdentifiers(columns);
        setTableRows();
    }

    public void setTableRows() {
        for (int i = 0; i < UserClass.list2.size(); i++) {
            UserClass.rollNo++;
            model.addRow(UserClass.list2.get(i));
        }
    }
}