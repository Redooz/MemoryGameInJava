package vista;
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

    /**
     * Creates new form game
     */
    public Game() {
        initComponents();
    }

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
        iconBG = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(900, 590));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backgroundGame.setBackground(new java.awt.Color(29, 36, 44));
        backgroundGame.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblHighScore.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblHighScore.setText("Your Score:");
        lblHighScore.setPreferredSize(new java.awt.Dimension(100, 20));
        backgroundGame.add(lblHighScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 110, 50));

        lblName.setBackground(new java.awt.Color(255, 255, 255));
        lblName.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblName.setText("Your name:");
        lblName.setMaximumSize(new java.awt.Dimension(3, 16));
        lblName.setPreferredSize(new java.awt.Dimension(58, 20));
        backgroundGame.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 30, 120, 60));

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

        backgroundGame.add(panelMatriz, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 480, 480));

        iconBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/backgroundGame.png"))); // NOI18N
        backgroundGame.add(iconBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, -1, 480));

        jLabel1.setText("10000");
        backgroundGame.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 50, -1));

        jLabel2.setText("SnakyDH");
        backgroundGame.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 50, -1, 20));

        getContentPane().add(backgroundGame, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 900, 600));

        jMenu1.setText("Scores");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Help");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("About Us");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void java1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_java1MouseClicked
        java1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/java.png"))); // NOI18N
    }//GEN-LAST:event_java1MouseClicked

    private void java2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_java2MouseClicked
        java2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/java.png")));
    }//GEN-LAST:event_java2MouseClicked

    private void js1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_js1MouseClicked
        js1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/javascript.png")));
    }//GEN-LAST:event_js1MouseClicked

    private void js2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_js2MouseClicked
        js2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/javascript.png")));
    }//GEN-LAST:event_js2MouseClicked

    private void c1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c1MouseClicked
        c1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/c.png")));
    }//GEN-LAST:event_c1MouseClicked

    private void c2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c2MouseClicked
        c2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/c.png")));
    }//GEN-LAST:event_c2MouseClicked

    private void cpp1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cpp1MouseClicked
        cpp1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/cpp.png")));
    }//GEN-LAST:event_cpp1MouseClicked

    private void cpp2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cpp2MouseClicked
        cpp2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/cpp.png")));
    }//GEN-LAST:event_cpp2MouseClicked

    private void py1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_py1MouseClicked
        py1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/python.png")));
    }//GEN-LAST:event_py1MouseClicked

    private void py2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_py2MouseClicked
        py2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/python.png")));
    }//GEN-LAST:event_py2MouseClicked

    private void cs1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cs1MouseClicked
        cs1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/c#.png")));
    }//GEN-LAST:event_cs1MouseClicked

    private void cs2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cs2MouseClicked
        cs2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/c#.png")));
    }//GEN-LAST:event_cs2MouseClicked

    private void bash1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bash1MouseClicked
        bash1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/bash.png")));
    }//GEN-LAST:event_bash1MouseClicked

    private void bash2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bash2MouseClicked
        bash2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/bash.png")));
    }//GEN-LAST:event_bash2MouseClicked

    private void sql1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sql1MouseClicked
        sql1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/sql.png")));
    }//GEN-LAST:event_sql1MouseClicked

    private void sql2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sql2MouseClicked
        sql2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/sql.png")));
    }//GEN-LAST:event_sql2MouseClicked

    private void perl1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_perl1MouseClicked
        perl1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/perl.png")));
    }//GEN-LAST:event_perl1MouseClicked

    private void perl2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_perl2MouseClicked
        perl2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/perl.png")));
    }//GEN-LAST:event_perl2MouseClicked

    private void swift1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_swift1MouseClicked
        swift1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/swift.png")));
    }//GEN-LAST:event_swift1MouseClicked

    private void swift2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_swift2MouseClicked
        swift2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/swift.png")));
    }//GEN-LAST:event_swift2MouseClicked

    private void kt1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kt1MouseClicked
        kt1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/kotlin.png")));
    }//GEN-LAST:event_kt1MouseClicked

    private void kt2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kt2MouseClicked
        kt2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/kotlin.png")));
    }//GEN-LAST:event_kt2MouseClicked

    private void php1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_php1MouseClicked
        php1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/php.png")));
    }//GEN-LAST:event_php1MouseClicked

    private void php2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_php2MouseClicked
        php2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/php.png")));
    }//GEN-LAST:event_php2MouseClicked

    private void r1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_r1MouseClicked
        r1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/r.png")));
    }//GEN-LAST:event_r1MouseClicked

    private void r2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_r2MouseClicked
        r2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/r.png")));
    }//GEN-LAST:event_r2MouseClicked

    private void ru1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ru1MouseClicked
        ru1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/ruby.png")));
    }//GEN-LAST:event_ru1MouseClicked

    private void ru2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ru2MouseClicked
        ru2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/ruby.png")));
    }//GEN-LAST:event_ru2MouseClicked

    private void rs1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rs1MouseClicked
        rs1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/rust.png")));
    }//GEN-LAST:event_rs1MouseClicked

    private void rs2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rs2MouseClicked
        rs2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/rust.png")));
    }//GEN-LAST:event_rs2MouseClicked

    private void scala1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_scala1MouseClicked
        scala1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/scala.png")));
    }//GEN-LAST:event_scala1MouseClicked

    private void scala2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_scala2MouseClicked
        scala2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/scala.png")));
    }//GEN-LAST:event_scala2MouseClicked

    private void ts1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ts1MouseClicked
        ts1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/typescript.png")));
    }//GEN-LAST:event_ts1MouseClicked

    private void ts2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ts2MouseClicked
        ts2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/typescript.png")));
    }//GEN-LAST:event_ts2MouseClicked

    private void go1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_go1MouseClicked
        go1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/golang.png")));
    }//GEN-LAST:event_go1MouseClicked

    private void go2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_go2MouseClicked
        go2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/golang.png")));
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
    private javax.swing.JPanel backgroundGame;
    private javax.swing.JLabel bash1;
    private javax.swing.JLabel bash2;
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
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
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
}
