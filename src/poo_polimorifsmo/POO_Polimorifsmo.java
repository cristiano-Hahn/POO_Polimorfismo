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
public class POO_Polimorifsmo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cachorro dogao = new Cachorro();
        Cavalo peDePano = new Cavalo();
        Preguica creminho = new Preguica();
        PeixeBoi leoncio = new PeixeBoi();
        Zoologico zoo = new Zoologico();
        
        Veterinario.examinar(dogao);
        Veterinario.examinar(peDePano);
        Veterinario.examinar(creminho);
        Veterinario.examinar(leoncio);
        
        System.out.println("---------------------------------------------");
        
        zoo.adicionarAnimalNaJaula(dogao);
        zoo.adicionarAnimalNaJaula(peDePano);
        zoo.adicionarAnimalNaJaula(creminho);
        zoo.adicionarAnimalNaJaula(leoncio);
        zoo.adicionarAnimalNaJaula(new Preguica());
        zoo.adicionarAnimalNaJaula(new Cachorro());
        zoo.adicionarAnimalNaJaula(new PeixeBoi());
        zoo.adicionarAnimalNaJaula(new Cavalo());
        zoo.adicionarAnimalNaJaula(new PeixeBoi());
        zoo.adicionarAnimalNaJaula(new Preguica());
        
        for (Animal s : zoo.getJaula()) {
            if (s instanceof AnimalCorredor){
                ((AnimalCorredor) s).correr();
            } else if (s instanceof Preguica){
                ((Preguica)s).SubirNaArvore();
            }else if (s instanceof PeixeBoi){
                ((PeixeBoi) s).nadar();
            }
        }
    }
    
}
