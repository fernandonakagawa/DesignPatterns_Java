/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactorydemo;

/**
 *
 * @author Professor
 */
public abstract class AbstractFactory {
    abstract IMaterial getIMaterial(String material);
    abstract IForma getIForma(String forma) ;

}
