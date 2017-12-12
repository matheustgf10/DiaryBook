package DAO;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDataBase {
    
    Connection connection;
    
    public ConnectionDataBase(){
        connection = null;
    }

    public Connection createConnection() throws ClassNotFoundException {

            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = null;

        try {
            //connect
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/diarybook_db", "root", "");
            System.out.println("connected!");
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());

            return null;
        }

        //if(connection != null) {
        //    return connection;

        //}else{   System.out.println("Houve algum problema com a conexão. Tente novamente mais tarde1");
        //}
            return connection;
    }

    private Connection closeConnection() throws SQLException{

        connection.close();

        return null;
    }
}
