/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package reader;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.List;
import modelo.Negociacao;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Lucas
 */

public class LeitorXMLTest {
    
    public LeitorXMLTest() {
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
public void carregaXmlComUmaNegociacaoEmListaUnitaria() {
  String xmlDeTeste = "<list>" +
          "  <negociacao>" +
          "    <preco>43.5</preco>" +
          "    <quantidade>1000</quantidade>" +
          "    <data>" +
          "      <time>1322233344455</time>" +
          "    </data>" +
          "  </negociacao>" +
          "</list>";
  
  LeitorXML leitor = new LeitorXML();

  InputStream xml = new ByteArrayInputStream(xmlDeTeste.getBytes());

  List<Negociacao> negociacoes = leitor.carrega(xml);
}
    
}
