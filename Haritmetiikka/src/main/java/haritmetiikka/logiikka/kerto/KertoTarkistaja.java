/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package haritmetiikka.logiikka.kerto;

/**
 * Luokka tarkistaa ja laskee tuloja.
 * 
 */
public class KertoTarkistaja {

    /**
     * Metodi tarkistaa lukujen summan ja palauttaa totuusarvon.
     *
     * @param ekaLuku koknaisluku.
     * @param tokaLuku kokonaisluku.
     * @param vastausKerto pelaajan vastaus.
     * @return totuusarvo onko lukujen oikein.
     */
    public final boolean getOikein(final int ekaLuku, final int tokaLuku, final int vastausKerto) {

        return (ekaLuku * tokaLuku) == vastausKerto;
    }

    /**
     * Laskee kahden luvun tulon.
     *
     * @param ekaLuku Kokonaisluku.
     * @param tokaLuku Kokonaisluku.
     * @return Kokonaislukujen tulo
     */
    public final int getVastaus(final int ekaLuku, final int tokaLuku) {
        return (ekaLuku * tokaLuku);

    }

}
