/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apuLuokat;
import java.util.*;
/**
 Luokkaa arpoo kokonaislukuja halutulle välille
 
 */

public class LukuArpoja {

/**
 * Metodi arpoo kokonaisluvun halutulla välillä
 * 
 * @param alaraja Arvottavan kokonaisluvun alaraja
 * @param ylaraja Arvottavan kokonaisluvun yläraja
 * @return Arvottu kokonaisluku
 */
    
    
  public int arvottuLuku(int alaraja, int ylaraja){
  
 
      
      Random arpoja = new Random();
      if (alaraja > ylaraja) {
      throw new IllegalArgumentException("Alarajan täytyy olla pienempi kuin ylärajan");
    }
    long vali = (long)ylaraja - (long)alaraja + 1;
    long lisaOsa = (long)(vali * arpoja.nextDouble());
    int satunnaisluku =  (int)(lisaOsa + alaraja);    
    return satunnaisluku;
  
  }
    
 


}
