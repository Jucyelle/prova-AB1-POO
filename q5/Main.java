package q5;

public class Main {
  public static void main(String[] args) {
    UFALBluetooth c1 = new ComunicacaoSerial();
    System.out.println("---");
    UFALBluetooth c2 = new ComunicacaoBEP();
  }
}
