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
class Estrutura //Criamos aqui nossa classe EstruturaVetor
{

    private Jogador[] ar;                 // cria a referência para um vetor do tipo Jogador
    private int nElems;               // nElems controla quantos elementos o vetor terá ...
    //-----------------------------------------------------------

    public Estrutura(int max) // método construtor
    {
        ar = new Jogador[max];                 // cria o vetor ...
        nElems = 0;                        // inicialmente sem itens ...
    }

    //--------------------------------------------------------------
//Método que retorna quantidade de itens do vetor ....
//--------------------------------------------------------------
    public int size() {
        return nElems;
    }

    //--------------------------------------------------------------
//Método de pesquisa binária com String
//--------------------------------------------------------------
    public int findByIdade(int searchKey) {
        int lowerBound = 0;
        int upperBound = nElems - 1;
        int curIn;

        while (true) {
            curIn = (lowerBound + upperBound) / 2;
            if (ar[curIn].getIdade() == searchKey) //mudamos aqui para comparar nome
            {
                for (int i = curIn; (ar[i].getIdade() == searchKey); i++) { //mudado p/desafio
                    ar[i].displayJogador(); //mudado p/ imprimir todos os dados da pessoa
                    System.out.println("==============================================");
                }
                for (int j = curIn - 1; (ar[j].getIdade() == searchKey); j--) { //mudado p/ desafio
                    ar[j].displayJogador();//mudado p/ imprimir todos os dados da pessoa
                    System.out.println("==============================================");
                }
                //return true;
                return curIn;              // encontrei!
            } else if (lowerBound > upperBound) {
                return nElems;             // não pude encontra-lo
            } else // divide o range
            {
                //O metodo compareTo do tipo String, retorna positivo se a primeira
                //String for maior que a segunda e negativo se for o contrário
                if (ar[curIn].getIdade() < searchKey) //mudamos aqui para comparar idade
                {
                    lowerBound = curIn + 1; // esta na metade de cima
                } else {
                    upperBound = curIn - 1; // esta na metade de baixo
                }
            }  // fim do else de divisão de range
        }  // fim do while
    }  // fim do método de pesquisa binária()  

    //--------------------------------------------------------------
//Método de pesquisa linear por nome
//--------------------------------------------------------------
    public boolean findByName(String searchKey) {
        int j;
        for (j = 0; j < nElems; j++) // varrerá o vetor buscando ...
        {
            if (ar[j].getNome().equals(searchKey.toUpperCase())) // encontrou o item?
            {
                break;                       // sai do for antes de finalizar ...
            }
        }
        if (j == nElems) // precisou chegar no final??
        {
            return false;                   // se sim, retorna falso
        } else {
            return true;                    // se não, encontrou ...
        }
    }  // fim da busca

//--------------------------------------------------------------
//Método de inserção ORDENADA com String!!! ....
//--------------------------------------------------------------
public void insert(String n, double a, int id) // insere o elemento no vetor
    {
        int j;
        for (j = 0; j < nElems; j++) // localiza onde esse elemento se encaixa
        //usamos aqui o metodo compareTo para String
        {
            if (ar[j].getIdade() > id) //mudado
            {
                break;
            }
        }
        for (int k = nElems; k > j; k--) // move os elementos maiores uma posição p/ frente
        {
            ar[k] = ar[k - 1];
        }
        //Apos abrir um espaço no lugar certo, ele cria o nome objeto Jogador na posição aberta!!!
        ar[j] = new Jogador(n, a, id);                  // insere o elemento na posição necessária
        nElems++;                      // incrementa a variavel de controle de tamanho
    }  // finaliza o método de inserção

//--------------------------------------------------------------
//Método de remoção ....
//--------------------------------------------------------------
    public boolean delete(int value) {
        int j = findByIdade(value);           //Utiliza a busca binária para remover!!!
        if (j == nElems) // caso não encontre, retorna false!
        {
            return false;
        } else // caso encontre...
        {
            for (int k = j; k < nElems; k++) // move os elementos uma posição pra tras
            {
                ar[k] = ar[k + 1];
            }
            nElems--;                   // decrementa o tamanho
            return true;
        }
    }  // finaliza remoção

//--------------------------------------------------------------
//Método de visualização ....
//--------------------------------------------------------------
    public void display() // mostra o conteúdo do vetor
    {
        for (int j = 0; j < nElems; j++) {
            ar[j].displayJogador();
        }
    }
   //-----------------------------------

    void insert(String nome, String altura, int idade) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    boolean findAd(String nextLine) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
}
