public class Usuario {
    String nome;
    String email;
    String senha;
public Usuario(String nome,String email,String senha) {
    this.nome = nome;
    this.email = email;
    this.senha = senha;
}
public void imprimirDados() {
    System.out.println("Nome: " + nome);
    System.out.println("Email: " + email);
    System.out.println("Senha: " + senha);
    }

    @Override
    public String toString() {
        return nome;
    }
}