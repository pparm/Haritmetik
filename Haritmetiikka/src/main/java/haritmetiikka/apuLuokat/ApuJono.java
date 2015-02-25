/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package haritmetiikka.apuLuokat;

import java.util.ArrayDeque;

/**
 * Tähän luokkaan tallennetaan Stringejä jonoon. Paluuarvona on ensimmäinen jono
 * ensimmäinen syötetty Stringi (First In First Out)
 * Paluuarvona antaa ensimmäisenä viety Stringi
 *
 * @author poplinus
 */
public class ApuJono {
    
    ArrayDeque<String> ad = new ArrayDeque<String>(); 
    String string;
   
    public void setString(String string){
        this.string = string;
        ad.addFirst(string);
    
    }
    
    public String getString(){
       return ad.getLast();
    }
    
    
    
}
