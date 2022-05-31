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
public class Triangulo implements IForma{
        @Override
    public void desenhar() {
        System.out.println("Desenhando triangulo: ");
        System.out.println(" /\\");
        System.out.println("/  \\");
        System.out.println("----");
    }
}
