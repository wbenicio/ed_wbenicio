/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioPilha;

/**
 *
 * @author Washington
 */
public class Pilha {
    private int maxSize;
    private long[] arr;
    private int top;
    
    public Pilha(int tamanhoMax){
        maxSize = tamanhoMax;
        arr = new long[maxSize];
        top = -1;
    }
    
    public void inserir(long j){
        arr[++top] = j;
    }
    
    public long deletar(){
      return  arr[top--];
    }
    
    public long isTop(){
       return arr[top];
    }
    
    public boolean isEmpty(){
        return (top == -1);
    }
    
    public boolean isFull(){
        return (top == maxSize-1);
    }
    
    public long posicaoTop(){
        return top + 1;
    }
    
    
}
