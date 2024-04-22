public class Product {
    protected int productid ;
    protected String name ;
    protected double price ;
public Product (int productid , String name , double price ){
    this.productid = productid;
    this.name = name;
    this.price = price ;
}
    public void setProductid(int productid) {
        if (productid >= 0 )
            this.productid = productid;
        else
            this.productid = Math.abs(productid);
    }

    public int getProductid() {
        return productid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        if (price >= 0)
            this.price = price;
        else
            this.price =Math.abs(price);
    }

    public double getPrice() {
        return price;
    }



}
