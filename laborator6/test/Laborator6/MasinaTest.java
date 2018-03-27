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
    public void given_car_when_marcaDacia_then_dacia() {
        System.out.println("given_car_when_marcaDacia_then_dacia");
        Masina car = new Masina("dacia", "blue", 1997, 4, 20);
        String color = car.getMarca();
        String expResult = "dacia";
        assertEquals(color, expResult);
    }

    @Test
    public void given_car_when_setMarcaDacia_then_dacia() {
        System.out.println("given_car_when_setMarcaDacia_then_dacia");
        Masina car = new Masina();
        car.setMarca("dacia");
        assertEquals (car.getMarca(), "dacia");
    }

    @Test
    public void given_car_when_CuloareBlue_then_blue() {
        System.out.println("given_car_when_CuloareBlue_then_blue");
        Masina car = new Masina("dacia", "blue", 1997, 4, 20);
        String expResult = "blue";
        String color = car.getCuloare();
        assertEquals (color , expResult);
    }

    @Test
    public void given_car_when_setCarCuloareBlue_then_blue() {
        System.out.println("given_car_when_setCarCuloareBlue_then_blue");
        Masina car = new Masina();
        String color = "Blue";
        car.setCuloare(color);
        assertEquals (car.getCuloare() , color);
    }

    @Test
    public void given_car_when_AnProd1998_then_1998() {
        System.out.println("given_car_when_AnProd1998_then_1998");
        Masina car = new Masina("dacia", "blue", 1998, 4, 20);
        int an = car.getAnProductie();
        assert (an == 1998);
    }

    @Test
    public void given_car_when_setAnProductie1998_then_1998() {
        System.out.println("given_car_when_setAnProductie1998_then_1998");
        Masina car = new Masina();
        car.setAnProductie(1998);
        assert (car.getAnProductie() == 1998);
    }

    
    /**
     * Test of getNumarUsi method, of class Masina.
     */
    @Test
    public void given_car_when_numarUsi4_then_4() {
        System.out.println("given_car_when_numarUsi4_then_4");
        Masina car = new Masina("dacia", "blue", 1998, 4, 20);
        int expResult = 4;
        int result = car.getNumarUsi();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setNumarUsi method, of class Masina.
     */
    @Test
    public void given_car_when_SetNumarUsi4_then_4() {
        System.out.println("given_car_when_SetNumarUsi4_then_4");
        int numarUsi = 4;
        Masina instance = new Masina();
        instance.setNumarUsi(numarUsi);
        assertEquals(numarUsi, instance.getNumarUsi());
    }

    /**
     * Test of getGarantie method, of class Masina.
     */
    @Test
    public void given_car_when_garantie10_then_10() {
        System.out.println("given_car_when_garantie10_then_10");
        Masina car = new Masina("dacia", "blue", 1998, 4, 20);
        int expResult = 20;
        int result = car.getGarantie();
        assertEquals(expResult, result);
    }

    /**
     * Test of setGarantie method, of class Masina.
     */
    @Test
    public void given_car_when_setGarantie20_then_20() {
        System.out.println("given_car_when_setGarantie20_then_20");
        int garantie = 20;
        Masina instance = new Masina();
        instance.setGarantie(garantie);
        assertEquals (garantie, instance.getGarantie());
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
     //   instance.setComponente(componente);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
