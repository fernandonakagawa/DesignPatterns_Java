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
public class AbstractFactoryDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AbstractFactory formaFactory = FactoryProducer.getFactory("forma");

        IForma forma1 = formaFactory.getIForma("circulo");
        forma1.desenhar();
        IForma forma2 = formaFactory.getIForma("retangulo");
        forma2.desenhar();
        IForma forma3 = formaFactory.getIForma("triangulo");
        forma3.desenhar();
        
        AbstractFactory materialFactory = FactoryProducer.getFactory("material");

        IMaterial mat1 = materialFactory.getIMaterial("madeira");
        mat1.materializar();
        IMaterial mat2 = materialFactory.getIMaterial("metal");
        mat2.materializar();
        IMaterial mat3 = materialFactory.getIMaterial("rocha");
        mat3.materializar();
    }
    
}
