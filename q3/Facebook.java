package q3;

public class Facebook implements Login {
  private String celular;
  private String senha;

  public Facebook(String celular, String senha) {
    this.celular = celular;
    this.senha = senha;
  }

  @Override
  public void fazerLogin() {
    System.out.println("Fazendo login com o Facebook...");
  }
}
