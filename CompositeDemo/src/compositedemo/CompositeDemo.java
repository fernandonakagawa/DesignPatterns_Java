/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositedemo;

import java.util.ArrayList;

/**
 *
 * @author Professor
 */
public class CompositeDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empregado diretor = new Empregado("Gustavo", "Desenvolvimento", 15000);
        Empregado e1 = new Empregado("Victor", "Desenvolvimento", 16000);
        Empregado e2 = new Empregado("Maycon", "Desenvolvimento", 1500);
        Empregado e3 = new Empregado("Bruno", "Desenvolvimento", 10000);
        diretor.add(e1);
        diretor.add(e2);
        e2.add(e3);
        System.out.println(diretor.toString());
        for(Empregado e: diretor.getSubordinates()){
            System.out.println(e.toString());
            for(Empregado ea: e.getSubordinates()){
                System.out.println(ea.toString());
            }
        }
    }
    
}
