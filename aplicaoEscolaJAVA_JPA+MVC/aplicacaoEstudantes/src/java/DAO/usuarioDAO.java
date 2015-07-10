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
import model.Usuario;

/**
 *
 * @author Compaq
 */
public class usuarioDAO {
    
    
EntityManagerFactory emf = Persistence.createEntityManagerFactory("aplicacaoEstudantesPU");
        EntityManager em = emf.createEntityManager();
    
        public Usuario getUser(String login, String senha){
        
            try{
            
                Usuario user = (Usuario) em.createQuery("SELECT u from Usuario u where u.login = :login and u.senha = :senha")
                        .setParameter("login", login)
                        .setParameter("senha", senha).getSingleResult();
                
                return user;
                
            } catch(NoResultException e){
            
                return null;
            }
            
        }
           public boolean insereUsuario(Usuario user){
                try{
                
                    em.persist(user);
                    return true;   
                    
                }catch (Exception e){
                
                    e.printStackTrace();
                    return false;
                }                    
                }
           
            public boolean deletaUsuario (Usuario user){
            
                try{
                
                    em.remove(user);
                    return true;
                }catch(Exception e){
                    
                    e.printStackTrace();
                    return false;
                }
                
            }
            
            
                
            }
            


