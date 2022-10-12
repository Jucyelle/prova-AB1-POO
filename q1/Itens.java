package q1;

public class Itens {

    private Double preço;
    private Produto produto;
    private Integer quantidade;
    
    public Itens(Double preço, Produto produto, Integer quantidade) {
        this.preço = preço;
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Double getPreço() {
        return preço;
    }
    public void setPreço(Double preço) {
        this.preço = preço;
    }
    public Produto getProduto() {
        return produto;
    }
    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    public Integer getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public double subTotal() {
		return preço * quantidade;
	}
   
    public String toString() {
		return produto.getNome() + ", $" + String.format("%.2f", preço) + ", Quantidade: " + quantidade + ", Subtotal: R$" + String.format("%.2f", subTotal());
	}
}
