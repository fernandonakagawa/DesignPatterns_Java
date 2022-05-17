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
public class AudioPlayer implements IMediaPlayer{
    AdaptadorDeMedia adaptadorDeMedia;
    @Override
    public void play(String tipo, String caminho) {
        if(tipo.equals("mp3")) System.out.println("Tocando mp3 " + caminho);
        else if(tipo.equals("vlc") || tipo.equals("mp4")){
            adaptadorDeMedia = new AdaptadorDeMedia(tipo);
            adaptadorDeMedia.play(tipo, caminho);
        }
        else System.out.println("Formato não suportado.");
    }
    
}
