package Assignment2.DataCoupling;

public class Customer {

    public void Purchase(){
        ProductHandler productHandler = new ProductHandler();
        if(productHandler.isAvailable(new Product(1, "Soap"))){
            productHandler.Purchase(new Product(1, "Soap"));
        }else{
            System.out.println("Product is unavailable");
        }
    }
}
