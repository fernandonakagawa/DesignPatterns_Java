/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletondemo;


public class SingletonDemo {

    public static void main(String[] args) {
        //ClasseSingleton c1 = new ClasseSingleton();
        ClasseSingleton c1 = ClasseSingleton.getInstancia();
        ClasseSingleton c2 = ClasseSingleton.getInstancia();
        if(c1 == c2) System.out.println("São o mesmo objeto.");
    }
    
}
