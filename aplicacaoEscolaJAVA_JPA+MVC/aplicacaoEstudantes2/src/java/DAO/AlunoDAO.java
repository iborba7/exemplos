/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import javax.persistence.EntityManager; 
import javax.persistence.EntityManagerFactory; 
import javax.persistence.NoResultException; 
import javax.persistence.Persistence;
import MODEL.Aluno;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Compaq
 */
public class AlunoDAO {
    
    
EntityManagerFactory emf = Persistence.createEntityManagerFactory("aplicacaoEstudantesPU");
        EntityManager em = emf.createEntityManager();
    
        public Aluno getAluno(String nome, String matricula, int cpf){
        
            try{
            
                Aluno aluno = (Aluno) em.createQuery("SELECT a from aluno a where a.nome = :nome, a.matricula = :matricula, a.cpf = :cpf")
                        .setParameter("nome", nome)
                        .setParameter("matricula", matricula)
                        .setParameter("cpf", cpf).getSingleResult();
                
                return aluno;
                
            } catch(NoResultException e){
            
                return null;
            }
            
        }
        
        public Aluno buscaAluno(int cpf){
        
            em.getTransaction().begin();
            Aluno aluno = em.find(Aluno.class, cpf);
            return aluno;
        }
        
        
        public List<Aluno> listaAlunos (){
        
            em.getTransaction().begin();
            
            Query q = em.createQuery("SELECT a FROM aluno a ORDER BY a.nome");
            
            List<Aluno> cadastro = q.getResultList();
            
            
            em.getTransaction().commit();
            
            em.close();
            emf.close();
            return cadastro;
                        
        }
        
        
           public boolean insereAluno(Aluno aluno){
                try{
                    
                    em.getTransaction().begin();
                    em.persist(aluno);
                    em.getTransaction().commit();
                    em.close();
                    return true;   
                    
                    
                }catch (Exception e){
                
                    e.printStackTrace();
                    return false;
                }                    
                }
           
            public boolean deletaAluno (Aluno aluno){
            
                try{
                
                    em.remove(aluno);
                    return true;
                }catch(Exception e){
                    
                    e.printStackTrace();
                    return false;
                }
                
            }
}

                
            
            


