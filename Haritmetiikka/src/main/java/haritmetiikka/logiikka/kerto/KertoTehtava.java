/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package haritmetiikka.logiikka.kerto;
/**
 * Luokka .
 */
public class KertoTehtava{

    private KertoTarkistaja kertoTarkistaja = new KertoTarkistaja();

    /**
     * Palauttaa boolean onko käyttäjän syöttömä vastaus oikein.
     *
     * @param ekaLuku luku
     * @param tokaLuku luku
     * @param vastaus lukujen summa
     * @return boolean onko lukujen summa oikein
     */
    public final boolean getOikein(final int ekaLuku, final int tokaLuku, final int vastaus) {
        return kertoTarkistaja.getOikein(ekaLuku, tokaLuku, vastaus);
    }

    /**
     * Laskee kahden luvun tulon.
     *
     *
     * @param ekaLuku kokonaisluku
     * @param tokaLuku kokonaisluku
     * @return kokonaislukujen summa
     */
    public final int getVastaus(final int ekaLuku, final int tokaLuku) {

        return kertoTarkistaja.getVastaus(ekaLuku, tokaLuku);
    }

} 