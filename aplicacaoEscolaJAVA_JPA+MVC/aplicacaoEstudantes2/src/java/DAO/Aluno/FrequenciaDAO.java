/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.Aluno;

import MODEL.Aluno.Aluno;
import MODEL.Aluno.Frequencia;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Compaq
 */
public class FrequenciaDAO {
    
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
        
        
        
            
            
        public Frequencia buscaFrequencia(int id){
            
            
           Frequencia frequencia = em.find(Frequencia.class, id);
            
            return frequencia;
        }
        
        public void insereFrequencia (Frequencia frequencia){
                try{
                   
                    em.persist(frequencia);
                    
                    
                }catch (Exception e){
                
                    e.printStackTrace();
                    
                }                    
                }
           
            public boolean deletaFrequencia (int id){
            
                try{
                    
                     Aluno aluno = em.find(Aluno.class, id);
                        
                        em.remove(aluno);
                    
                        return true;
                }catch(Exception e){
                    
                    e.printStackTrace();
                    return false;
                }
        
            }
            
            
            public Frequencia getFrequenciaByAlunoId(int id){
        
            try{
                
               Frequencia frequencia = (Frequencia) em.createQuery("SELECT f from Frequencia f where f.idAluno = :id")
                        .setParameter("id", id).getResultList();
                
                return frequencia;
                
            } catch(Exception e){
            
                return null;
            }
            }
            
}
