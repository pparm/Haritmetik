package haritmetiikka.haritmetiikka;

import haritmetiikka.kayttoliittyma.*;
public class App 
{
    public static void main( String[] args )
    {
        SummaOikeaVastaus koe = new SummaOikeaVastaus();
        System.out.println(koe.vastaus(3, 1));
    }
}
