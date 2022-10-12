package q4;

public class PIX implements Pagamento{
    private String chave;

    public PIX(String chave) {
        this.chave = chave;
    }

    public String getChave() {
        return chave;
    }

    public void setChave(String chave) {
        this.chave = chave;
    }

    @Override
    public void fazerPagamento() {
        System.out.println("Chave: "+ chave);
        System.out.println("Pagamento PIX com sucesso!");
    }


}
