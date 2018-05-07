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
public class Preguica extends Animal{
    private Boolean estaNaArvore = false;
    @Override    
    public String emitirSom(){
        return "ZzZz...";
    } 
    public void SubirNaArvore(){
        estaNaArvore = true;
        System.out.println("Animal subindo na árvore");
    }

    public void setEstaNaArvore(Boolean estaNaArvore) {
        this.estaNaArvore = estaNaArvore;
    }

    public Boolean getEstaNaArvore() {
        return estaNaArvore;
    }
}
