/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package haritmetiikka.summalogiikka;

import apuLuokat.LukuArpoja;

/**
 * Luokka laskee summia yhteen
 */
public class SummaTehtava {

    private LukuArpoja arpoja = new LukuArpoja();
    private SummaTarkistaja summaTarkistaja = new SummaTarkistaja();
    private int ekaLuku = arpoja.arvottuLuku(0, 10);
    private int tokaLuku = arpoja.arvottuLuku(0, 10);
    private int vastaus = 6;
    
    
    /**
     * Palauttaa boolean onko käyttäjän syöttömä summa oikein
     *
     * @param ekaLuku luku
     * @param tokaLuku luku
     * @param vastaus lukujen summa
     * @return boolean onko lukujen summa oikein
     */
    public boolean getOikein(int ekaLuku, int tokaLuku, int vastaus) {
        return summaTarkistaja.getOikein(ekaLuku, tokaLuku, vastaus);
    }

    /**
     * Laskee kahden luvun summan
     *
     *
     * @param ekaLuku kokonaisluku
     * @param tokaLuku kokonaisluku
     * @return kokonaislukujen summa
     */
    public int getSumma(int ekaLuku, int tokaLuku) {
      this.ekaLuku = ekaLuku;
        return summaTarkistaja.getSumma(ekaLuku, tokaLuku);
    } 

}
