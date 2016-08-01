/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataDriver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Comarch
 */
public class Driver {
    public static Connection connection = null;
    public static Statement statement = null;
    
     public  static void getConnection()throws ClassNotFoundException, SQLException {
        Class.forName("org.sqlite.JDBC");
		   connection = DriverManager.getConnection("jdbc:sqlite:C:/Users/user/Documents/NetBeansProjects/Lexecuter/LexecuterDB.s3db");
		   
		   //System.out.println("Database connected.");
    }
     
    public static void closeConnetcion(){
        try {
            connection.close();
            System.out.println("connection closed");
        } catch (SQLException ex) {
            Logger.getLogger(Driver.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 
}
