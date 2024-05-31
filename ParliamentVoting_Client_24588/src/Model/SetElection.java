
package Model;

import java.io.Serializable;
import java.util.Date;


/**
 *
 * @author SHEMA 01
 */

public class SetElection implements Serializable{

  private String proposalId;
  private String proposal_name;
  private String proposal_description;
  private Voting voting;
  private String status;
  private String date; 

    public SetElection() {
    }

    public SetElection(String proposalId) {
        this.proposalId = proposalId;
    }

    public SetElection(String proposalId, String proposal_name, String proposal_description, Voting voting, String status, String date) {
        this.proposalId = proposalId;
        this.proposal_name = proposal_name;
        this.proposal_description = proposal_description;
        this.voting = voting;
        this.status = status;
        this.date = date;
    }

    public String getProposalId() {
        return proposalId;
    }

    public void setProposalId(String proposalId) {
        this.proposalId = proposalId;
    }

    public String getProposal_name() {
        return proposal_name;
    }

    public void setProposal_name(String proposal_name) {
        this.proposal_name = proposal_name;
    }

    public String getProposal_description() {
        return proposal_description;
    }

    public void setProposal_description(String proposal_description) {
        this.proposal_description = proposal_description;
    }

    public Voting getVoting() {
        return voting;
    }

    public void setVoting(Voting voting) {
        this.voting = voting;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
  
}
