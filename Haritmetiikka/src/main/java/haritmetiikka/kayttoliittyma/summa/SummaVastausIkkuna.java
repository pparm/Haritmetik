/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package haritmetiikka.kayttoliittyma.summa;

import haritmetiikka.kayttoliittyma.StartIkkuna;
import haritmetiikka.kayttoliittyma.summa.SummaIkkuna;
import haritmetiikka.rajapinta.Tehtava;
import java.awt.Color;

/**
 *
 *Luokka on Vähennyslaskuvastausikkuna. Luokka tarkistaa tuloksen ja ilmoittaa
 * näyttää sen.
 */

public class SummaVastausIkkuna extends javax.swing.JFrame {

    private Tehtava tehtava;
    private int vastaus;
    String kysymysTeksti;
    String oikeaVastaus;   
    
    /**
     ** Metodi rakentaa SummaVastausIkkunan.
     *
     * @param tehtava Tehtava-luokan olio, joka pitää sisällään tarvittavat arvot.
     * @param vastaus SummaIkkunasta tuotu vastaus.
     * @param kysymysTyyppi Kysymystyyppi, jota käytetään parametrina
     * metodeille.
     */
    public SummaVastausIkkuna(Tehtava tehtava, int vastaus,String kysymysTyyppi) {
        initComponents();
        this.kysymysTeksti = tehtava.kysymysTekstiYhdista(tehtava.getEkaLuku(), tehtava.getKoeTokaLuku(kysymysTyyppi),kysymysTyyppi);   
        this.oikeaVastaus =  String.valueOf(tehtava.getOikeaVastaus(kysymysTyyppi, tehtava.getEkaLuku(), tehtava.getKoeTokaLuku("summa")));
        this.tehtava = tehtava;
        this.vastaus = vastaus;
       if (tehtava.getOikein(kysymysTyyppi, tehtava.getEkaLuku(), tehtava.getKoeTokaLuku(kysymysTyyppi), vastaus)) {
            oikeaVastausLabel.setText("Tehtävän oli "+kysymysTeksti+" "+oikeaVastaus+". ");
            vastausOikeinLabel.setForeground(Color.green);
            vastausOikeinLabel.setText("%");
        
        } else {
     vastausOikeinLabel.setForeground(Color.red);
           
     oikeaVastausLabel.setText("Tehtävän oli "+kysymysTeksti+" "+oikeaVastaus+". "+ "Vastauksesi oli "+vastaus+".");
           
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
                        .addComponent(lopetaJButton)
                        .addGap(72, 72, 72)
                        .addComponent(vastausOikeinLabel))
                    .addComponent(kokeileUudelleenJButton)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(oikeaVastausLabel))
                    .addComponent(uusiLaskuButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(kokeileUudelleenJButton)
                .addGap(25, 25, 25)
                .addComponent(oikeaVastausLabel)
                .addGap(18, 18, 18)
                .addComponent(uusiLaskuButton)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(lopetaJButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(vastausOikeinLabel)))
                .addContainerGap(107, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
     * Nappi joka sulkee SummaVastausIkkunan ja tekee uuden SummaIkkunan (uusi
     * lasku)
     *
     * @param evt
     */
    private void uusiLaskuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uusiLaskuButtonActionPerformed
        new SummaIkkuna().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_uusiLaskuButtonActionPerformed
    /**
     * Nappi joka sulkee SummaVastausIkkunan.
     *
     * @param evt
     */

    private void kokeileUudelleenJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kokeileUudelleenJButtonActionPerformed
        new SummaIkkuna(this.tehtava).setVisible(true);
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
