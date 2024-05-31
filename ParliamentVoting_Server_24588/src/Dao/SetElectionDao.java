
package Dao;

import Model.SetElection;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author SHEMA 01
 */
public class SetElectionDao {
   public SetElection recordSetElections(SetElection setElectionObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.save(setElectionObj);
            ss.beginTransaction().commit();
            ss.close();
            return setElectionObj;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    public SetElection updateSetElections(SetElection setElectionObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.update(setElectionObj);
            ss.beginTransaction().commit();
            ss.close();
            return setElectionObj;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    public SetElection deleteSetElections(SetElection setElectionObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.delete(setElectionObj);
            ss.beginTransaction().commit();
            ss.close();
            return setElectionObj;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    public SetElection searchSetElections(SetElection setElectionObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            SetElection setElections = (SetElection) ss.get(SetElection.class, setElectionObj.getProposalId());
            ss.close();
            return setElections;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    public List<SetElection> displaySetElections(){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            List<SetElection> theSetElections = ss.createQuery("SELECT setElection FROM SetElection setElection").list();
            ss.close();
            return theSetElections;  
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }  
    
     public SetElection getData(String status){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
           String hql = "FROM SetElection WHERE status = :status";
            Query query = ss.createQuery(hql);
            query.setParameter("status", "Voting" );
            
            SetElection user = (SetElection) query.uniqueResult();
            ss.close();
            return user;   
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    return null;
    }
}
