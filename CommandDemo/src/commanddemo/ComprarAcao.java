/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commanddemo;

public class ComprarAcao implements IOrdem {

    private Acao acao;
    
    public ComprarAcao(Acao acao){
        this.acao = acao;
    }
    
    @Override
    public void executar() {
        this.acao.comprar();
    }
    
}
