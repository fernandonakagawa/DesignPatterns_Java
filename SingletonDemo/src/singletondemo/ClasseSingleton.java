/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletondemo;

public class ClasseSingleton {
    private static ClasseSingleton instancia;
    private ClasseSingleton() {
    }
    public static synchronized ClasseSingleton getInstancia(){
        if(instancia == null) instancia = new ClasseSingleton();
        return instancia;
    }
}
