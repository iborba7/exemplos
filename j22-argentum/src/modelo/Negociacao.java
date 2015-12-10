/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Calendar;

/**
 *
 * @author lucas
 */
public final class Negociacao {
  private final double preco;
  private final int quantidade;
  private final Calendar data;
  
  public Negociacao(double preco, int quantidade, Calendar data) {
  this.preco = preco;
  this.quantidade = quantidade;
  this.data = data;
}

    public Calendar getData() {
        return data;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }
  
  public double getVolume(){
  return preco *quantidade;
  }
  
}
