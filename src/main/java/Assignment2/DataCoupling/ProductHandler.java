package Assignment2.DataCoupling;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class ProductHandler {

    List<Product> products = Arrays.asList(
            new Product(1,"Soap"),
            new Product(2,"Shampoo")
    );

    public boolean isAvailable(Product product){
        for(Product product1: products){
            if(Objects.equals(product1, product)){
                return true;
            }
        }

        return false;
    }

    public void Purchase(Product product){
        products.remove(product);
    }
}
