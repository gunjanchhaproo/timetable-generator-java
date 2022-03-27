package com.data_structure;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class DBConnect {
    public static Connection con;
    public static ResultSet rs;
    public static Statement st;
    public static void connect() {
        try {
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
//            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ttschema", "root", "..#Gunjan4122");
            st=con.createStatement();
            
//            con.close();  
        }catch (SQLException e){ 
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Cannot connect to the database","Issue!", JOptionPane.OK_OPTION);
        } 
    }
}
