/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import modelo.Candlestick;
import modelo.CandlestickFactory;
import modelo.Negociacao;

/**
 *
 * @author lucas
 */
public class TestaCandlestickFactory {
    
    public static void main(String[] args) {
    Calendar hoje = Calendar.getInstance();

    Negociacao negociacao1 = new Negociacao(40.5, 100, hoje);
    Negociacao negociacao2 = new Negociacao(45.0, 100, hoje);
    Negociacao negociacao3 = new Negociacao(39.8, 100, hoje);
    Negociacao negociacao4 = new Negociacao(42.3, 100, hoje);

    List<Negociacao> negociacoes = Arrays.asList(negociacao1, negociacao2,
               negociacao3, negociacao4);

    CandlestickFactory fabrica = new CandlestickFactory();
    Candlestick candle = fabrica.constroiCandleParaData(
                        hoje, negociacoes);

   
    System.out.println(candle.toString());
  }
    
}
