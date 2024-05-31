
package Service;

import Model.SetElection;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author SHEMA 01
 */
public interface SetElectionService extends Remote{
     SetElection addSetElection(SetElection setElections) throws RemoteException;
    SetElection editSetElection(SetElection setElections) throws RemoteException;
    SetElection removeSetElection(SetElection setElections) throws RemoteException;
    SetElection findSetElection(SetElection setElections) throws RemoteException;
    SetElection myDate(String status) throws RemoteException;
    List<SetElection> allElections () throws RemoteException;
}
