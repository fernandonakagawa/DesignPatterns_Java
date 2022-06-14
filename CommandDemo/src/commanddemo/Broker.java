/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commanddemo;

import java.util.ArrayList;
import java.util.List;

public class Broker {

    private List<IOrdem> listOrdem = new ArrayList<IOrdem>();

    public void receberOrdem(IOrdem ordem) {
        listOrdem.add(ordem);
    }

    public void executarOrdens() {
        for (IOrdem ordem : listOrdem) {
            ordem.executar();
        }
        listOrdem.clear();
    }
}
