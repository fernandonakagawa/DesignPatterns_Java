/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerdemo;

import java.util.ArrayList;

/**
 *
 * @author Professor
 */
public class Sujeito implements ISujeito{

    private String estado;
    private ArrayList<IObservador> observadores;
    public Sujeito(String estado){
        this.estado = estado;
        this.observadores = new ArrayList<>();
    }
    @Override
    public void addEventListener(IObservador o) {
        observadores.add(o);
    }

    @Override
    public void removeEventListener(IObservador o) {
        observadores.remove(o);
    }

    @Override
    public void notificar() {
        for(IObservador o: observadores){
            o.atualizar(estado);
        }
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
        notificar();
    }
    
    
}
