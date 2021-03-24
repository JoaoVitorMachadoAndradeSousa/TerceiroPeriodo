
package aplicaçaocadastro;

import br.unikut.classes.*;

import java.util.Scanner;


public class AplicaçaoCadastro {

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    LSE<Cadastro> usuarios = new LSE();
    LSE<Cadastro> amigos = new LSE();
    int op, op2;
    String login, senha, nome;
    Cadastro loginAmigo;
    do{
        System.out.println("BEM VINDO");
        System.out.println("1 - CRIAR CONTA");
        System.out.println("2 - EDITAR PERFIL/ADICIONAR ATRIBUTO AO PERFIL");
        System.out.println("3 - ADICIONAR AMIGOS");
        System.out.println("4 - ENVIAR RECADOS");
         op = in.nextInt();
        switch(op){
            case 1: System.out.println("Deseja criar uma conta convidada? 1 - para SIM / 2 - para NÃO");
            op = in.nextInt();
            switch(op){
                case 1: 
                    System.out.println("Informe o login: ");
                    login = in.nextLine();
                    in.nextLine();
                    System.out.println("Informe a sua senha: ");
                    senha = in.nextLine();
                    Cadastro c = new Cadastro (login,senha,"Convidado");
                    usuarios.inserirValorFinal(c);
                    break;
                case 2:
                    System.out.println("Informe o login: ");
                    login = in.nextLine();
                    in.nextLine();
                    System.out.println("Informe a sua senha: ");
                    senha = in.nextLine();
                    System.out.println("Informe o seu nome: ");
                    nome = in.nextLine();
                    Cadastro cc = new Cadastro(login,senha,nome);
                    usuarios.inserirValorFinal(cc);
                    break;
            }
             break;
            case 2: System.out.println("Informe o seu login para alteração ou adição de dados: ");
            login = in.nextLine();
            in.nextLine();
          System.out.println("Informe sua senha:");
           senha = in.nextLine();
           alteraCadastro(usuarios,login,senha);
                System.out.println();
            break;
            case 3:System.out.println("Informe o login do seu amigo: ");
            login = in.nextLine();
            in.nextLine();
            loginAmigo = new Cadastro (login,"","","");
            amigos.inserirValorFinal(loginAmigo);
                
        }
    }while(op != 5);
    }
     public static void alteraCadastro(LSE<Cadastro> usuarios, String log, String senha){
        Scanner in = new Scanner(System.in);
        Cadastro cadastro, result;
        String senha11, nome, bio;
        int op;
        cadastro = new Cadastro (log,senha,"","");
        result = usuarios.buscaObjeto(cadastro);
        System.out.println(result);
        if(result != null){
            System.out.println("USUÁRIO NÃO ENCONTRADO/CADASTRADO");
            System.out.println(result);
        }else{
            System.out.println(result);
            System.out.println("1 - ALTERAR SENHA");
            System.out.println("2 - ALTERAR NOME");
            System.out.println("3 - ADICIONAR BIOGRAFIA");
            System.out.println("4 - VOLTAR AO MENU");
            op = in.nextInt();
            in.nextLine();
            switch(op){
                case 1: System.out.println("Digite a nova senha a ser cadastrada: ");
                 senha11 = in.nextLine();
                 result.setSenha(senha11);
                 break;
                case 2: System.out.println("Digite o novo nome a ser cadastrado: ");
                nome = in.nextLine();
                in.nextLine();
                result.setNome(nome);
                break;
                case 3: System.out.println("Adicione o que desejar neste ponto (Ex: idade, hobbies e etc): ");
                bio = in.nextLine();
                result.setBio(bio);
                break;
                case 4: System.out.println("Voltando ao menu...");
                break;
                default: System.out.println("Opção inválida, digite novamente: "); 
                break;
                
                    
                }
            }
        }
     


    }

    

