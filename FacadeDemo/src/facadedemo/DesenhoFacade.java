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
public class DesenhoFacade {
    private Circulo circulo;
    private Retangulo retangulo;
    private Triangulo triangulo;

    public DesenhoFacade() {
        this.circulo = new Circulo();
        this.retangulo = new Retangulo();
        this.triangulo = new Triangulo();
    }
    public void desenharCirculo(){
        this.circulo.desenhar();
    }
    public void desenharRetangulo(){
        this.retangulo.desenhar();
    }
    public void desenharTriangulo(){
        this.triangulo.desenhar();
    }
    
    
}
