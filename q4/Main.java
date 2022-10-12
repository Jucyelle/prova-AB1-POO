package q4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int n;

        System.out.print("DIGITE O NÚMERO E SELECIONE UM MÉTODO DE PAGAMENTO:\n 1 - PIX\n 2 - Cartão de Crédito\n 3 - Boleto\n 4 - Outro método de pagamento ");
        n = ler.nextInt();

        if (n == 1) {
            Pagamento p1 = new PIX("fe3d58r8-3445-4e9b-8c7");

            p1.fazerPagamento();
        }

        else if (n == 2) {
            Pagamento p2 = new Cartao("5424 1801 2345 6789",764);

            p2.fazerPagamento();
        }

        else if (n == 3){
            Pagamento p3 = new Boleto("34191.79001 01043.510047 91020.150008 1 91360026000");

            p3.fazerPagamento();
        }

        else if (n == 4){
            System.out.println("Nova forma de pagamento cadastrada com sucesso!");
        }

        else{
            System.out.println("Opção inválida. Tente novamente!");
        }

        ler.close();
    
    }
}
