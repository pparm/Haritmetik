/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package haritmetiikka.kayttoliittyma.kerto;

import haritmetiikka.rajapinta.Tehtava;

/**
 *
 * @author poplinus
 */
public class KertoIkkuna extends javax.swing.JFrame {

    public Tehtava tehtava = new Tehtava();

    int vastaus;

    /**
     * Konstruktori joka muotoilee KertoVastausIkkunan johon tuodaan olemassa
     * oleva Tehtava-luokka.
     */
    public KertoIkkuna(Tehtava tehtava) {
        initComponents();
        vastausTextField.requestFocus();
        this.tehtava = tehtava;
         syottoJLabel.setText(this.tehtava.getEkaLuku() + " * " + tehtava.getTokaLuku() + " = ");
    }

    /**
     * Konsistori joka muotoilee SuommaVastausIkkunan.
     */
    public KertoIkkuna() {
        initComponents();
        vastausTextField.requestFocus();
        syottoJLabel.setText(tehtava.getEkaLuku() + " * " + tehtava.getTokaLuku() + " = ");
    }

    /**
     * Metodi muotoilee ikkunan ja elementit This method is called from within
     * the constructor to initialize the form. WARNING: Do NOT modify this code.
     * The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        uusiLasku = new javax.swing.JButton();
        lopeta = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        vastausTextField = new javax.swing.JTextField();
        syottoVirheJLabel = new javax.swing.JLabel();
        vastaaJButton = new javax.swing.JButton();
        syottoJLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kerto harjoitus");

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

        vastausTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vastausTextFieldActionPerformed(evt);
            }
        });

        syottoVirheJLabel.setForeground(new java.awt.Color(255, 0, 0));

        vastaaJButton.setText("Vastaa");
        vastaaJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vastaaJButtonActionPerformed(evt);
            }
        });

        syottoJLabel.setText("ekaLuku");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addComponent(syottoVirheJLabel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(syottoJLabel)
                        .addGap(83, 83, 83)
                        .addComponent(vastausTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(vastaaJButton)))
                .addContainerGap(186, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(vastausTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                        .addComponent(syottoJLabel))
                    .addComponent(vastaaJButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(syottoVirheJLabel)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lopeta)
                    .addComponent(uusiLasku))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(uusiLasku)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lopeta)
                .addContainerGap(101, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Metodi avaa uuden kertoikkunan ja sulkee olemassa olevan. Näin alkaa uusi
     * lasku.
     *
     * @param evt
     */
    private void uusiLaskuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uusiLaskuActionPerformed

        new KertoIkkuna().setVisible(true);
        this.dispose();

    }//GEN-LAST:event_uusiLaskuActionPerformed
    /**
     * Metodi avaa uuden KertoVastausIkkunan ja vie siihen olemassa olevan
     * Tehtava-luokan olion.
     *
     * @param evt
     */
    private void vastaaJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vastaaJButtonActionPerformed
        try {
            this.vastaus = Integer.parseInt(vastausTextField.getText());
            new KertoVastausIkkuna(this.tehtava, this.vastaus).setVisible(true);

            this.dispose();
        } catch (Exception e) {

            this.syottoVirheJLabel.setText("Syötä kokonaisluku tai lopeta");

        }

    }//GEN-LAST:event_vastaaJButtonActionPerformed
    /**
     * Metodi lopettaa Yhteenlaskuharjoituksen.
     *
     * @param evt
     */
    private void lopetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lopetaActionPerformed
        // javax.swing.WindowConstants.EXIT_ON_CLOSE;
        this.dispose();
    }//GEN-LAST:event_lopetaActionPerformed

    private void vastausTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vastausTextFieldActionPerformed

    }//GEN-LAST:event_vastausTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton lopeta;
    private javax.swing.JLabel syottoJLabel;
    private javax.swing.JLabel syottoVirheJLabel;
    private javax.swing.JButton uusiLasku;
    private javax.swing.JButton vastaaJButton;
    private javax.swing.JTextField vastausTextField;
    // End of variables declaration//GEN-END:variables
}
