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
public class ProductB extends Product{
    @Override
    public String formatNameOutput() {
        StringBuffer reversedName = new StringBuffer(myName).reverse();
        return Product.MY_NAME_IS + reversedName.toString();
    }

}
