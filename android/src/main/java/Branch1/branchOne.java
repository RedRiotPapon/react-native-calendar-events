package Branch1;

public class branchOne {
    int id;
    String Address;
    int s_Class;

    public branchOne(int id, String address, int s_Class) {
        this.id = id;
        Address = address;
        this.s_Class = s_Class;
    }

    public void setS_Class(int s_Class) {
        this.s_Class = s_Class;
    }

    public int getS_Class() {
        return s_Class;

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
