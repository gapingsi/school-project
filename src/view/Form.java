package view;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form implements ActionListener {
    JPanel firstF,secondF, firstchild,firstchild1,firstchild2, firstchild3, firstchild4,firstchild5,firstchild6,secondchild;
    JLabel titleT, Fname, Sname, sex, classF ,dob;
    JTextField FIname,SIname, Tdob;
    JRadioButton Msex, Fsex;
    JButton cancel, submit;
    JTable table;
    JScrollPane sp;
    JComboBox<String> classB;
   DefaultTableModel tableModel;
   ButtonGroup sexGroup;
    JFrame frame = new JFrame();
     public Form(){
        firstF = new JPanel();
        titleT = new JLabel("Fill The Form To Register A Student");
        titleT.setForeground(Color.darkGray);
        firstF.setBorder(BorderFactory.createEmptyBorder(5, 0, 5, 0));
        titleT.setFont(new Font("sanserif", Font.BOLD, 13));
        firstF.add(titleT);
        secondF = new JPanel();
        firstchild = new JPanel();
        firstchild.setBorder(BorderFactory.createEmptyBorder(0, 15, 0, 5));
        firstchild1 = new JPanel();
        firstchild1.setLayout(new GridLayout(1,2,2,2));
        Fname = new JLabel("First Name");
        FIname = new JTextField();
        firstchild1.add(Fname);
        firstchild1.add(FIname);
        firstchild2 = new JPanel();
        firstchild2.setLayout(new GridLayout(1,2,2,2));
        Sname = new JLabel("Last Name");
        SIname = new JTextField();
        firstchild2.add(Sname);
        firstchild2.add(SIname);
        firstchild3 = new JPanel();
        firstchild3.setLayout(new GridLayout(1, 3, 2, 2));
        sex = new JLabel("Sex");
        Fsex = new JRadioButton("F");
        Msex = new JRadioButton("M");
        sexGroup = new ButtonGroup();
        sexGroup.add(Fsex);
        sexGroup.add(Msex);
        firstchild3.add(sex);
        firstchild3.add(Fsex);
        firstchild3.add(Msex);
        firstchild4 = new JPanel();
        firstchild4.setLayout(new GridLayout(1,2,2,2));
        classF = new JLabel("Class");
        classB = new JComboBox<>();
        String[] items = {"Master", "B-tech", "M-tech"};
        classB.addItem("Choose a class");  // Optional default item
        for (String item : items) {
            classB.addItem(item);
        }
        firstchild4.add(classF);
        firstchild4.add(classB);
        firstchild5 = new JPanel();
        firstchild5.setLayout(new GridLayout(1,2,2,2));
        dob = new JLabel("DOB");
        Tdob = new JTextField();
        firstchild5.add(dob);
        firstchild5.add(Tdob);
        firstchild6 = new JPanel();
        firstchild6.setLayout(new GridLayout(1,2,2,2));
        cancel = new JButton("Cancel");
        cancel.addActionListener(this);
        cancel.setForeground(new Color(51,50,155));
        submit = new JButton("Submit");
        submit.addActionListener(this);
        submit.setForeground(new Color(51,50,155));
        firstchild6.add(cancel);
        firstchild6.add(submit);
        firstchild.add(firstchild1);
        firstchild.add(firstchild2);
        firstchild.add(firstchild5);
        firstchild.add(firstchild4);
        firstchild.add(firstchild3);
        firstchild.add(firstchild6);
        firstchild.setLayout(new GridLayout(6,1));
        secondchild = new JPanel();
        String[] columnNames = {"NAME", "SEX", "CLASS", "DOB", "ACTION"};
        tableModel = new DefaultTableModel(columnNames, 0);
        table = new JTable(tableModel);
        table.setBackground(Color.green);
        sp = new JScrollPane(table);
        secondchild.add(sp);
        secondF.setBackground(Color.cyan);
        secondF.add(firstchild);
        secondF.add(secondchild);
        secondF.setLayout(new GridLayout(1,2));
        frame.pack();
        frame.setLayout(new BorderLayout());
        frame.add(firstF, BorderLayout.PAGE_START);
        frame.add(secondF, BorderLayout.CENTER);
        frame.setLocationRelativeTo(null);
        frame.setSize(1000,300);
        frame.setTitle("Registration Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
   public JButton getSubmit() {
      return submit;
   }
   public void setSubmit(JButton submit) {
      this.submit = submit;
   }
   public void actionPerformed(ActionEvent e) {
      if (e.getSource() == submit) {
         String firstName = FIname.getText();
         String lastName = SIname.getText();
         String sex = Fsex.isSelected() ? "F" : "M";
         String selectedClass = classB.getSelectedItem().toString();
         String dob = Tdob.getText();
         DefaultTableModel model = (DefaultTableModel) table.getModel();
         tableModel.addRow(new Object[]{firstName + " " + lastName, sex, selectedClass, dob, "Action"});
      }
      else if (e.getSource() == cancel) {
         FIname.setText("");
         SIname.setText("");
         Tdob.setText("");
         Fsex.isSelected();
         classB.setSelectedIndex(0);
      }
   }
}