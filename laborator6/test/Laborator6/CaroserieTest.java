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

public class CaroserieTest {
    
    public CaroserieTest() {
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
    public void given_culoare_when_culoare_is_red() {
        Caroserie caroserie = new Caroserie("red","wood");
        assert(caroserie.getCuloare().equals("red"));
    }

    @Test
    public void given_culoare_when_setCuloare_is_white() {
        Caroserie caroserie = new Caroserie();
        caroserie.setCuloare("white");
        assert(caroserie.getCuloare().equals("white"));
    }

    @Test
    public void given_material_when_material_is_paper() {
        Caroserie caroserie = new Caroserie("black","paper");
        assert(caroserie.getMaterial().equals("paper"));
    }

    @Test
    public void given_material_when_setMaterial_is_aluminium() {
        Caroserie caroserie = new Caroserie();
        caroserie.setMaterial("aluminium");
        assert(caroserie.getMaterial().equals("aluminium"));
    }
    /*
    @Test
    public void testGetCuloare() {
        System.out.println("getCuloare");
        Caroserie instance = null;
        String expResult = "";
        String result = instance.getCuloare();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

   */
}
