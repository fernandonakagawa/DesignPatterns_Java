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
public class FactoryForma extends AbstractFactory{
    public IForma getIForma(String forma){
        if(forma == null) return null;
        if(forma.equals("retangulo")) return new Retangulo();
        else if(forma.equals("circulo")) return new Circulo();
        else if(forma.equals("triangulo")) return new Triangulo();
        return null;
    }

    @Override
    IMaterial getIMaterial(String material) {
        return null;
    }

}
