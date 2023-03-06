
import javax.swing.*;
import java.awt.event.*;
import javax.swing.table.DefaultTableModel;

class DeleteWindow extends JFrame implements ActionListener {
    FourthWindow fourthWindow = new FourthWindow();
    String[] columns = { "Rollno", "Name", "Factully", "Course", "ID", "Level", "Class", "Lab Time" };
    JTable table = new JTable();
    DefaultTableModel model = (DefaultTableModel) table.getModel();
    JButton btnDelete = new JButton("Delete Student");
    JScrollPane pane = new JScrollPane(table);

    public DeleteWindow() {
        super("11");
        setSize(600, 300);
        setLocation(460, 100);
        setLayout(null);
        btnDelete.setBounds(300, 240, 200, 20);
        pane.setBounds(0, 0, 600, 200);
        add(btnDelete);
        add(pane);
        btnDelete.addActionListener(this);
        model.setColumnIdentifiers(columns);
        setTableRows();
    }

    public void setTableRows() {
        for (int i = 0; i < UserClass.list2.size(); i++) {
            UserClass.id++;
            model.addRow(UserClass.list2.get(i));
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnDelete) {
            // i = the index of the selected row
            int i = table.getSelectedRow();
            if (i >= 0) {
                // remove a row from jtable
                model.removeRow(i);
                UserClass.list2.remove(i);
            } else {
                JOptionPane.showMessageDialog(null, "Delete Error!");
            }
        }

    }
}