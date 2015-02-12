/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package haritmetiikka.koe;
import haritmetiikka.rajapinta.Tehtava;
/**
 *
 * @author poplinus
 */
public class Koe {
 Koe koe =new Koe();
 int tehtavaNro;
 int vastaus,ekaLuku,tokaLuku;
int oikeinLkm;
public  Koe(int tehtavaNro, int vastaus){
    this.tehtavaNro = tehtavaNro;
    this.vastaus = vastaus;
    }
   public Koe(){
   } 
   
   public int seuraavaTehtavaNro(int tehtavaNro){
        this.tehtavaNro = tehtavaNro++;
        return tehtavaNro;
   }
   public int oikeitaVastauksia(int oikeinLkm){
        this.tehtavaNro = tehtavaNro++;
        return tehtavaNro;
   }
   
 public boolean getKoeTehtavaOikein(int ekaLuku,int tokaLuku,int tehtavaNro, int vastaus){
     this.ekaLuku = ekaLuku;
     this.tokaLuku = tokaLuku;
     this.tehtavaNro = tehtavaNro;
     this.vastaus = vastaus;
      Tehtava koeTehtava = new Tehtava();
       return koeTehtava.getOikein(null, ekaLuku, tokaLuku, vastaus);
   
  
 }
       
  
}


