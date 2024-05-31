
package Dao;

import Model.Voting;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author SHEMA 01
 */
public class VotingDao {
   public Voting recordVotings(Voting votingObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.save(votingObj);
            ss.beginTransaction().commit();
            ss.close();
            return votingObj;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    public Voting updateVotings(Voting votingObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.update(votingObj);
            ss.beginTransaction().commit();
            ss.close();
            return votingObj;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    public Voting deleteVotings(Voting votingObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.delete(votingObj);
            ss.beginTransaction().commit();
            ss.close();
            return votingObj;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    public Voting searchVotings(Voting votingObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Voting votings = (Voting) ss.get(Voting.class, votingObj.getVotingId());
            ss.close();
            return votings;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    public List<Voting> displayVotings(){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            List<Voting> theVotings = ss.createQuery("SELECT voting FROM Voting voting").list();
            ss.close();
            return theVotings;  
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    } 
     public Voting checkData(String proposalId , String deputeId){
        try {
            Session ss = HibernateUtil.getSessionFactory().openSession();
           String hql = "FROM Voting WHERE proposalId = :proposalId  AND deputeId = :deputeId ";
            Query query = ss.createQuery(hql);
            query.setParameter("proposalId", proposalId );
            query.setParameter("deputeId", deputeId);
            
            Voting user = (Voting) query.uniqueResult();
            ss.close();
            return user;   
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    return null;
    }
public List<Voting> countVote(Voting theVote) {
    try {
        Session ss = HibernateUtil.getSessionFactory().openSession();
        String queryStr = "FROM Voting WHERE proposalId = :proId";
        Query query = ss.createQuery(queryStr);
        query.setParameter("proId", theVote.getProposalId());

        List<Voting> voteList = query.list();

        ss.close();
        return voteList;
    } catch (Exception e) {
        e.printStackTrace();
    }
    return null;
}

}