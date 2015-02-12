/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package haritmetiikka.kertologiikka;

import haritmetiikka.kertologiikka.*;
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
public class KertoTarkistajaTest {
KertoTarkistaja tarkistus;
    
    public KertoTarkistajaTest() {
    }

    @BeforeClass
    public static void setUpClass() {
   }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    tarkistus = new KertoTarkistaja();
  
    
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void kertoTarkistajatusTest1() {
    
    assertEquals(true,tarkistus.getOikein(3,1,3));
    
}
    @Test
    public void kertoTarkistajatusTest2() {
    
    assertEquals(false,tarkistus.getOikein(3,1,4));
    
}
    @Test
    public void kertoTarkistajatusTest3() {
    
    assertEquals(false,tarkistus.getOikein(2,1,5));
    
}
    @Test
    public void kertoTarkistajatusTest4() {
    
    assertEquals(false,tarkistus.getOikein(3,2,4));
    
}
    @Test
    public void kertoTarkistajatusTest5() {
    
    assertEquals(false,tarkistus.getOikein(50,20,100));
 
}
    @Test
    public void kertoTarkistajatusTest6() {
    
    assertEquals(true,tarkistus.getOikein(2,0,0));
    
}
    @Test
    public void kertoTarkistajatusTest7() {
    
    assertEquals(true,tarkistus.getOikein(-2,1,-2));
    
}
    @Test
    public void kertoTarkistajatusTest8() {
    
    assertEquals(true,tarkistus.getOikein(0,0,0));
    
}
     @Test
    public void kertoTarkistajatusTes9() {
    
    assertEquals(false,tarkistus.getOikein(10,1,40));
    
}
    
     @Test
    public void kertoTarkistajatusTest10() {
    
    assertEquals(true,tarkistus.getOikein(10,10,100));
    
}
// Oikean summauksen testaus    
     @Test
    public void oikeaKertoTest() {
    
    for(int i = 0; i<=10; i++){
        
        assertEquals(i*10,tarkistus.getVastaus(i,10));
    }
        
    
}    
    
    
}
