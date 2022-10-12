package q3;

public class ICloud implements Login {
  private Integer id;
  private String senha;

  public ICloud(Integer id, String senha) {
    this.id = id;
    this.senha = senha;
  }

  @Override
  public void fazerLogin() {
    System.out.println("Fazendo login com o iCloud...");
  }
}
