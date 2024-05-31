
package Service;

import Model.Commission;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author SHEMA 01
 */
public interface CommissionService extends Remote{
    Commission addCommission(Commission commissions) throws RemoteException;
    Commission editCommission(Commission commissions) throws RemoteException;
    Commission removeCommission(Commission commissions) throws RemoteException;
    Commission findCommission(Commission commissions) throws RemoteException;
    List<Commission> allCommissions () throws RemoteException;  
}
