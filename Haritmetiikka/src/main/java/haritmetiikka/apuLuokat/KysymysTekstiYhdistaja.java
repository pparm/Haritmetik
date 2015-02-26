/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package haritmetiikka.apuLuokat;

/**
 *
 * @author poplinus
 */
public class KysymysTekstiYhdistaja {
 int ekaLuku;
 int tokaLuku;
 String tehtavaTyyppi;
 String virhePaluuArvo;        
   public KysymysTekstiYhdistaja(int ekaLuku,int tokaLuku, String tehtavaTyyppi){
    this.ekaLuku = ekaLuku;
    this.tokaLuku = tokaLuku;
    this.tehtavaTyyppi = tehtavaTyyppi;
    
}
   public String getYhdistettyTeksti(int ekaLuku,int tokaLuku, String tehtavaTyyppi){
    this.ekaLuku = ekaLuku;
    this.tokaLuku = tokaLuku;
    this.tehtavaTyyppi = tehtavaTyyppi;
   if (tehtavaTyyppi.equals("summa")){
   return ekaLuku+" + "+tokaLuku+" =";
   
   }
   if (tehtavaTyyppi.equals("miinus")){
   return ekaLuku+" - "+tokaLuku+" =";
   }
   if (tehtavaTyyppi.equals("kerto")){
   return ekaLuku+" * "+tokaLuku+" =";
   }
   return virhePaluuArvo;
   }  
}