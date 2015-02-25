/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package haritmetiikka.kayttoliittyma.summa;

import haritmetiikka.kayttoliittyma.KoeTulosIkkuna;
import haritmetiikka.rajapinta.Tehtava;
import java.lang.Process.*;
import java.util.ArrayDeque;


/**
 *
 * @author poplinus
 */
public class KoeSummaIkkuna extends javax.swing.JFrame {

    Tehtava koeTehtava = new Tehtava();
   // Tehtava vastausJono = new Tehtava();
    int tehtavaNro;
    int koeTehtaviaOikein;
    int vastaus;
    String syottoVirheTeksti, vastaukset;
    ArrayDeque<String> vastaustenJonoArrayDeque = new ArrayDeque<>();
    
  
    /*
     * Creates new form SummaKoeIkkuna
     */
    public KoeSummaIkkuna(int tehtavaNro, int koeTehtaviaOikein, String syottoVirheTeksti, String vastaukset) {
        initComponents();
        this.tehtavaNro = tehtavaNro;
        this.koeTehtaviaOikein = koeTehtaviaOikein;
        this.syottoVirheTeksti = syottoVirheTeksti;
        this.vastaukset = vastaukset;
        kysymysJLabel.setText(String.valueOf(koeTehtava.getEkaLuku()+" + " +koeTehtava.getTokaLuku()+" ="));
        tehtavaNroLabel.setText(this.tehtavaNro+1 + ". tehtävä");
        syottoVirheJLabel.setText(this.syottoVirheTeksti);
      //  System.out.println(kysymysJLabel.getText());
       
        
    }

    public KoeSummaIkkuna(int tehtavaNro, int koeTehtaviaOikein, String syottoVirheTeksti) {
     this.tehtavaNro = tehtavaNro;
     this.koeTehtaviaOikein = koeTehtaviaOikein;
     this.syottoVirheTeksti = syottoVirheTeksti;
    }
    
   
    
    

   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kysymysJLabel = new javax.swing.JLabel();
        vastausButton = new javax.swing.JButton();
        vastausTextField = new javax.swing.JTextField();
        otsikkoJLabel = new javax.swing.JLabel();
        tehtavaNroLabel = new javax.swing.JLabel();
        lopetaButton = new javax.swing.JButton();
        syottoVirheJLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kysymysJLabel.setText("jLabel1");

        vastausButton.setText("Vastaa");
        vastausButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vastausButtonActionPerformed(evt);
            }
        });

        vastausTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vastausTextFieldActionPerformed(evt);
            }
        });

        otsikkoJLabel.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        otsikkoJLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        otsikkoJLabel.setText("Yhteenlaskukoe. Yhteensä 10 tehtävää.");

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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tehtavaNroLabel)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(kysymysJLabel)
                                        .addGap(29, 29, 29)
                                        .addComponent(vastausTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(vastausButton))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(lopetaButton)
                                        .addGap(82, 82, 82)
                                        .addComponent(syottoVirheJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(76, 230, Short.MAX_VALUE)))
                        .addGap(109, 109, 109))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(otsikkoJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(otsikkoJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(tehtavaNroLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kysymysJLabel)
                    .addComponent(vastausButton)
                    .addComponent(vastausTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(syottoVirheJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(lopetaButton)))
                .addContainerGap(90, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void vastausTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vastausTextFieldActionPerformed

    }//GEN-LAST:event_vastausTextFieldActionPerformed

    private void vastausButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vastausButtonActionPerformed
      
        //  System.out.print(" "+kysymysJLabel.getText());
          //System.out.print(" oikea vastaus"+ koeTehtava.getOikeaVastaus("summa", koeTehtava.getEkaLuku(), koeTehtava.getTokaLuku()));
   
        // vastaustenJonoArrayDeque.add("tehtävän " + (this.tehtavaNro)+". kysymys on "+kysymysJLabel.getText()+"?, jonka oikea vastaus on "+ koeTehtava.getOikeaVastaus("summa", koeTehtava.getEkaLuku(), koeTehtava.getTokaLuku()));
   
        try {
            this.vastaus = Integer.parseInt(vastausTextField.getText());

            
            this.tehtavaNro++;

            if (koeTehtava.getOikein("summa", koeTehtava.getEkaLuku(), koeTehtava.getTokaLuku(), vastaus)) {
                koeTehtaviaOikein++;

         //       System.out.println("koeTehtaviaOikein laskuri");
            }

           // System.out.println(koeTehtaviaOikein);
            if (tehtavaNro < 10) {
            //    vastaustenJonoArrayDeque.add("tehtävän " + (this.tehtavaNro)+". kysymys on "+kysymysJLabel.getText()+"?, jonka oikea vastaus on "+ koeTehtava.getOikeaVastaus("summa", koeTehtava.getEkaLuku(), koeTehtava.getTokaLuku()));
                String uusiVastaus = this.tehtavaNro+". tehtävä oli "+ kysymysJLabel.getText() +"<br>"; 
                this.vastaukset = this.vastaukset+ uusiVastaus;
                System.out.println("tehtävänumeroita oikein " + this.tehtavaNro);    
               new KoeSummaIkkuna(this.tehtavaNro, koeTehtaviaOikein,"",this.vastaukset).setVisible(true);
                System.out.println("loopin sisällä"+tehtavaNro);    
            System.out.println(vastaukset);
                this.dispose();
            
                
            } 
            else {
                String uusiVastaus = this.tehtavaNro+". tehtävä oli "+ kysymysJLabel.getText() +"<br>"; 
                this.vastaukset = this.vastaukset+ uusiVastaus;
                
            this.vastaukset = "<html>"+this.vastaukset+"</html>";
                System.out.println("LOPULLINEN VASTAUKSET"+vastaukset);
                
                new KoeTulosIkkuna(tehtavaNro, koeTehtaviaOikein,this.vastaukset).setVisible(true);
                this.dispose();
            
            
            
                
          //      vastaustenJonoArrayDeque.add("tehtävän " + (this.tehtavaNro)+". kysymys on "+kysymysJLabel.getText()+"?, jonka oikea vastaus on "+ koeTehtava.getOikeaVastaus("summa", koeTehtava.getEkaLuku(), koeTehtava.getTokaLuku()));
            //    this.vastaukset = vastaustenJonoArrayDeque.pollFirst()+"<br>";
        //for(int i = 0; i < 10; i++){  
            
            //this.vastaukset = this.vastaukset+ "tehtävän " + this.tehtavaNro+". kysymys on "+ kysymysJLabel.getText() +"?, jonka oikea vastaus on "+ koeTehtava.getOikeaVastaus("summa", koeTehtava.getEkaLuku(), koeTehtava.getTokaLuku())+"<br>";
       
        }
                
                
                
            }
            
         
        catch (Exception e) {
            this.dispose();
            new KoeSummaIkkuna(tehtavaNro, koeTehtaviaOikein, "Syötä kokonaisluku tai lopeta","").setVisible(true);
        }
          
 /*       if(tehtavaNro == 11){
              for(int i = 0; i<10;i++){
              System.out.println(koeTehtava.getVastausJono());    
          }}
   */       
          
          
    }//GEN-LAST:event_vastausButtonActionPerformed

    private void lopetaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lopetaButtonActionPerformed
        this.dispose();

    }//GEN-LAST:event_lopetaButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel kysymysJLabel;
    private javax.swing.JButton lopetaButton;
    private javax.swing.JLabel otsikkoJLabel;
    private javax.swing.JLabel syottoVirheJLabel;
    private javax.swing.JLabel tehtavaNroLabel;
    private javax.swing.JButton vastausButton;
    private javax.swing.JTextField vastausTextField;
    // End of variables declaration//GEN-END:variables

}

