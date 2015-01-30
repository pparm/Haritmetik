/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package haritmetiikka.haritmetiikka;

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
public class SummaOikeaVastausTest {
   SummaOikeaVastaus summaOikeaVastaus; 
    public SummaOikeaVastausTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    
    }
    
    @AfterClass  
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
   summaOikeaVastaus = new SummaOikeaVastaus();
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
     public void summaTarkistus1() {

    assertEquals(0,summaOikeaVastaus.vastaus(0,0));
     }
    @Test
     public void summaTarkistus2() {

    assertEquals(1,summaOikeaVastaus.vastaus(0,1));
     }
    @Test
     public void summaTarkistus3() {

    assertEquals(2,summaOikeaVastaus.vastaus(0,2));
     }
    @Test
     public void summaTarkistus4() {

    assertEquals(1,summaOikeaVastaus.vastaus(1,0));
     }
    @Test
     public void summaTarkistus5() {

    assertEquals(-1,summaOikeaVastaus.vastaus(-1,0));
     }
    @Test
     public void summaTarkistus6() {

    assertEquals(0,summaOikeaVastaus.vastaus(-1,1));
     }
    @Test
     public void summaTarkistus7() {

    assertEquals(20,summaOikeaVastaus.vastaus(10,10));
     }
    @Test
     public void summaTarkistus8() {

    assertEquals(30,summaOikeaVastaus.vastaus(15,15));
     }
    @Test
     public void summaTarkistus9() {

    assertEquals(18,summaOikeaVastaus.vastaus(9,9));
     }
    @Test
     public void summaTarkistus10() {

    assertEquals(10,summaOikeaVastaus.vastaus(5,5));
     }}
  