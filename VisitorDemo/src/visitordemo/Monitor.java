/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitordemo;

public class Monitor implements IPecaComputador {

    @Override
    public void aceitar(IPecaComputadorVisitante pecaComputadorVisitante) {
        pecaComputadorVisitante.visitar(this);
    }
}
