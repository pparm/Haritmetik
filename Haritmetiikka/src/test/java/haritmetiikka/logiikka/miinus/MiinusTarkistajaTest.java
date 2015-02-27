/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package haritmetiikka.logiikka.miinus;

import haritmetiikka.logiikka.miinus.MiinusTarkistaja;
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
public class MiinusTarkistajaTest {
MiinusTarkistaja tarkistus;
    
    public MiinusTarkistajaTest() {
    }

    @BeforeClass
    public static void setUpClass() {
   }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    tarkistus = new MiinusTarkistaja();
  
    
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void MiinusTarkistusTest1() {
    
    assertEquals(true,tarkistus.getOikein(3,1,2));
    
}
    @Test
    public void MiinusTarkistusTest2() {
    
    assertEquals(false,tarkistus.getOikein(3,1,1));
    
}
    @Test
    public void MiinusTarkistusTest3() {
    
    assertEquals(false,tarkistus.getOikein(2,1,2));
    
}
    @Test
    public void MiinusTarkistusTest4() {
    
    assertEquals(false,tarkistus.getOikein(3,2,4));
    
}
    @Test
    public void MiinusTarkistusTest5() {
    
    assertEquals(false,tarkistus.getOikein(50,20,3));
 
}
    @Test
    public void MiinusTarkistusTest6() {
    
    assertEquals(true,tarkistus.getOikein(2,0,2));
    
}
    @Test
    public void MiinusTarkistusTest7() {
    
    assertEquals(true,tarkistus.getOikein(-2,1,-3));
    
}
    @Test
    public void MiinusTarkistusTest8() {
    
    assertEquals(true,tarkistus.getOikein(0,0,0));
    
}
     @Test
    public void MiinusTarkistusTes9() {
    
    assertEquals(false,tarkistus.getOikein(10,1,4));
    
}
    
     @Test
    public void MiinusTarkistusTest10() {
    
    assertEquals(true,tarkistus.getOikein(10,10,0));
    
}
// Oikean summauksen testaus    
     @Test
    public void oikeaSummaTest() {
    
    for(int i = 0; i<=10; i++){
        
        assertEquals(i-20,tarkistus.getVastaus(i,20));
    }
        
    
}    
    
    
}
