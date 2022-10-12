package q6;

public class ContaCorrente {
  protected float saldo;
  protected Cliente cliente;

  public ContaCorrente() {}

  public ContaCorrente(float saldo, Cliente cliente) {
    this.saldo = saldo;
    this.cliente = cliente;
  }

  public void depositar(float valor) {
    this.saldo += valor;
  }

  public boolean sacar(float valor) {
    float novoSaldo = this.saldo - valor;
    if(novoSaldo >= 0) {
      this.saldo = novoSaldo;
      return true;
    }
    else {
      return false;
    }
  }

  public boolean transferir(ContaCorrente conta, float valor) {
    float novoSaldo = this.saldo - valor;
    if(novoSaldo >= 0) {
      this.saldo = novoSaldo;
      conta.depositar(valor);
      return true;
    }
    else {
      return false;
    }
  } 

  public void setCliente(Cliente cliente) {
    this.cliente = cliente;
  }

  @Override
  public String toString() {
    return "-----\nCONTA CORRENTE\n" + cliente.toString() + "\nSaldo: " + this.saldo + "\n-----";
  }
}

