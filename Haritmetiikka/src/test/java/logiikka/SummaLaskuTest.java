/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logiikka;

import haritmetiikka.summalogiikka.SummaLasku;
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
public class SummaLaskuTest {
    SummaLasku summaLasku;
    
    public SummaLaskuTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    summaLasku = new SummaLasku();
    
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
    public void summaLaskuTest1() {
     for(int i = 0; i<10; i++){
        assertEquals(true,summaLasku.getOikein(3+i,1,4+i));
     }
    }
  public void summaLaskuTest2() {
     for(int i = 0; i<10; i++){
        assertEquals(true,summaLasku.getOikein(-1,3+i,4+i));
     }
    }

}
