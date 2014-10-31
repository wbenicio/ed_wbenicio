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
public class ListaPessoas {

    private Pessoa first;
    
    public ListaPessoas(){
        first = null;
    }
    
    public boolean isEmpty(){
        return (first == null);
    }
    
    public void insertFirst(String nome1, String nome2){
        Pessoa p  = new Pessoa(nome1,nome2);
        p.setNext(first);
        first = p;
    }
    public Pessoa deletFirst(){
        Pessoa temporaria = first;
        first = first.getNext();
        return temporaria;
    }
    
   public void display(){
        for(Pessoa n = first; n != null; n = n.getNext())
        {
            System.out.println(n.displayPessoa());
        } 
   }
   
   public void findName(String nome){
       for(Pessoa p = first; p != null; p = p.getNext()){
           if(p.getNome().equals(nome)){
               System.out.println(p.getNome());
           }
       }
       
       
   }
}
