/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import sun.security.util.BigInt;


/**
 *
 * @author Compaq
 */
@Entity
@Table (name="usuario")
public class Usuario implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Column
    private String nome;
    
    @Column
    private String senha;
    
    @Column
    private int cpf;
    
    @Column
    private String login;
    
     @Id
    @SequenceGenerator(name="usuario_id_seq",
                       sequenceName="usuario_id_seq",
                       allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
                    generator="usuario_id_seq")
    @Column(name = "id", updatable=false)
    private Integer id; 

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public Usuario(String nome, String senha, int cpf, String login) {
        this.nome = nome;
        this.senha = senha;
        this.cpf = cpf;
        this.login = login;
        
    }



    

    public void setLogin(String login) {
        this.login = login;
    }

    public String getLogin() {
        return login;
    }    

    public Usuario() {
    }
    
    
    
    public String getNome() {
        return nome;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }

    

    public void setNome(String nome) {
        this.nome = nome;
    }

    
    
     

    
    
}
