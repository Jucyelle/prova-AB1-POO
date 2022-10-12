package q3;

public class Main {
  public static void main(String[] args) {
    Login l1 = new Formulario("Ana", "user123", "email@gmail.com", "0987654321");
    Login l2 = new Google("tt@gmail.com", "123456789");
    Login l3 = new Facebook("(82)995432964", "123456789");
    Login l4 = new ICloud(654795422, "123456789");

    l1.fazerLogin();
    l2.fazerLogin();
    l3.fazerLogin();
    l4.fazerLogin();
  }
}
