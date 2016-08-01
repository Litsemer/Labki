/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataDriver;

import dilexis.DateFormater;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Comarch
 */
public class DataProcession {
    
    public static boolean loginIsExist(String login) throws SQLException{
    boolean exist = false;
    String loginQuery = "SELECT login FROM USER WHERE login = '"+login+"'";
    Driver.statement = Driver.connection.createStatement();
        ResultSet rs = Driver.statement.executeQuery(loginQuery);
        while(rs.next()){
        exist = true;
        }
    return exist;
    }   
    
    public static void createUser(JTextField name, JTextField surname, JComboBox sex, JTextField login, JPasswordField jPassword){

        String currentTime = DateFormater.getDate();
        
        String password = "";
         for (int i = 0; i<jPassword.getPassword().length; i++){
             password += jPassword.getPassword()[i];
         }
         
         String createUserQuery = "INSERT INTO USER (name, surname, sex, login, password, creation_date) VALUES ('"+name.getText()+"', '"
                 + surname.getText()+ "', '"+sex.getSelectedItem().toString()+"', '"
                 + login.getText().toLowerCase()+"', '"+password+"', '"+currentTime+"');";
         
        try {
            Driver.statement.executeUpdate(createUserQuery);
        } catch (SQLException ex) {
            Logger.getLogger(DataProcession.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    public static void deleteNotLastUserLog() throws SQLException{
    Driver.statement = Driver.connection.createStatement();
    String deleteQuery = "delete from last_login where log_id not in (select max(log_id) from last_login)";
    Driver.statement.execute(deleteQuery);
    }
}
