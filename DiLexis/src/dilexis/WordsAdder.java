/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dilexis;

import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JTextField;

public class WordsAdder {
public static void addWords(ArrayList<JLabel> words, ArrayList<JLabel> translations, ArrayList<JSeparator> separators, JTextField word, JTextField translation, int counter){
    words.get(counter).setVisible(true);
    words.get(counter).setText(word.getText().toLowerCase());
    translations.get(counter).setVisible(true);
    translations.get(counter).setText(translation.getText().toLowerCase());
    
    separators.get(counter).setVisible(true);
}
public static void cleanWords(ArrayList<JLabel> words, ArrayList<JLabel> translations, ArrayList<JSeparator> separators){
    for (int i = 0; i < words.size(); i++) {
        words.get(i).setVisible(false);
        translations.get(i).setVisible(false);
        separators.get(i).setVisible(false);
    }
}  
}
