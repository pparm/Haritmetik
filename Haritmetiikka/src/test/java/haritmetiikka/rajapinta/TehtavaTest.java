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
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
     public void tehtavaTest1() {
     assertEquals(true,tehtava.getOikein("summa",10,10,20));
     
     }

    @Test
     public void tehtavaTest2() {
     assertEquals(false,tehtava.getOikein("summa",10,10,30));
     
     }
    @Test
     public void tehtavaTest3() {
     assertEquals(true,tehtava.getOikein("summa",0,0,0));
     
     }
     
    @Test
     public void tehtavaTest4() {
     assertEquals(false,tehtava.getOikein("summa",-2,0,0));
     
     }
    @Test
     public void tehtavaTest5() {
     assertEquals(true,tehtava.getOikein("summa",-2,-2,-4));
     
     }
    @Test
     public void tehtavaTest6() {
     assertEquals(-4,tehtava.getOikeaVastaus("summa",-2,-2));
     
     }
    @Test
     public void tehtavaTest7() {
     assertEquals(0,tehtava.getOikeaVastaus("summa",0,0));
     
     }
    @Test
     public void tehtavaTest8() {
     assertEquals(100,tehtava.getOikeaVastaus("summa",50,50));
     
     }
    @Test
     public void tehtavaTest9() {
     assertEquals(1,tehtava.getOikeaVastaus("summa",100,-99));
     
     }
     
     @Test
     public void ekaLukuTest1() {
     assertEquals(-198,tehtava.getOikeaVastaus("summa",-99,-99));
     
     }
     
     
     
     
     
}
