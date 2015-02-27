/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package haritmetiikka.apuLuokat;
import haritmetiikka.apuLuokat.*;
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
public class KysymysTekstiYhdistajaTest {
    KysymysTekstiYhdistaja tarkistus;
    
    public KysymysTekstiYhdistajaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    tarkistus = new KysymysTekstiYhdistaja(1, 2, "summa");
    
    }
    
    @After
    public void tearDown() {
    }
    @Test
     public void KysymysTekstiYhdistaja1(){       
    assertEquals("1 + 2 =",tarkistus.getYhdistettyTeksti(1,2,"summa"));
}
    @Test
     public void KysymysTekstiYhdistaja2(){       
    assertEquals("1 * 2 =",tarkistus.getYhdistettyTeksti(1,2,"kerto"));
}
    @Test
     public void KysymysTekstiYhdistaja3(){       
    assertEquals("1 - 2 =",tarkistus.getYhdistettyTeksti(1,2,"miinus"));
}
    @Test
     public void KysymysTekstiYhdistaja4(){       
    assertEquals("X",tarkistus.getYhdistettyTeksti(1,2,"d"));
}
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
