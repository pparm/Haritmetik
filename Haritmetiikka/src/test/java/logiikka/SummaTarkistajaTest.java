/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logiikka;

import haritmetiikka.summalogiikka.SummaTarkistaja;
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
public class SummaTarkistajaTest {
SummaTarkistaja tarkistus;
    
    public SummaTarkistajaTest() {
    }

    @BeforeClass
    public static void setUpClass() {
   }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    tarkistus = new SummaTarkistaja();
  
    
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void SummaTarkistusTest1() {
    
    assertEquals(true,tarkistus.summaTarkistus(3,1,4));
    
}
    @Test
    public void SummaTarkistusTest2() {
    
    assertEquals(false,tarkistus.summaTarkistus(3,1,5));
    
}
    @Test
    public void SummaTarkistusTest3() {
    
    assertEquals(false,tarkistus.summaTarkistus(2,1,4));
    
}
    @Test
    public void SummaTarkistusTest4() {
    
    assertEquals(false,tarkistus.summaTarkistus(3,2,4));
    
}
    @Test
    public void SummaTarkistusTest5() {
    
    assertEquals(false,tarkistus.summaTarkistus(50,20,3));
 
}
    @Test
    public void SummaTarkistusTest6() {
    
    assertEquals(true,tarkistus.summaTarkistus(2,0,2));
    
}
    @Test
    public void SummaTarkistusTest7() {
    
    assertEquals(true,tarkistus.summaTarkistus(-2,1,-1));
    
}
    @Test
    public void SummaTarkistusTest8() {
    
    assertEquals(true,tarkistus.summaTarkistus(0,0,0));
    
}
     @Test
    public void SummaTarkistusTes9() {
    
    assertEquals(false,tarkistus.summaTarkistus(10,1,4));
    
}
    
     @Test
    public void SummaTarkistusTest10() {
    
    assertEquals(true,tarkistus.summaTarkistus(10,10,20));
    
}
// Oikean summauksen testaus    
     @Test
    public void oikeaSummaTest() {
    
    for(int i = 0; i<=10; i++){
        
        assertEquals(i+20,tarkistus.getSumma(i,20));
    }
        
    
}    
    
    
}
