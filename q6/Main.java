package q6;

public class Main {
  public static void main(String[] args) {
    Cliente c1 = new Cliente("João");
    Cliente c2 = new Cliente("Maria");
    Cliente c3 = new Cliente("Ana");

    ContaCorrente cc1 = new ContaCorrente(500f, c1);
    System.out.println(cc1.toString());
    ContaCorrente cc2 = new ContaCorrente(700f, c2);
    System.out.println(cc2.toString());
    ContaCorrente cc3 = new ContaEspecial(600f, c3, 800f);
    System.out.println(cc3.toString());

    cc1.depositar(250.67f);
    System.out.println(cc1.toString());

    cc2.sacar(200f);
    System.out.println(cc2.toString());

    cc2.sacar(600f); //valor maior que o que tem atualmente para sacar
    System.out.println(cc2.toString()); //valor não é mudado, retorna o mesmo

    cc1.transferir(cc3, 100f); 
    System.out.println(cc1.toString());
    System.out.println(cc3.toString());

    cc3.sacar(750f); //sacando valor maior que o saldo e menor que o limite
    System.out.println(cc3.toString());

    cc3.sacar(200f); //sacando valor maior que o saldo e maior que o limite
    System.out.println(cc3.toString()); //operacao nao ocorre e retorna o mesmo valor de antes
  }
}
