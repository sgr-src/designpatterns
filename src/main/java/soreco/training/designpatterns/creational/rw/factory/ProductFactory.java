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
public class ProductFactory {
    public static Product createProduct(String stringType){
        if (stringType.equalsIgnoreCase("A")) return new ProductA();
        if (stringType.equalsIgnoreCase("B")) return new ProductB();
        return null;        
    }
}
