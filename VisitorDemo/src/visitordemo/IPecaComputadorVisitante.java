/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitordemo;


public interface IPecaComputadorVisitante {

    public void visitar(Computador computador);

    public void visitar(Mouse mouse);

    public void visitar(Teclado teclado);

    public void visitar(Monitor monitor);
}
