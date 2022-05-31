/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facadedemo;

/**
 *
 * @author SESI
 */
public class FacadeDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DesenhoFacade desenhoFacade = new DesenhoFacade();
        desenhoFacade.desenharCirculo();
        desenhoFacade.desenharRetangulo();
        desenhoFacade.desenharTriangulo();
    }
    
}
