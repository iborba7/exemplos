/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import java.util.Calendar;
import java.util.GregorianCalendar;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Lucas
 */
public class NegociacaoTest {
    
    public NegociacaoTest() {
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

    /**
     * Test of getData method, of class Negociacao.
     */
    @Test
    public void testGetData() {
        System.out.println("getData");
        Negociacao instance = null;
        Calendar expResult = null;
        Calendar result = instance.getData();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPreco method, of class Negociacao.
     */
    @Test
    public void testGetPreco() {
        System.out.println("getPreco");
        Negociacao instance = null;
        double expResult = 0.0;
        double result = instance.getPreco();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getQuantidade method, of class Negociacao.
     */
    @Test
    public void testGetQuantidade() {
        System.out.println("getQuantidade");
        Negociacao instance = null;
        int expResult = 0;
        int result = instance.getQuantidade();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVolume method, of class Negociacao.
     */
    @Test
    public void testGetVolume() {
        System.out.println("getVolume");
        Negociacao instance = null;
        double expResult = 0.0;
        double result = instance.getVolume();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
public void mesmoMilissegundoEhDoMesmoDia() {
  Calendar agora = Calendar.getInstance();
  Calendar mesmoMomento = (Calendar) agora.clone();

  Negociacao negociacao = new Negociacao(40.0, 100, agora);
  Assert.assertTrue(negociacao.isMesmoDia(mesmoMomento));
}

@Test
public void comHorariosDiferentesEhNoMesmoDia() {
  // usando GregorianCalendar(ano, mes, dia, hora, minuto)
  Calendar manha = new GregorianCalendar(2011, 10, 20, 8, 30);
  Calendar tarde = new GregorianCalendar(2011, 10, 20, 15, 30);

  Negociacao negociacao = new Negociacao(40.0, 100, manha);
  Assert.assertTrue(negociacao.isMesmoDia(tarde));
}


    
}
