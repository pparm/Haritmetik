/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package haritmetiikka.rajapinta;

import haritmetiikka.summalogiikka.SummaTehtava;
import haritmetiikka.apuLuokat.ApuJono;
import haritmetiikka.apuLuokat.LukuArpoja;
import haritmetiikka.apuLuokat.TekstiYhdistaja;
import haritmetiikka.kertologiikka.KertoTehtava;
import haritmetiikka.miinuslogiikka.MiinusTehtava;
import java.util.ArrayDeque;
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
    int vastaus;
    ArrayDeque<String> vastausArrayDeque= new ArrayDeque<String>();
    String vastauslause;
    public Tehtava(){
    }
/**
 * Konsistori jolla voidaan 
 * @param tyyppi
 * @param vastaus 
 */
    
    public Tehtava(String tyyppi, int vastaus){
        this.tyyppi = tyyppi;
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
     * Arvotaan toinen kysymyksessä oleva kokonaisluku.
     */
    private int tokaLuku = arpoja.arvottuLuku(ALARAJA, YLARAJA);
    
    /**
     * Arvotaan miinuslaskua varten toinen luku joka on pienempi kuin ekaluku.
     * 
     */
    private int tokaLukuMiinus = arpoja.arvottuLuku(ALARAJA, this.getEkaLuku());
    
    
  
    /**
     * Luodaan summaLaskuolio.
     */
    private SummaTehtava summaTehtava = new SummaTehtava();
    private KertoTehtava kertoTehtava = new KertoTehtava();
    private MiinusTehtava miinusTehtava = new MiinusTehtava();
    private ApuJono apuJono = new ApuJono();
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
    
    public final int getMiinusTokaLuku() {
       return tokaLukuMiinus;
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
            return miinusTehtava.getOikein(ekaLuku, tokaLuku, vastaus);

        }

        return false;
    }
    
    public void setVastausJono(String vastauslause){
        this.vastauslause = vastauslause;
        apuJono.setString(vastauslause);
        
    }
    
        public String getVastausJono(){
        return apuJono.getString();
    }
    
         public static String yhdistaTeksti(String tekstiAlku, String tekstiLoppu){
      
         return TekstiYhdistaja.yhdistaTeksti(tekstiAlku, tekstiLoppu);
          
    }  
        
    
    
    /* ei tarvetta tällä hetkellä asetta arvoja olioon
     public void setArvot(String tyyppi, int vastaus){
      this.tyyppi = tyyppi;
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
   

