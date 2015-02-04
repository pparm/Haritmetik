/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package haritmetiikka.logiikka;

/**
 *
 * @author poplinus
 */
public class SummaTarkistaja {
   
   
    public boolean summaTarkistus(int ekaLuku, int tokaLuku, int vastausSumma){
       if((ekaLuku +tokaLuku) == vastausSumma){
           return true;}
           else return false;
       
     
   }
        public int getSumma(int ekaLuku, int tokaLuku){
       return ekaLuku + tokaLuku;   
       
     
   } 
    
    
    
}
