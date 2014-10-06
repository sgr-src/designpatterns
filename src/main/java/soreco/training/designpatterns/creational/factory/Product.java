package soreco.training.designpatterns.creational.factory;


public abstract class Product {

    private String name;

    public void setName (String name){

        this.name = name;
    }

    public String getName (){

        return "My name is " + name;
}
}
