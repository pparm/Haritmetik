/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package haritmetiikka.rajapinta;

import haritmetiikka.rajapinta.Tehtava;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author poplinus
 */
public class TehtavaTest {

    Tehtava tehtava;
    Tehtava tehtava2;

    public TehtavaTest() {
    }

    @BeforeClass
    public static void setUpClass() {

    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {

        tehtava = new Tehtava();
        tehtava2 = new Tehtava("summa", 2);

    }

    @After
    public void tearDown() {
    }

   
    @Test
    public void kysymysTestiYhd1stajaTest() {
        assertEquals("1 + 2 =", tehtava.kysymysTekstiYhdista(1, 2, "summa"));

    }
    @Test
    public void tekstiYhdistajaTest() {
        assertEquals("ab", tehtava.yhdistaTeksti("summa", "a", "b"));

    }
    @Test
    public void tehtavaTest1() {
        assertEquals(true, tehtava.getOikein("summa", 10, 10, 20));

    }

    @Test
    public void tehtavaTest2() {
        assertEquals(false, tehtava.getOikein("summa", 10, 10, 30));

    }

    @Test
    public void tehtavaTest3() {
        assertEquals(true, tehtava.getOikein("summa", 0, 0, 0));

    }

    @Test
    public void tehtavaTest4() {
        assertEquals(false, tehtava.getOikein("summa", -2, 0, 0));

    }

    @Test
    public void tehtavaTest5() {
        assertEquals(true, tehtava.getOikein("summa", -2, -2, -4));

    }

    @Test
    public void tehtavaTest6() {
        assertEquals(-4, tehtava.getOikeaVastaus("summa", -2, -2));

    }

    @Test
    public void tehtavaTest7() {
        assertEquals(0, tehtava.getOikeaVastaus("summa", 0, 0));

    }

    @Test
    public void tehtavaTest8() {
        assertEquals(100, tehtava.getOikeaVastaus("summa", 50, 50));

    }

    @Test
    public void tehtavaTest9() {
        assertEquals(1, tehtava.getOikeaVastaus("summa", 100, -99));

    }

    @Test
    public void tehtavaTestKerto1() {
        assertEquals(true, tehtava.getOikein("kerto", 10, 10, 100));

    }

    @Test
    public void tehtavaTestKerto2() {
        assertEquals(false, tehtava.getOikein("kerto", 10, 1, 100));

    }

    @Test
    public void tehtavaTestKerto3() {
        assertEquals(100, tehtava.getOikeaVastaus("kerto", 10, 10));

    }

    @Test
    public void tehtavaTestMiinus1() {
        assertEquals(true, tehtava.getOikein("miinus", 10, 10, 0));

    }

    @Test
    public void tehtavaTestMiinus2() {
        assertEquals(false, tehtava.getOikein("miinus", 10, 1, 8));

    }

    @Test
    public void tehtavaTestMiinus3() {
        assertEquals(1, tehtava.getOikeaVastaus("miinus", 10, 9));

    }

    @Test
    public void tehtavaTestTyhja1() {
        assertEquals(-1, tehtava.getOikeaVastaus("ha", 10, 9));

    }

    @Test
    public void tehtavaTestTyhja2() {
        assertEquals(false, tehtava.getOikein("ha", 10, 9, 2));

    }

    public void tehtavaTestGetEkaluku() {
        assertEquals(tehtava.getEkaLuku(), tehtava.getEkaLuku());

    }

    @Test
    public void ekaLukuTest1() {
        assertEquals(-198, tehtava.getOikeaVastaus("summa", -99, -99));

    }

    @Test

    public void ekaLukuTest() {

        assertEquals(true, tehtava.getEkaLuku() <= 10 && tehtava.getEkaLuku() >= 0);

    }

    @Test
    public void tokaLukuTest() {
        assertEquals(true, tehtava.getTokaLuku() <= 10 && tehtava.getTokaLuku() >= 0);

    }

}
