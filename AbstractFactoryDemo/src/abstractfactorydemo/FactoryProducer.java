/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactorydemo;

/**
 *
 * @author Professor
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
    if(choice.equalsIgnoreCase("forma")){
        return new FactoryForma();
    } else if(choice.equalsIgnoreCase("material")){
        return new FactoryMaterial();
    }
        return null;
    }

}
