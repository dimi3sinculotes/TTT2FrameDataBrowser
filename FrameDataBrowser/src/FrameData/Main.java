package FrameData;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.ResultSet;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        jTableFull.setVisible(false);
        jScrollPaneFull.setVisible(false);
        
        jLabelEasterEgg.setVisible(false);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMain = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jTextFieldMove = new javax.swing.JTextField();
        jComboBoxChars = new javax.swing.JComboBox<>();
        jButtonSimple = new javax.swing.JButton();
        jButtonFull = new javax.swing.JButton();
        jScrollPaneSimple = new javax.swing.JScrollPane();
        jTableSimple = new javax.swing.JTable();
        jButtonOk = new javax.swing.JButton();
        jScrollPaneFull = new javax.swing.JScrollPane();
        jTableFull = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabelEasterEgg = new javax.swing.JLabel();
        jButtonCopy = new javax.swing.JButton();
        jLabelBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TTT2 Frame Data Browser");
        setMinimumSize(new java.awt.Dimension(800, 500));
        setResizable(false);

        jPanelMain.setFocusable(false);
        jPanelMain.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));
        jPanel1.setFocusable(false);
        jPanel1.setOpaque(false);
        jPanel1.setLayout(null);

        jTextFieldMove.setFont(new java.awt.Font("Serif", 0, 11)); // NOI18N
        jTextFieldMove.setText("f, F+2");
        jTextFieldMove.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldMoveKeyPressed(evt);
            }
        });
        jPanel1.add(jTextFieldMove);
        jTextFieldMove.setBounds(230, 210, 290, 20);

        jComboBoxChars.setFont(new java.awt.Font("Serif", 0, 11)); // NOI18N
        jComboBoxChars.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alex", "Alisa", "Ancient Ogre", "Angel", "Anna", "Armor King", "Asuka", "Baek", "Bob", "Bruce", "Bryan", "Christie", "Craig Marduk", "Devil Jin", "Dr B", "Dragunov", "Eddy", "Feng", "Ganryu", "Forest", "Heihachi", "Hwoarang", "Jack 6", "Jaycee", "Jin", "Jinpachi", "Jun", "Kazuya", "King", "Kuma/Panda", "Kunimitsu", "Lars", "Lee", "Lei", "Leo", "Lili", "Ling", "Marshall Law", "Michelle", "Miharu", "Miguel", "Nina", "True Ogre", "Paul", "P-Jack", "Raven", "Roger Jr.", "Sebastian", "Slim Bob", "Steve", "Tiger", "Unknown", "Violet", "Wang", "Yoshimitsu", "Zafina" }));
        jPanel1.add(jComboBoxChars);
        jComboBoxChars.setBounds(230, 180, 360, 21);

        jButtonSimple.setBackground(new java.awt.Color(255, 255, 255));
        jButtonSimple.setFont(new java.awt.Font("Serif", 1, 11)); // NOI18N
        jButtonSimple.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconReduce.png"))); // NOI18N
        jButtonSimple.setFocusable(false);
        jButtonSimple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSimpleActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonSimple);
        jButtonSimple.setBounds(50, 210, 30, 30);

        jButtonFull.setBackground(new java.awt.Color(255, 255, 255));
        jButtonFull.setFont(new java.awt.Font("Serif", 1, 11)); // NOI18N
        jButtonFull.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconExpand.png"))); // NOI18N
        jButtonFull.setFocusable(false);
        jButtonFull.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFullActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonFull);
        jButtonFull.setBounds(100, 210, 30, 30);

        jScrollPaneSimple.setFocusable(false);

        jTableSimple.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTableSimple.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jTableSimple.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "INPUT", "SPEED", "ON BLOCK", "ON HIT"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableSimple.setFocusable(false);
        jTableSimple.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPaneSimple.setViewportView(jTableSimple);

        jPanel1.add(jScrollPaneSimple);
        jScrollPaneSimple.setBounds(60, 250, 690, 230);

        jButtonOk.setBackground(new java.awt.Color(255, 255, 255));
        jButtonOk.setFont(new java.awt.Font("Serif", 1, 11)); // NOI18N
        jButtonOk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/okBut.png"))); // NOI18N
        jButtonOk.setFocusable(false);
        jButtonOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOkActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonOk);
        jButtonOk.setBounds(530, 210, 60, 20);

        jScrollPaneFull.setFocusable(false);

        jTableFull.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jTableFull.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "INPUT", "LEVEL", "DAMAGE", "SPEED", "ON BLOCK", "ON HIT", "ON CH"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableFull.setFocusable(false);
        jTableFull.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPaneFull.setViewportView(jTableFull);

        jPanel1.add(jScrollPaneFull);
        jScrollPaneFull.setBounds(40, 250, 740, 230);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tekken Frame Data Browser 1.00     Spain 2016");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(510, 486, 290, 14);

        jLabelEasterEgg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tumblr_mz0itj9Yre1rmbhf9o1_500.gif"))); // NOI18N
        jPanel1.add(jLabelEasterEgg);
        jLabelEasterEgg.setBounds(170, -30, 470, 370);

        jButtonCopy.setBackground(new java.awt.Color(255, 255, 255));
        jButtonCopy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconCopy.png"))); // NOI18N
        jButtonCopy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCopyActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonCopy);
        jButtonCopy.setBounds(690, 190, 40, 40);

        jPanelMain.add(jPanel1);
        jPanel1.setBounds(0, 0, 800, 500);

        jLabelBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondo4.png"))); // NOI18N
        jLabelBackground.setFocusable(false);
        jPanelMain.add(jLabelBackground);
        jLabelBackground.setBounds(0, 0, 800, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSimpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSimpleActionPerformed
        jTableFull.setVisible(false);
        jScrollPaneFull.setVisible(false);
        
        jTableSimple.setVisible(true);
        jScrollPaneSimple.setVisible(true);  
        
        simpleFull = false;
    }//GEN-LAST:event_jButtonSimpleActionPerformed

    private void jButtonFullActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFullActionPerformed
        jTableFull.setVisible(true);
        jScrollPaneFull.setVisible(true);
        
        jTableSimple.setVisible(false);
        jScrollPaneSimple.setVisible(false);    
        
        simpleFull = true;
    }//GEN-LAST:event_jButtonFullActionPerformed

    private void jButtonOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOkActionPerformed
        CleanTable();    
        SearchInDb();
    }//GEN-LAST:event_jButtonOkActionPerformed

    private void jTextFieldMoveKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldMoveKeyPressed
        int c;
        c = evt.getKeyCode();
                   
        if(c == KeyEvent.VK_ENTER){
            CleanTable();
            SearchInDb();
        }                    
    }//GEN-LAST:event_jTextFieldMoveKeyPressed

    private void jButtonCopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCopyActionPerformed
        CopyFromTableToClipboard();
    }//GEN-LAST:event_jButtonCopyActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCopy;
    private javax.swing.JButton jButtonFull;
    private javax.swing.JButton jButtonOk;
    private javax.swing.JButton jButtonSimple;
    private javax.swing.JComboBox<String> jComboBoxChars;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelBackground;
    private javax.swing.JLabel jLabelEasterEgg;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JScrollPane jScrollPaneFull;
    private javax.swing.JScrollPane jScrollPaneSimple;
    private javax.swing.JTable jTableFull;
    private javax.swing.JTable jTableSimple;
    private javax.swing.JTextField jTextFieldMove;
    // End of variables declaration//GEN-END:variables
    // VARs arrays...
    boolean simpleFull = false;
    
    // END OF DECLARATION

    
    private void SearchInDb(){
        String codigoPer;
        String campos;
        String from;
        String where;
        String archivo;
        String move;
    
        ArrayList<String> aImprimir = new ArrayList<String>();  // Array list que imprimiremos en la tabla
        
        codigoPer = codigoPersonaje();
        campos = "INPUT, LEVEL, DAMAGE, SPEED, BLOCK, BLOCK, HIT, CHIT";
        
        from  = "MOVES";
        where = "CHAR_ID";
        archivo = "tekken.db";
        move = "INPUT like '%" + jTextFieldMove.getText() + "%' ";
        
        if((codigoPersonaje().equals("32")) && (jTextFieldMove.getText().equals("u/f+3"))){
            jLabelEasterEgg.setVisible(true);
        }else{jLabelEasterEgg.setVisible(false);}
    
      
    aImprimir = DeBdAArrayList.sacarDeBd(codigoPer, campos, from, where, archivo, move, simpleFull);
        
        String s;  
        int k = 0;
        int jj;
        int ii = 15;
        
        if(!simpleFull){
            jj = 4;
        }else{
            jj = 7;
        }
        
        for(int i = 0; i < ii; i++){
            for(int j = 0; j < jj; j++){
                if(aImprimir.size() > k){
                    s = aImprimir.get(k);
                    printFrames(s,i,j);
                }
                k++;           
            }
        }
        
    }
    
    private void printFrames(String s, int col, int row){
        if(simpleFull){
        jTableFull.getModel().setValueAt(s, col, row);
        }else{      
            jTableSimple.getModel().setValueAt(s, col, row);
        }
    }
    
    
    private void CleanTable(){
            
        int c = jTableFull.getColumnCount();
        int r = jTableFull.getRowCount();
    
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){                
                jTableFull.getModel().setValueAt("", i, j);              
            }
        } 
             
            int c2 = jTableSimple.getColumnCount();
            int r2 = jTableSimple.getRowCount();
    
        for(int i = 0; i < r2; i++){
            for(int j = 0; j < c2; j++){                
                jTableSimple.getModel().setValueAt("", i, j);
            }
        } 
    }
        
    private String codigoPersonaje() {
        String codigo;
        String pj = jComboBoxChars.getItemAt(jComboBoxChars.getSelectedIndex());
        
        switch(pj){
            case "Alex":
                codigo = "01";
                break;
            
            case "Alisa":
                codigo = "02";
                break;
            
            case "Ancient Ogre":
                codigo = "03";
                break;
            
            case "Angel":
                codigo = "04";
                break;
            
            case "Anna":
                codigo = "05";
                break;
            
            case "Armor King":
                codigo = "06";
                break;
            
            case "Asuka":
                codigo = "07";
                break;
            
            case "Baek":
                codigo = "08";
                break;
            
            case "Bob":
                codigo = "09";
                break;
            
            case "Bruce":
                codigo = "10";
                break;
            
            case "Bryan":
                codigo = "11";
                break;
            
            case "Christie":
                codigo = "12";
                break;
            
            case "Craig Marduk":
                codigo = "13";
                break;
            
            case "Devil Jin":
                codigo = "14";
                break;
            
            case "Dr B":
                codigo = "15";
                break;
            
            case "Dragunov":
                codigo = "16";
                break;
            
            case "Eddy":
                codigo = "17";
                break;
            
            case "Feng":
                codigo = "18";
                break;
            
            case "Ganryu":
                codigo = "19";
                break;
            
            case "Forest":
                codigo = "20";
                break;
            
            case "Heihachi":
                codigo = "21";
                break;
            
            case "Hwoarang":
                codigo = "22";
                break;
            
            case "Jack 6":
                codigo = "23";
                break;
            
            case "Jaycee":
                codigo = "24";
                break;
            
            case "Jin":
                codigo = "25";
                break;
            
            case "Jinpachi":
                codigo = "26";
                break;
            
            case "Jun":
                codigo = "27";
                break;
            
            case "Kazuya":
                codigo = "28";
                break;
            
            case "King":
                codigo = "29";
                break;
            
            case "Kuma/Panda":
                codigo = "30";
                break;
            
            case "Kunimitsu":
                codigo = "31";
                break;
            
            case "Lars":
                codigo = "32";
                break;
            
            case "Lee":
                codigo = "33";
                break;
            
            case "Lei":
                codigo = "34";
                break;
            
            case "Leo":
                codigo = "35";
                break;
            
            case "Lili":
                codigo = "36";
                break;
            
            case "Ling":
                codigo = "37";
                break;
            
            case "Marshall Law":
                codigo = "38";
                break;
            
            case "Michelle":
                codigo = "39";
                break;
            
            case "Miharu":
                codigo = "40";
                break;
            
            case "Miguel":
                codigo = "41";
                break;
            
            case "Nina":
                codigo = "42";
                break;
            
            case "True Ogre":
                codigo = "43";
                break;
            
            case "Paul":
                codigo = "44";
                break;
            
            case "P-Jack":
                codigo = "45";
                break;
            
            case "Raven":
                codigo = "46";
                break;
            
            case "Roger Jr.":
                codigo = "47";
                break;
            
            case "Sebastian":
                codigo = "48";
                break;
            
            case "Slim Bob":
                codigo = "49";
                break;
            
            case "Steve":
                codigo = "50";
                break;
            
            case "Tiger":
                codigo = "51";
                break;
            
            case "Unknown":
                codigo = "52";
                break;
            
            case "Violet":
                codigo = "53";
                break;
            
            case "Wang":
                codigo = "54";
                break;
            
            case "Yoshimitsu":
                codigo = "55";
                break;
                
            case "Zafina":
                codigo = "56";
                break;
                
            case "Basic Frame Data":
                codigo = "57";
                break;
                
            default:
                codigo = "01";
                break;
        }
                
        
        return codigo;
    }  

    private void CopyFromTableToClipboard() {
        String myString = new String();
        myString = myString + "Character: " + jComboBoxChars.getItemAt(jComboBoxChars.getSelectedIndex()) + "\n";
        
        int k = 0;
        int jj;
        int ii = 15;     
        if(!simpleFull){
            jj = 4;
        }else{
            jj = 7;
        }       
        for(int i = 0; i < ii; i++){
            for(int j = 0; j < jj; j++){
                if((jj == 4) && (!String.valueOf(jTableSimple.getModel().getValueAt(i, j)).equals(""))){   
                    switch(j){
                        case 0:
                            myString = myString + "INPUT: ";
                            break;
                        case 1:
                            myString = myString + "  SPEED: ";
                            break;
                        case 2:
                            myString = myString + "  ON BLOCK: ";
                            break;
                        case 3:
                            myString = myString + "  ON HIT: ";
                            break;
                    }
                }else{
                if(!(String.valueOf(jTableSimple.getModel().getValueAt(i, j)).equals(""))){
                    switch(j){
                        case 0:
                            myString = myString + "INPUT: ";
                            break;
                        case 1:
                            myString = myString + "  LEVEL: ";
                            break;
                        case 2:
                            myString = myString + "  DAMAGE: ";
                            break;
                        case 3:
                            myString = myString + "  SPEED: ";
                            break;
                        case 4:
                            myString = myString + "  ON BLOCK: ";
                            break;
                        case 5:
                            myString = myString + "  ON HIT: ";
                            break;
                        case 6:
                            myString = myString + "  ON COUNTER: ";
                            break;                        
                    }
                }
                }
                
                myString = myString + String.valueOf(jTableSimple.getModel().getValueAt(i, j));   
                myString = myString + "  ";
            }
            
            if(!(String.valueOf(jTableSimple.getModel().getValueAt(i, 0)).equals(""))){myString = myString + "\n";}
            k++;           
        }       
        
        StringSelection stringSelection = new StringSelection(myString);
        Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard();
        clpbrd.setContents(stringSelection, null);
    }
        
}
