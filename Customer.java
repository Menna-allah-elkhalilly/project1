public class Customer {
    private int customerId ;
    private String name ;
    private String address ;
    public Customer(int customerId , String name , String address) {
        this.customerId = customerId;
        this.name = name ;
        this . address = address ;
    }

    public void setCustomerId(int customerId) {
        if (customerId >= 0)
            this.customerId = customerId;
        else
            this.customerId =Math.abs(customerId) ;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}
