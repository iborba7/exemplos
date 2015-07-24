/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import javax.persistence.EntityManager; 
import javax.persistence.EntityManagerFactory; 
 
import javax.persistence.Persistence;
import MODEL.Usuario;

/**
 *
 * @author Compaq
 */
public class UsuarioDAO {
    
    
EntityManagerFactory emf = Persistence.createEntityManagerFactory("aplicacaoEstudantesPU2");
        EntityManager em = emf.createEntityManager();
    
        public Usuario getUser(String login, String senha){
        
            try{
                em.getTransaction().begin();
                Usuario user = (Usuario) em.createQuery("SELECT u from Usuario u where u.login = :login and u.senha = :senha")
                        .setParameter("login", login)
                        .setParameter("senha", senha).getSingleResult();
                    em.getTransaction().commit();
                    em.close();
                    
                
                return user;
                
            } catch(Exception e){
            
                 e.printStackTrace();
                 return null;
                
            }
            
        }
        
        public Usuario getUserByCpf(String cpf){
        
            try{
                em.getTransaction().begin();
                Usuario user = (Usuario) em.createQuery("SELECT u from Usuario u where u.cpf = :cpf")
                        .setParameter("cpf", cpf)
                        .getSingleResult();
                    em.getTransaction().commit();
                    em.close();
                    
                
                return user;
                
            } catch(Exception e){
                
                return null;
            }
            
        }
        
           public boolean insereUsuario(Usuario user){
                try{
                    
                    em.persist(user);
                    em.getTransaction().commit();
                    em.close();
                    
                    return true;   
                    
                }catch (Exception e){
                
                    e.printStackTrace();
                    return false;
                }                    
                }
           
            public boolean deletaUsuario (Usuario user){
            
                try{
                    
                    em.getTransaction().begin();
                    em.remove(user);
                    em.getTransaction().commit();
                    em.close();
                    
                    return true;
                }catch(Exception e){
                    
                    e.printStackTrace();
                    return false;
                }
                
            }

    public UsuarioDAO() {
    }
            
            
            
                
            }
            


