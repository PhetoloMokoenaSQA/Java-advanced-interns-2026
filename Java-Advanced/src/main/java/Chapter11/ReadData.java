package Chapter11;

import java.sql.*;

/**
 * Project: Java-Advanced
 * Date  : 10/15/2026
 *
 * @author: Phetolo Mokoena
 */
public class ReadData {
    static void main(String[] args) {
        String connectionString = "jdbc.sqlserver://ILAB10\\SQLEXPRESS;database=Northwind;encrypt=true";
        try {
            
            //create connection object
            Connection objConnection = DriverManager.getConnection(connectionString);
            //open the connection
            Statement stm = objConnection.createStatement();
            // results = objConnection.createStatement();
            String cmdSelect = "Select * FROM Employees";
            ResultSet results = stm.executeQuery(cmdSelect);

           while (results.next()){
               System.out.println(results.getInt(2)+"-"+results.getString(4));
           }
           objConnection.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
