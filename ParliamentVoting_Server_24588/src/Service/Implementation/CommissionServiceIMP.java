
package Service.Implementation;

import Dao.CommissionDao;
import Model.Commission;
import Service.CommissionService;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 *
 * @author SHEMA 01
 */
public class CommissionServiceIMP extends UnicastRemoteObject implements CommissionService{

    public CommissionServiceIMP() throws RemoteException {
    }
     CommissionDao dao = new CommissionDao();
    @Override
    public Commission addCommission(Commission commissions) throws RemoteException {
       return dao.recordCommissions(commissions);
    }

    @Override
    public Commission editCommission(Commission commissions) throws RemoteException {
        return dao.updateCommissions(commissions);
    }

    @Override
    public Commission removeCommission(Commission commissions) throws RemoteException {
       return dao.deleteCommissions(commissions);
    }

    @Override
    public Commission findCommission(Commission commissions) throws RemoteException {
       return dao.searchCommissions(commissions);
    }

    @Override
    public List<Commission> allCommissions() throws RemoteException {
        return dao.displayCommissions();
    }
    
}
