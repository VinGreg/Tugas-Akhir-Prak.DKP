/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.JOptionPane;
/**
 *
 * @author VINCENT GINTING
 */
public class Utama extends javax.swing.JFrame {

    /**
     * Creates new form Utama
     */
    public Utama() {                                                    //Variabel (Utama)
        initComponents();
        
        this.setLocationRelativeTo(null);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TblLogin = new javax.swing.JButton();
        Keluar = new javax.swing.JButton();
        isiUser = new javax.swing.JTextField();
        isiPass = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(51, 51, 255));
        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        jLabel1.setText("Selamat Datang di MovieHalal");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(50, 10, 340, 42);
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 20, 0);

        jLabel3.setText("Username :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 60, 70, 14);

        jLabel5.setText("Password :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 110, 60, 14);

        TblLogin.setText("Login");
        TblLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TblLoginActionPerformed(evt);
            }
        });
        jPanel1.add(TblLogin);
        TblLogin.setBounds(60, 200, 70, 23);

        Keluar.setText("Keluar");
        Keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KeluarActionPerformed(evt);
            }
        });
        jPanel1.add(Keluar);
        Keluar.setBounds(310, 200, 63, 23);

        isiUser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                isiUserFocusGained(evt);
            }
        });
        isiUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isiUserActionPerformed(evt);
            }
        });
        jPanel1.add(isiUser);
        isiUser.setBounds(100, 60, 230, 30);

        isiPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                isiPassFocusGained(evt);
            }
        });
        isiPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isiPassActionPerformed(evt);
            }
        });
        jPanel1.add(isiPass);
        isiPass.setBounds(100, 100, 230, 30);

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\VINCENT GINTING\\Pictures\\me\\BG gradient utama.jpg")); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(0, 0, 450, 250);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TblLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TblLoginActionPerformed
      String empass[] []={{"vincentgg","12345678"},{"gregory21","87654321"}};           // Tipe data String dan Array multidimensi
        for (int i=0;i<empass.length;i--){                                                             // Looping (perulangan)   //variabel i
                if (isiUser.getText().equals(empass[i][0]) && isiPass.getText().equals(empass[i][1])) {
                    Beranda main= new Beranda();
                         main.setVisible(true);
                        
                } else {
                JOptionPane.showMessageDialog(null, "Maaf, Username / Password Salah! " );
                
            }
      
        }
    }//GEN-LAST:event_TblLoginActionPerformed

    private void KeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KeluarActionPerformed
        System.exit(0);                                                                                                                                                 // private (modifier OOP 1)
    }//GEN-LAST:event_KeluarActionPerformed

    private void isiUserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_isiUserFocusGained
        isiUser.setText("");
    }//GEN-LAST:event_isiUserFocusGained

    private void isiUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isiUserActionPerformed
        
    }//GEN-LAST:event_isiUserActionPerformed

    private void isiPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isiPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isiPassActionPerformed

    private void isiPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_isiPassFocusGained
        isiPass.setText("");
    }//GEN-LAST:event_isiPassFocusGained

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
            java.util.logging.Logger.getLogger(Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Utama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Keluar;
    private javax.swing.JButton TblLogin;
    private javax.swing.JTextField isiPass;
    private javax.swing.JTextField isiUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
