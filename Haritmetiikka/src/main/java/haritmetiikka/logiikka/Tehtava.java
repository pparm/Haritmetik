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
private int ekaLuku = arpoja.arvottuLuku(0,10);
private int tokaLuku = arpoja.arvottuLuku(0,10);
  SummaLasku summaLasku = new SummaLasku();
  /**
   * Palauttaa olion arpoman ensimmäisen kokonaisluvun
   * @return Arvottu ensimmäinen arvottu kokonaisluku
   */
  public int getEkaLuku(){
      return ekaLuku;
      
  }
  /**
   *Palauttaa olion arpoman toisen kokonaisluvun
   * @return Arvottu toinen kokonaisluku
   */
   public int getTokaLuku(){
  return tokaLuku;
  }
  
  /**
   * Palauttaa oikean vastauksen
   * @param tehtavaTyyppi Tehtävätyypin syöttö
   * @param ekaLuku Ensimmäinen kokonaisluku
   * @param tokaLuku Toinen kokonaisluku
   * @return Palauttaa tehtävätyypin oikean vastauksen
   */
  public int getOikeaVastaus(String tehtavaTyyppi,int ekaLuku,int tokaLuku){
    if (tehtavaTyyppi.equals("summa")){
    return summaLasku.getSumma(ekaLuku,tokaLuku);}

return -1;
}
  
  /**
   * Palauttaa totuusarvon onko Käyttäjän vastaus oikein
   * @param tehtavaTyyppi Tehtävän tyyppi
   * @param ekaLuku Ensimmäinen kokonaisluku
   * @param tokaLuku Toinen kokonaisluku
   * @param vastaus Käyttäjän vastaus
   * @return Totuusarvo oliko käyttäjän vastaus
   * oikein valitulla tehtävätyypilla
   */
public boolean getOikein(String tehtavaTyyppi,int ekaLuku,int tokaLuku, int vastaus){
    if (tehtavaTyyppi.equals("summa")){
    return summaLasku.getOikein(ekaLuku,tokaLuku,vastaus);
    

    }
    System.out.println("Tehtava/getOikein ei toimi");
    
    return false;
}}