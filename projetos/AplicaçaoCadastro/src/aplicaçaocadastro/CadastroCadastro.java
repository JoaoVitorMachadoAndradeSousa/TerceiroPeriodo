
package aplicaçaocadastro;


import br.unikut.classes.LSE;
import java.util.Scanner;
public class CadastroCadastro {
    public void alteraCadastro(LSE<Cadastro> usuarios, String log){
        Cadastro cadastro, result;
        Scanner in = new Scanner(System.in);
        String  senha1, nome, bio;
        int op;
        cadastro = new Cadastro (log,"","","");
        result = usuarios.buscaObjeto(cadastro);
        if(result == null){
            System.out.println("USUÁRIO NÃO ENCONTRADO");
            
        }else{
            System.out.println("Digite a sua senha: ");
            String senha2;
            senha2 = in.nextLine();
            if(senha2 != result.getSenha()){
                System.out.println("Senha inválida.");
            }else{
            System.out.println("1 - ALTERAR SENHA");
            System.out.println("2 - ALTERAR NOME");
            System.out.println("3 - ADICIONAR BIOGRAFIA");
            op = in.nextInt();
            switch(op){
                case 1: System.out.println("Digite a nova senha a ser cadastrada: ");
                 senha1 = in.nextLine();
                 result.setSenha(senha1);
                 break;
                case 2: System.out.println("Digite o novo nome a ser cadastrado: ");
                nome = in.nextLine();
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
}

