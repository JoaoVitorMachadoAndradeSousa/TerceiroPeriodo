
package aplicaçaocadastro;
import br.unikut.classes.LSE;


public class Cadastro implements Comparable<Cadastro> {
    private String login;
    private String senha;
    private String nome;
    private String bio;
    private LSE<Cadastro> amigos;
    public Cadastro (String login, String senha, String nome,String bio){
        this.setLogin(login);
        this.setSenha(senha);
        this.setNome(nome);
        this.setBio(bio);
    }

    public Cadastro(String login, String senha, String nome) {
        this.login = login;
        this.senha = senha;
        this.nome = nome;
    }
    
    public void setLogin(String login){
        this.login = login;
    }
    public String getLogin(){
        return this.login;
    }
    public void setSenha(String senha){
        this.senha = senha;
    }
    public String getSenha(){
        return this.senha;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setBio(String bio){
        this.bio = bio;
    }
    public String getBio(){
        return this.bio;
    }
    public int compareTo(Cadastro c) {
		return this.getLogin().compareTo(c.getLogin());
	}
    public String toString(){
        return "LOGIN: " + this.getLogin() + "\n" +  
                "NOME: " + this.getNome() + "\n" + 
                "BIOGRAFIA: " + this.getBio();
                
}
}
