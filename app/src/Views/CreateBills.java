package Views;

import Models.Bill;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

public class CreateBills extends JFrame implements ActionListener {

    JButton jbCreate, jbClear;
    JLabel jlName, jlDate, jlValue, jlEmpty;
    JTextField jtName, jtValue;
    JFormattedTextField jftDate;
    JComboBox jcPayOrReceive; 
    Bill bill;

    public CreateBills() throws ParseException{
        setTitle("Cadastrar Conta");
        setBounds(300, 300, 300 ,300);
        getContentPane().setBackground(new Color(120, 120 ,120, 120));
        getContentPane().setLayout(new GridLayout(5,2));
        

        jlName = new JLabel("Nome:");
        jlDate = new JLabel("Data:");
        jlValue = new JLabel("Valor:");
        jlEmpty = new JLabel("");

        jbCreate = new JButton("Adicionar");
        jbClear = new JButton("Limpar Campos");

        jtName = new JTextField();
        jtValue = new JTextField();

        jftDate = new JFormattedTextField();
        jftDate.setFormatterFactory(new DefaultFormatterFactory(new MaskFormatter("##/##/####")));

        jcPayOrReceive = new JComboBox();
        jcPayOrReceive.addItem("Conta a pagar");
        jcPayOrReceive.addItem("Conta a receber");
        
        getContentPane().add(jlName);
        getContentPane().add(jtName);

        getContentPane().add(jlDate);
        getContentPane().add(jftDate);

        getContentPane().add(jlValue);
        getContentPane().add(jtValue);
        
        getContentPane().add(jcPayOrReceive);
        getContentPane().add(jlEmpty);
        
        getContentPane().add(jbCreate);
        getContentPane().add(jbClear);
    }

    @Override
    public void actionPerformed( ActionEvent e ) {
        if (e.getSource() == jbClear){
            // clear textfields
            jtName.setText("");
            jftDate.setText("");
            jtValue.setText("");

        }else if(e.getSource() == jbCreate){
            // create bill
            bill.setName(jtName.getText());
            bill.setDate(jftDate.getText());
            bill.setValue(Double.parseDouble(jtValue.getText()));
            
            
        }
    }
}
