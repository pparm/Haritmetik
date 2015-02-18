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
public class KoeSummaIkkuna extends javax.swing.JFrame {

    Tehtava koeTehtava = new Tehtava();
    int tehtavaNro;
    int koeTehtaviaOikein;
    int vastaus;
    

/*
     * Creates new form SummaKoeIkkuna
     */
    public KoeSummaIkkuna(int tehtavaNro,int koeTehtaviaOikein) {
        initComponents();
       this.tehtavaNro = tehtavaNro;
       this.koeTehtaviaOikein= koeTehtaviaOikein;
       ekaLukuLabel.setText(String.valueOf(koeTehtava.getEkaLuku()));
      tokaLukuLabel.setText(String.valueOf(koeTehtava.getTokaLuku()));
       tehtavaNroLabel.setText(""+tehtavaNro);
    }
    
    public static int laskuri(int nro){
       return nro++;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ekaLukuLabel = new javax.swing.JLabel();
        tokaLukuLabel = new javax.swing.JLabel();
        vastausButton = new javax.swing.JButton();
        vastausTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tehtavaNroLabel = new javax.swing.JLabel();
        lopetaButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ekaLukuLabel.setText("jLabel1");

        tokaLukuLabel.setText("jLabel2");

        vastausButton.setText("Vastaa");
        vastausButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vastausButtonActionPerformed(evt);
            }
        });

        vastausTextField.setText("?");
        vastausTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vastausTextFieldActionPerformed(evt);
            }
        });

        jLabel3.setText("+");

        jLabel4.setText("=");

        jLabel5.setText("Yhteenlaskukoe. Yhteensä 10 tehtävää.");

        tehtavaNroLabel.setText("jLabel1");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tehtavaNroLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ekaLukuLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tokaLukuLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addGap(4, 4, 4)
                        .addComponent(vastausTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vastausButton)))
                .addGap(109, 109, 109))
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lopetaButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tehtavaNroLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ekaLukuLabel)
                    .addComponent(tokaLukuLabel)
                    .addComponent(vastausButton)
                    .addComponent(vastausTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(lopetaButton)
                .addGap(77, 77, 77))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void vastausTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vastausTextFieldActionPerformed
  
    }//GEN-LAST:event_vastausTextFieldActionPerformed

    private void vastausButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vastausButtonActionPerformed
     try {
           this.vastaus = Integer.parseInt(vastausTextField.getText());
        } catch (Exception e) {
            
            new SyottoVirheIkkuna().setVisible(true);
            
        }
     
       
        this.tehtavaNro++;
        
        if(koeTehtava.getOikein("summa", koeTehtava.getEkaLuku(), koeTehtava.getTokaLuku(),vastaus)){
        koeTehtaviaOikein++;
        
       
        }
            
        System.out.println(koeTehtaviaOikein);    
        if(tehtavaNro<=10){    
        new KoeSummaIkkuna(tehtavaNro,koeTehtaviaOikein).setVisible(true);
        this.dispose();}
        else{new KoeTulosIkkuna(tehtavaNro,koeTehtaviaOikein).setVisible(true);
            
            
        }
        this.dispose();
         
    }//GEN-LAST:event_vastausButtonActionPerformed

    private void lopetaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lopetaButtonActionPerformed
      this.dispose();
    }//GEN-LAST:event_lopetaButtonActionPerformed
    /*
        private void uusiTehtava(int tehtavaNro){
            
        this.tehtavaNro = tehtavaNro;
        
    }
    */
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(SummaKoeIkkuna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(SummaKoeIkkuna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(SummaKoeIkkuna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(SummaKoeIkkuna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new SummaKoeIkkuna().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ekaLukuLabel;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton lopetaButton;
    private javax.swing.JLabel tehtavaNroLabel;
    private javax.swing.JLabel tokaLukuLabel;
    private javax.swing.JButton vastausButton;
    private javax.swing.JTextField vastausTextField;
    // End of variables declaration//GEN-END:variables

}
