/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectosJava;

import java.awt.Color;
import java.awt.Frame;
import static java.awt.Image.SCALE_DEFAULT;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Ale
 */
public class TresRaya extends javax.swing.JFrame {

    private ImageIcon icono;
    private ImageIcon imagen;
    private String player1;
    private String player2;
    int marcadorX = 0;
    int marcadorO = 0;
    String turno = "O";
    int juego = 0;
    JLabel[] lbs = new JLabel[9];
         int[][] vs = {
            {1,2,3},
            {4,5,6},
            {7,8,9},
            {1,4,7},
            {2,5,8},
            {3,6,9},
            {1,5,9},
            {3,5,7},
        };
  

    public TresRaya() {
        
        initComponents();
         this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/pngwing.com.png")));
        this.setLocationRelativeTo(this);
        this.pintarImagen(this.jLabel7, "/images/btn_exit.png");
        this.pintarImagen(this.jLabel6, "/images/btn_minimize.png");
       
        lbs[0] = pnl1;
        lbs[1] = pnl2;
        lbs[2] = pnl3;
        lbs[3] = pnl4;
        lbs[4] = pnl5;
        lbs[5] = pnl6;
        lbs[6] = pnl7;
        lbs[7] = pnl8;
        lbs[8] = pnl9;
   

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        pnl1 = new javax.swing.JLabel();
        pnl2 = new javax.swing.JLabel();
        pnl3 = new javax.swing.JLabel();
        pnl4 = new javax.swing.JLabel();
        pnl5 = new javax.swing.JLabel();
        pnl6 = new javax.swing.JLabel();
        pnl7 = new javax.swing.JLabel();
        pnl8 = new javax.swing.JLabel();
        pnl9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(243, 239, 238));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Turno: O   ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, -1, -1));

        jPanel2.setBackground(new java.awt.Color(30, 30, 30));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Reiniciar");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, 30));

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl1.setBackground(new java.awt.Color(255, 255, 255));
        pnl1.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        pnl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnl1.setOpaque(true);
        pnl1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl1MouseClicked(evt);
            }
        });
        jPanel3.add(pnl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 90));

        pnl2.setBackground(new java.awt.Color(255, 255, 255));
        pnl2.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        pnl2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnl2.setOpaque(true);
        pnl2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl2MouseClicked(evt);
            }
        });
        jPanel3.add(pnl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 90, 90));

        pnl3.setBackground(new java.awt.Color(255, 255, 255));
        pnl3.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        pnl3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnl3.setOpaque(true);
        pnl3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl3MouseClicked(evt);
            }
        });
        jPanel3.add(pnl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 90, 90));

        pnl4.setBackground(new java.awt.Color(255, 255, 255));
        pnl4.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        pnl4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnl4.setOpaque(true);
        pnl4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl4MouseClicked(evt);
            }
        });
        jPanel3.add(pnl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 90, 90));

        pnl5.setBackground(new java.awt.Color(255, 255, 255));
        pnl5.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        pnl5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnl5.setOpaque(true);
        pnl5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl5MouseClicked(evt);
            }
        });
        jPanel3.add(pnl5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 90, 90));

        pnl6.setBackground(new java.awt.Color(255, 255, 255));
        pnl6.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        pnl6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnl6.setOpaque(true);
        pnl6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl6MouseClicked(evt);
            }
        });
        jPanel3.add(pnl6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 90, 90));

        pnl7.setBackground(new java.awt.Color(255, 255, 255));
        pnl7.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        pnl7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnl7.setOpaque(true);
        pnl7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl7MouseClicked(evt);
            }
        });
        jPanel3.add(pnl7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 90, 90));

        pnl8.setBackground(new java.awt.Color(255, 255, 255));
        pnl8.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        pnl8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnl8.setOpaque(true);
        pnl8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl8MouseClicked(evt);
            }
        });
        jPanel3.add(pnl8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 90, 90));

        pnl9.setBackground(new java.awt.Color(255, 255, 255));
        pnl9.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        pnl9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnl9.setOpaque(true);
        pnl9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl9MouseClicked(evt);
            }
        });
        jPanel3.add(pnl9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 90, 90));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 310, 310));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel3.setText("X: 0");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel4.setText("O: 0    ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 400, -1, -1));

        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 15, 15));

        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 15, 15));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        // TODO add your handling code here:
        jPanel2.setBackground(new java.awt.Color(80, 80, 80));
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        // TODO add your handling code here:
        jPanel2.setBackground(new java.awt.Color(30, 30, 30));
    }//GEN-LAST:event_jLabel2MouseExited

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        turno="O";
        jLabel1.setText("Turno: " + turno);
        for(int i=0;i<lbs.length;i++){
            lbs[i].setText("");
            lbs[i].setBackground(Color.WHITE);        }
        juego = 0;
        
        
    }//GEN-LAST:event_jLabel2MouseClicked

    private void pnl1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl1MouseClicked
        // TODO add your handling code here:
        presionar(1);
        
    }//GEN-LAST:event_pnl1MouseClicked

    private void pnl2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl2MouseClicked
        // TODO add your handling code here:
        presionar(2);
    }//GEN-LAST:event_pnl2MouseClicked

    private void pnl3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl3MouseClicked
presionar(3);        // TODO add your handling code here:
    }//GEN-LAST:event_pnl3MouseClicked

    private void pnl4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl4MouseClicked
presionar(4);        // TODO add your handling code here:
    }//GEN-LAST:event_pnl4MouseClicked

    private void pnl5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl5MouseClicked
presionar(5);        // TODO add your handling code here:
    }//GEN-LAST:event_pnl5MouseClicked

    private void pnl6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl6MouseClicked
presionar(6);        // TODO add your handling code here:
    }//GEN-LAST:event_pnl6MouseClicked

    private void pnl7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl7MouseClicked
presionar(7);        // TODO add your handling code here:
    }//GEN-LAST:event_pnl7MouseClicked

    private void pnl8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl8MouseClicked
presionar(8);        // TODO add your handling code here:
    }//GEN-LAST:event_pnl8MouseClicked

    private void pnl9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl9MouseClicked
presionar(9);        // TODO add your handling code here:
    }//GEN-LAST:event_pnl9MouseClicked

    
    public void presionar(int casilla){
        if(lbs[casilla-1].getText().equals("")&&juego==0){
        lbs[casilla-1].setText(turno);
        comprobarGanador();
        cambiarTurno();}
        
    }
    
    public void cambiarTurno(){
        
        
        if (turno.equals("X")){
            turno="O";
           
        }else{
            turno="X";
        }
         jLabel1.setText("Turno: " + turno);
       
    }
    
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
            java.util.logging.Logger.getLogger(TresRaya.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TresRaya.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TresRaya.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TresRaya.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TresRaya().setVisible(true);
            }
        });
    }
    
      private void pintarImagen (JLabel lbl, String ruta){
        this.imagen = new ImageIcon(getClass().getResource(ruta));
        this.icono = new ImageIcon(
                this.imagen.getImage().getScaledInstance(
                        lbl.getWidth(),
                       lbl.getHeight(),
                       SCALE_DEFAULT)
        );
        lbl.setIcon(this.icono);
        this.repaint();
    }
    private void comprobarGanador(){
        for(int i = 0 ; i<vs.length;i++){
            if(lbs[vs[i][0]-1].getText().equals("X")&&
                    lbs[vs[i][1]-1].getText().equals("X")&&
                    lbs[vs[i][2]-1].getText().equals("X")){
                    juego = 1;
                    lbs[vs[i][0]-1].setBackground(Color.GREEN);
                    lbs[vs[i][1]-1].setBackground(Color.GREEN);
                    lbs[vs[i][2]-1].setBackground(Color.GREEN);
                    jLabel3.setText("X: " + ++marcadorX);
                    JOptionPane.showMessageDialog(null, "Ganaron las X");
                    
                    
            }
             if(lbs[vs[i][0]-1].getText().equals("O")&&
                    lbs[vs[i][1]-1].getText().equals("O")&&
                    lbs[vs[i][2]-1].getText().equals("O")){
                    juego = 1;
                    lbs[vs[i][0]-1].setBackground(Color.GREEN);
                    lbs[vs[i][1]-1].setBackground(Color.GREEN);
                    lbs[vs[i][2]-1].setBackground(Color.GREEN);
                    jLabel4.setText("O: " + ++marcadorO);
                    JOptionPane.showMessageDialog(null, "Ganaron las O");
                    
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel pnl1;
    private javax.swing.JLabel pnl2;
    private javax.swing.JLabel pnl3;
    private javax.swing.JLabel pnl4;
    private javax.swing.JLabel pnl5;
    private javax.swing.JLabel pnl6;
    private javax.swing.JLabel pnl7;
    private javax.swing.JLabel pnl8;
    private javax.swing.JLabel pnl9;
    // End of variables declaration//GEN-END:variables
}