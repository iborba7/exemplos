package modelo;


import modelo.MediaMovelSimples;
import modelo.SerieTemporal;
import org.primefaces.model.chart.ChartModel;
import org.primefaces.model.chart.LineChartModel;
import org.primefaces.model.chart.LineChartSeries;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lucas
 */
public class GeradorModeloGrafico {
    private final int comeco;
    private final int fim;
    private final SerieTemporal serie;
    private final LineChartModel modeloGrafico;
    
    
    
    public GeradorModeloGrafico(SerieTemporal serie, int comeco, int fim){
    
        this.comeco = comeco;
        this.fim = fim;
        this.serie = serie;
        this.modeloGrafico = new LineChartModel();
    }
    
    public void plotaMediaMovelSimples(){
    
        MediaMovelSimples indicador = new MediaMovelSimples();
        LineChartSeries chartSerie = new LineChartSeries("MMS- Fechamento");
        
        for (int i = comeco; i<= fim; i++){
        
            double valor = indicador.calcula(i, serie);
            chartSerie.set(i, valor);
            
        }
        this.modeloGrafico.addSeries(chartSerie);
        this.modeloGrafico.setLegendPosition("w");
        this.modeloGrafico.setTitle("Indicadores");
    }
    
    public ChartModel getModeloGrafico(){
    
        return this.modeloGrafico;
        
    }
    
}
