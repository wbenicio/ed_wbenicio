/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioPilha;

import javax.swing.JOptionPane;

/**
 *
 * @author Washington
 */
public class Menu {

    public static void main(String[] args){
        try {
            int item;
            Pilha pl = new Pilha(10);
        
        
            do{
                item = Integer.parseInt(JOptionPane.showInputDialog(null,"===============\n"+
                                                                           "*** Menu de Opções ***\n"+
                                                                           "1 - Inserir Mercadoria\n"+ 
                                                                           "2 - Remover Mercadoria\n"+ 
                                                                           "3 - Verificar Mercadorias\n"+ 
                                                                           "4 - Proxima Entrega\n"+
                                                                           "5 - Quantidade de Mercadoria\n"+ 
                                                                           "6 - Sair\n"+
                                                                           "===============\n"+
                                                                           "Digite sua opção:\n","CONTEINER DE MERCADORIAS:",JOptionPane.INFORMATION_MESSAGE));
                switch(item){
                    case 1:{
                        if(!pl.isFull()){
                            int cod = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero da mercadoria", "Entrega de mercadoria",JOptionPane.INFORMATION_MESSAGE));
                            pl.inserir(cod);
                        }
                        else{
                            JOptionPane.showConfirmDialog(null, "O conteiner está cheio!");
                        }                    
                    }
                    break;
                    case 2:{
                        if(!pl.isEmpty()){
                            long value = pl.deletar();
                            JOptionPane.showMessageDialog(null, "Mercadoria removida: "+ value);
                        }
                    }
                    break;
                    case 3:{
                        if(pl.isEmpty()){
                            JOptionPane.showMessageDialog(null, "Conteiner Vazio !!! ");
                        }
                        else{
                            if(pl.isFull()){
                                JOptionPane.showMessageDialog(null, "Conteiner Cheio !!! ");
                            }
                            else{
                                JOptionPane.showMessageDialog(null, "Conteiner não está Vazio !!! ");
                            }
                        }
                    }
                    break;
                    case 4:{
                        if(!pl.isEmpty()){
                            long value = pl.isTop();
                            JOptionPane.showMessageDialog(null, "Proxima mercadoria: "+ value);
                        }
                    }
                    break;
                    case 5:{
                        long value = pl.posicaoTop();
                        JOptionPane.showMessageDialog(null, "Quantidade atual no Conteiner: "+ value);                    
                    }
                    break;
                    default:{
                        if(item != 6){
                            JOptionPane.showMessageDialog(null, "Numero inválido\n Digite novamente!!"); 
                        }
                        else{
                            if(item == 6){
                                JOptionPane.showMessageDialog(null, "Você vai sair do programa!!!");
                            }
                        }
                    }
                    break;                
                }
            }while (item != 6 );
        }
        catch(NumberFormatException num){
            num.getMessage();
        }
    }
}
