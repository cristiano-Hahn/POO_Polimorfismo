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
public class Animal {
    private String nome;
    private Integer Idade;
    
    public String emitirSom(){
        return "Som não definido";
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(Integer Idade) {
        this.Idade = Idade;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return Idade;
    }
}
