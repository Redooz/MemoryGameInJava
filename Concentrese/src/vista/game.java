package vista;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SnakyDH
 */
public class Game extends javax.swing.JFrame {
    JLabel[] images = new JLabel[36];
    int numeroImagenes[] = new int[36];
    int controlRepeticiones[] = new int[18];
     
    /**
     * Creates new form game
     */
    public Game() {
        initComponents();
        initGame();
        
    }

    
    //private void init
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundGame = new javax.swing.JPanel();
        lblHighScore = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        panelMatriz = new javax.swing.JPanel();
        java1 = new javax.swing.JLabel();
        java2 = new javax.swing.JLabel();
        js1 = new javax.swing.JLabel();
        js2 = new javax.swing.JLabel();
        c1 = new javax.swing.JLabel();
        c2 = new javax.swing.JLabel();
        cpp1 = new javax.swing.JLabel();
        cpp2 = new javax.swing.JLabel();
        py1 = new javax.swing.JLabel();
        py2 = new javax.swing.JLabel();
        cs1 = new javax.swing.JLabel();
        cs2 = new javax.swing.JLabel();
        bash1 = new javax.swing.JLabel();
        bash2 = new javax.swing.JLabel();
        sql1 = new javax.swing.JLabel();
        sql2 = new javax.swing.JLabel();
        perl1 = new javax.swing.JLabel();
        perl2 = new javax.swing.JLabel();
        swift1 = new javax.swing.JLabel();
        swift2 = new javax.swing.JLabel();
        kt1 = new javax.swing.JLabel();
        kt2 = new javax.swing.JLabel();
        php1 = new javax.swing.JLabel();
        php2 = new javax.swing.JLabel();
        r1 = new javax.swing.JLabel();
        r2 = new javax.swing.JLabel();
        ru1 = new javax.swing.JLabel();
        ru2 = new javax.swing.JLabel();
        rs1 = new javax.swing.JLabel();
        rs2 = new javax.swing.JLabel();
        scala1 = new javax.swing.JLabel();
        scala2 = new javax.swing.JLabel();
        ts1 = new javax.swing.JLabel();
        ts2 = new javax.swing.JLabel();
        go1 = new javax.swing.JLabel();
        go2 = new javax.swing.JLabel();
        btnReset = new javax.swing.JButton();
        iconBG = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        MenuBar = new javax.swing.JMenuBar();
        ScoresMenu = new javax.swing.JMenu();
        HelpMenu = new javax.swing.JMenu();
        AboutMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(900, 590));
        setMinimumSize(new java.awt.Dimension(900, 590));
        setPreferredSize(new java.awt.Dimension(900, 590));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backgroundGame.setBackground(new java.awt.Color(29, 36, 44));
        backgroundGame.setMaximumSize(new java.awt.Dimension(900, 590));
        backgroundGame.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblHighScore.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblHighScore.setText("Your Score:");
        lblHighScore.setPreferredSize(new java.awt.Dimension(100, 20));
        backgroundGame.add(lblHighScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 110, 50));

        lblName.setBackground(new java.awt.Color(255, 255, 255));
        lblName.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblName.setText("Your name:");
        lblName.setMaximumSize(new java.awt.Dimension(3, 16));
        lblName.setPreferredSize(new java.awt.Dimension(58, 20));
        backgroundGame.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, 120, 60));

        panelMatriz.setBackground(new java.awt.Color(75, 58, 108));
        panelMatriz.setLayout(new java.awt.GridLayout(6, 6));

        java1.setForeground(new java.awt.Color(255, 255, 255));
        java1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/cardIcon.png"))); // NOI18N
        java1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                java1MouseClicked(evt);
            }
        });
        panelMatriz.add(java1);

        java2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/cardIcon.png"))); // NOI18N
        java2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                java2MouseClicked(evt);
            }
        });
        panelMatriz.add(java2);

        js1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/cardIcon.png"))); // NOI18N
        js1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                js1MouseClicked(evt);
            }
        });
        panelMatriz.add(js1);

        js2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/cardIcon.png"))); // NOI18N
        js2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                js2MouseClicked(evt);
            }
        });
        panelMatriz.add(js2);

        c1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/cardIcon.png"))); // NOI18N
        c1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c1MouseClicked(evt);
            }
        });
        panelMatriz.add(c1);

        c2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/cardIcon.png"))); // NOI18N
        c2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c2MouseClicked(evt);
            }
        });
        panelMatriz.add(c2);

        cpp1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/cardIcon.png"))); // NOI18N
        cpp1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cpp1MouseClicked(evt);
            }
        });
        panelMatriz.add(cpp1);

        cpp2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/cardIcon.png"))); // NOI18N
        cpp2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cpp2MouseClicked(evt);
            }
        });
        panelMatriz.add(cpp2);

        py1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/cardIcon.png"))); // NOI18N
        py1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                py1MouseClicked(evt);
            }
        });
        panelMatriz.add(py1);

        py2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/cardIcon.png"))); // NOI18N
        py2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                py2MouseClicked(evt);
            }
        });
        panelMatriz.add(py2);

        cs1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/cardIcon.png"))); // NOI18N
        cs1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cs1MouseClicked(evt);
            }
        });
        panelMatriz.add(cs1);

        cs2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/cardIcon.png"))); // NOI18N
        cs2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cs2MouseClicked(evt);
            }
        });
        panelMatriz.add(cs2);

        bash1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/cardIcon.png"))); // NOI18N
        bash1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bash1MouseClicked(evt);
            }
        });
        panelMatriz.add(bash1);

        bash2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/cardIcon.png"))); // NOI18N
        bash2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bash2MouseClicked(evt);
            }
        });
        panelMatriz.add(bash2);

        sql1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/cardIcon.png"))); // NOI18N
        sql1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sql1MouseClicked(evt);
            }
        });
        panelMatriz.add(sql1);

        sql2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/cardIcon.png"))); // NOI18N
        sql2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sql2MouseClicked(evt);
            }
        });
        panelMatriz.add(sql2);

        perl1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/cardIcon.png"))); // NOI18N
        perl1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                perl1MouseClicked(evt);
            }
        });
        panelMatriz.add(perl1);

        perl2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/cardIcon.png"))); // NOI18N
        perl2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                perl2MouseClicked(evt);
            }
        });
        panelMatriz.add(perl2);

        swift1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/cardIcon.png"))); // NOI18N
        swift1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                swift1MouseClicked(evt);
            }
        });
        panelMatriz.add(swift1);

        swift2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/cardIcon.png"))); // NOI18N
        swift2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                swift2MouseClicked(evt);
            }
        });
        panelMatriz.add(swift2);

        kt1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/cardIcon.png"))); // NOI18N
        kt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kt1MouseClicked(evt);
            }
        });
        panelMatriz.add(kt1);

        kt2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/cardIcon.png"))); // NOI18N
        kt2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kt2MouseClicked(evt);
            }
        });
        panelMatriz.add(kt2);

        php1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/cardIcon.png"))); // NOI18N
        php1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                php1MouseClicked(evt);
            }
        });
        panelMatriz.add(php1);

        php2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/cardIcon.png"))); // NOI18N
        php2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                php2MouseClicked(evt);
            }
        });
        panelMatriz.add(php2);

        r1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/cardIcon.png"))); // NOI18N
        r1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                r1MouseClicked(evt);
            }
        });
        panelMatriz.add(r1);

        r2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/cardIcon.png"))); // NOI18N
        r2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                r2MouseClicked(evt);
            }
        });
        panelMatriz.add(r2);

        ru1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/cardIcon.png"))); // NOI18N
        ru1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ru1MouseClicked(evt);
            }
        });
        panelMatriz.add(ru1);

        ru2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/cardIcon.png"))); // NOI18N
        ru2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ru2MouseClicked(evt);
            }
        });
        panelMatriz.add(ru2);

        rs1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/cardIcon.png"))); // NOI18N
        rs1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rs1MouseClicked(evt);
            }
        });
        panelMatriz.add(rs1);

        rs2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/cardIcon.png"))); // NOI18N
        rs2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rs2MouseClicked(evt);
            }
        });
        panelMatriz.add(rs2);

        scala1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/cardIcon.png"))); // NOI18N
        scala1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                scala1MouseClicked(evt);
            }
        });
        panelMatriz.add(scala1);

        scala2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/cardIcon.png"))); // NOI18N
        scala2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                scala2MouseClicked(evt);
            }
        });
        panelMatriz.add(scala2);

        ts1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/cardIcon.png"))); // NOI18N
        ts1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ts1MouseClicked(evt);
            }
        });
        panelMatriz.add(ts1);

        ts2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/cardIcon.png"))); // NOI18N
        ts2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ts2MouseClicked(evt);
            }
        });
        panelMatriz.add(ts2);

        go1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/cardIcon.png"))); // NOI18N
        go1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                go1MouseClicked(evt);
            }
        });
        panelMatriz.add(go1);

        go2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/cardIcon.png"))); // NOI18N
        go2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                go2MouseClicked(evt);
            }
        });
        panelMatriz.add(go2);

        backgroundGame.add(panelMatriz, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 480, 480));

        btnReset.setText("Reset");
        btnReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnResetMouseClicked(evt);
            }
        });
        backgroundGame.add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 500, -1, -1));

        iconBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/backgroundGame.png"))); // NOI18N
        backgroundGame.add(iconBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, 490));

        jLabel1.setText("10000");
        backgroundGame.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 50, -1));

        jLabel2.setText("SnakyDH");
        backgroundGame.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 40, -1, 20));

        getContentPane().add(backgroundGame, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 900, 590));

        ScoresMenu.setText("Scores");
        MenuBar.add(ScoresMenu);

        HelpMenu.setText("Help");
        MenuBar.add(HelpMenu);

        AboutMenu.setText("About Us");
        MenuBar.add(AboutMenu);

        setJMenuBar(MenuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResetMouseClicked
        // TODO add your handling code here:
        if(evt.getSource() == btnReset){
            initGame();
            for (int i = 0; i < images.length; i++) {
                images[i].setIcon(new ImageIcon(getClass().getResource("/vista/img/cardIcon.png")));
            }
        }
    }//GEN-LAST:event_btnResetMouseClicked

    private void java1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_java1MouseClicked

        for (int i = 0; i < images.length; i++) {
            if(evt.getSource() == images[i]){
                images[i].setIcon(new ImageIcon(getClass().getResource("/vista/img/"+ numeroImagenes[i] +".png")));
            }
        }
    }//GEN-LAST:event_java1MouseClicked

    private void java2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_java2MouseClicked
        for (int i = 0; i < images.length; i++) {
            if(evt.getSource() == images[i]){
                images[i].setIcon(new ImageIcon(getClass().getResource("/vista/img/"+ numeroImagenes[i] +".png")));
            }
        }
    }//GEN-LAST:event_java2MouseClicked

    private void js1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_js1MouseClicked
        for (int i = 0; i < images.length; i++) {
            if(evt.getSource() == images[i]){
                images[i].setIcon(new ImageIcon(getClass().getResource("/vista/img/"+ numeroImagenes[i] +".png")));
            }
        }
    }//GEN-LAST:event_js1MouseClicked

    private void js2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_js2MouseClicked
        for (int i = 0; i < images.length; i++) {
            if(evt.getSource() == images[i]){
                images[i].setIcon(new ImageIcon(getClass().getResource("/vista/img/"+ numeroImagenes[i] +".png")));
            }
        }
    }//GEN-LAST:event_js2MouseClicked

    private void c1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c1MouseClicked
        for (int i = 0; i < images.length; i++) {
            if(evt.getSource() == images[i]){
                images[i].setIcon(new ImageIcon(getClass().getResource("/vista/img/"+ numeroImagenes[i] +".png")));
            }
        }
    }//GEN-LAST:event_c1MouseClicked

    private void c2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c2MouseClicked
        for (int i = 0; i < images.length; i++) {
            if(evt.getSource() == images[i]){
                images[i].setIcon(new ImageIcon(getClass().getResource("/vista/img/"+ numeroImagenes[i] +".png")));
            }
        }
    }//GEN-LAST:event_c2MouseClicked

    private void cpp1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cpp1MouseClicked
        for (int i = 0; i < images.length; i++) {
            if(evt.getSource() == images[i]){
                images[i].setIcon(new ImageIcon(getClass().getResource("/vista/img/"+ numeroImagenes[i] +".png")));
            }
        }
    }//GEN-LAST:event_cpp1MouseClicked

    private void cpp2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cpp2MouseClicked
        for (int i = 0; i < images.length; i++) {
            if(evt.getSource() == images[i]){
                images[i].setIcon(new ImageIcon(getClass().getResource("/vista/img/"+ numeroImagenes[i] +".png")));
            }
        }
        
    }//GEN-LAST:event_cpp2MouseClicked

    private void py1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_py1MouseClicked
        for (int i = 0; i < images.length; i++) {
            if(evt.getSource() == images[i]){
                images[i].setIcon(new ImageIcon(getClass().getResource("/vista/img/"+ numeroImagenes[i] +".png")));
            }
        }
    }//GEN-LAST:event_py1MouseClicked

    private void py2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_py2MouseClicked
        for (int i = 0; i < images.length; i++) {
            if(evt.getSource() == images[i]){
                images[i].setIcon(new ImageIcon(getClass().getResource("/vista/img/"+ numeroImagenes[i] +".png")));
            }
        }
    }//GEN-LAST:event_py2MouseClicked

    private void cs1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cs1MouseClicked
        for (int i = 0; i < images.length; i++) {
            if(evt.getSource() == images[i]){
                images[i].setIcon(new ImageIcon(getClass().getResource("/vista/img/"+ numeroImagenes[i] +".png")));
            }
        }
    }//GEN-LAST:event_cs1MouseClicked

    private void cs2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cs2MouseClicked
        for (int i = 0; i < images.length; i++) {
            if(evt.getSource() == images[i]){
                images[i].setIcon(new ImageIcon(getClass().getResource("/vista/img/"+ numeroImagenes[i] +".png")));
            }
        }
    }//GEN-LAST:event_cs2MouseClicked

    private void bash1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bash1MouseClicked
        for (int i = 0; i < images.length; i++) {
            if(evt.getSource() == images[i]){
                images[i].setIcon(new ImageIcon(getClass().getResource("/vista/img/"+ numeroImagenes[i] +".png")));
            }
        }
    }//GEN-LAST:event_bash1MouseClicked

    private void bash2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bash2MouseClicked
        for (int i = 0; i < images.length; i++) {
            if(evt.getSource() == images[i]){
                images[i].setIcon(new ImageIcon(getClass().getResource("/vista/img/"+ numeroImagenes[i] +".png")));
            }
        }
    }//GEN-LAST:event_bash2MouseClicked

    private void sql1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sql1MouseClicked
        for (int i = 0; i < images.length; i++) {
            if(evt.getSource() == images[i]){
                images[i].setIcon(new ImageIcon(getClass().getResource("/vista/img/"+ numeroImagenes[i] +".png")));
            }
        }
    }//GEN-LAST:event_sql1MouseClicked

    private void sql2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sql2MouseClicked
        for (int i = 0; i < images.length; i++) {
            if(evt.getSource() == images[i]){
                images[i].setIcon(new ImageIcon(getClass().getResource("/vista/img/"+ numeroImagenes[i] +".png")));
            }
        }
    }//GEN-LAST:event_sql2MouseClicked

    private void perl1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_perl1MouseClicked
        for (int i = 0; i < images.length; i++) {
            if(evt.getSource() == images[i]){
                images[i].setIcon(new ImageIcon(getClass().getResource("/vista/img/"+ numeroImagenes[i] +".png")));
            }
        }
    }//GEN-LAST:event_perl1MouseClicked

    private void perl2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_perl2MouseClicked
        for (int i = 0; i < images.length; i++) {
            if(evt.getSource() == images[i]){
                images[i].setIcon(new ImageIcon(getClass().getResource("/vista/img/"+ numeroImagenes[i] +".png")));
            }
        }
    }//GEN-LAST:event_perl2MouseClicked

    private void swift1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_swift1MouseClicked
        for (int i = 0; i < images.length; i++) {
            if(evt.getSource() == images[i]){
                images[i].setIcon(new ImageIcon(getClass().getResource("/vista/img/"+ numeroImagenes[i] +".png")));
            }
        }
    }//GEN-LAST:event_swift1MouseClicked

    private void swift2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_swift2MouseClicked
        for (int i = 0; i < images.length; i++) {
            if(evt.getSource() == images[i]){
                images[i].setIcon(new ImageIcon(getClass().getResource("/vista/img/"+ numeroImagenes[i] +".png")));
            }
        }
    }//GEN-LAST:event_swift2MouseClicked

    private void kt1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kt1MouseClicked
        for (int i = 0; i < images.length; i++) {
            if(evt.getSource() == images[i]){
                images[i].setIcon(new ImageIcon(getClass().getResource("/vista/img/"+ numeroImagenes[i] +".png")));
            }
        }
    }//GEN-LAST:event_kt1MouseClicked

    private void kt2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kt2MouseClicked
        for (int i = 0; i < images.length; i++) {
            if(evt.getSource() == images[i]){
                images[i].setIcon(new ImageIcon(getClass().getResource("/vista/img/"+ numeroImagenes[i] +".png")));
            }
        }
    }//GEN-LAST:event_kt2MouseClicked

    private void php1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_php1MouseClicked
        for (int i = 0; i < images.length; i++) {
            if(evt.getSource() == images[i]){
                images[i].setIcon(new ImageIcon(getClass().getResource("/vista/img/"+ numeroImagenes[i] +".png")));
            }
        }
    }//GEN-LAST:event_php1MouseClicked

    private void php2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_php2MouseClicked
        for (int i = 0; i < images.length; i++) {
            if(evt.getSource() == images[i]){
                images[i].setIcon(new ImageIcon(getClass().getResource("/vista/img/"+ numeroImagenes[i] +".png")));
            }
        }
    }//GEN-LAST:event_php2MouseClicked

    private void r1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_r1MouseClicked
        for (int i = 0; i < images.length; i++) {
            if(evt.getSource() == images[i]){
                images[i].setIcon(new ImageIcon(getClass().getResource("/vista/img/"+ numeroImagenes[i] +".png")));
            }
        }
    }//GEN-LAST:event_r1MouseClicked

    private void r2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_r2MouseClicked
        for (int i = 0; i < images.length; i++) {
            if(evt.getSource() == images[i]){
                images[i].setIcon(new ImageIcon(getClass().getResource("/vista/img/"+ numeroImagenes[i] +".png")));
            }
        }
    }//GEN-LAST:event_r2MouseClicked

    private void ru1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ru1MouseClicked
        for (int i = 0; i < images.length; i++) {
            if(evt.getSource() == images[i]){
                images[i].setIcon(new ImageIcon(getClass().getResource("/vista/img/"+ numeroImagenes[i] +".png")));
            }
        }
    }//GEN-LAST:event_ru1MouseClicked

    private void ru2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ru2MouseClicked
        for (int i = 0; i < images.length; i++) {
            if(evt.getSource() == images[i]){
                images[i].setIcon(new ImageIcon(getClass().getResource("/vista/img/"+ numeroImagenes[i] +".png")));
            }
        }
    }//GEN-LAST:event_ru2MouseClicked

    private void rs1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rs1MouseClicked
        for (int i = 0; i < images.length; i++) {
            if(evt.getSource() == images[i]){
                images[i].setIcon(new ImageIcon(getClass().getResource("/vista/img/"+ numeroImagenes[i] +".png")));
            }
        }
    }//GEN-LAST:event_rs1MouseClicked

    private void rs2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rs2MouseClicked
        for (int i = 0; i < images.length; i++) {
            if(evt.getSource() == images[i]){
                images[i].setIcon(new ImageIcon(getClass().getResource("/vista/img/"+ numeroImagenes[i] +".png")));
            }
        }
    }//GEN-LAST:event_rs2MouseClicked

    private void scala1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_scala1MouseClicked
        for (int i = 0; i < images.length; i++) {
            if(evt.getSource() == images[i]){
                images[i].setIcon(new ImageIcon(getClass().getResource("/vista/img/"+ numeroImagenes[i] +".png")));
            }
        }
    }//GEN-LAST:event_scala1MouseClicked

    private void scala2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_scala2MouseClicked
        for (int i = 0; i < images.length; i++) {
            if(evt.getSource() == images[i]){
                images[i].setIcon(new ImageIcon(getClass().getResource("/vista/img/"+ numeroImagenes[i] +".png")));
            }
        }
    }//GEN-LAST:event_scala2MouseClicked

    private void ts1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ts1MouseClicked
        for (int i = 0; i < images.length; i++) {
            if(evt.getSource() == images[i]){
                images[i].setIcon(new ImageIcon(getClass().getResource("/vista/img/"+ numeroImagenes[i] +".png")));
            }
        }
    }//GEN-LAST:event_ts1MouseClicked

    private void ts2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ts2MouseClicked
        for (int i = 0; i < images.length; i++) {
            if(evt.getSource() == images[i]){
                images[i].setIcon(new ImageIcon(getClass().getResource("/vista/img/"+ numeroImagenes[i] +".png")));
            }
        }
    }//GEN-LAST:event_ts2MouseClicked

    private void go1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_go1MouseClicked
        for (int i = 0; i < images.length; i++) {
            if(evt.getSource() == images[i]){
                images[i].setIcon(new ImageIcon(getClass().getResource("/vista/img/"+ numeroImagenes[i] +".png")));
            }
        }
    }//GEN-LAST:event_go1MouseClicked

    private void go2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_go2MouseClicked
        for (int i = 0; i < images.length; i++) {
            if(evt.getSource() == images[i]){
                images[i].setIcon(new ImageIcon(getClass().getResource("/vista/img/"+ numeroImagenes[i] +".png")));
            }
        }
    }//GEN-LAST:event_go2MouseClicked
                              
 
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Game().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu AboutMenu;
    private javax.swing.JMenu HelpMenu;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JMenu ScoresMenu;
    private javax.swing.JPanel backgroundGame;
    private javax.swing.JLabel bash1;
    private javax.swing.JLabel bash2;
    private javax.swing.JButton btnReset;
    private javax.swing.JLabel c1;
    private javax.swing.JLabel c2;
    private javax.swing.JLabel cpp1;
    private javax.swing.JLabel cpp2;
    private javax.swing.JLabel cs1;
    private javax.swing.JLabel cs2;
    private javax.swing.JLabel go1;
    private javax.swing.JLabel go2;
    private javax.swing.JLabel iconBG;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel java1;
    private javax.swing.JLabel java2;
    private javax.swing.JLabel js1;
    private javax.swing.JLabel js2;
    private javax.swing.JLabel kt1;
    private javax.swing.JLabel kt2;
    private javax.swing.JLabel lblHighScore;
    private javax.swing.JLabel lblName;
    private javax.swing.JPanel panelMatriz;
    private javax.swing.JLabel perl1;
    private javax.swing.JLabel perl2;
    private javax.swing.JLabel php1;
    private javax.swing.JLabel php2;
    private javax.swing.JLabel py1;
    private javax.swing.JLabel py2;
    private javax.swing.JLabel r1;
    private javax.swing.JLabel r2;
    private javax.swing.JLabel rs1;
    private javax.swing.JLabel rs2;
    private javax.swing.JLabel ru1;
    private javax.swing.JLabel ru2;
    private javax.swing.JLabel scala1;
    private javax.swing.JLabel scala2;
    private javax.swing.JLabel sql1;
    private javax.swing.JLabel sql2;
    private javax.swing.JLabel swift1;
    private javax.swing.JLabel swift2;
    private javax.swing.JLabel ts1;
    private javax.swing.JLabel ts2;
    // End of variables declaration//GEN-END:variables

    private void initGame() {
        int imagePosition;
        Random nRandom = new Random();
        
        initImages();
        initArrays(numeroImagenes); 
        initArrays(controlRepeticiones);
                
        for (int i = 0; i < numeroImagenes.length; i++) {
            imagePosition = nRandom.nextInt(18);
            
            if (controlRepeticiones[imagePosition] < 2) {
                numeroImagenes[i] = imagePosition + 1;
                controlRepeticiones[imagePosition]++;
                System.out.print(numeroImagenes[i] + "-");
            } else {
                i--;
            }
        }
        System.out.print("\n");
    }
    
    private void initArrays(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = 0;
        }
    }

    private void initImages() {
        images[0] = bash1; 
        images[1] = bash2; 
        images[2] = cs1; 
        images[3] = cs2; 
        images[4] = c1; 
        images[5] = c2; 
        images[6] = cpp1; 
        images[7] = cpp2; 
        images[8] = go1; 
        images[9] = go2; 
        images[10] = java1; 
        images[11] = java2;
        images[12] = js1; 
        images[13] = js2; 
        images[14] = kt1; 
        images[15] = kt2;
        images[16] = perl1; 
        images[17] = perl2;
        images[18] = php1; 
        images[19] = php2; 
        images[20] = py1; 
        images[21] = py2; 
        images[22] = r1; 
        images[23] = r2;
        images[24] = ru1; 
        images[25] = ru2; 
        images[26] = rs1; 
        images[27] = rs2; 
        images[28] = scala1; 
        images[29] = scala2;
        images[30] = sql1; 
        images[31] = sql2; 
        images[32] = swift1; 
        images[33] = swift2; 
        images[34] = ts1; 
        images[35] = ts2;
        
    }

}
