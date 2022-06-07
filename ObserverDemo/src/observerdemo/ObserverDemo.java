/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerdemo;

/**
 *
 * @author Professor
 */
public class ObserverDemo {


    public static void main(String[] args) {
        Sujeito s = new Sujeito("estado 1");
        Observador o = new Observador("observador 1");
        s.addEventListener(o);
        s.setEstado("estado 2");
        s.setEstado("estado 3");
    }
    
}
