/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercicio1;

import java.util.Scanner;

/**
 *
 * @author Washington Ernando Pereira Benício
 * 
 * 
 * /*
        Desenvolver um programa simples em Java que:
        1 – Peça para o usuário digitar o nome de 5 alunos;
        2 – Armazene esses 5 nomes em um vetor;
        3 – Peça para o usuário digitar uma letra do alfabeto;
        4 – Pesquise no vetor todos os nomes que começam com essa letra;
        5 – Retorne na tela os nomes que conferem com essa pesquisa.
 */

public class desafio1Melhorado {
    
    private String arrayNome[];
    private int nElement;
    
    public desafio1Melhorado(int tamanho){
        arrayNome = new String[tamanho];
        nElement = 0;
    }
    
    public void inserir(String value){
        arrayNome[nElement] = value;
        nElement++;
    }
    
    public boolean buscar(String buscaChave){
        int i;
        boolean b = false; 
        for(i = 0; i<nElement; i++){
            if(arrayNome[i].equals(buscaChave)){
                //System.out.println(arrayNome[i]);
                b = true;
            }
        }
        return b;               
    }
    
    public boolean excluir(String value){
        
    }
    
    public void exibir(){
        for(int j=0; j<nElement; j++){
            System.out.print(arrayNome[j] + " ");
        }
        System.out.println("");
    }
        
}

class ClasseUsuaria{
    public static void main(String[] args){
        int tamanho = 5;
        desafio1Melhorado arr = new desafio1Melhorado(tamanho);
        Scanner scan = new Scanner(System.in);
        
        for (int i = 1; i < 6; i++){
            
        }
        
        
    }
}
