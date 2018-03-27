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
public class AnvelopeTest {
    
    public AnvelopeTest() {
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
    public void given_diametru_when_diametru_is_positive() {
        System.out.println("given_diametru_when_diametru_is_positive");
        Anvelope anvelopa = new Anvelope(100,1);
        int expResult = 0;
        assert (anvelopa.getDiametru()> expResult);
            
    }

    @Test
    public void given_diametru_when_SetDiametru_is_100() {
        System.out.println("given_diametru_when_SetDiametru_is_100");
        Anvelope anvelopa = new Anvelope();
        anvelopa.setDiametru(100);
        int expResult = 100;
        assert (anvelopa.getDiametru() == expResult);
    }

    @Test
    public void given_anotimp_when_anotimp_is_1() {
        System.out.println("given_anotimp_when_anotimp_is_1");
        Anvelope anvelopa = new Anvelope(100,1);
        assert(anvelopa.getAnotimp() == 1);
    }

    @Test
    public void given_anotimp_when_SetAnotimp_is_in_range() {
        System.out.println("given_anotimp_when_SetAnotimp_is_in_range");
        Anvelope anvelopa = new Anvelope();
        anvelopa.setAnotimp(2);
        assert (anvelopa.getAnotimp() >= 1 && anvelopa.getAnotimp() <= 4);
    }
    
}
