package soreco.training.designpatterns.creational.factory;

/**
 * Created by Sergej Grebenjuk on 01.10.14.
 */

public class ProductB extends Product {

    private String name;

    public void setName ( String name ){

        this.name = name;

    }

    public String getName (){

        StringBuilder tempName = new StringBuilder().append(name);

        String nameReverted = new String ("My reversed name is " + tempName.reverse());

        return nameReverted;
    }

}
