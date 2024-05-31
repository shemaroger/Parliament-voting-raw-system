 
package Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 *
 * @author SHEMA 01
 */

public class Party implements Serializable{
  private static final long serialVersionUID = 7472060252158327327L;
  private Integer partyId;
  private String party_name;
  private List<Depute> depute = new ArrayList<>();
  private Date created_date = new Date();

    public Party() {
    }

    public Party(Integer partyId) {
        this.partyId = partyId;
    }

    public Party(Integer partyId, String party_name) {
        this.partyId = partyId;
        this.party_name = party_name;
    }

    public Integer getPartyId() {
        return partyId;
    }

    public void setPartyId(Integer partyId) {
        this.partyId = partyId;
    }

    public String getParty_name() {
        return party_name;
    }

    public void setParty_name(String party_name) {
        this.party_name = party_name;
    }

    public List<Depute> getDepute() {
        return depute;
    }

    public void setDepute(List<Depute> depute) {
        this.depute = depute;
    }

    public Date getCreated_date() {
        return created_date;
    }

    public void setCreated_date(Date created_date) {
        this.created_date = created_date;
    }

    @Override
    public String toString() {
        return party_name;
    }
  
  
}
