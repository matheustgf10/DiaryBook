package Views;

import javax.swing.*;
import java.awt.*;

public class Menu extends JFrame{

    public Menu(){
        setTitle("MENU");
        setBounds(300, 300, 300 ,300);
        getContentPane().setBackground(new Color(120, 120 ,120, 120));

        getContentPane().setLayout(new GridLayout(2,2));

    }
}
