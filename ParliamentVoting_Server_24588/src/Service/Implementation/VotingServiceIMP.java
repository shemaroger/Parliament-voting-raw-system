/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.Implementation;

import Dao.VotingDao;
import Model.Voting;
import Service.VotingService;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 *
 * @author SHEMA 01
 */
public class VotingServiceIMP extends UnicastRemoteObject implements VotingService{

    public VotingServiceIMP() throws RemoteException{
    }
   VotingDao dao = new VotingDao();
    @Override
    public Voting addVoting(Voting votings) throws RemoteException {
       return dao.recordVotings(votings);
    }

    @Override
    public Voting editVoting(Voting votings) throws RemoteException {
        return dao.updateVotings(votings);
    }

    @Override
    public Voting removeVoting(Voting votings) throws RemoteException {
        return dao.deleteVotings(votings);
    }

    @Override
    public Voting findVoting(Voting votings) throws RemoteException {
        return dao.searchVotings(votings);
    }

    @Override
    public List<Voting> allVotings() throws RemoteException {
        return dao.displayVotings();
    }

    @Override
    public Voting checkVoter(String proposalId, String deputeId) throws RemoteException {
        return dao.checkData(proposalId, deputeId);
    }

    @Override
    public List<Voting> countVotes(Voting votings) throws RemoteException {
   return dao.countVote(votings);
    }

    
    
}
