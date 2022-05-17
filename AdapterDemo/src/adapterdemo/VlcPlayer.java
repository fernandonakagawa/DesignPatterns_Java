/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapterdemo;

/**
 *
 * @author Professor
 */
public class VlcPlayer implements IMediaPlayerAvancado {

    @Override
    public void playVlc(String caminho) {
        System.out.println("Tocando VLC: "+ caminho);
    }

    @Override
    public void playMp4(String caminho) {
        
    }
    
}
