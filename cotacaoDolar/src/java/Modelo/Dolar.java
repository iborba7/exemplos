package Modelo;

import java.util.Calendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lucas
 */
public class Dolar {
    
    private String ultimoValorCompra;
    private String ultimoValorVenda;
    private String ultimosValores;
    private final Calendar data;

    public Dolar(String ultimoValorCompra, String ultimoValorVenda, String ultimosValores, Calendar data) {
        this.ultimoValorCompra = ultimoValorCompra;
        this.ultimoValorVenda = ultimoValorVenda;
        this.ultimosValores = ultimosValores;
        this.data = data;
    }

    public Dolar() {
        this.data = null;
    }

    public Calendar getData() {
        return data;
    }
 
    public String getUltimoValorCompra() {
        return ultimoValorCompra;
    }

    public String getUltimoValorVenda() {
        return ultimoValorVenda;
    }

    public String getUltimosValores() {
        return ultimosValores;
    }

    public void setUltimoValorCompra(String ultimoValorCompra) {
        this.ultimoValorCompra = ultimoValorCompra;
    }

    public void setUltimoValorVenda(String ultimoValorVenda) {
        this.ultimoValorVenda = ultimoValorVenda;
    }

    public void setUltimosValores(String ultimosValores) {
        this.ultimosValores = ultimosValores;
    }
    
    
}
