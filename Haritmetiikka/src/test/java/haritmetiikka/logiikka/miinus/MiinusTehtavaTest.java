/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package haritmetiikka.logiikka.miinus;

import haritmetiikka.logiikka.miinus.MiinusTehtava;
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
public class MiinusTehtavaTest {
    MiinusTehtava miinusLasku;
    
    public MiinusTehtavaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    miinusLasku = new MiinusTehtava();
    
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
    public void miinusLaskuTest1() {
     for(int i = 0; i<10; i++){
        assertEquals(true,miinusLasku.getOikein(3,i,3-i));
     }
    }
  public void miinusLaskuTest2() {
     for(int i = 0; i<10; i++){
        assertEquals(false,miinusLasku.getOikein(1,3+i,3+i));
     }
    }

}
