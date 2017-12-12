package Views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DeleteBills extends JFrame implements ActionListener {

    public DeleteBills(){
        setTitle("Deletar Conta");
        setBounds(300, 300, 300 ,300);
        getContentPane().setBackground(new Color(120, 120 ,120, 120));

        getContentPane().setLayout(new GridLayout(2,2));

    }

    @Override
    public void actionPerformed( ActionEvent e ) {

    }
}
