/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dilexis;

import DataDriver.Driver;
import GUIForms.LoginForm;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Comarch
 */
public class DiLexis {

    public static void main(String[] args) {
        try {
            Driver.getConnection();
            // TODO code application logic here
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DiLexis.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DiLexis.class.getName()).log(Level.SEVERE, null, ex);
        }
        LoginForm.start();
    }
    
}
