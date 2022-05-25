/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletondemo;

/**
 *
 * @author SESI
 */
public class ClasseSingleton2 {
    private static ClasseSingleton2 instancia = new ClasseSingleton2();
    private ClasseSingleton2() {
    }
    public static ClasseSingleton2 getInstancia(){
        return instancia;
    }
}
