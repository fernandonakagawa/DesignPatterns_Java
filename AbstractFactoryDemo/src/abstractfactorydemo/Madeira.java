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
public class Madeira implements IMaterial {

    @Override
    public void materializar() {
        System.out.println("Madeira: toc toc");
    }
    
}
