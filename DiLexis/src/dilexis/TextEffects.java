/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dilexis;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.Timer;



/**
 *
 * @author Comarch
 */
public class TextEffects {
    
    
    
    public static void greetingText(JLabel jLabel){
        //-------first greeting text--------------
        ArrayList<String> greetText = new ArrayList<String>();
        greetText.add("Hi there!");
        greetText.add("Greetings!");
        greetText.add("Wellcome!");
        greetText.add("Hi!");
        greetText.add("Hello!");
        
        //-------next phrase---------------------
        ArrayList<String> questionText = new ArrayList<String>();
        questionText.add("How are you?");
        questionText.add("Are you ready?");
        questionText.add("Let's start!");
       
        int randNum1 = (int) (Math.random()*greetText.size());
        int randNum2 = (int) (Math.random()*questionText.size());
        
        jLabel.setText(greetText.get(randNum1)); 
        
        Timer timer1 = new Timer(3000, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                jLabel.setText(questionText.get(randNum2));
            }
        });
        timer1.setRepeats(false);
        timer1.start();
    }
    public static void registrationText(JLabel jLabel){
    jLabel.setText("Ok! Government need your personal data...");
    
    Timer timer1 = new Timer(6000, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                jLabel.setText("Just joking. They already knows everything about you...");
            }
        });
        timer1.setRepeats(false);
        timer1.start(); 
    }

    
}
