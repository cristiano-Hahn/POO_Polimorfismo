/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_polimorifsmo;

/**
 *
 * @author crist
 */
public class AnimalCorredor extends Animal {
    private Boolean correndo = false;
    
    public void correr(){
        correndo = true;  
        System.out.println("Animal Correndo");
    }

    public void setCorrendo(Boolean correndo) {
        this.correndo = correndo;
    }

    public Boolean getCorrendo() {
        return correndo;
    }
}
