/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package haritmetiikka.logiikka;

import haritmetiikka.logiikka.LukuArpoja;

/**
 *
 * @author poplinus
 */


public class SummaLasku {
    
    public LukuArpoja arpoja = new LukuArpoja();
    public SummaTarkistaja summaTarkistaja = new SummaTarkistaja();
    int ekaLuku = arpoja.arvottuLuku(0, 10);
    int tokaLuku = arpoja.arvottuLuku(0, 10);
    int vastaus = 6;
public boolean getOikein(int ekaLuku,int tokaLuku,int vastaus){
   return summaTarkistaja.summaTarkistus(ekaLuku,tokaLuku,vastaus);
}
public int getSumma(int ekaLuku,int tokaLuku){
   return summaTarkistaja.getSumma(ekaLuku,tokaLuku);
}

}
