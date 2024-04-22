import java .util.Scanner;
public class EcommerceSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        ElectronicProduct e =new ElectronicProduct(1,"Smartphone" ,599.9 ," Samsung" , 1) ;
        Clothingproduct c = new Clothingproduct(2 ,"T-shirt" ,19.99 , "Medium" , "Cotton");
        BookProduct b = new BookProduct(3 , " OOP" ,39.99 ,"O’Reilly","X Publications");


        System.out.println(" Welcome to the E-commerce System ! \n Please enter your ID : ");
        int id = sc.nextInt();
        System.out.println("Please enter your name : ");
        String name = sc.next();
        System.out.println(" Please enter your address : ");
        String add = sc.next();
        Customer C = new Customer(id, name , add) ;
        System.out.println("How many products you want to add to your cart ? ");
        int num = sc.nextInt();
        Cart cart = new Cart (C.getCustomerId(),num);
        for(int i=0 ; i < num;i++) {
            System.out.println("Which product would you like to add ?   1_Samrtphone    2_T_shirt    3_OOP");
            int W = sc.nextInt();
            switch (W) {
                case (1):
                    cart.addproduct(e,i);
                    break;
                case (2):
                    cart.addproduct(c,i);
                    break;
                case (3):
                    cart.addproduct(b,i);
                    break;
            }
        }
        System.out.println(" your Total is $ " +cart.calculatePrice() +". Would you like to place the order? \n 1-YES    2-NO");
        int a = sc.nextInt();
       boolean z = cart.placeOrder(a);
        if ( z == true){
        Order O = new Order(id,1,cart.getProducts()) ;
        O.printOrderInfo();}
        else
        { System.out.println(" your order didn't placed ");}
}
}