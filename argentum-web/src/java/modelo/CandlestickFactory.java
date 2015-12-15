/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author lucas
 */
public class CandlestickFactory {
public Candlestick constroiCandleParaData (Calendar data, List<Negociacao> negociacoes){
    double maximo = negociacoes.get(0).getPreco();
    double minimo = negociacoes.get(0).getPreco();
    double volume = 0;
    
    for (Negociacao negociacao : negociacoes) {
        volume +=negociacao.getVolume();
        
        if(negociacao.getPreco()>maximo){
        
            maximo = negociacao.getPreco();   
        }
        else if (negociacao.getPreco() < minimo){
        minimo = negociacao.getPreco();
        }
    }
    
    double abertura = negociacoes.get(0).getPreco();
    double fechamento = negociacoes.get(negociacoes.size()-1).getPreco();
    
    return new   Candlestick(abertura, fechamento, minimo, maximo, volume, data);
    
}    

    public List<Candlestick> constroiCandles(List<Negociacao> todasNegociacoes) {
  List<Candlestick> candles = new ArrayList<Candlestick>();

  List<Negociacao> negociacoesDoDia = new ArrayList<Negociacao>();
  Calendar dataAtual = todasNegociacoes.get(0).getData();

  for (Negociacao negociacao : todasNegociacoes) {
    // se não for mesmo dia, fecha candle e reinicia variáveis
    if (!negociacao.isMesmoDia(dataAtual)) {
      Candlestick candleDoDia = constroiCandleParaData(dataAtual, 
                            negociacoesDoDia);
      candles.add(candleDoDia);
      negociacoesDoDia = new ArrayList<Negociacao>();
      dataAtual = negociacao.getData();
    }
    negociacoesDoDia.add(negociacao);
  }
  // adiciona último candle
  Candlestick candleDoDia = constroiCandleParaData(dataAtual,
         negociacoesDoDia);
  candles.add(candleDoDia);

  return candles;
}
    
    
}
