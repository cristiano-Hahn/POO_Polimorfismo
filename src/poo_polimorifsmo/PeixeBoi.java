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
public class PeixeBoi extends Animal{
   private Boolean nadando = false;
   
   public void nadar(){
       System.out.println("Animal nadando");
       nadando = true;
   }

    public Boolean getNadando() {
        return nadando;
    }

    public void setNadando(Boolean nadando) {
        this.nadando = nadando;
    }
   
   @Override    
    public String emitirSom(){
        return "ºo0O (são bolinhas de oxigênio)";
    } 
}
