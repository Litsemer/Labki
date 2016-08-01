/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataDriver;

import GUIForms.Learning;
import GUIForms.RegistrationForm;
import dilexis.DateFormater;
import dilexis.Session;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Comarch
 */
public class DictionaryData {
private static String userDictionary;

public static String getUserDictionary() {
        return userDictionary;
    }

public static void setUserDictionary(JTextField userName) {
        DictionaryData.userDictionary = userName.getText() +"Dictionary";
    }



public static void createUserDictionary(){
String query = "CREATE TABLE "+userDictionary+" ("
        + " word_id	integer PRIMARY KEY  autoincrement unique,\n" +
        "user_id integer,\n" +
        "word varchar(24) not null,\n" +
        "translate varchar(100) not null,\n" +
        "word_time date not null,\n" +
        "FOREIGN KEY (user_id) REFERENCES user (user_id));";

    try {
        Driver.statement = Driver.connection.createStatement();
        Driver.statement.execute(query);
    } catch (SQLException ex) {
        Logger.getLogger(DictionaryData.class.getName()).log(Level.SEVERE, null, ex);
    }
}
 
public static void insertWords(ArrayList<JLabel> words, ArrayList<JLabel> translations){
    int counter = 0;
    if (Learning.jComboBox2.getSelectedItem().toString().equals("5")) {
        counter = 5;
    } else {counter = 10;}
    for (int i = 0; i < counter; i++) {
        String date = DateFormater.getDate();
        userDictionary = Session.getUser_loged() +"Dictionary";
        String query = "insert into "+userDictionary+" (user_id, word, translate, word_time) values ((select user_id from User where login='"+Session.getUser_loged()
                +"'), '"+words.get(i).getText().toLowerCase()+"', '"+translations.get(i).getText().toLowerCase()+"', '"+date+"')";
        try {
            Driver.statement = Driver.connection.createStatement();
            Driver.statement.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(DictionaryData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
}
