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
public class AdaptadorDeMedia implements IMediaPlayer {
    IMediaPlayerAvancado mediaPlayerAvancado;

    public AdaptadorDeMedia(String tipo) {
        if(tipo.equals("vlc")) mediaPlayerAvancado = new VlcPlayer();
        else if(tipo.equals("mp4")) mediaPlayerAvancado = new Mp4Player();
    }
    
    @Override
    public void play(String tipo, String caminho) {
        if(tipo.equals("vlc")) mediaPlayerAvancado.playVlc(caminho);
        else if(tipo.equals("mp4")) mediaPlayerAvancado.playMp4(caminho);
    }
    
}
