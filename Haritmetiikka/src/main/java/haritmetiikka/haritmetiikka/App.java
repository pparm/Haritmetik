package haritmetiikka.haritmetiikka;

import haritmetiikka.apuLuokat.TekstiYhdistaja;
import haritmetiikka.kayttoliittyma.summa.SummaIkkuna;
import haritmetiikka.kayttoliittyma.*;
import haritmetiikka.rajapinta.Tehtava;

public class App {

    private SummaIkkuna summaIkkuna = new SummaIkkuna();

    public static void main(String[] args) {
        new StartIkkuna().setVisible(true);
       // System.out.println(Tehtava.yhdistaTeksti("a", "b"));
        
//   
//
////  System.out.println(tehtava.getEkaLuku());
//  //  System.out.println(tehtava.getTokaLuku());
//    
// //       System.out.println(tehtava.getOikeaVastaus("summa", tehtava.getEkaLuku(), tehtava.getTokaLuku()));
// //       System.out.println(tehtava.getOikein("summa", tehtava.getEkaLuku(),tehtava.getTokaLuku(),tehtava.getOikeaVastaus("summa",tehtava.getEkaLuku(), tehtava.getTokaLuku())));
//// LukuArpoja arpoja = new LukuArpoja();
//   //     System.out.println(arpoja.arvottuLuku(0, 10));
    }
}
