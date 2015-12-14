/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
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
public class CandlestickFactoryTest {
    
    public CandlestickFactoryTest() {
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
     * Test of constroiCandleParaData method, of class CandlestickFactory.
     */
    @Test
    public void testConstroiCandleParaData() {
        System.out.println("constroiCandleParaData");
        Calendar data = null;
        List<Negociacao> negociacoes = null;
        CandlestickFactory instance = new CandlestickFactory();
        Candlestick expResult = null;
        Candlestick result = instance.constroiCandleParaData(data, negociacoes);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
     @Test
  public void sequenciaSimplesDeNegociacoes() {
    Calendar hoje = Calendar.getInstance();

    Negociacao negociacao1 = new Negociacao(40.5, 100, hoje);
    Negociacao negociacao2 = new Negociacao(45.0, 100, hoje);
    Negociacao negociacao3 = new Negociacao(39.8, 100, hoje);
    Negociacao negociacao4 = new Negociacao(42.3, 100, hoje);

    List<Negociacao> negociacoes = Arrays.asList(negociacao1, negociacao2, 
                    negociacao3, negociacao4);

    CandlestickFactory fabrica = new CandlestickFactory();
    Candlestick candle = fabrica.constroiCandleParaData(hoje, negociacoes);
    
    Assert.assertEquals(40.5, candle.getAbertura(), 0.00001);
    Assert.assertEquals(42.3, candle.getFechamento(), 0.00001);
    Assert.assertEquals(39.8, candle.getMinimo(), 0.00001);
    Assert.assertEquals(45.0, candle.getMaximo(), 0.00001);
    Assert.assertEquals(16760.0, candle.getVolume(), 0.00001);
  }
  
  @Test
public void semNegociacoesGeraCandleComZeros() {
  Calendar hoje = Calendar.getInstance();
  
  List<Negociacao> negociacoes = Arrays.asList(); 
    
  CandlestickFactory fabrica = new CandlestickFactory();
  Candlestick candle = fabrica.constroiCandleParaData(hoje, negociacoes);
  
  Assert.assertEquals(0.0, candle.getVolume(), 0.00001);
}
    
}
