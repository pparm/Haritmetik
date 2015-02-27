/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package haritmetiikka.logiikka.summa;
import haritmetiikka.rajapinta.RajapintaTehtava;
/**
 * Luokka laskee summia yhteen ja tarkistaa onko kahden luvun summa oikein.
 */
public class SummaTehtava {

    /**
     * Luodaan summan tarkastaja.
     */
    private SummaTarkistaja summaTarkistaja = new SummaTarkistaja();

    /**
     * Palauttaa boolean onko käyttäjän syöttömä summa oikein.
     *
     * @param ekaLuku tarkistettava luku
     * @param tokaLuku tarkistettava luku
     * @param vastaus lukujen summa
     * @return boolean onko lukujen summa oikein
     */
    public final boolean getOikein(final int ekaLuku, final int tokaLuku, final int vastaus) {
        return summaTarkistaja.getOikein(ekaLuku, tokaLuku, vastaus);
    }

    /**
     * Laskee kahden luvun summan.
     *
     *
     * @param ekaLuku 1. laskettava kokonaisluku
     * @param tokaLuku 2. laskettava kokonaisluku
     * @return kokonaislukujen summa
     */
    public final int getVastaus(final int ekaLuku, final int tokaLuku) {

        return summaTarkistaja.getVastaus(ekaLuku, tokaLuku);
    }
}
  