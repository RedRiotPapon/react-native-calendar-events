package Branch1;

public class branchOne {
    int id;
    String Address;
    String Strandard;

    public branchOne(int id, String address, String strandard) {
        this.id = id;
        Address = address;
        Strandard = strandard;
    }

    public String getStrandard() {
        return Strandard;
    }

    public void setStrandard(String strandard) {
        Strandard = strandard;
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
