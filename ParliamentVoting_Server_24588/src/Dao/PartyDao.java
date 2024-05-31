
package Dao;

import Model.Party;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author SHEMA 01
 */
public class PartyDao {
     public Party recordPartys(Party partyObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.save(partyObj);
            ss.beginTransaction().commit();
            ss.close();
            return partyObj;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    public Party updatePartys(Party partyObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.update(partyObj);
            ss.beginTransaction().commit();
            ss.close();
            return partyObj;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    public Party deletePartys(Party partyObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.delete(partyObj);
            ss.beginTransaction().commit();
            ss.close();
            return partyObj;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    public Party searchPartys(Party partyObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Party partys = (Party) ss.get(Party.class, partyObj.getPartyId());
            ss.close();
            return partys;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    public List<Party> displayPartys(){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            List<Party> thePartys = ss.createQuery("SELECT party FROM Party party").list();
            ss.close();
            return thePartys;  
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    } 
}
