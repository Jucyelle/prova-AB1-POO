package q4;

public class Cartao implements Pagamento {
    private String numeroCartao;
    private Integer codCVV;
    
    public Cartao(String numeroCartao, Integer codCVV) {
        this.numeroCartao = numeroCartao;
        this.codCVV = codCVV;
    }
    public String getNumeroCartao() {
        return numeroCartao;
    }
    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }
    public Integer getCodCVV() {
        return codCVV;
    }
    public void setCodCVV(Integer codCVV) {
        this.codCVV = codCVV;
    }
    @Override
    public void fazerPagamento() {
        System.out.println("Pagamento no Cartão de Crédito: " + numeroCartao);
        System.out.println("Pagamento Cartão de Crédito com sucesso!");
    }
}
