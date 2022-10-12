package q4;

public class Boleto implements Pagamento {
    private String codBoleto;

    public Boleto(String codBoleto) {
        this.codBoleto = codBoleto;
    }

    public String getCodBoleto() {
        return codBoleto;
    }

    public void setCodBoleto(String codBoleto) {
        this.codBoleto = codBoleto;
    }
    
    @Override
    public void fazerPagamento() {
        System.out.println("Boleto : " + codBoleto);
        System.out.println("Pagamento Boleto com sucesso!");
    }
    
}
