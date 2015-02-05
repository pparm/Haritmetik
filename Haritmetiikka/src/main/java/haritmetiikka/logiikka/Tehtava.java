/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package haritmetiikka.logiikka;

import haritmetiikka.logiikka.SummaLasku;
import haritmetiikka.logiikka.LukuArpoja;

/**
 *
 * @author poplinus
 */
public class Tehtava {

  LukuArpoja arpoja = new LukuArpoja();
public int ekaLuku = arpoja.arvottuLuku(0,10);
public int tokaLuku = arpoja.arvottuLuku(0,10);
  SummaLasku summaLasku = new SummaLasku();
  
  public int getEkaLuku(){
      return ekaLuku;
      
  }
  
   public int getTokaLuku(){
  return tokaLuku;
  }
  
  
  public int getOikeaVastaus(String tehtavaTyyppi,int ekaLuku,int tokaLuku){
    if (tehtavaTyyppi.equals("summa")){
    return summaLasku.getSumma(ekaLuku,tokaLuku);}

return -1;
}
public boolean getOikein(String tehtavaTyyppi,int ekaLuku,int tokaLuku, int vastaus){
    if (tehtavaTyyppi.equals("summa")){
    return summaLasku.getOikein(ekaLuku,tokaLuku,vastaus);
    

    }
    System.out.println("Tehtava/getOikein ei toimi");
    
    return false;
}}