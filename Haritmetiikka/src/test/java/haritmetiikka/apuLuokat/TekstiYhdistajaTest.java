/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package haritmetiikka.apuLuokat;
import haritmetiikka.apuLuokat.KysymysTekstiYhdistaja;
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
public class TekstiYhdistajaTest {
    //TekstiYhdistaja tarkistaja;
    public TekstiYhdistajaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

   
     @Test
     public void hello() {
     assertEquals("ab",TekstiYhdistaja.yhdistaTeksti("a","b"));
     }
}
