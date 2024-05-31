
package Model;

import java.io.Serializable;
import java.util.Set;


/**
 *
 * @author SHEMA 01
 */

public class Depute implements Serializable{
 private static final long serialVersionUID = 9170578629643561730L;
 private String deputeId;
 private String depute_name;
 private String birthDate;
 private String gender;
 private String phone_number;
 private Party party;
 private String password;
 private String role;
 private Set<Commission> commission;

    public Depute() {
    }

    public Depute(String deputeId) {
        this.deputeId = deputeId;
    }

    public Depute(String deputeId, String depute_name, String birthDate, String gender, String phone_number, Party party, String password, String role, Set<Commission> commission) {
        this.deputeId = deputeId;
        this.depute_name = depute_name;
        this.birthDate = birthDate;
        this.gender = gender;
        this.phone_number = phone_number;
        this.party = party;
        this.password = password;
        this.role = role;
        this.commission = commission;
    }

    public String getDeputeId() {
        return deputeId;
    }

    public void setDeputeId(String deputeId) {
        this.deputeId = deputeId;
    }

    public String getDepute_name() {
        return depute_name;
    }

    public void setDepute_name(String depute_name) {
        this.depute_name = depute_name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public Party getParty() {
        return party;
    }

    public void setParty(Party party) {
        this.party = party;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Set<Commission> getCommission() {
        return commission;
    }

    public void setCommission(Set<Commission> commission) {
        this.commission = commission;
    }

}
