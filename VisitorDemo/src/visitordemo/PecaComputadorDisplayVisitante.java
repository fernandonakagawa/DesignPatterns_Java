/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitordemo;

public class PecaComputadorDisplayVisitante implements IPecaComputadorVisitante {

    @Override
    public void visitar(Computador computador) {
        System.out.println("Visitando Computador.");
    }

    @Override
    public void visitar(Mouse mouse) {
        System.out.println("Visitando Mouse.");
    }

    @Override
    public void visitar(Teclado teclado) {
        System.out.println("Visitando Teclado.");
    }

    @Override
    public void visitar(Monitor monitor) {
        System.out.println("Visitando Monitor.");
    }
}
