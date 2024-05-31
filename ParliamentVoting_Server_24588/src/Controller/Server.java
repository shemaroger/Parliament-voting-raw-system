
package Controller;

import Service.Implementation.CommissionServiceIMP;
import Service.Implementation.DeputeServiceIMP;
import Service.Implementation.PartyServiceIMP;
import Service.Implementation.SetElectionServiceIMP;
import Service.Implementation.VotingServiceIMP;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import javassist.bytecode.stackmap.BasicBlock;

/**
 *
 * @author SHEMA 01
 */
public class Server {
    public static void main(String[] args) {
        try {
            System.setProperty("java.rmi.server.hostname", "127.0.0.1");
            Registry theRegistry = LocateRegistry.createRegistry(6000);
            theRegistry.rebind("votings", new VotingServiceIMP());
            theRegistry.rebind("deputes", new DeputeServiceIMP());
            theRegistry.rebind("parties", new PartyServiceIMP());
            theRegistry.rebind("setElections", new SetElectionServiceIMP());
            theRegistry.rebind("commissions", new CommissionServiceIMP());
            System.out.println("Server is running on port 6000");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

