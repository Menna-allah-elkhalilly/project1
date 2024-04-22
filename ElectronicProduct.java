public class ElectronicProduct extends Product {

    private String brand ;
    private int warrantyPeriod;
public ElectronicProduct( int productid , String name , double price , String brand , int  warrantyPeriod){
    super ( productid , name , price );
    this.brand = brand ;
    this.warrantyPeriod = warrantyPeriod;

}
    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setbrand(String brand) {
        this.brand = brand;
    }

    public String getbrand() {
        return brand;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        if (warrantyPeriod >= 0 )
            this.warrantyPeriod = warrantyPeriod;
        else
            this.warrantyPeriod = Math.abs(warrantyPeriod) ;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }
}
