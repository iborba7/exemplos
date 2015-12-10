/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL.Aluno;

import DAO.Aluno.FrequenciaDAO;
import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author Compaq
 */
@Entity 
@Table (name="frequencia")
public class Frequencia implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue
    private int id; 
    
    @Column(name = "data")
    private java.sql.Date data;
    
    @Column(name = "falta")
    private int falta;
    
       @ManyToOne(optional=false)
       @JoinColumn(name="idAluno",referencedColumnName="id")
       private Aluno aluno;
       
    @Column(name = "idAluno")
    private int idAluno;

    public Frequencia(Date data, int falta, Aluno aluno, int idAluno) {
        
        this.data = data;
        this.falta = falta;
        this.aluno = aluno;
        this.idAluno = idAluno;
    }
    
    

    public Frequencia() {
    }

    public Aluno getAluno() {
        return aluno;
    }

    public Date getData() {
        return data;
    }

    public int getFalta() {
        return falta;
    }

    public int getIdAluno() {
        return idAluno;
    }

    public int getId() {
        return id;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setFalta(int falta) {
        this.falta = falta;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
    }
   
    public static void main(String[] args) {
        
        Frequencia f = new Frequencia();
       
       
        
    }
    
    
    
    
    
}
