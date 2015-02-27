/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package haritmetiikka.apuLuokat;

/**
 *
 * Luokkaa yhdistää kaksi String tekstiä toisiinsa.
 */
public class TekstiYhdistaja {

    /**
     * Metodi palauttaa yhdistetyn Stringin kahdesta Stringistä.
     *
     * @param tekstiAlku
     * @param tekstiLoppu
     * @return
     */
    public static String yhdistaTeksti(String tekstiAlku, String tekstiLoppu) {
        tekstiAlku = tekstiAlku + tekstiLoppu;
        return tekstiAlku;

    }

    /*    
     public String getYhdistaTeksti(String tekstiAlku, String tekstiLoppu){
        
     tekstiAlku = tekstiAlku + tekstiLoppu; 
        
     return tekstiAlku;
     }
     */
}
