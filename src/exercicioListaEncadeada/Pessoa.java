/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercicioListaEncadeada;

/**
 *
 * @author Washington
 */
public class Pessoa {
    private final String nome;
    private final String pessoaQuerida;
    private Pessoa proximo;
    
    public Pessoa (String nome, String outroNome){
        this.nome = nome;
        this.pessoaQuerida = outroNome;        
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNext(Pessoa n){
        this.proximo = n;
    }
    
    public String displayPessoa(){
        return ("Nome: " + nome + " Pessoa querida: " + pessoaQuerida);
    }
    
    public Pessoa getNext(){
        return this.proximo;
    }
}