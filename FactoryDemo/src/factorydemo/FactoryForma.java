/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorydemo;

/**
 *
 * @author Professor
 */
public class FactoryForma {
    public static IForma getForma(String forma){
        if(forma.equals("retangulo")) return new Retangulo();
        else if(forma.equals("circulo")) return new Circulo();
        else if(forma.equals("triangulo")) return new Triangulo();
        return null;
    }
}
