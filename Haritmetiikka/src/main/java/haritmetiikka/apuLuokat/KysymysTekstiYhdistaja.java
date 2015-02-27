/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package haritmetiikka.apuLuokat;

/**
 * Luokka yhdistää luvuista kysymyslausekkeen.
 *
 */
public class KysymysTekstiYhdistaja {

   private int ekaLuku;
   private int tokaLuku;
   private String tehtavaTyyppi;
   private String virhePaluuArvo;

    /**
     * Konsistori.
     *
     * @param ekaLuku ensimmäinen luku
     * @param tokaLuku toinen luku
     * @param tehtavaTyyppi tehtävä tyyppi. Summa, Miinus tai Kerto.
     */
    public KysymysTekstiYhdistaja(int ekaLuku, int tokaLuku, String tehtavaTyyppi) {
        this.ekaLuku = ekaLuku;
        this.tokaLuku = tokaLuku;
        this.tehtavaTyyppi = tehtavaTyyppi;

    }

    /**
     * Metodi tuo yhdistetyn lausekkeen.
     *
     * @param ekaLuku
     * @param tokaLuku
     * @param tehtavaTyyppi
     * @return String lauseke esimerkiksi 1 + 2 = tai 1 - 2 =
     */
    public String getYhdistettyTeksti(int ekaLuku, int tokaLuku, String tehtavaTyyppi) {
        this.ekaLuku = ekaLuku;
        this.tokaLuku = tokaLuku;
        this.tehtavaTyyppi = tehtavaTyyppi;
        if (tehtavaTyyppi.equals("summa")) {
            return ekaLuku + " + " + tokaLuku + " =";

        }
        if (tehtavaTyyppi.equals("miinus")) {
            return ekaLuku + " - " + tokaLuku + " =";
        }
        if (tehtavaTyyppi.equals("kerto")) {
            return ekaLuku + " * " + tokaLuku + " =";
        }
        return "X";
    }
}
