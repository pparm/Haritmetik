/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package haritmetiikka.kayttoliittyma.miinus;

import haritmetiikka.kayttoliittyma.StartIkkuna;
import haritmetiikka.kayttoliittyma.miinus.MiinusIkkuna;
import haritmetiikka.rajapinta.Tehtava;
import java.awt.Color;

/**
 *  
 * @author poplinus
 */
public class MiinusVastausIkkuna extends javax.swing.JFrame {

    private Tehtava tehtava;
    private int vastaus;

    /**
     * Metodi rakentaa MiinusVastausIkkunan
     *
     * @param tehtava MiinusIkkunasta tuotu olio, jossa on mm. jo arvotut luvut
     * @param vastaus MiinusIkkunassa käyttäjän antama laskun vastaus
     */
    public MiinusVastausIkkuna(Tehtava tehtava, int vastaus) {
        initComponents();
        this.tehtava = tehtava;
        this.vastaus = vastaus;
        oikeaVastausLabel.setText("Oikea vastaus: " + String.valueOf(tehtava.getOikeaVastaus("miinus", tehtava.getEkaLuku(), tehtava.getTokaLuku())));
        if (tehtava.getOikein("miinus", tehtava.getEkaLuku(), tehtava.getTokaLuku(), vastaus)) {
            vastausOikeinLabel.setForeground(Color.green);
            vastausOikeinLabel.setText("%" + " Vastasit oikein");
        
        } else {
     vastausOikeinLabel.setForeground(Color.red);
            vastausOikeinLabel.setText("X"+" Vastasit väärin");
               }
//      vastausOikeinLabel.setText(String.valueOf(tehtava.getOikein("miinus", tehtava.getEkaLuku(), tehtava.getTokaLuku(), vastaus)));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        oikeaVastausLabel = new javax.swing.JLabel();
        vastausOikeinLabel = new javax.swing.JLabel();
        uusiLaskuButton = new javax.swing.JButton();
        kokeileUudelleenJButton = new javax.swing.JButton();
        lopetaJButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        oikeaVastausLabel.setText("jLabel1");

        vastausOikeinLabel.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        vastausOikeinLabel.setText("jLabel2");

        uusiLaskuButton.setText("Uusi Lasku");
        uusiLaskuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uusiLaskuButtonActionPerformed(evt);
            }
        });

        kokeileUudelleenJButton.setText("Kokeile uudelleen");
        kokeileUudelleenJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kokeileUudelleenJButtonActionPerformed(evt);
            }
        });

        lopetaJButton.setText("Lopeta");
        lopetaJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lopetaJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(oikeaVastausLabel)
                .addGap(48, 48, 48)
                .addComponent(vastausOikeinLabel)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(uusiLaskuButton)
                    .addComponent(kokeileUudelleenJButton)
                    .addComponent(lopetaJButton))
                .addGap(141, 263, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(kokeileUudelleenJButton)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(oikeaVastausLabel)
                    .addComponent(vastausOikeinLabel))
                .addGap(18, 18, 18)
                .addComponent(uusiLaskuButton)
                .addGap(18, 18, 18)
                .addComponent(lopetaJButton)
                .addContainerGap(134, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
     * Nappi joka sulkee MiinusVastausIkkunan ja tekee uuden MiinusIkkunan (uusi
     * lasku)
     *
     * @param evt
     */
    private void uusiLaskuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uusiLaskuButtonActionPerformed
        new MiinusIkkuna().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_uusiLaskuButtonActionPerformed
    /**
     * Nappi joka sulkee MiinusVastausIkkunan
     *
     * @param evt
     */

    private void kokeileUudelleenJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kokeileUudelleenJButtonActionPerformed
        new MiinusIkkuna(this.tehtava).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_kokeileUudelleenJButtonActionPerformed

    private void lopetaJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lopetaJButtonActionPerformed
        new StartIkkuna().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lopetaJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton kokeileUudelleenJButton;
    private javax.swing.JButton lopetaJButton;
    private javax.swing.JLabel oikeaVastausLabel;
    private javax.swing.JButton uusiLaskuButton;
    private javax.swing.JLabel vastausOikeinLabel;
    // End of variables declaration//GEN-END:variables
}
