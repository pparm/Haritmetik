/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package haritmetiikka.logiikka.kerto;

import haritmetiikka.logiikka.kerto.KertoTehtava;
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
public class KertoTehtavaTest {
    KertoTehtava kertoLasku;
    
    public KertoTehtavaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    kertoLasku = new KertoTehtava();
    
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
    public void kertoLaskuTest1() {
     for(int i = 0; i<10; i++){
        assertEquals(true,kertoLasku.getOikein(i,i,i*i));
     }
    }
  public void kertoLaskuTest2() {
     for(int i = 0; i<10; i++){
        assertEquals(false,kertoLasku.getOikein(-1,3+i,4+i));
     }
    }
  

}
