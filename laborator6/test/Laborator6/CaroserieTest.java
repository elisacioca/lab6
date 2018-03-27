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
        System.out.println("given_culoare_when_culoare_is_red");
        Caroserie caroserie = new Caroserie("red","wood");
        String expResult = "red";
        assertEquals (caroserie.getCuloare(), expResult);
    }

    @Test
    public void given_culoare_when_setCuloare_is_white() {
        System.out.println("given_culoare_when_setCuloare_is_white");
        Caroserie caroserie = new Caroserie();
        caroserie.setCuloare("white");
        String expResult = "white";
        assertEquals (caroserie.getCuloare(), expResult);
    }

    @Test
    public void given_material_when_material_is_paper() {
        System.out.println("given_material_when_material_is_paper");
        Caroserie caroserie = new Caroserie("black","paper");
        String expResult = "paper"; // ????
        assertEquals (caroserie.getMaterial(), expResult);
    }

    @Test
    public void given_material_when_setMaterial_is_aluminium() {
        System.out.println("given_material_when_setMaterial_is_aluminium");
        Caroserie caroserie = new Caroserie();
        caroserie.setMaterial("aluminium");
        String expResult = "aluminium";
        assertEquals (caroserie.getMaterial(),expResult);
    }
    
}
