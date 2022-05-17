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
public class Circulo implements IForma {
        @Override
    public void desenhar() {
        System.out.println("Desenhando circulo: ");
        System.out.println("/--\\");
        System.out.println("|   |");
        System.out.println("\\--/");
    }
}
