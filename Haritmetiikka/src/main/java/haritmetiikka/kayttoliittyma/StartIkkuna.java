/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package haritmetiikka.kayttoliittyma;

/**
 *
 * @author poplinus
 */
public class StartIkkuna extends javax.swing.JFrame {

    /**
     * Creates new form StartIkkuna
     */
    public StartIkkuna() {
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

        yhteenlaskuButton = new javax.swing.JButton();
        vahennuslaskuButton = new javax.swing.JButton();
        kertolaskuButton = new javax.swing.JButton();
        lopetaButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        yhteenlaskuButton.setText("Yhteenlasku");
        yhteenlaskuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yhteenlaskuButtonActionPerformed(evt);
            }
        });

        vahennuslaskuButton.setText("Vähennyslasku");
        vahennuslaskuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vahennuslaskuButtonActionPerformed(evt);
            }
        });

        kertolaskuButton.setText("Kertolasku");

        lopetaButton.setText("Lopeta");
        lopetaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lopetaButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lopetaButton)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(yhteenlaskuButton)
                        .addGap(18, 18, 18)
                        .addComponent(vahennuslaskuButton)
                        .addGap(18, 18, 18)
                        .addComponent(kertolaskuButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yhteenlaskuButton)
                    .addComponent(vahennuslaskuButton)
                    .addComponent(kertolaskuButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                .addComponent(lopetaButton)
                .addGap(62, 62, 62))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void vahennuslaskuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vahennuslaskuButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vahennuslaskuButtonActionPerformed
    /**
     * Avaa Yhteenlaskuikknunan
     *
     * @param evt
     */
    private void yhteenlaskuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yhteenlaskuButtonActionPerformed
        new SummaIkkuna().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_yhteenlaskuButtonActionPerformed


    private void lopetaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lopetaButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_lopetaButtonActionPerformed

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
            java.util.logging.Logger.getLogger(StartIkkuna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StartIkkuna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StartIkkuna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StartIkkuna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new StartIkkuna().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton kertolaskuButton;
    private javax.swing.JButton lopetaButton;
    private javax.swing.JButton vahennuslaskuButton;
    private javax.swing.JButton yhteenlaskuButton;
    // End of variables declaration//GEN-END:variables
}
