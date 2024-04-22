public class Order {
    private int customerId ;
    private int orderId;
    private Product [] products ;
    private double totalPrice ;

    public Order(int customerId, int orderId, Product[] products) {
        this.customerId = customerId;
        this.orderId = orderId;
        this.products = products;
        this.totalPrice = totalPrice;
    }
    public double calculatePrice (){
        double totalprice=0;
        for (Product p : products){
            if (p!=null){
                totalprice += p.getPrice();
            }
        }
        return totalprice;
    }
    public void printOrderInfo (){
        System.out.println("Here's your order's summary : " );
        System.out.println(" orderID : " + orderId);
        System.out.println(" Customer ID : " +customerId);
        System.out.println(" Products : " );
        for (Product p: products){
            if (p!=null){
                System.out.println(p.getName()+"- price :$"+p.getPrice());
            }
        }

        System.out.println(" Total price : $" + calculatePrice());
    }
}
