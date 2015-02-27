/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package haritmetiikka.logiikka.kerto;
import haritmetiikka.rajapinta.RajapintaTehtava;
/**
 * Luokka laskee summia yhteen.
 */
public class KertoTehtava{

    /**
     * Luodaan summan tarkastaja.
     */
    private KertoTarkistaja kertoTarkistaja = new KertoTarkistaja();

    /**
     * Palauttaa boolean onko käyttäjän syöttömä summa oikein.
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
     * Laskee kahden luvun summan.
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