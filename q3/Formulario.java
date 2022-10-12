package q3;

public class Formulario implements Login {
  private String nome;
  private String username;
  private String email;
  private String senha;

  public Formulario(String nome, String username, String email, String senha) {
    this.nome = nome;
    this.username = username;
    this.email = email;
    this.senha = senha;
  }

  @Override
  public void fazerLogin() {
    System.out.println("Fazendo login com o formulário...");
  }
}
