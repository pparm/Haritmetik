/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package haritmetiikka.kayttoliittyma;
import haritmetiikka.rajapinta.Tehtava;

/**
 *
 * @author poplinus
 */
public class SummaIkkuna extends javax.swing.JFrame {
Tehtava summaTehtava = new Tehtava();
int vastaus;
/**
     * Tekee käyttöliittymän
     */
    public SummaIkkuna() {
        initComponents();
       
        ekaLukuLabel.setText(String.valueOf(summaTehtava.getEkaLuku()));
        tokaLukuLabel.setText(String.valueOf(summaTehtava.getTokaLuku()));
        
    }

    /**
     * Metodi muotoilee ikkunan ja elementit
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        vastaa = new javax.swing.JButton();
        uusiLasku = new javax.swing.JButton();
        lopeta = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        ekaLukuLabel = new javax.swing.JLabel();
        tokaLukuLabel = new javax.swing.JLabel();
        plusmerkki = new java.awt.Label();
        label1 = new java.awt.Label();
        vastausTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Summa harjoitus");

        vastaa.setText("Vastaa");
        vastaa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vastaaActionPerformed(evt);
            }
        });

        uusiLasku.setText("UusiLasku");
        uusiLasku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uusiLaskuActionPerformed(evt);
            }
        });

        lopeta.setText("Lopeta");
        lopeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lopetaActionPerformed(evt);
            }
        });

        ekaLukuLabel.setText("ekaLuku");

        tokaLukuLabel.setText("tokaLuku");

        plusmerkki.setText("+");

        label1.setText("=");

        vastausTextField.setText("?");
        vastausTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vastausTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(ekaLukuLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(plusmerkki, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(tokaLukuLabel)
                .addGap(19, 19, 19)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(vastausTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(plusmerkki, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(ekaLukuLabel)
                                .addComponent(tokaLukuLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(vastausTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(uusiLasku)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lopeta))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95)
                        .addComponent(vastaa)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uusiLasku)
                    .addComponent(lopeta))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(vastaa))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(113, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void vastausTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vastausTextFieldActionPerformed



    }//GEN-LAST:event_vastausTextFieldActionPerformed
/**
 * Metodi avaa uuden summaikkunan ja sulkee aikaisemman. Näin alkaa uusi lasku.
 * @param evt 
 */
    private void uusiLaskuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uusiLaskuActionPerformed
        
     new SummaIkkuna().setVisible(true);
     this.dispose();
       
    }//GEN-LAST:event_uusiLaskuActionPerformed
/**
 * Metodi avaa SummaVastausIkkunan ja vie sinne summaTehtava olion ja Käyttäjän
 * vastauksen
 * @param evt 
 */
    private void vastaaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vastaaActionPerformed
  try{  this.vastaus = Integer.parseInt(vastausTextField.getText());}
  catch(Exception e){
      
      new SyottoVirheIkkuna().setVisible(true);
      
  }
    new SummaVastausIkkuna(summaTehtava,vastaus).setVisible(true);
    
//    this.setVisible(false);
    }//GEN-LAST:event_vastaaActionPerformed
/**
 * Metodi lopettaa ohjelman
 * @param evt 
 */
    private void lopetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lopetaActionPerformed
   // javax.swing.WindowConstants.EXIT_ON_CLOSE;
        this.dispose();
    }//GEN-LAST:event_lopetaActionPerformed

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
            java.util.logging.Logger.getLogger(SummaIkkuna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SummaIkkuna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SummaIkkuna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SummaIkkuna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SummaIkkuna().setVisible(true);
          
            
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ekaLukuLabel;
    private javax.swing.JPanel jPanel1;
    private java.awt.Label label1;
    private javax.swing.JButton lopeta;
    private java.awt.Label plusmerkki;
    private javax.swing.JLabel tokaLukuLabel;
    private javax.swing.JButton uusiLasku;
    private javax.swing.JButton vastaa;
    private javax.swing.JTextField vastausTextField;
    // End of variables declaration//GEN-END:variables
}
