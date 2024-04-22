public class Cart {
    private int customerid ;
    private int nProducts ;
    private double Totalprice = 0.0 ;
    private Product products[] ;

    public Cart (int customerid, int nProducts) {
        this.customerid = customerid;
        this.nProducts = nProducts ;
        this.products = new Product[nProducts];
    }

    public void setCustomerid(int customerid) {
        this.customerid = customerid;
    }

    public void setnProducts(int nProducts) {
        this.nProducts = nProducts;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public int getCustomerid() {
        return customerid;
    }

    public int getnProducts() {
        return nProducts;
    }

    public Product[] getProducts() {
        return products;
    }
    public void addproduct(Product product , int x  ){
        if (x >= 0 && x < nProducts)
        products[x] = product;
    }
    public void removeProduct (int x){
        products [x] = null ;
    }
    public double calculatePrice (){
        double totalprice = 0.0 ;
    for (Product p : products){
        if (p!=null){
            totalprice += p.getPrice();
        }
    }
        return totalprice;
    }
    public boolean placeOrder (int a ){
       if (a == 1)
           return true;
       else
           return false;
    }
}
