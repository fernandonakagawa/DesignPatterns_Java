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
        IForma forma1 = FactoryForma.getForma("retangulo");
        forma1.desenhar();
        IForma forma2 = FactoryForma.getForma("triangulo");
        forma2.desenhar();
        IForma forma3 = FactoryForma.getForma("circulo");
        forma3.desenhar();
        //Forma não fabricada pela FactoryForma
        //IForma forma4 = FactoryForma.getForma("losango");
        //forma4.desenhar();
    }
    
}
