/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package haritmetiikka.rajapinta;

import haritmetiikka.summalogiikka.SummaTehtava;
import apuLuokat.LukuArpoja;

/**
 *
 * @author poplinus
 *
 * Luokka on graafisen käyttöliittymän ja sovelluslogiikan rajapinta
 *
 *
 */
public class Tehtava {

    LukuArpoja arpoja = new LukuArpoja();
    private int ekaLuku = arpoja.arvottuLuku(0, 10);
    private int tokaLuku = arpoja.arvottuLuku(0, 10);
    SummaTehtava summaLasku = new SummaTehtava();

    /**
     * Palauttaa olion arpoman ensimmäisen kokonaisluvun
     *
     * @return Arvottu ensimmäinen arvottu kokonaisluku
     */
    public int getEkaLuku() {

        return this.ekaLuku;

    }

    /**
     * Palauttaa olion arpoman toisen kokonaisluvun
     *
     * @return Arvottu toinen kokonaisluku
     */
    public int getTokaLuku() {
        return this.tokaLuku;
    }

    /**
     * Palauttaa oikean vastauksen
     *
     * @param tehtavaTyyppi Tehtävätyypin syöttö
     * @param ekaLuku Ensimmäinen kokonaisluku
     * @param tokaLuku Toinen kokonaisluku
     * @return Palauttaa tehtävätyypin oikean vastauksen
     */
    public int getOikeaVastaus(String tehtavaTyyppi, int ekaLuku, int tokaLuku) {
        if (tehtavaTyyppi.equals("summa")) {
            return summaLasku.getSumma(ekaLuku, tokaLuku);
        }

        return -1;
    }

    /**
     * Palauttaa totuusarvon true jos tehtävä oikein ja false jos väärin
     *
     * @param tehtavaTyyppi summa, miinus tai kerto
     * @param ekaLuku ensimmäinen luku laskussa
     * @param tokaLuku tionen luku laskussa
     * @return paluuarvo true jos vastaus oikein, false jos väärin
     */
    public boolean getOikein(String tehtavaTyyppi, int ekaLuku, int tokaLuku, int vastaus) {
        if (tehtavaTyyppi.equals("summa")) {
            return summaLasku.getOikein(ekaLuku, tokaLuku, vastaus);

        }
        System.out.println("Tehtava/getOikein ei toimi");

        return false;
    }
}
