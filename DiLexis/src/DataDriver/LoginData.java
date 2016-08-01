/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataDriver;

import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JCheckBox;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Comarch
 */
public class LoginData {
    private static boolean toRemember;
    
    public static boolean signIn(JTextField login, JPasswordField jPassword, boolean remember, JCheckBox jCheckBox){
        String rem;
        if (remember==true) {
            rem = "true";
        } else {
            rem = "false";
        }
        
        String password = "";
        for (int i=0; i<jPassword.getPassword().length; i++){
        password += jPassword.getPassword()[i];
        }
        String loginQuery = "SELECT login, password FROM User WHERE login = '"+login.getText().toLowerCase()+"' AND password = '"+password+"';";
        try {
            Driver.statement = Driver.connection.createStatement();
            ResultSet rs = Driver.statement.executeQuery(loginQuery);
            while (rs.next()){
            String username = rs.getString("login");
            String passw = rs.getString("password");
            
                if ((login.getText().toLowerCase().equals(username)) && (password.equals(passw))) {
                    String rememberQuery = "INSERT INTO last_login (login, password, remember_login) VALUES ('"+login.getText().toLowerCase()+"', '"+password+"', '"+rem+"');";
                    Driver.statement.executeUpdate(rememberQuery);
                toRemember = true;
                } else {toRemember = false;}
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoginData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return toRemember;
    }
    public static void are_you_remember(JTextField jTextField, JPasswordField jPasswordField, JCheckBox jCheckBox) throws SQLException{
    String username;
    String pass;
    String rem;
    
    String rememberQuery = "select login, password, remember_login from last_login where log_id = (select max(log_id) from last_login);";
    
    Driver.statement = Driver.connection.createStatement();
    ResultSet rs = Driver.statement.executeQuery(rememberQuery);
    
    while(rs.next()){
    username = rs.getString("login");
    pass = rs.getString("password");
    rem = rs.getString("remember_login");
    
            if (rem.equals("true")) {
            jTextField.setBackground(new Color(255,255,244));
            jTextField.setText(username);
            jPasswordField.setBackground(new Color(255,255,244));
            jPasswordField.setText(pass);
            jCheckBox.setSelected(true);
        } else {
            jTextField.setText("");
            jPasswordField.setText("");
            jCheckBox.setSelected(false);
            }
    }

    
    }
    public static void loginAfterRegistration() throws SQLException{
    Driver.statement = Driver.connection.createStatement();
    String updateQuery = "update last_login set remember_login = 'false' where log_id = (select max(log_id) from last_login)";
    Driver.statement.execute(updateQuery);
    }
}