/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitordemo;

public class Computador implements IPecaComputador {

    IPecaComputador[] pecas;

    public Computador() {
        pecas = new IPecaComputador[]{new Mouse(), new Teclado(), new Monitor()};
    }

    @Override
    public void aceitar(IPecaComputadorVisitante pecaComputadorVisitante) {
        for (int i = 0; i < pecas.length; i++) {
            pecas[i].aceitar(pecaComputadorVisitante);
        }
        pecaComputadorVisitante.visitar(this);
    }
}
