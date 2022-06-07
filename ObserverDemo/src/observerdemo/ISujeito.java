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
public interface ISujeito {
    public void addEventListener(IObservador o);
    public void removeEventListener(IObservador o);
    public void notificar();
}
