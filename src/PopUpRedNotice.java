/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author VINCENT GINTING
 */
public class PopUpRedNotice extends javax.swing.JFrame {

    /**
     * Creates new form PopUpRedNotice
     */
    public PopUpRedNotice() {
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

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Semilight", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Red Notice (2021)");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 200, -1));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("\tRed Notice menceritakan seorang buronan bernama Nolan Booth \n(Ryan Reynolds) yang berencana mencuri telur Cleopatra yang tak ternilai harganya. \nAksi pencurian itu pun nyaris digagalkan oleh agen khusus, John Hartley (Dwayne \nJohnson), seorang profiler kriminal FBI yang ditugaskan untuk membantu agen \nInterpol Urvashi Das dalam menyelidiki kasus tersebut. \n\tAksi pencurian Booth berhasil, namun alih-alih lolos, dia justru \ntertangkap tepat di kediamannya yang berada Bali. Tak sampai di situ, pencurian \nkembali berlanjut dan dilakukan pencuri kelas kakap bernama Sarah Black alias \nThe Bishop (Gal Gadot) yang menyamar dan menukar telur itu menjadi palsu. \nAlhasil, Hartley dianggap berkhianat dan dikurung dalam penjara Rusia bersama\ndengan Booth.\n\tDemi mengembalikan reputasi keduanya, Hartley dan Booth \nsepakat bekerja sama untuk saling membantu meringkus The Bishop. Upaya \nmereka membawanya berpetualang ke berbagai penjuru dunia, mulai dari \nsebuah penjara terpencil, masuk ke brankas pedagang senjata Sotto Voce untuk\n mencuri telur kedua, bertarung dengan banteng di dalam koloseum, hingga \ntersesat di dalam hutan Argentina demi menemukan telur ketiga.");
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 63, 512, 182));

        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Price: Rp 315.000,-");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 263, 94, -1));

        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Offers 10%");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 263, -1, -1));

        jButton1.setText("Beli");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(361, 263, 73, -1));

        jButton2.setText("Kembali");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 263, 73, -1));

        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Action");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 263, 34, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\VINCENT GINTING\\Pictures\\me\\bg red notice.jpg")); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        BeliFilm main = new BeliFilm ();
        main.setRedNotice();
        main.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Beranda main = new Beranda();
        main.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(PopUpRedNotice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PopUpRedNotice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PopUpRedNotice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PopUpRedNotice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PopUpRedNotice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
