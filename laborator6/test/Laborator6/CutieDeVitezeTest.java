/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laborator6;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lenovo
 */
public class CutieDeVitezeTest {
    
    public CutieDeVitezeTest() {
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
    public void given_number_when_trepte_is_greater_than0_and_lower_than_8() {
        CutieDeViteze cutieDeViteze = new CutieDeViteze(3,true);
        assert(cutieDeViteze.getTrepteViteza() >= 0 && cutieDeViteze.getTrepteViteza() < 8);
    }

    @Test
    public void given_number_when_setTrepte_is_5() {
        CutieDeViteze cutieDeViteze = new CutieDeViteze();
        cutieDeViteze.setTrepteViteza(5);
        assert (cutieDeViteze.getTrepteViteza() == 5);
    }

    @Test
    public void given_automat_when_automat_is_true() {
        CutieDeViteze cutieDeViteze = new CutieDeViteze(1,true);
        assert(cutieDeViteze.isAutomat());
    }

    @Test
    public void given_automat_when_setAutomat_is_false() {
        CutieDeViteze cutieDeViteze = new CutieDeViteze();
        cutieDeViteze.setAutomat(false);
        assert(!cutieDeViteze.isAutomat());
    }
    
    /*
     
    @Test
    public void testGetTrepteViteza() {
        System.out.println("getTrepteViteza");
        CutieDeViteze instance = new CutieDeViteze();
        int expResult = 0;
        int result = instance.getTrepteViteza();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    @Test
    public void testSetTrepteViteza() {
        System.out.println("setTrepteViteza");
        int trepteViteza = 0;
        CutieDeViteze instance = new CutieDeViteze();
        instance.setTrepteViteza(trepteViteza);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    @Test
    public void testIsAutomat() {
        System.out.println("isAutomat");
        CutieDeViteze instance = new CutieDeViteze();
        boolean expResult = false;
        boolean result = instance.isAutomat();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

  
    @Test
    public void testSetAutomat() {
        System.out.println("setAutomat");
        boolean automat = false;
        CutieDeViteze instance = new CutieDeViteze();
        instance.setAutomat(automat);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    */
}
