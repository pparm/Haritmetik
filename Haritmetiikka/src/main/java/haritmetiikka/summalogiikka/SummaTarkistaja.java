/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package haritmetiikka.summalogiikka;

/**
 * Luokka tarkistaa summia.
 */
public class SummaTarkistaja {

    /**
     * Metodi tarkistaa lukujen summan ja palauttaa totuusarvon.
     *
     * @param ekaLuku koknaisluku
     * @param tokaLuku kokonaisluku
     * @param vastausSumma lukujen summa
     * @return totuusarvo onko lukujen summa oikein
     */
    public boolean getOikein(int ekaLuku, int tokaLuku, int vastausSumma) {

        return (ekaLuku + tokaLuku) == vastausSumma;
    }

    /**
     * Laskee lukujen summan.
     *
     * @param ekaLuku Kokonaisluku
     * @param tokaLuku Kokonaisluku
     * @return Kokonaislukujen summa
     */
    public int getSumma(int ekaLuku, int tokaLuku) {
        return ekaLuku + tokaLuku;

    }

}
