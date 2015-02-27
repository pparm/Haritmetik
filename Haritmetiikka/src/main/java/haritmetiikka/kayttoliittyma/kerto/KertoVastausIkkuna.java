/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package haritmetiikka.kayttoliittyma.kerto;

import haritmetiikka.kayttoliittyma.StartIkkuna;
import haritmetiikka.kayttoliittyma.kerto.KertoIkkuna;
import haritmetiikka.rajapinta.Tehtava;
import java.awt.Color;

/**
 * Luokka tarkistaa kertolaskutehtävän ja tulostaa oikean vastauksen.
 *
 */
public class KertoVastausIkkuna extends javax.swing.JFrame {

    private Tehtava tehtava;
    private int vastaus;
    String kysymysTeksti;
    String oikeaVastaus;

    /**
     * Konstruktori rakentaa KertoVastausIkkunan, tarkistaa laskun ja tulostaa
     * vastaukset.
     *
     * @param tehtava KertoIkkunasta tuotu olio Tehtava-luokan olio, jossa on
     * mm. jo arvotut luvut.
     * @param vastaus KertoIkkunassa käyttäjän antama laskun vastaus.
     */
    public KertoVastausIkkuna(Tehtava tehtava, int vastaus, String kysymysTyyppi) {
        initComponents();
        this.kysymysTeksti = tehtava.kysymysTekstiYhdista(tehtava.getEkaLuku(), tehtava.getKoeTokaLuku(kysymysTyyppi), kysymysTyyppi);
        this.oikeaVastaus = String.valueOf(tehtava.getOikeaVastaus(kysymysTyyppi, tehtava.getEkaLuku(), tehtava.getKoeTokaLuku(kysymysTyyppi)));
        this.tehtava = tehtava;
        this.vastaus = vastaus;
        if (tehtava.getOikein(kysymysTyyppi, tehtava.getEkaLuku(), tehtava.getKoeTokaLuku(kysymysTyyppi), vastaus)) {
            oikeaVastausLabel.setText("Tehtävän oli " + kysymysTeksti + " " + oikeaVastaus + ". ");
            vastausOikeinLabel.setForeground(Color.green);
            vastausOikeinLabel.setText("%");

        } else {
            vastausOikeinLabel.setForeground(Color.red);

            oikeaVastausLabel.setText("Tehtävän oli " + kysymysTeksti + " " + oikeaVastaus + ". " + "Vastauksesi oli " + vastaus + ".");

            vastausOikeinLabel.setText("X");
        }

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

        vastausOikeinLabel.setFont(new java.awt.Font("Ubuntu", 1, 120)); // NOI18N
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
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(oikeaVastausLabel))
                    .addComponent(kokeileUudelleenJButton)
                    .addComponent(lopetaJButton)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(uusiLaskuButton)
                        .addGap(63, 63, 63)
                        .addComponent(vastausOikeinLabel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(kokeileUudelleenJButton)
                .addGap(25, 25, 25)
                .addComponent(oikeaVastausLabel)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(uusiLaskuButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(vastausOikeinLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lopetaJButton)
                .addContainerGap(132, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
     * Nappi joka sulkee KertoVastausIkkunan ja tekee uuden KertoIkkunan (uusi
     * lasku)
     *
     * @param evt
     */
    private void uusiLaskuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uusiLaskuButtonActionPerformed

        new KertoIkkuna().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_uusiLaskuButtonActionPerformed
    /**
     * Nappi jolla voi palata samaan laskuun.
     *
     * @param evt
     */
    private void kokeileUudelleenJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kokeileUudelleenJButtonActionPerformed
        new KertoIkkuna(this.tehtava).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_kokeileUudelleenJButtonActionPerformed
    /**
     * Nappi jolla lopetetaan kertolaskuharjoitus.
     *
     * @param evt
     */

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
