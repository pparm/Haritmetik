/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package haritmetiikka.kertologiikka;

import haritmetiikka.summalogiikka.*;

/**
 * Luokka tarkistaa summia.
 */
public class KertoTarkistaja {

    /**
     * Metodi tarkistaa lukujen summan ja palauttaa totuusarvon.
     *
     * @param ekaLuku koknaisluku
     * @param tokaLuku kokonaisluku
     * @param vastausKerto lukujen summa
     * @return totuusarvo onko lukujen summa oikein
     */
    public final boolean getOikein(final int ekaLuku, final int tokaLuku, final int vastausKerto) {

        return (ekaLuku * tokaLuku) == vastausKerto;
    }

    /**
     * Laskee lukujen summan.
     *
     * @param ekaLuku Kokonaisluku
     * @param tokaLuku Kokonaisluku
     * @return Kokonaislukujen summa
     */
    public final int getVastaus(final int ekaLuku, final int tokaLuku) {
        return (ekaLuku * tokaLuku);

    }

}
