/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package haritmetiikka.kayttoliittyma;

import haritmetiikka.kayttoliittyma.StartIkkuna;
import haritmetiikka.kayttoliittyma.summa.KoeSummaIkkuna;
import java.util.ArrayDeque;
/**
 *
 * @author poplinus
 */
public class KoeTulosIkkuna extends javax.swing.JFrame {
        String vastaukset = null;
       
    
    /**
     * Creates new form koeTulosIkkuna
     */
     public KoeTulosIkkuna(int tehtavaNro,int koeTehtaviaOikein){
             initComponents();
             tehtavaNro = tehtavaNro-1;
             oikeinLkmJLabel.setText("Sait "+koeTehtaviaOikein+" oikein "+tehtavaNro+" tehtavasta.");
     }
    public KoeTulosIkkuna(int tehtavaNro,int koeTehtaviaOikein, String vastaukset) {
        //this.vast = vast;
            initComponents();
            this.vastaukset = vastaukset;
        // Vähennetään tehetävänumeroa yhdellä, koska sitä käytetään jo seuraavan laskun numerona
   //    "<html>First line<br>Second line</html>"
    /*    this.vastaukset = vastaustenJonoArrayDeque.pollFirst()+"<br>";
        for(int i = 0; i < 10; i++){  
            
            this.vastaukset = vastaukset + vastaustenJonoArrayDeque.pollFirst()+"<br>";
            System.out.println(this.vastaukset);   
        }
      */
        //vastauksetJLabel.setText("<html>This is<br>a multi-line string");
        System.out.println("vastausikkuna"+this.vastaukset);
        vastauksetJLabel.setText(this.vastaukset);
        // vastauksetJLabel.setText("<html>"+vastaustenJonoArrayDeque.pollLast()+"<br>"+vastaustenJonoArrayDeque.pollLast()+"</html>");
          
        tehtavaNro = tehtavaNro-1;
        oikeinLkmJLabel.setText("Sait "+koeTehtaviaOikein+" oikein "+tehtavaNro+" tehtavasta.");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        oKButton = new javax.swing.JButton();
        oikeinLkmJLabel = new javax.swing.JLabel();
        vastauksetJLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        oKButton.setText("OK");
        oKButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oKButtonActionPerformed(evt);
            }
        });

        oikeinLkmJLabel.setText("jLabel2");

        vastauksetJLabel.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(oKButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oikeinLkmJLabel))
                .addGap(40, 40, 40)
                .addComponent(vastauksetJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(oikeinLkmJLabel)
                        .addGap(48, 48, 48)
                        .addComponent(oKButton)
                        .addGap(137, 137, 137))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(vastauksetJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void oKButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oKButtonActionPerformed
    new StartIkkuna().setVisible(true);
    this.dispose();
    }//GEN-LAST:event_oKButtonActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton oKButton;
    private javax.swing.JLabel oikeinLkmJLabel;
    private javax.swing.JLabel vastauksetJLabel;
    // End of variables declaration//GEN-END:variables
}
