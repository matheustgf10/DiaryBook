package DAO;

import Models.Bill;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.List;

public class BillsDAO {
    String sql;
    ConnectionDataBase connection = new ConnectionDataBase();    
    public BillsDAO(){

        Bill bill = new Bill();
        sql = null;
    }

    private void createBills(Bill bill) throws ClassNotFoundException, SQLException{
        sql = "INSERT INTO bill(nameBill,valueBill,dateBill) VALUES(?,?,?)";
        PreparedStatement stmt = connection.createConnection().prepareStatement(sql);
        ResultSet rs;
        
    }

    private void deleteBills(Bill bill){

    }

    private void alterBill(Bill bill){

    }

    private List<Bill> listBills(Bill bill){



        return null;
    }
}
