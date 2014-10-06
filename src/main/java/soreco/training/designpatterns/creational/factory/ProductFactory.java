package soreco.training.designpatterns.creational.factory;

public class ProductFactory {

    public Product createProduct(String type) {

        if (type.equalsIgnoreCase("A")) {
            return new ProductA();

        } else
            return new ProductB();
    }
}


