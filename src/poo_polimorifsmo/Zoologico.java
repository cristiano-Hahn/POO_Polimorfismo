/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_polimorifsmo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author crist
 */
public class Zoologico {
    
    private List<Animal> jaula = new ArrayList<>();
    
    public void adicionarAnimalNaJaula(Animal animal){
        jaula.add(animal);
    }
    public Animal getAnimalDaJaula(Integer index){
        return jaula.get(index);
    }

    public List<Animal> getJaula() {
        return jaula;
    }
    
}
