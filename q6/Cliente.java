package q6;

public class Cliente {
  private String nome;

  public Cliente() {}

  public Cliente(String nome) {
    this.nome = nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return nome;
  }

  @Override
  public String toString() {
    return "Cliente: " + getNome();
  }
}