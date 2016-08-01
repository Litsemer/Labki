/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIForms;

import static GUIForms.Learning.wordEditor;
import static GUIForms.MainForm.jPanel1;
import dilexis.Combinator;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JTextField;

/**
 *
 * @author Comarch
 */
public class CombinePanel extends javax.swing.JPanel {
    public static ArrayList<JLabel> labels = new ArrayList<JLabel>();
    public static ArrayList<JTextField> textFields = new ArrayList<>();
    public static ArrayList<JSeparator> separators = new ArrayList<JSeparator>();
    public static int stageCounter = 0;

    public CombinePanel() {
        initComponents();

        t1.setVisible(false);      
        w1.setVisible(false);     
        t2.setVisible(false);
        w2.setVisible(false);
        t3.setVisible(false);
        w3.setVisible(false);
        t4.setVisible(false);
        w4.setVisible(false);
        t5.setVisible(false);
        w5.setVisible(false);
        t6.setVisible(false);
        w6.setVisible(false);
        t7.setVisible(false);
        w7.setVisible(false);
        t8.setVisible(false);
        w8.setVisible(false);
        t9.setVisible(false);
        w9.setVisible(false);
        t10.setVisible(false);
        w10.setVisible(false);
        
        s1.setVisible(true);
        s2.setVisible(false);
        s3.setVisible(false);
        s4.setVisible(false);
        s5.setVisible(false);
        s6.setVisible(false);
        s7.setVisible(false);
        s8.setVisible(false);
        s9.setVisible(false); 
        s10.setVisible(false);
        s11.setVisible(false);

            w1.setText(Learning.words.get(0).getText());
            w1.setVisible(true);
            t1.setVisible(true);
            s2.setVisible(true);
            labels.add(w1);
            textFields.add(t1);
            separators.add(s2);
        

            w2.setText(Learning.words.get(1).getText());
            w2.setVisible(true);
            t2.setVisible(true);
            s3.setVisible(true);
            labels.add(w2);
            textFields.add(t2);
            separators.add(s3);
                
            w3.setText(Learning.words.get(2).getText());
            w3.setVisible(true);
            t3.setVisible(true);
            s4.setVisible(true);
            labels.add(w3);
            textFields.add(t3);
            separators.add(s4);


            w4.setText(Learning.words.get(3).getText());
            w4.setVisible(true);
            t4.setVisible(true);
            s5.setVisible(true);
            labels.add(w4);
            textFields.add(t4);
            separators.add(s5);
                

            w5.setText(Learning.words.get(4).getText());
            w5.setVisible(true);
            t5.setVisible(true);
            s6.setVisible(true);
            labels.add(w5);
            textFields.add(t5);
            separators.add(s6);
                
                if (Learning.jComboBox2.getSelectedItem().toString().equals("10")) {
            w6.setText(Learning.words.get(5).getText());
            w6.setVisible(true);
            t6.setVisible(true);
            s7.setVisible(true);
            labels.add(w6);
            textFields.add(t6);
            separators.add(s7);
        }else {        
        w6.setVisible(false);
        t6.setVisible(false);
        s7.setVisible(false);}
        
        if (Learning.jComboBox2.getSelectedItem().toString().equals("10")) {
            w7.setText(Learning.words.get(6).getText());
            w7.setVisible(true);
            t7.setVisible(true);
            s8.setVisible(true);
            labels.add(w7);
            textFields.add(t7);
            separators.add(s8);
        }else {       
        w7.setVisible(false);
        t7.setVisible(false);
        s8.setVisible(false);}
        
        if (Learning.jComboBox2.getSelectedItem().toString().equals("10")) {
            w8.setText(Learning.words.get(7).getText());
            w8.setVisible(true);
            t8.setVisible(true);
            s9.setVisible(true);
            labels.add(w8);
            textFields.add(t8);
            separators.add(s9);
        }else {        
        w8.setVisible(false);
        t8.setVisible(false);
        s9.setVisible(false);}
        
        if (Learning.jComboBox2.getSelectedItem().toString().equals("10")) {
            w9.setText(Learning.words.get(8).getText());
            w9.setVisible(true);
            t9.setVisible(true);
            s10.setVisible(true);
            labels.add(w9);
            textFields.add(t9);
            separators.add(s10);
        }else {       
        w9.setVisible(false);
        t9.setVisible(false);
        s10.setVisible(false);}
        
        if (Learning.jComboBox2.getSelectedItem().toString().equals("10")) {
            w10.setText(Learning.words.get(9).getText());
            w10.setVisible(true);
            t10.setVisible(true);
            s11.setVisible(true);
            labels.add(w10);
            textFields.add(t10);
            separators.add(s11);
        }else {        
        w10.setVisible(false);
        t10.setVisible(false);
        s11.setVisible(false);}   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        s1 = new javax.swing.JSeparator();
        mainLabel = new javax.swing.JLabel();
        w1 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        s2 = new javax.swing.JSeparator();
        w2 = new javax.swing.JLabel();
        t2 = new javax.swing.JTextField();
        s3 = new javax.swing.JSeparator();
        w3 = new javax.swing.JLabel();
        t3 = new javax.swing.JTextField();
        s4 = new javax.swing.JSeparator();
        w4 = new javax.swing.JLabel();
        t4 = new javax.swing.JTextField();
        s5 = new javax.swing.JSeparator();
        w5 = new javax.swing.JLabel();
        t5 = new javax.swing.JTextField();
        s6 = new javax.swing.JSeparator();
        w6 = new javax.swing.JLabel();
        t6 = new javax.swing.JTextField();
        s7 = new javax.swing.JSeparator();
        w7 = new javax.swing.JLabel();
        t7 = new javax.swing.JTextField();
        s8 = new javax.swing.JSeparator();
        w8 = new javax.swing.JLabel();
        t8 = new javax.swing.JTextField();
        s9 = new javax.swing.JSeparator();
        w9 = new javax.swing.JLabel();
        t9 = new javax.swing.JTextField();
        s10 = new javax.swing.JSeparator();
        w10 = new javax.swing.JLabel();
        t10 = new javax.swing.JTextField();
        s11 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(242, 253, 253));
        setMaximumSize(new java.awt.Dimension(992, 681));
        setMinimumSize(new java.awt.Dimension(992, 681));
        setPreferredSize(new java.awt.Dimension(992, 681));
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                formPropertyChange(evt);
            }
        });

        s1.setBackground(new java.awt.Color(94, 178, 178));
        s1.setForeground(new java.awt.Color(94, 178, 178));

        mainLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 30)); // NOI18N
        mainLabel.setForeground(new java.awt.Color(0, 102, 153));
        mainLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mainLabel.setText("Translate it, if you can!");

        w1.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        w1.setForeground(new java.awt.Color(0, 102, 153));
        w1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        w1.setText("Word1");

        t1.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        t1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t1.setMaximumSize(new java.awt.Dimension(8, 27));
        t1.setMinimumSize(new java.awt.Dimension(8, 27));
        t1.setPreferredSize(new java.awt.Dimension(8, 27));

        s2.setBackground(new java.awt.Color(192, 239, 239));
        s2.setForeground(new java.awt.Color(192, 239, 239));

        w2.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        w2.setForeground(new java.awt.Color(0, 102, 153));
        w2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        w2.setText("Word2");

        t2.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        t2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        s3.setBackground(new java.awt.Color(192, 239, 239));
        s3.setForeground(new java.awt.Color(192, 239, 239));

        w3.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        w3.setForeground(new java.awt.Color(0, 102, 153));
        w3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        w3.setText("Word3");

        t3.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        t3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        s4.setBackground(new java.awt.Color(192, 239, 239));
        s4.setForeground(new java.awt.Color(192, 239, 239));

        w4.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        w4.setForeground(new java.awt.Color(0, 102, 153));
        w4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        w4.setText("Word4");

        t4.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        t4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        s5.setBackground(new java.awt.Color(192, 239, 239));
        s5.setForeground(new java.awt.Color(192, 239, 239));

        w5.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        w5.setForeground(new java.awt.Color(0, 102, 153));
        w5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        w5.setText("Word5");

        t5.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        t5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t5ActionPerformed(evt);
            }
        });

        s6.setBackground(new java.awt.Color(192, 239, 239));
        s6.setForeground(new java.awt.Color(192, 239, 239));

        w6.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        w6.setForeground(new java.awt.Color(0, 102, 153));
        w6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        w6.setText("Word6");

        t6.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        t6.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        s7.setBackground(new java.awt.Color(192, 239, 239));
        s7.setForeground(new java.awt.Color(192, 239, 239));

        w7.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        w7.setForeground(new java.awt.Color(0, 102, 153));
        w7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        w7.setText("Word7");

        t7.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        t7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t7ActionPerformed(evt);
            }
        });

        s8.setBackground(new java.awt.Color(192, 239, 239));
        s8.setForeground(new java.awt.Color(192, 239, 239));

        w8.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        w8.setForeground(new java.awt.Color(0, 102, 153));
        w8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        w8.setText("Word8");

        t8.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        t8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t8ActionPerformed(evt);
            }
        });

        s9.setBackground(new java.awt.Color(192, 239, 239));
        s9.setForeground(new java.awt.Color(192, 239, 239));

        w9.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        w9.setForeground(new java.awt.Color(0, 102, 153));
        w9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        w9.setText("Word9");

        t9.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        t9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t9ActionPerformed(evt);
            }
        });

        s10.setBackground(new java.awt.Color(192, 239, 239));
        s10.setForeground(new java.awt.Color(192, 239, 239));

        w10.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        w10.setForeground(new java.awt.Color(0, 102, 153));
        w10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        w10.setText("Word10");

        t10.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        t10.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        s11.setBackground(new java.awt.Color(192, 239, 239));
        s11.setForeground(new java.awt.Color(192, 239, 239));

        jButton1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 102, 102));
        jButton1.setText("Next");
        jButton1.setFocusPainted(false);
        jButton1.setOpaque(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(s2, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(s3, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(s4, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(s5, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(s6, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(s7, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(s8, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(s9, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(s10, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(s11, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(s1, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mainLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(w2, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)
                                        .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(w4, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)
                                        .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(w3, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)
                                        .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(w6, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)
                                        .addComponent(t6, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(w8, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)
                                        .addComponent(t8, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(w7, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)
                                        .addComponent(t7, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(w5, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)
                                        .addComponent(t5, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(w10, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)
                                        .addComponent(t10, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(w9, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)
                                        .addComponent(t9, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(w1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)
                                        .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(405, 405, 405)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(145, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(mainLabel)
                .addGap(30, 30, 30)
                .addComponent(s1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(w1)
                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(s2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(w2)
                    .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(s3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(w3)
                    .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(s4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(w4)
                    .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(s5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(w5)
                    .addComponent(t5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(s6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(w6)
                    .addComponent(t6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(s7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(w7)
                    .addComponent(t7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(s8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(w8)
                    .addComponent(t8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(s9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(w9)
                    .addComponent(t9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(s10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(w10)
                    .addComponent(t10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(s11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
       // TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked

    private void t5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t5ActionPerformed

    private void t7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t7ActionPerformed

    private void t8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t8ActionPerformed

    private void t9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t9ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        stageCounter++;
        if (stageCounter == 1) {
            Combinator.takeCurrentWordAndTranslation(labels, textFields);
            Combinator.checkWords();
            Combinator.showTranslations(labels, textFields, separators);
        } else if (stageCounter == 2) {
            Combinator.takeCurrentTranslationAndWord(labels, textFields);
            Combinator.checkTranslations();
            Combinator.clearAllFields(labels, textFields, separators);
            Combinator.showWrongWords(labels, textFields, separators, mainLabel);
        } else if(stageCounter == 3){
           Combinator.cleanAllWords(textFields, labels);
            stageCounter = 0;
        } else if(stageCounter == 6){
        MainForm.l.setVisible(true);
        Learning.jPanel1.setVisible(true);
        jPanel1.setEnabled(true);
        jPanel1.setVisible(true);
        wordEditor.setEnabled(true);
        MainForm.jButton2.setVisible(true);
        MainForm.jButton3.setVisible(true);
        setVisible(false);
        setEnabled(false);
        Combinator.currentWordAndTranslation.clear();
        Combinator.wordAndTranslation.clear();
        Combinator.wordsAfterCheking.clear();
        Combinator.wordsForRemoving.clear();
        labels.clear();
        separators.clear();
        textFields.clear();
        }

        

        
//          // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

    private void formPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_formPropertyChange

         
    }//GEN-LAST:event_formPropertyChange

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
         // TODO add your handling code here:
    }//GEN-LAST:event_formMouseMoved

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
            // TODO add your handling code here:
    }//GEN-LAST:event_formFocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel mainLabel;
    public static javax.swing.JSeparator s1;
    public static javax.swing.JSeparator s10;
    public static javax.swing.JSeparator s11;
    public static javax.swing.JSeparator s2;
    public static javax.swing.JSeparator s3;
    public static javax.swing.JSeparator s4;
    public static javax.swing.JSeparator s5;
    public static javax.swing.JSeparator s6;
    public static javax.swing.JSeparator s7;
    public static javax.swing.JSeparator s8;
    public static javax.swing.JSeparator s9;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t10;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    private javax.swing.JTextField t7;
    private javax.swing.JTextField t8;
    private javax.swing.JTextField t9;
    private javax.swing.JLabel w1;
    private javax.swing.JLabel w10;
    private javax.swing.JLabel w2;
    private javax.swing.JLabel w3;
    private javax.swing.JLabel w4;
    private javax.swing.JLabel w5;
    private javax.swing.JLabel w6;
    private javax.swing.JLabel w7;
    private javax.swing.JLabel w8;
    private javax.swing.JLabel w9;
    // End of variables declaration//GEN-END:variables
}
