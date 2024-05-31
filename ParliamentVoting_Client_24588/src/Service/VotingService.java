
package Service;

import Model.Voting;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author SHEMA 01
 */
public interface VotingService extends Remote{
    Voting addVoting(Voting votings) throws RemoteException;
    Voting editVoting(Voting votings) throws RemoteException;
    Voting removeVoting(Voting votings) throws RemoteException;
    Voting findVoting(Voting votings) throws RemoteException;
    Voting checkVoter(String proposalId , String deputeId) throws RemoteException;
    List<Voting> countVotes(Voting votings) throws RemoteException;
    List<Voting> allVotings () throws RemoteException; 
}
