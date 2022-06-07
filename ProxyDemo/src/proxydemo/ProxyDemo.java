/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxydemo;

/**
 *
 * @author Professor
 */
public class ProxyDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Image image = new ImagemProxy("foto.jpg");
        //a imagem será carregada do disco
        image.display();
        System.out.println("");
        //image não será carregada do disco
        image.display();
    }

}
