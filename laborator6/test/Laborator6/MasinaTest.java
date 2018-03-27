/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laborator6;

import java.util.ArrayList;
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
public class MasinaTest {
    
    public MasinaTest() {
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
    public void addComponent() {
    }

    @Test
    public void given_car_when_carIsDacia_then_dacia() {
        Masina car = new Masina("dacia", "blue", 1997, 4, 20);
        String color = car.getMarca();
        assertEquals(color, "dacia");
    }

    @Test
    public void given_car_when_setMarcaDacia_then_dacia() {
        Masina car = new Masina();
        car.setMarca("dacia");
        assertEquals (car.getMarca(), "dacia");
    }

    @Test
    public void given_car_when_carIsBlue_then_blue() {
        Masina car = new Masina("dacia", "blue", 1997, 4, 20);
        String color = car.getCuloare();
        assertEquals (color , "blue");
    }

    @Test
    public void given_car_when_setCarCuloareBlue_then_blue() {
        Masina car = new Masina();
        car.setCuloare("Blue");
        assertEquals (car.getCuloare() , "Blue");
    }

    @Test
    public void given_car_when_carHasAnProd1998_then_1998() {
        Masina car = new Masina("dacia", "blue", 1998, 4, 20);
        int an = car.getAnProductie();
        assert (an == 1998);
    }

    @Test
    public void given_car_when_setAnProductie1998_then_1998() {
        Masina car = new Masina();
        car.setAnProductie(1998);
        assert (car.getAnProductie() == 1998);
    }

    
    /**
     * Test of getNumarUsi method, of class Masina.
     */
    @Test
    public void testGetNumarUsi() {
        System.out.println("getNumarUsi");
        Masina instance = new Masina();
        int expResult = 0;
        int result = instance.getNumarUsi();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of setNumarUsi method, of class Masina.
     */
    @Test
    public void testSetNumarUsi() {
        System.out.println("setNumarUsi");
        int numarUsi = 0;
        Masina instance = new Masina();
        instance.setNumarUsi(numarUsi);
        // TODO review the generated test code and remove the default call to fail.
     //   fail("The test case is a prototype.");
    }

    /**
     * Test of getGarantie method, of class Masina.
     */
    @Test
    public void testGetGarantie() {
        System.out.println("getGarantie");
        Masina instance = new Masina();
        int expResult = 0;
        int result = instance.getGarantie();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of setGarantie method, of class Masina.
     */
    @Test
    public void testSetGarantie() {
        System.out.println("setGarantie");
        int garantie = 0;
        Masina instance = new Masina();
        instance.setGarantie(garantie);
        // TODO review the generated test code and remove the default call to fail.
     //   fail("The test case is a prototype.");
    }

    /**
     * Test of getComponente method, of class Masina.
     */
    @Test
    public void testGetComponente() {
        System.out.println("getComponente");
        Masina instance = new Masina();
        ArrayList<Componenta> expResult = null;
        ArrayList<Componenta> result = instance.getComponente();
//        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of setComponente method, of class Masina.
     */
    @Test
    public void testSetComponente() {
        System.out.println("setComponente");
        ArrayList<Componenta> componente = null;
        Masina instance = new Masina();
        instance.setComponente(componente);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
