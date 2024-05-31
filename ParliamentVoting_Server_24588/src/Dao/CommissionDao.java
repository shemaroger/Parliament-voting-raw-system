
package Dao;

import Model.Commission;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author SHEMA 01
 */
public class CommissionDao {
     public Commission recordCommissions(Commission commissionObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.save(commissionObj);
            ss.beginTransaction().commit();
            ss.close();
            return commissionObj;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    public Commission updateCommissions(Commission commissionObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.update(commissionObj);
            ss.beginTransaction().commit();
            ss.close();
            return commissionObj;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    public Commission deleteCommissions(Commission commissionObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            ss.delete(commissionObj);
            ss.beginTransaction().commit();
            ss.close();
            return commissionObj;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    public Commission searchCommissions(Commission commissionObj){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Commission commissions = (Commission) ss.get(Commission.class, commissionObj.getCommmissionId());
            ss.close();
            return commissions;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    public List<Commission> displayCommissions(){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            List<Commission> theCommissions = ss.createQuery("SELECT commission FROM Commission commission").list();
            ss.close();
            return theCommissions;  
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    } 
}
