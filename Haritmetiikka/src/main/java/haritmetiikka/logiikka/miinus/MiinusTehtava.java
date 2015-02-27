/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package haritmetiikka.logiikka.miinus;
/**
 * Luokka laskee summia yhteen.
 */
public class MiinusTehtava {

    /**
     * Luodaan summan tarkastaja.
     */
    private MiinusTarkistaja miinusTarkistaja = new MiinusTarkistaja();

    /**
     * Palauttaa boolean onko käyttäjän syöttömä summa oikein.
     *
     * @param ekaLuku luku
     * @param tokaLuku luku
     * @param vastaus lukujen summa
     * @return boolean onko lukujen summa oikein
     */
    public final boolean getOikein(final int ekaLuku, final int tokaLuku, final int vastaus) {
        return miinusTarkistaja.getOikein(ekaLuku, tokaLuku, vastaus);
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

        return miinusTarkistaja.getVastaus(ekaLuku, tokaLuku);
    }
}
  