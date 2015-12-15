/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bean;

import java.util.List;
import javax.faces.bean.ManagedBean;
import modelo.ClienteWebService;
import modelo.Negociacao;

/**
 *
 * @author Lucas
 */
@ManagedBean
public class ArgentumBean {
    
    private List<Negociacao> negociacoes;
    
    public ArgentumBean (){
        negociacoes = new ClienteWebService().getNegociacoes();
    }
    
    public List<Negociacao> getNegociacoes() {
    return negociacoes;
  }
}
