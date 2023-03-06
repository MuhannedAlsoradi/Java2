
import javax.swing.*;
import java.awt.event.*;
import javax.swing.table.DefaultTableModel;

class FifthWindow extends JFrame implements ActionListener {
    String[] a = { "Id", "Name", "Password", "Email", "Contact no" };
    JTable table = new JTable();
    DefaultTableModel model = (DefaultTableModel) table.getModel();

    public FifthWindow() {
        super("5");
        add(new JScrollPane(table));
        setSize(500, 300);
        setLocation(460, 100);
        table.setModel(model);
        model.setColumnIdentifiers(a);
        setTableRows();

    }

    public void setTableRows() {
        for (int i = 0; i < UserClass.list1.size(); i++) {
            UserClass.id++;
            model.addRow(UserClass.list1.get(i));
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}