/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

/**
 *
 * @author Lucas
 */
public class MediaMovelSimples {
    
    public  double calcula (int posicao, SerieTemporal serie){
    
        double soma = 0.0;
        
        for (int i = posicao; i > posicao -3; i--){
        
            Candlestick c = serie.getCandle(i);
            soma += c.getFechamento();
        }
        return  soma /3;    
    }
    
}
