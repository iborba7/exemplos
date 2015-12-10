/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.Aluno;

import javax.persistence.EntityManager; 
import javax.persistence.EntityManagerFactory; 
import javax.persistence.NoResultException; 
import javax.persistence.Persistence;
import MODEL.Aluno.Aluno;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Compaq
 */
public class AlunoDAO {
    
    
 EntityManagerFactory emf = Persistence.createEntityManagerFactory("aplicacaoEstudantesPU2");
          EntityManager em = emf.createEntityManager();
        
        public boolean connect (){
            
            try{
            em.getTransaction().begin();
            return true;
            
            }catch(Exception e){
            
                e.printStackTrace();
                return false; 
            }
        }
        
        public boolean disconnect(){
        
            try{
            em.getTransaction().commit();
            em.close();
            
            return true;
            
            }catch(Exception e){
            
                e.printStackTrace();
                return false; 
            }
        
        }
    
        public Aluno getAluno(String nome, String matricula, String cpf){
        
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
        
         public Aluno getAlunoByCpf(String cpf){
        
            try{
                
                Aluno aluno = (Aluno) em.createQuery("SELECT a from Aluno a where a.cpf = :cpf")
                        .setParameter("cpf", cpf).getSingleResult();
                
                return aluno;
                
            } catch(Exception e){
            
                return null;
            }
            
        }
        
        public Aluno buscaAluno(int id){
            
            
           Aluno aluno = em.find(Aluno.class, id);
            
            return aluno;
        }
        
        
        public List<Aluno> listaAlunos (){
         
            Query q = em.createQuery("SELECT a FROM Aluno a ORDER BY a.nome");
            
            List<Aluno> cadastro = q.getResultList();
            
            return cadastro;
                        
        }
        
           public void insereAluno(Aluno aluno){
                try{
                   
                    em.persist(aluno);
                    
                    
                }catch (Exception e){
                
                    e.printStackTrace();
                    
                }                    
                }
           
            public boolean deletaAluno (int id){
            
                try{
                    
                     Aluno aluno = em.find(Aluno.class, id);
                        
                        em.remove(aluno);
                    
                        return true;
                }catch(Exception e){
                    
                    e.printStackTrace();
                    return false;
                }
                
            }
            
            public boolean updateAlunoNome(int id, String nome){
               
              Aluno aluno = em.merge(em.find(Aluno.class, id)); 
              aluno.setNome(nome);
              
              return true;  
            }

            public boolean updateAlunoCpf(int id, String cpf){
               
              Aluno aluno = em.merge(em.find(Aluno.class, id)); 
              if(getAlunoByCpf(cpf)== null){
              aluno.setCpf(cpf);
              } else {
              return false;
              }
              return true;  
            }
            
            public boolean updateAlunoMatricula(int id, String matricula){
               
            Aluno aluno = em.merge(em.find(Aluno.class, id)); 
              aluno.setMatricula(matricula);
              return true;  
            }
}

                
            
            


