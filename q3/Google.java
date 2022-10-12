package q3;

public class Google implements Login {
  private String email;
  private String senha;

  public Google(String email, String senha) {
    this.email = email;
    this.senha = senha;
  }

  @Override
  public void fazerLogin() {
    System.out.println("Fazendo login com o Google...");
  }
}
