
package Model;

import java.io.Serializable;
import java.util.Date;


/**
 *
 * @author SHEMA 01
 */

public class Voting implements Serializable{
 
  private Integer votingId;
  private String deputeId;
  private String proposalName;
  private String choise;
  private String proposalId;
  private SetElection setElection;
  private Date created_date = new Date();

    public Voting() {
    }

    public Voting(Integer votingId) {
        this.votingId = votingId;
    }

    public Voting(Integer votingId, String deputeId, String proposalName, String choise, String proposalId, SetElection setElection) {
        this.votingId = votingId;
        this.deputeId = deputeId;
        this.proposalName = proposalName;
        this.choise = choise;
        this.proposalId = proposalId;
        this.setElection = setElection;
    }

    public Integer getVotingId() {
        return votingId;
    }

    public void setVotingId(Integer votingId) {
        this.votingId = votingId;
    }

    public String getDeputeId() {
        return deputeId;
    }

    public void setDeputeId(String deputeId) {
        this.deputeId = deputeId;
    }

    public String getProposalName() {
        return proposalName;
    }

    public void setProposalName(String proposalName) {
        this.proposalName = proposalName;
    }

    public String getChoise() {
        return choise;
    }

    public void setChoise(String choise) {
        this.choise = choise;
    }

    public String getProposalId() {
        return proposalId;
    }

    public void setProposalId(String proposalId) {
        this.proposalId = proposalId;
    }

    public SetElection getSetElection() {
        return setElection;
    }

    public void setSetElection(SetElection setElection) {
        this.setElection = setElection;
    }

    public Date getCreated_date() {
        return created_date;
    }

    public void setCreated_date(Date created_date) {
        this.created_date = created_date;
    }

    
}
