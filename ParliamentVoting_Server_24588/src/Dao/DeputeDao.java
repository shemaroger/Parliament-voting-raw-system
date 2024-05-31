
package Dao;

import Model.Depute;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author SHEMA 01
 */
public class DeputeDao {
     public Depute recordDeputes(Depute deputeObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.save(deputeObj);
            ss.beginTransaction().commit();
            ss.close();
            return deputeObj;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    public Depute updateDeputes(Depute deputeObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.update(deputeObj);
            ss.beginTransaction().commit();
            ss.close();
            return deputeObj;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    public Depute deleteDeputes(Depute deputeObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.delete(deputeObj);
            ss.beginTransaction().commit();
            ss.close();
            return deputeObj;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    public Depute searchDeputes(Depute deputeObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Depute deputes = (Depute) ss.get(Depute.class, deputeObj.getDeputeId());
            ss.close();
            return deputes;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    public List<Depute> displayDeputes(){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            List<Depute> theDeputes = ss.createQuery("SELECT depute FROM Depute depute").list();
            ss.close();
            return theDeputes;  
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    } 
      public Depute userDepute(String depute_id , String password, String role){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
           String hql = "FROM Depute WHERE depute_id = :depute_id  AND password = :password AND role = :role";
            Query query = ss.createQuery(hql);
            query.setParameter("depute_id", depute_id );
            query.setParameter("password", password);
            query.setParameter("role", role);
            Depute user = (Depute) query.uniqueResult();
            ss.close();
            return user;   
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    return null;
    }
}
