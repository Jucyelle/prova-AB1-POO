package q6;

public class ContaEspecial extends ContaCorrente {
  private float limite;

  public ContaEspecial(float saldo, Cliente cliente, float limite) {
    super(saldo, cliente);
    this.limite = limite;
  }

  public void setLimite(float limite) {
    this.limite = limite;
  }

  @Override
  public boolean sacar(float valor) {
    float novoSaldo = this.saldo - valor;
    float novoLimite = this.limite - valor;
    if(novoLimite >= 0) {
      this.saldo = novoSaldo;
      this.setLimite(novoLimite);
      return true;
    }
    else {
      return false;
    }
  }

  @Override
  public String toString() {
    return "-----\nCONTA ESPECIAL\n" + cliente.toString() + "\nSaldo: " + this.saldo + "\nLimite: " + this.limite + "\n-----";
  }
}
