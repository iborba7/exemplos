/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bean;

import modelo.GeradorModeloGrafico;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import modelo.Candlestick;
import modelo.CandlestickFactory;
import modelo.ClienteWebService;
import modelo.Negociacao;
import modelo.SerieTemporal;
import org.primefaces.model.chart.ChartModel;

/**
 *
 * @author Lucas
 */
@ManagedBean
@ViewScoped
public class ArgentumBean {
    
    private List<Negociacao> negociacoes;
    private final ChartModel modeloGrafico;

    public ChartModel getModeloGrafico() {
        return modeloGrafico;
    }
    
    
    public ArgentumBean (){
        negociacoes = new ClienteWebService().getNegociacoes();
        List <Candlestick> candles = new CandlestickFactory().constroiCandles(negociacoes);
        SerieTemporal serie = new SerieTemporal(candles);
        GeradorModeloGrafico geradorGrafico = new GeradorModeloGrafico(serie, 2, serie.getUltimaPosicao());
        geradorGrafico.plotaMediaMovelSimples();
        this.modeloGrafico = geradorGrafico.getModeloGrafico();
    }
    
    public List<Negociacao> getNegociacoes() {
    return negociacoes;
  }
}
