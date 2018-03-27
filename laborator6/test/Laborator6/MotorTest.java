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
public class MotorTest {
    
    public MotorTest() {
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
    public void given_putere_when_putere_is_500() {
        Motor motor = new Motor(500,100,10,"gas");
        int expResult = 500;
        assert(motor.getPutere() == expResult);
    }

    @Test
    public void given_putere_when_setPutere_is_minimum_100_and_maximum_1000() {
        Motor motor = new Motor();
        motor.setPutere(900);
        assert(motor.getPutere()>=100 && motor.getPutere()<=1000);
    }

    @Test
    public void given_turatie_when_turatie_is_300() {
        Motor motor = new Motor(100,300,40,"gas");
        assert(motor.getTuratie()==300);
    }

    @Test
    public void given_turatie_when_setTuratie_is_400() {
        Motor motor = new Motor();
        motor.setTuratie(400);
        assert(motor.getTuratie()==400);
    }

    @Test
    public void given_capacitate_when_capacitate_is_positive() {
        Motor motor = new Motor(100,200,50,"gas");
        assert(motor.getCapacitateCilindrica() > 0);
    }

    @Test
    public void given_capacitate_when_setCapacitate_is_positive() {
        Motor motor = new Motor();
        motor.setCapacitateCilindrica(30);
        assert(motor.getCapacitateCilindrica()>0);
    }

    @Test
    public void given_combustibil_when_combustibil_is_gas() {
        Motor motor = new Motor(100,200,30,"gas");
        assertEquals (motor.getCombustibil(),"gas");
    }

    @Test
    public void given_combustibil_when_setCombustibil_is_gas() {
        Motor motor = new Motor();
        motor.setCombustibil("gas");
        assertEquals (motor.getCombustibil(),"gas");
    }
    
    /*
    @Test
    public void testGetPutere() {
        System.out.println("getPutere");
        Motor instance = null;
        int expResult = 0;
        int result = instance.getPutere();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    */
}
