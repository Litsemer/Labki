/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dilexis;

/**
 *
 * @author Comarch
 */
public class Session{
    
    private static String user_loged;
    private static String sessionStatus = "off";

    public static String getUser_loged() {
        return user_loged;
    }

    public static void setUser_loged(String user_loged) {
        Session.user_loged = user_loged;
    }

    public static String getSessionStatus() {
        return sessionStatus;
    }

    public static void setSessionStatus(String sessionStatus) {
        Session.sessionStatus = sessionStatus;
    }
    
    
}
