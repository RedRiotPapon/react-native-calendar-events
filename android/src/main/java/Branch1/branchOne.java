package Branch1;

public class branchOne {
    int id;
    String Address;

    public branchOne(int id, String address) {
        this.id = id;
        Address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
    
}
