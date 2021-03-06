package soreco.training.designpatterns.creational.factory.test;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import soreco.training.designpatterns.creational.rw.factory.*;


public class ClientFactoryTestRW {

    private ProductFactory pf;

    @Before
    public void init (){
        pf = new ProductFactory();
    }

    @Test
    public void testProductA() {

        Product prod;
        prod = pf.createProduct("A");
        prod.setName("John Doe");

        assertEquals("My name is John Doe", prod.getName());
    }

    @Test
    public void testProductB() {

        Product prod;
        prod = pf.createProduct("B");
        prod.setName("John Doe");
        
        //My reversed name is
        assertEquals("My name is eoD nhoJ", prod.getName());
    }
}
