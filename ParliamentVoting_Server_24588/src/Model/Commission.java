
package Model;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;


@Entity
public class Commission implements Serializable{
    @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)  
  @Column(name = "commission_id")
  private Integer commmissionId;
  private String commission_name;
  @ManyToMany(mappedBy = "commission",fetch = FetchType.EAGER)
  private Set<Depute> depute = new HashSet<>();
  private Date created_date = new Date();

    public Commission() {
    }

    public Commission(Integer commmissionId) {
        this.commmissionId = commmissionId;
    }

    public Commission(Integer commmissionId, String commission_name) {
        this.commmissionId = commmissionId;
        this.commission_name = commission_name;
    }

    public Integer getCommmissionId() {
        return commmissionId;
    }

    public void setCommmissionId(Integer commmissionId) {
        this.commmissionId = commmissionId;
    }

    public String getCommission_name() {
        return commission_name;
    }

    public void setCommission_name(String commission_name) {
        this.commission_name = commission_name;
    }

    public Set<Depute> getDepute() {
        return depute;
    }

    public void setDepute(Set<Depute> depute) {
        this.depute = depute;
    }

    public Date getCreated_date() {
        return created_date;
    }

    public void setCreated_date(Date created_date) {
        this.created_date = created_date;
    }
  
    
}
