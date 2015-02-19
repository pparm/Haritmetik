/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package haritmetiikka.rajapinta;

import haritmetiikka.summalogiikka.SummaTehtava;
import apuLuokat.LukuArpoja;
import haritmetiikka.kertologiikka.KertoTehtava;
import haritmetiikka.miinuslogiikka.MiinusTehtava;
//import haritmetiikka.Koe;
/**
 *
 * @author poplinus
 *
 * Luokka on graafisen käyttöliittymän ja sovelluslogiikan rajapinta.
 *
 *
 */
public class Tehtava {
    
    String tyyppi;
   // int tehtavaNro;
    int vastaus;
    public Tehtava(){
        
    }
    public Tehtava(String tyyppi, int vastaus){
        this.tyyppi = tyyppi;
       // this.tehtavaNro = tehtavaNro;
        this.vastaus = vastaus;
    }
    /**
     * Luodaan kokonaislukuarpoja olio.
     */
    private LukuArpoja arpoja = new LukuArpoja();
    /**
     * Arvottavan luvun alaraja.
     */
    static final int ALARAJA = 0;
    /**
     * Arvottavan luvun yläraja.
     */
    static final int YLARAJA = 10;
    /**
     * Arvotaan ensimmäinen kysymyksessä oleva kokonaisluku.
     */

    private int ekaLuku = arpoja.arvottuLuku(ALARAJA, YLARAJA);
    /**
     * Arvotaan ensimmäinen kysymyksessä oleva kokonaisluku.
     */
    private int tokaLuku = arpoja.arvottuLuku(ALARAJA, YLARAJA);
    /**
     * Luodaan summaLaskuolio.
     */
    private SummaTehtava summaTehtava = new SummaTehtava();
    private KertoTehtava kertoTehtava = new KertoTehtava();
    private MiinusTehtava miinusTehtava = new MiinusTehtava();
    
    /**
     * Palauttaa olion arpoman ensimmäisen kokonaisluvun.
     *
     * @return Arvottu ensimmäinen arvottu kokonaisluku
     */
    public final int getEkaLuku() {

        return ekaLuku;

    }

    /**
     * Palauttaa olion arpoman toisen kokonaisluvun.
     *
     * @return Arvottu toinen kokonaisluku
     */
    public final int getTokaLuku() {
        return tokaLuku;
    }

    /**
     * Palauttaa oikean vastauksen.
     *
     * @param tehtavaTyyppi Tehtävätyypin syöttö
     * @param ekaLuku Ensimmäinen kokonaisluku
     * @param tokaLuku Toinen kokonaisluku
     * @return Palauttaa tehtävätyypin oikean vastauksen
     */
    public final int getOikeaVastaus(final String tehtavaTyyppi, final int ekaLuku, final int tokaLuku) {
        if (tehtavaTyyppi.equals("summa")) {
            return summaTehtava.getVastaus(ekaLuku, tokaLuku);
        }
        
        if (tehtavaTyyppi.equals("kerto")) {
            return kertoTehtava.getVastaus(ekaLuku, tokaLuku);
        }
        
        if (tehtavaTyyppi.equals("miinus")) {
            return miinusTehtava.getVastaus(ekaLuku, tokaLuku);
        }
        
        
        

        return -1;
    }

    /**
     * Palauttaa totuusarvon onko tehtävätyyppi ratkaistu oikein.
     *
     * @param tehtavaTyyppi tehtava tyyppi jota ratkaistaan summa/kerto/miinus.
     * @param ekaLuku Ensimmäinen luku kysymyksessä.
     * @param tokaLuku Toinen luku kysymyksessä.
     * @param vastaus Pelaajan
     * @return totuusarvo
     */
    public final boolean getOikein(String tehtavaTyyppi, final int ekaLuku, final int tokaLuku, final int vastaus) {
        if (tehtavaTyyppi.equals("summa")) {
            return summaTehtava.getOikein(ekaLuku, tokaLuku, vastaus);

        }
        if (tehtavaTyyppi.equals("kerto")) {
            return kertoTehtava.getOikein(ekaLuku, tokaLuku, vastaus);

        }
       
        if (tehtavaTyyppi.equals("miinus")) {
            return kertoTehtava.getOikein(ekaLuku, tokaLuku, vastaus);

        }
       
        
        
        System.out.println("Tehtava/getOikein ei toimi");

        return false;
    }   
    /** Asettaa 
     * 
     * @param tyyppi
     * @param vastaus 
     */
    
    /*
     public void setArvot(String tyyppi, int vastaus){
      this.tyyppi = tyyppi;
     // this.tehtavaNro = tehtavaNro;
      this.vastaus = vastaus;
     
     }
    */
 /*   
    public int tehtava(String tehtavaTyyppi){
      if(tehtavaTyyppi == "summa"){
       return 15;}
      return -1;
      }  
*/  
    }
   

