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
public class FactoryMaterial extends AbstractFactory{

    @Override
    IMaterial getIMaterial(String material) {
        if(material == null) return null;
        if(material.equals("madeira")) return new Madeira();
        else if(material.equals("metal")) return new Metal();
        else if(material.equals("rocha")) return new Rocha();
        return null;
    }

    @Override
    IForma getIForma(String forma) {
        return null;
    }
    
}
