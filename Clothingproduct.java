import java.lang.invoke.StringConcatFactory;

public class Clothingproduct extends Product {
    private String size ;
    private String fabric ;
    public Clothingproduct(int productid , String name , double price , String size , String factory){
        super ( productid , name , price );
        this.size = size ;
        this.fabric = fabric ;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setFabric(String fabric) {
        this.fabric = fabric;
    }

    public String getFabric() {
        return fabric;
    }
}
