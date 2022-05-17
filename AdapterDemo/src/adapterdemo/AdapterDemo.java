/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapterdemo;

/**
 *
 * @author SESI
 */
public class AdapterDemo {

    public static void main(String[] args) {
        AudioPlayer ap = new AudioPlayer();
        ap.play("mp3", "Black");
        ap.play("vlc", "Evidências");
        ap.play("mp4", "É o tchan");
        ap.play("wma", "5ª Sinfonia");
    }
    
}
