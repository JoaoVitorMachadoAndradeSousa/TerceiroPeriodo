
package cadastromarvel;

import java.util.Scanner;


public class CadastroMarvel {

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String [] nomeP = new String [100];
    String[] poderP = new String [100];
    int [] classeHeroiouVilao = new int [100];
    int [] numP = new int [100];
    int [] anoC = new int [100];
    int [] viveuEstalo = new int [100];
    int [] morreuEstalo = new int [100];
    int ultimoIndice = 0;
    int id = 0;
    int op, op1, op2, num;
    
    
    do{
        menu();
        op = in.nextInt();
        in.nextLine();
        switch(op){
            case 1: if(ultimoIndice < nomeP.length){
                System.out.println("É Herói ou Vilão? 1 para herói 2 para vilão");
                op = in.nextInt();
                if (op == 1){
                    int viveuEst= 0;
                    int morreuEst = 0;
                    int qtdHeroi = 0;
                    classeHeroiouVilao[qtdHeroi] = 1;
                    System.out.println("Informe o ID do herói: ");
                    numP[ultimoIndice] = in.nextInt();
                    in.nextLine();
                    System.out.println("Informe o nome do herói: ");
                    nomeP[ultimoIndice] = in.nextLine();
                    System.out.println("Informe o poder do herói: ");
                    poderP[ultimoIndice] = in.nextLine();
                    System.out.println("Informe o ano de criação do herói: ");
                    anoC[ultimoIndice] = in.nextInt();
                    System.out.println("Sobreviveu ao estalo? 1 para sim ou 2 para não");
                    op2 = in.nextInt();
                    in.nextLine();
                    if(op2 == 1){
                        viveuEstalo[viveuEst] = 1;
                        viveuEst++;
                    }else{
                        morreuEstalo[morreuEst] = 2;
                        morreuEst++;
                    }
                    
                    ultimoIndice++;
                    qtdHeroi++;
                    
                }else{
                   int viveuEst = 0;
                   int morreuEst = 0;
                   int qtdVilao = 0;
                    classeHeroiouVilao[qtdVilao] = 2;
                    System.out.println("Informe o ID do vilão: ");
                    numP[ultimoIndice] = in.nextInt();
                     in.nextLine();
                     System.out.println("Informe o nome do vilão: ");
                    nomeP[ultimoIndice] = in.nextLine();
                    System.out.println("Informe o poder do vilão: ");
                    poderP[ultimoIndice] = in.nextLine();
                    System.out.println("Informe o ano de criação do vilão: ");
                    anoC[ultimoIndice] = in.nextInt();
                    System.out.println("Sobreviveu ao estalo?");
                     op2 = in.nextInt();
                      in.nextLine();
                    if(op2 == 1){
                        viveuEstalo[viveuEst] = 1;
                        viveuEst++;
                    }else{
                        morreuEstalo[morreuEst] = 2;
                        morreuEst++;
                    }
                    ultimoIndice++;
                    qtdVilao++;
                }
                break;
            }
            case 2:
                System.out.println("Informe a ID do personagem: ");
                op1 = in.nextInt();
                int busca = buscaSimples(op1, numP, ultimoIndice);
                if(busca != -1){
                    for(int i = busca; i < ultimoIndice; i++){
                    System.out.println("Nome: " + nomeP[i]);
                    System.out.println("Poder: " + poderP[i]);
                    System.out.println("Ano de criação: " + anoC[i] );
                    System.out.println("Classe: Herói" );
                }
                    
                }else{
                    System.out.println("Personagem não encontrado!");
                }
        
                break;
            case 3:
                System.out.println("Informe a ID do personagem: ");
                op1 = in.nextInt();
                int busca1 = buscaSimples(op1, numP, ultimoIndice);
                if(busca1 != -1){
                    for(int i = 0; i < ultimoIndice; i++){
                    System.out.println("Nome: " + nomeP[i]);
                    System.out.println("Poder: " + poderP[i]);
                    System.out.println("Ano de criação: " + anoC[i] );
                    System.out.println("Classe: Vilão" );
                }
                    
                }else{
                    System.out.println("Personagem não encontrado!");
                }
                
                break;
            case 4:
                System.out.println("Lista de Personagens");
                for(int i = 0; i < ultimoIndice; i++){
                    System.out.println("O personagem: " + nomeP[i]);
                    System.out.println("O poder: " + poderP[i]);
                    System.out.println("O ID: " + numP[i]);
                }
                break;
            case 5:
                System.out.println("Lista de Personagens por Classe");
                for(int i = 0; i < ultimoIndice; i++){
                    if(classeHeroiouVilao[i] == 1){
                        System.out.println("HERÓIS");
                    System.out.println("O personagem: " + nomeP[i]);
                    System.out.println("O poder: " + poderP[i]);
                    System.out.println("O ID: " + numP[i]);
                    }else if (classeHeroiouVilao[i] == 2){
                        System.out.println("VILÕES");
                    System.out.println("O personagem: " + nomeP[i]);
                    System.out.println("O poder: " + poderP[i]);
                    System.out.println("O ID: " + numP[i]);
                    }else{
                        System.out.println("Lista vazia!");
                    }
                    
                }
                break;
            case 6: System.out.println("Lista de Personagens que sobreviveram ao estalo: ");
            for(int i = 0; i < ultimoIndice; i++){
                if(viveuEstalo[i] == 1){
                    System.out.println("O personagem: " + nomeP[i]);
                    System.out.println("O poder: " + poderP[i]);
                    System.out.println("O ID: " + numP[i]);
                }else{
                    System.out.println("Lista de sobreviventes vazia!");
                }
            }
            break;
            case 7: System.out.println("Digite o ID do personagem a ser removido: ");
            num = in.nextInt();
            int ind;
            ind = buscaSimples (num, numP, ultimoIndice);
            if (ind != -1){
                for(int i = ind; i < ultimoIndice; i++){
                    numP[i] = numP[i + 1];
                    nomeP[i] = nomeP[i + 1];
                    poderP[i] = poderP[i + 1];
                    anoC[i] = anoC[i + 1];
                }
                ultimoIndice--;
                
            }else{
                System.out.println("Personagem não encontrado!");
            }
            break;
            default: System.out.println("Opção inválida!");
            break;
            case 8: 
                System.out.println("Programa encerrado!");
                break;
                    
        }
        for(int i = 0; i < numP.length; i++){
            
        }
    }while(op != 8);
    }
    public static void menu (){
        System.out.println("1- Incluir personagem");
        System.out.println("2- Consultar herói");
        System.out.println("3- Consultar vilão");
        System.out.println("4- Lista de todos os personagens");
        System.out.println("5- Lista de personagens por classe");
        System.out.println("6- Lista de personagens sobreviventes");
        System.out.println("7- Remover um personagem");
        System.out.println("8- Encerrar o programa");
    }
     public static int buscaSimples(int numP, int[] numPs, int ultimoIndice){
        for (int i = 0; i < ultimoIndice; i++) {
            if (numP == numPs[i]){
                return i;
            }
        }
        return -1;
    }
    
    
}
