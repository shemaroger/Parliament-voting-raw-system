/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.Implementation;

import Dao.PartyDao;
import Model.Party;
import Service.PartyService;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 *
 * @author SHEMA 01
 */
public class PartyServiceIMP extends UnicastRemoteObject implements PartyService{

    public PartyServiceIMP() throws RemoteException{
    }
    PartyDao dao = new PartyDao();
    @Override
    public Party addParty(Party parties) throws RemoteException {
        return dao.recordPartys(parties);
}

    @Override
    public Party editParty(Party parties) throws RemoteException {
        return dao.updatePartys(parties);
    }

    @Override
    public Party removeParty(Party parties) throws RemoteException {
       return dao.deletePartys(parties);
    }

    @Override
    public Party findParty(Party parties) throws RemoteException {
        return dao.searchPartys(parties);
    }

    @Override
    public List<Party> allParties() throws RemoteException {
        return dao.displayPartys();
    }
    
}
