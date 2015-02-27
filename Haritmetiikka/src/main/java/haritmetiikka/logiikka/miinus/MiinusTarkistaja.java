/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package haritmetiikka.logiikka.miinus;

/**
 * Luokka tarkistaa ja laskee erotuksia.
 */
public class MiinusTarkistaja {

    /**
     * Metodi tarkistaa lukujen erotuksen ja palauttaa totuusarvon.
     *
     * @param ekaLuku koknaisluku
     * @param tokaLuku kokonaisluku
     * @param vastausSumma pelaajan syöttämä totuusarvo.
     * @return totuusarvo onko lukujen summa oikein.
     */
    public final boolean getOikein(final int ekaLuku, final int tokaLuku, final int vastausSumma) {

        return (ekaLuku - tokaLuku) == vastausSumma;
    }

    /**
     * Laskee lukujen erotuksen ja palauttaa vastauksen.
     *
     * @param ekaLuku Kokonaisluku.
     * @param tokaLuku Kokonaisluku.
     * @return Kokonaislukujen erotus.
     */
    public final int getVastaus(final int ekaLuku, final int tokaLuku) {
        return (ekaLuku - tokaLuku);

    }

}
