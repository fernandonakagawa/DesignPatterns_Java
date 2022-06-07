/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerdemo;

/**
 *
 * @author Professor
 */
public class Observador implements IObservador {

    private String estadoObservador;

    public Observador(String estadoObservador) {
        this.estadoObservador = estadoObservador;
    }
    
    @Override
    public void atualizar(String estado) {
        System.out.println(estadoObservador + " atualizado para " + estado);
    }
    
}
