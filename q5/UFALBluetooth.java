package q5;

public abstract class UFALBluetooth {
  
  public UFALBluetooth() {
    conectar();
    processar();
    encerrar();
  }

  public void conectar() {
    System.out.println("Estabelecendo uma conexão UFALBluetooth...");
  }

  public abstract void processar();

  public void encerrar() {
    System.out.println("Fechando a conexão...");
  }
}
