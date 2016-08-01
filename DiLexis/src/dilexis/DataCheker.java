/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dilexis;

import DataDriver.DataProcession;
import java.awt.Color;
import java.sql.SQLException;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Comarch
 */
public class DataCheker {
    private static boolean nameFlag;
    private static boolean surnameFlag;
    private static boolean loginFlag;
    private static boolean passwordFlag;
    private static boolean passwordConfFlag;
    private static boolean totalCheckFlag;
    

    public static boolean nameChek(JTextField jTextField, JLabel jLabel){
        
        if (jTextField.getText().equals("")) {
            jLabel.setForeground(Color.red);
            jLabel.setText("Your name, please");
            nameFlag = false;
        } else {
            jLabel.setForeground(Color.white);
            jLabel.setText("Nice to meet you, "+jTextField.getText() + "!");
            nameFlag = true;}
        return nameFlag;
    }
    
    public static boolean surnameChek(JTextField jTextField, JLabel jLabel){
        
        if (jTextField.getText().equals("")) {
            jLabel.setForeground(Color.red);
            jLabel.setText("Your surname, please");
            surnameFlag = false;
        } else {
            jLabel.setForeground(Color.white);
            jLabel.setText("Well done!");
            surnameFlag = true;}
        return nameFlag;
    }
 
    public static boolean passwordChek(JPasswordField jPasswordField, JLabel jLabel){
        if (jPasswordField.getPassword().length < 6 || jPasswordField.getPassword().length >12) {
            jLabel.setForeground(Color.red);
            jLabel.setText("From 6 to 12 chars");
            passwordFlag = false;
        } else {
            jLabel.setForeground(Color.white);
            jLabel.setText("Pretty suitable");
            passwordFlag = true;
        }
        return passwordFlag;
    }
    
    public static boolean loginChek(JTextField jTextField, JLabel jLabel) throws SQLException{
        if (jTextField.getText().equals("")) {
            jLabel.setForeground(Color.red);
            jLabel.setText("Create a username");
            loginFlag = false;
        }else if(DataProcession.loginIsExist(jTextField.getText().toLowerCase())){
            jLabel.setForeground(Color.red);
            jLabel.setText("Login is already exist");
            loginFlag = false;
        } 
        else {
            jLabel.setForeground(Color.white);
            jLabel.setText("I got it!");
            loginFlag = true;}    
        return loginFlag;
    }
    
    public static boolean passwordConfirmChek(JPasswordField jPasswordField1, JPasswordField jPasswordField2, JLabel jLabel1, JLabel jLabel2){
        String password1 = "", password2 = "";
        for (int i = 0; i<jPasswordField1.getPassword().length; i++){
        password1 += jPasswordField1.getPassword()[i];
        }
        for (int i = 0; i<jPasswordField2.getPassword().length; i++){
        password2 += jPasswordField2.getPassword()[i];
        }
        if (password1.equals(password2)) {
            jLabel1.setForeground(Color.white);
            jLabel1.setText("Password:");
            jLabel2.setForeground(Color.white);
            jLabel2.setText("Good job!");
            passwordConfFlag = true;
        } else{
        jLabel1.setForeground(Color.red);
        jLabel1.setText("This field and");
        jLabel2.setForeground(Color.red);
        jLabel2.setText("this one, must be equal!");
        passwordConfFlag = false;
        }
        return passwordConfFlag;
    }
    
    public static boolean totalCheck(JLabel jLabel){
        if ((nameFlag == true) && (surnameFlag = true) && (loginFlag == true) && (passwordFlag == true) && (passwordConfFlag == true)) {
            jLabel.setText("");        
            totalCheckFlag = true;
        } else {
            jLabel.setForeground(Color.red);
            jLabel.setText("Please, fill out all fields");
            totalCheckFlag = false;}
        return totalCheckFlag;
    }
}
