/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package haritmetiikka.kayttoliittyma;

import haritmetiikka.kayttoliittyma.kerto.KertoIkkuna;
import haritmetiikka.kayttoliittyma.kerto.KoeKertoIkkuna;
import haritmetiikka.kayttoliittyma.miinus.KoeMiinusIkkuna;
import haritmetiikka.kayttoliittyma.miinus.MiinusIkkuna;
import haritmetiikka.kayttoliittyma.summa.KoeSummaIkkuna;
import haritmetiikka.kayttoliittyma.summa.SummaIkkuna;
import haritmetiikka.kayttoliittyma.miinus.MiinusIkkuna;
import java.util.ArrayDeque;

/**
 *
 * @author poplinus
 */
public class StartIkkuna extends javax.swing.JFrame {

    SummaIkkuna summaIkkuna;

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
        koeYhteenlaskuButton = new javax.swing.JButton();
        koeVahennyslaskuButton = new javax.swing.JButton();
        koeKertolaskuButton = new javax.swing.JButton();

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
        kertolaskuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kertolaskuButtonActionPerformed(evt);
            }
        });

        lopetaButton.setText("Lopeta");
        lopetaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lopetaButtonActionPerformed(evt);
            }
        });

        koeYhteenlaskuButton.setText("Yhteenlaskukoe");
        koeYhteenlaskuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                koeYhteenlaskuButtonActionPerformed(evt);
            }
        });

        koeVahennyslaskuButton.setText("Vähennyslaskukoe");
        koeVahennyslaskuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                koeVahennyslaskuButtonActionPerformed(evt);
            }
        });

        koeKertolaskuButton.setText("Kertolaskukoe");
        koeKertolaskuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                koeKertolaskuButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(lopetaButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(koeYhteenlaskuButton)
                            .addComponent(yhteenlaskuButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(vahennuslaskuButton)
                            .addComponent(koeVahennyslaskuButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kertolaskuButton)
                            .addComponent(koeKertolaskuButton))
                        .addGap(0, 12, Short.MAX_VALUE)))
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
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(koeYhteenlaskuButton)
                    .addComponent(koeVahennyslaskuButton)
                    .addComponent(koeKertolaskuButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(lopetaButton)
                .addGap(62, 62, 62))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Avaa Yhteenlaskuikknunan
     *
     * @param evt
     */
    private void yhteenlaskuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yhteenlaskuButtonActionPerformed
        summaIkkuna = new SummaIkkuna();
        summaIkkuna.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_yhteenlaskuButtonActionPerformed
    private void lopetaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lopetaButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_lopetaButtonActionPerformed

    private void koeYhteenlaskuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_koeYhteenlaskuButtonActionPerformed
        // Luodaan tyhjä ArrayDeque, jotta saadaan KoeSummaIkkuna käynnistettyä.
       // ArrayDeque<String> adTyhja = new ArrayDeque<String>();
       KoeSummaIkkuna koeSummaIkkuna = new KoeSummaIkkuna(1,0,"","");
        
        koeSummaIkkuna.setVisible(true);
    }//GEN-LAST:event_koeYhteenlaskuButtonActionPerformed

    private void vahennuslaskuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vahennuslaskuButtonActionPerformed
        new MiinusIkkuna().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_vahennuslaskuButtonActionPerformed

    private void kertolaskuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kertolaskuButtonActionPerformed
        new KertoIkkuna().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_kertolaskuButtonActionPerformed

    private void koeVahennyslaskuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_koeVahennyslaskuButtonActionPerformed
        KoeMiinusIkkuna koeMiinusIkkuna = new KoeMiinusIkkuna(1, 0, "");
        koeMiinusIkkuna.setVisible(true);
    }//GEN-LAST:event_koeVahennyslaskuButtonActionPerformed

    private void koeKertolaskuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_koeKertolaskuButtonActionPerformed
        KoeKertoIkkuna koeKertoIkkuna = new KoeKertoIkkuna(1, 0, "");
        koeKertoIkkuna.setVisible(true);
 
    }//GEN-LAST:event_koeKertolaskuButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton kertolaskuButton;
    private javax.swing.JButton koeKertolaskuButton;
    private javax.swing.JButton koeVahennyslaskuButton;
    private javax.swing.JButton koeYhteenlaskuButton;
    private javax.swing.JButton lopetaButton;
    private javax.swing.JButton vahennuslaskuButton;
    private javax.swing.JButton yhteenlaskuButton;
    // End of variables declaration//GEN-END:variables
}
