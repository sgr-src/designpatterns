package soreco.training.designpatterns.creational.factory.test;

import org.junit.Test;
import soreco.training.designpatterns.creational.factory.Product;
import soreco.training.designpatterns.creational.factory.ProductFactory;

public class ProductFactoryTest {

    
    @Test
    public void testCreateProductA {
        
        ProductFactory pf = new ProductFactory();
        Product prod;

        prod = pf.createProduct("A");
        prod.setName("John Doe");

        assertTrue();
    }

    
    @Test
    public void testCreateProductB {
        
        ProductFactory pf = new ProductFactory();
        Product prod;

        prod = pf.createProduct("B");
        prod.set("John Doe");

        assertTrue();
    }
}
