/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercicioReforco1;

/**
 *
 * @author Washington
 */
public class Jogador
   { 
   private String nome;
   private double altura;
   private int idade;
//--------------------------------------------------------------
   public Jogador(String n, double a, int id)
      {                               // comentario aqui
      nome = n;
      altura = a;
      idade = id;
      }
//--------------------------------------------------------------
   public void displayJogador()
      {
      System.out.print("   Nome: " + nome);
      System.out.print(", Altura: " + altura);
      System.out.println(", Idade: " + idade);
      }
//--------------------------------------------------------------
   public int getIdade()           // comentario aqui
      { return idade; }

    Object getNome() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   }  // Final da Classe Jogador