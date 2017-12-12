package Views;

import Models.Bill;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AlterBills extends JFrame implements ActionListener {

    JLabel jlSelect, jlName, jlValue, jlDate;
    JButton jbAlter, jbClear;
    JTextField jtName, jtValue;
    JFormattedTextField jftDate;
    Bill bills;
    JComboBox<Bill> jcbBills;


    public AlterBills(){
        setTitle("Alterar Conta");
        setBounds(300, 300, 300 ,300);
        getContentPane().setBackground(new Color(120, 120 ,120, 120));
        getContentPane().setLayout(new GridLayout(2,2));




    }

    @Override
    public void actionPerformed( ActionEvent e ) {

    }
}
