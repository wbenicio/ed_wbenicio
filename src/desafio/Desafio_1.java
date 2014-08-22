/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package desafio;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Desafio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Desenvolver um programa simples em Java que:
        1 – Peça para o usuário digitar o nome de 5 alunos;
        2 – Armazene esses 5 nomes em um vetor;
        3 – Peça para o usuário digitar uma letra do alfabeto;
        4 – Pesquise no vetor todos os nomes que começam com essa letra;
        5 – Retorne na tela os nomes que conferem com essa pesquisa.
        */
        Scanner entrada =  new Scanner(System.in);
        String[] nome = new String[5];
             
        
        System.out.println("Digite o nome de 5 pessoas");
        for(int i = 0; i < 5; i++){
            System.out.println("Digite o "+ (i+1) +"° nome: ");
            nome[i] = entrada.nextLine();
        }
        
        System.out.println("Digite uma letra para pequisar:");
        String letra = entrada.next();
        for (int i = 0; i < 5; i++) {
            if(letra.charAt(0) == nome[i].charAt(0)){
                System.out.println("Nome: " + nome[i]);
            }
        }
        
        
        
        
    }
    
}
