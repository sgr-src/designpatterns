package soreco.training.designpatterns.creational.rw.factory;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rw
 */
public abstract class Product {
    String myName;
    
    public abstract String formatNameOutput();
    
    public void setName(String name){
        this.myName = name;
    }

    public final String getName(){
        return formatNameOutput();
    }
    
    public static final String MY_NAME_IS = "My name is ";
}
