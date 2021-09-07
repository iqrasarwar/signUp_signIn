
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class DataBaseConnection {
    
    public static Connection getConnection(){
        
        Connection con = null;
     
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/chota","root","");
        } 
        catch (ClassNotFoundException | SQLException ex) {
            System.out.println("exp");
        }
        
        return con;
    }
}
