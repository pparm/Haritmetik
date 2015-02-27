/*
 *Luokka käynnistää ohjelman. 
 */
package haritmetiikka.haritmetiikka;

import haritmetiikka.apuLuokat.TekstiYhdistaja;
import haritmetiikka.kayttoliittyma.summa.SummaIkkuna;
import haritmetiikka.kayttoliittyma.*;
import haritmetiikka.rajapinta.Tehtava;

public class App {

    private SummaIkkuna summaIkkuna = new SummaIkkuna();

    public static void main(String[] args) {
        new StartIkkuna().setVisible(true);
    }
}
