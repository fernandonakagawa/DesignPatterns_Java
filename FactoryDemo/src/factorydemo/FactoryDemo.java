/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorydemo;

/**
 *
 * @author SESI
 */
public class FactoryDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FactoryForma formaFactory = new FactoryForma();
        IForma forma1 = formaFactory.getForma("circulo");
        forma1.desenhar();
        IForma forma2 = formaFactory.getForma("retangulo");
        forma2.desenhar();
        IForma forma3 = formaFactory.getForma("triangulo");
        forma3.desenhar();

        //Forma não fabricada pela FactoryForma
        //IForma forma4 = formaFactory.getForma("losango");
        //forma4.desenhar();

    }
    
}
