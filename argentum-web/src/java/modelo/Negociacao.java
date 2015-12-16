/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.Calendar;

/**
 *
 * @author lucas
 */
public final class Negociacao implements Serializable {
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

   public boolean isMesmoDia(Calendar outraData) {
        return 
     
    this.data.get(Calendar.DAY_OF_MONTH) == outraData.get(Calendar.DAY_OF_MONTH)
    && this.data.get(Calendar.MONTH) == outraData.get(Calendar.MONTH)
    && this.data.get(Calendar.YEAR) == outraData.get(Calendar.YEAR); //To change body of generated methods, choose Tools | Templates.
    }

    

   
  
}
