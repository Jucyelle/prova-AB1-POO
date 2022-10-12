package q1;

public class Main {
    public static void main(String[] args){
        Compra compra = new Compra();

        Produto produto1 = new Produto("Escova de Dentes", 4.99 );
        Produto produto2 = new Produto("Creme Dental", 6.99 );
        Itens item1 = new Itens( 4.99, produto1, 3);
        Itens item2 = new Itens( 6.99, produto2, 1);

        compra.addItem(item1);
        compra.addItem(item2);
        
        System.out.println(compra);
    }

}