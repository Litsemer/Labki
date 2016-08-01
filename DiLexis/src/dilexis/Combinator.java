/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dilexis;

import GUIForms.CombinePanel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JTextField;


/**
 *
 * @author Comarch
 */
public class Combinator {
    
    public static Map<String, String> wordAndTranslation = new HashMap<String, String>();
    public static Map<String, String> currentWordAndTranslation = new HashMap<String, String>();
    public static Map<String, String> currentTranslationAndWord = new HashMap<String, String>();
    public static ArrayList<String> wordsForRemoving = new ArrayList<String>();
    public static Map<String, String> wordsAfterCheking;
    static int counter = 0;
    
    public static void loadWordsToList(ArrayList<JLabel> words, ArrayList<JLabel> translations){
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).isVisible()) {
            wordAndTranslation.put(words.get(i).getText(), translations.get(i).getText());
            }else{break;}
        }
    }
    public static void takeCurrentWordAndTranslation(ArrayList<JLabel> labels, ArrayList<JTextField> textFields){
        currentWordAndTranslation.clear();
        for (int i = 0; i < labels.size(); i++) {
            currentWordAndTranslation.put(labels.get(i).getText(), textFields.get(i).getText());
        }
    }
    public static void takeCurrentTranslationAndWord(ArrayList<JLabel> labels, ArrayList<JTextField> textFields){
        currentTranslationAndWord.clear();
        for (int i = 0; i < wordAndTranslation.size(); i++) {
            currentTranslationAndWord.put(textFields.get(i).getText(), labels.get(i).getText());
        }
   
    }
    public static void checkWords(){
       wordsAfterCheking = new HashMap<>(wordAndTranslation);
       Iterator<Map.Entry<String, String>> iterator = wordAndTranslation.entrySet().iterator();
            while(iterator.hasNext()){
            Map.Entry<String, String> pair = iterator.next();
            String word = pair.getKey();
            String translation = pair.getValue();
                Iterator<Map.Entry<String, String>> iteratorOfCurrent = currentWordAndTranslation.entrySet().iterator();
                    while(iteratorOfCurrent.hasNext()){
                    Map.Entry<String, String> currentPair = iteratorOfCurrent.next();
                    String currentWord = currentPair.getKey();
                    String currentTranslation = currentPair.getValue();
                        if (word.equals(currentWord) && translation.equals(currentTranslation)) {
                            wordsForRemoving.add(word);
                        }
             }        
       }
           Iterator<Map.Entry<String, String>> iteratorForRemoving = wordsAfterCheking.entrySet().iterator();
           while(iteratorForRemoving.hasNext()){
            Map.Entry<String, String> pair = iteratorForRemoving.next();
            String word = pair.getKey();
               for (int i = 0; i < wordsForRemoving.size(); i++) {
                   if (word.equals(wordsForRemoving.get(i))) {
                      iteratorForRemoving.remove();
                   }
               }
           }
    }
    public static void printCurrent(){
           Iterator<Map.Entry<String, String>> iterator = currentWordAndTranslation.entrySet().iterator();
       while(iterator.hasNext()){
       Map.Entry<String, String> pair = iterator.next();
       String word = pair.getKey();
       String translation = pair.getValue();
       }
    }
    public static void checkTranslations(){
        Iterator<Map.Entry<String, String>> iterator = wordAndTranslation.entrySet().iterator();
            while(iterator.hasNext()){
            Map.Entry<String, String> pair = iterator.next();
            String word = pair.getKey();
            String translation = pair.getValue();
                Iterator<Map.Entry<String, String>> iteratorOfCurrent = currentTranslationAndWord.entrySet().iterator();
                    while(iteratorOfCurrent.hasNext()){
                    Map.Entry<String, String> currentPair = iteratorOfCurrent.next();
                    String currentWord = currentPair.getKey();
                    String currentTranslation = currentPair.getValue();
                        if (translation.equals(currentTranslation) && !(word.equals(currentWord))) {
                           wordsAfterCheking.put(word, translation);
                        }
             }        
            }
    }
    public static void showTranslations(ArrayList<JLabel> labels, ArrayList<JTextField> textFields, ArrayList<JSeparator> separators){
       ArrayList<String> translations = new ArrayList<String>();
       Iterator<Map.Entry<String, String>> iterator = wordAndTranslation.entrySet().iterator();
       while(iterator.hasNext()){
       Map.Entry<String, String> pair = iterator.next();
       translations.add(pair.getValue());
       }
        for (int i = 0; i < wordAndTranslation.size(); i++) {
            labels.get(i).setText(translations.get(i));
            labels.get(i).setVisible(true);
            textFields.get(i).setText("");
            textFields.get(i).setVisible(true);
            separators.get(i).setVisible(true);
        }

    }
    public static void clearAllFields(ArrayList<JLabel> labels, ArrayList<JTextField> textFields, ArrayList<JSeparator> jSeparators){
        for (int i = 0; i < labels.size(); i++) {
            labels.get(i).setVisible(false);
            textFields.get(i).setVisible(false);
            jSeparators.get(i).setVisible(false);
            
        }
    }
    public static void showWrongWords(ArrayList<JLabel> labels, ArrayList<JTextField> textFields, ArrayList<JSeparator> jSeparators, JLabel mainLabel){
        if (!wordsAfterCheking.isEmpty()) {
            mainLabel.setText("Try these words again:");
        } else {mainLabel.setText("Congrats! You learned some new words!");
            CombinePanel.stageCounter = 5;
        }
       ArrayList<String> words = new ArrayList<>();
       ArrayList<String> translations = new ArrayList<>();
       Iterator<Map.Entry<String, String>> iterator = wordsAfterCheking.entrySet().iterator();
       while(iterator.hasNext()){
       Map.Entry<String, String> pair = iterator.next();
       String word = pair.getKey();
       words.add(word);
       String translation = pair.getValue();
       translations.add(translation);
       }
       
        for (int i = 0; i < words.size(); i++) {
            labels.get(i).setText(words.get(i));
            labels.get(i).setVisible(true);
            textFields.get(i).setText(translations.get(i));
            textFields.get(i).setVisible(true);
            textFields.get(i).setEnabled(false);
            jSeparators.get(i).setVisible(true);
        }
    }
    public static void cleanAllWords(ArrayList<JTextField> textFields, ArrayList<JLabel> labels){
        wordAndTranslation.clear();
        wordAndTranslation.putAll(wordsAfterCheking);
        for (int i = 0; i < textFields.size(); i++) {
            if (i >= wordsAfterCheking.size()) {
                textFields.get(i).setVisible(false);
                labels.get(i).setVisible(false);
            }
        }
        
        for (int i = 0; i < textFields.size(); i++) {
            textFields.get(i).setEnabled(true);
            textFields.get(i).setText("");
            textFields.get(i).setEnabled(true);
            }
        currentWordAndTranslation.clear();
        wordsForRemoving.clear();
        wordsAfterCheking.clear();
            
        
    }
    public static void testPrint(){
           Iterator<Map.Entry<String, String>> iterator = wordAndTranslation.entrySet().iterator();
       while(iterator.hasNext()){
       Map.Entry<String, String> pair = iterator.next();
       String word = pair.getKey();
       String translation = pair.getValue();
           System.out.println(word + " - " + translation);
       }
    }
}
