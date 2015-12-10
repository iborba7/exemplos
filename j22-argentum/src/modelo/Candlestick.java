/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


/**
 *
 * @author lucas
 */
public final class Candlestick {
    private final double abertura;
  private final double fechamento;
  private final double minimo;
  private final double maximo;
  private final double volume;
  private final Calendar data;

  public Candlestick(double abertura,double fechamento,double minimo,
      double maximo, double volume, Calendar data) {
    this.abertura = abertura;
    this.fechamento = fechamento;
    this.minimo = minimo;
    this.maximo = maximo;
    this.volume = volume;
    this.data = data;
  }

    public String toString() {
        String textoData = "A data atual é: ";
        String textoAbertura = "Abertura: ";
        String textoFechamento = "Fechamento: ";
        String textoMinimo = "Mínimo: ";
        String textoMaximo = "Máximo: ";
        String textoVolume = "Volume: ";
        SimpleDateFormat formatar = new SimpleDateFormat("dd/MM/yyyy");
        return textoAbertura + abertura + "\n" +  
                textoFechamento + fechamento + "\n"+ 
                textoMinimo + minimo + "\n" + 
                textoMaximo + maximo + "\n" + 
                textoVolume + volume + "\n" + 
                textoData + formatar.format(data.getTime());
       
        
        //To change body of generated methods, choose Tools | Templates.
    }
  
  

  public double getAbertura() {
    return abertura;
  }
  public double getFechamento() {
    return fechamento;
  }
  public double getMinimo() {
    return minimo;
  }
  public double getMaximo() {
    return maximo;
  }
  public double getVolume() {
    return volume;
  }
  public Calendar getData() {
    return data;
  }  

  public boolean isAlta() {
  return this.abertura < this.fechamento;
}
  
public boolean isBaixa() {
  return this.abertura > this.fechamento;
}

}
