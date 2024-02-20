package view;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form implements ActionListener {
    JPanel firstF,secondF, firstchd,firstchd1,firstchd2, firstchd3, firstchd4,firstchd5,firstchd6,secondchd;
    JLabel Jtitle, Fname, Sname, sex, classF ,dob;
    JTextField F1name,S1name, Tdob;
    JRadioButton Msex, Fsex;
    JButton cancel, submit;
    JTable Jtable;
    JScrollPane Jsp;
    JComboBox<String> Jclass;
   DefaultTableModel tableModel;
   ButtonGroup sexGroup;
    JFrame frame = new JFrame();
     public Form(){
        firstF = new JPanel();
        Jtitle = new JLabel("Fill The Form To Register A Student");
        Jtitle.setForeground(Color.darkGray);
        firstF.setBorder(BorderFactory.createEmptyBorder(5, 0, 5, 0));
        Jtitle.setFont(new Font("sanserif", Font.BOLD, 13));
        firstF.add(Jtitle);
        secondF = new JPanel();
        firstchd = new JPanel();
        firstchd.setBorder(BorderFactory.createEmptyBorder(0, 15, 0, 5));
        firstchd1 = new JPanel();
        firstchd1.setLayout(new GridLayout(1,2,2,2));
        Fname = new JLabel("First Name");
        F1name = new JTextField();
        firstchd1.add(Fname);
        firstchd1.add(F1name);
        firstchd2 = new JPanel();
        firstchd2.setLayout(new GridLayout(1,2,2,2));
        Sname = new JLabel("Last Name");
        S1name = new JTextField();
        firstchd2.add(Sname);
        firstchd2.add(S1name);
        firstchd3 = new JPanel();
        firstchd3.setLayout(new GridLayout(1, 3, 2, 2));
        sex = new JLabel("Sex");
        Fsex = new JRadioButton("F");
        Msex = new JRadioButton("M");
        sexGroup = new ButtonGroup();
        sexGroup.add(Fsex);
        sexGroup.add(Msex);
        firstchd3.add(sex);
        firstchd3.add(Fsex);
        firstchd3.add(Msex);
        firstchd4 = new JPanel();
        firstchd4.setLayout(new GridLayout(1,2,2,2));
        classF = new JLabel("Class");
        Jclass = new JComboBox<>();
        String[] items = {"Master", "B-tech", "M-tech"};
        Jclass.addItem("Choose a class");  // Optional default item
        for (String item : items) {
            Jclass.addItem(item);
        }
        firstchd4.add(classF);
        firstchd4.add(Jclass);
        firstchd5 = new JPanel();
        firstchd5.setLayout(new GridLayout(1,2,2,2));
        dob = new JLabel("DOB");
        Tdob = new JTextField();
        firstchd5.add(dob);
        firstchd5.add(Tdob);
        firstchd6 = new JPanel();
        firstchd6.setLayout(new GridLayout(1,2,2,2));
        cancel = new JButton("Cancel");
        cancel.addActionListener(this);
        cancel.setForeground(new Color(51,50,155));
        submit = new JButton("Submit");
        submit.addActionListener(this);
        submit.setForeground(new Color(51,50,155));
        firstchd6.add(cancel);
        firstchd6.add(submit);
        firstchd.add(firstchd1);
        firstchd.add(firstchd2);
        firstchd.add(firstchd5);
        firstchd.add(firstchd4);
        firstchd.add(firstchd3);
        firstchd.add(firstchd6);
        firstchd.setLayout(new GridLayout(6,1));
        secondchd = new JPanel();
        String[] columnNames = {"NAME", "SEX", "CLASS", "DOB", "ACTION"};
        tableModel = new DefaultTableModel(columnNames, 0);
        Jtable = new JTable(tableModel);
        Jtable.setBackground(Color.gray);
        Jsp = new JScrollPane(Jtable);
        secondchd.add(Jsp);
        secondF.setBackground(Color.cyan);
        secondF.add(firstchd);
        secondF.add(secondchd);
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
         String firstName = F1name.getText();
         String lastName = S1name.getText();
         String sex = Fsex.isSelected() ? "F" : "M";
         String selectedClass = Jclass.getSelectedItem().toString();
         String dob = Tdob.getText();
         DefaultTableModel model = (DefaultTableModel) Jtable.getModel();
         tableModel.addRow(new Object[]{firstName + " " + lastName, sex, selectedClass, dob, "approved"});
      }
      else if (e.getSource() == cancel) {
         F1name.setText("");
         S1name.setText("");
         Tdob.setText("");
         Fsex.isSelected();
         Jclass.setSelectedIndex(0);
      }
   }
}