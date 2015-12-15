package modelo;


import javax.annotation.ManagedBean;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lucas
 */


@ManagedBean
public class Hello {

  private String mensagem = "Quem é você?";
  
  public String getMensagem() {
    return mensagem;
  }
  
  private String nome;
  
  public String getNome() {
    return nome;
  }
  
  public void setNome(String nome) {
    this.nome = nome;
  }
  
  public void nomeFoiDigitado() {
    System.out.println("\nChamou o botão");
  }
    
}

