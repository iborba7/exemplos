/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

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
@Table (name="aluno")
public class Aluno implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Column
    private String nome;
    @Column
    private String matricula;
    @Column
    private int cpf;   
    
     @Id
    @SequenceGenerator(name="aluno_id_seq",
                       sequenceName="aluno_id_seq",
                       allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
                    generator="aluno_id_seq")
    @Column(name = "id", updatable=false)
    private Integer id; 

    public int getCpf() {
        return cpf;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
     
         
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Aluno(String nome, String matricula, int cpf) {
        this.nome = nome;
        this.matricula = matricula;
        this.cpf = cpf;
  
    }

    public Aluno() {
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
    }

    
    
   
    
    
    
    
}
