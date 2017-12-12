package Views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ListBills extends JFrame implements ActionListener{

    JLabel jLabel1, jLabel2;
    JButton jbCreate, jbDrop, jbAlter;


    public ListBills(){
        setTitle("LISTA DE CONTAS");
        setBounds(300, 300, 300, 300);
        getContentPane().setBackground(new Color(120,120,120,120));
        getContentPane().setLayout(new GridLayout(2,1));

        jLabel1 = new JLabel("Test");
        jLabel2 = new JLabel("Test 2");

        jbCreate = new JButton("Adicionar conta");
        jbAlter = new JButton("Alterar conta");
        jbDrop = new JButton("Deletar conta");

        jbCreate.addActionListener(this);
        jbCreate.setHorizontalTextPosition(AbstractButton.LEFT);
        jbCreate.setBackground(new Color(100,180,180));
        jbCreate.setForeground(Color.BLACK);
        jbCreate.setMnemonic(KeyEvent.VK_ENTER);
        jbCreate.setToolTipText("Clique no botão para buscar");

        jbAlter = new JButton("Cancelar");
        jbAlter.addActionListener(this);
        jbAlter.setMnemonic(KeyEvent.VK_C);
        jbAlter.setToolTipText("Clique no botão para cancelar");

        add(jLabel1);
        add(jbCreate);
        add(jbAlter);
        add(jbDrop);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == jbCreate) {
            CreateBills createBills;

            try {
                createBills = new CreateBills();
                createBills.setVisible(true);
            
            } catch (ParseException ex) {
                Logger.getLogger(ListBills.class.getName()).log(Level.SEVERE, null, ex);
            }

        }else if(e.getSource() == jbAlter){
            AlterBills alterBills = new AlterBills();
            alterBills.setVisible(true);

        }else if(e.getSource() == jbDrop){
            DeleteBills deleteBills = new DeleteBills();
            deleteBills.setVisible(true);
        }
    }


}
