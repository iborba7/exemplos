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
    
    
EntityManagerFactory emf = Persistence.createEntityManagerFactory("aplicacaoEstudantesPU2");
        EntityManager em = emf.createEntityManager();
    
        public Aluno getAluno(String nome, String matricula, Long cpf){
        
            try{
                
                em.getTransaction().begin();
                
                Aluno aluno = (Aluno) em.createQuery("SELECT a from aluno a where a.nome = :nome, a.matricula = :matricula, a.cpf = :cpf")
                        .setParameter("nome", nome)
                        .setParameter("matricula", matricula)
                        .setParameter("cpf", cpf).getSingleResult();
                em.getTransaction().commit();
                    
                
                return aluno;
                
            } catch(NoResultException e){
            
                return null;
            }
            
        }
        
        public Aluno buscaAluno(Long cpf){
            
            em.getTransaction().begin();
            Aluno aluno = em.find(Aluno.class, cpf);
            em.getTransaction().commit();
                
            return aluno;
        }
        
        
        public List<Aluno> listaAlunos (){
        
            em.getTransaction().begin();
            
            Query q = em.createNativeQuery("SELECT c FROM aluno c ORDER BY c.id;");
            
            List<Aluno> cadastro = q.getResultList();
            
            em.getTransaction().commit();
            
            return cadastro;
                        
        }
        
        
           public void insereAluno(Aluno aluno){
                try{
                    
                    em.getTransaction().begin();
                    em.persist(aluno);
                    em.getTransaction().commit();
                    
                    
                       
                    
                    
                }catch (Exception e){
                
                    e.printStackTrace();
                    
                }                    
                }
           
            public boolean deletaAluno (Aluno aluno){
            
                try{
                    em.getTransaction().begin();
                    em.remove(aluno);
                    em.getTransaction().commit();
                    
                    return true;
                }catch(Exception e){
                    
                    e.printStackTrace();
                    return false;
                }
                
            }
}

                
            
            


