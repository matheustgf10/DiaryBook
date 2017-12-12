import DAO.ConnectionDataBase;
import Views.CreateBills;
import java.text.ParseException;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, ParseException{
        CreateBills window = new CreateBills();
        window.setDefaultCloseOperation(window.EXIT_ON_CLOSE);
        window.setVisible(true);
       
       
//        ConnectionDataBase connectionDataBase = new ConnectionDataBase();
//        connectionDataBase.createConnection();
    }

}
