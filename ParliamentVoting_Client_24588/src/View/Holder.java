
package View;

/**
 *
 * @author SHEMA 01
 */
public class Holder {
    public static String id;
    public static String names;
    public static String party;
    public static String commission;

    public Holder() {
    }

    public static String getId() {
        return id;
    }

    public static void setId(String id) {
        Holder.id = id;
    }

    public static String getNames() {
        return names;
    }

    public static void setNames(String names) {
        Holder.names = names;
    }

    public static String getParty() {
        return party;
    }

    public static void setParty(String party) {
        Holder.party = party;
    }

    public static String getCommission() {
        return commission;
    }

    public static void setCommission(String commission) {
        Holder.commission = commission;
    }
    
}
