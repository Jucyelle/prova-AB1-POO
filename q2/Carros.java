package q2;

public class Carros {
    private String modelo;
    private String placa;
    private Integer vagas;
    private Integer quantidadePessoas;
    
    public Carros(String modelo, String placa, Integer vagas, Integer quantidadePessoas) {
        this.modelo = modelo;
        this.placa = placa;
        this.vagas = vagas;
        this.quantidadePessoas = quantidadePessoas;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public Integer getVagas() {
        return vagas;
    }
    public void setVagas(Integer vagas) {
        this.vagas = vagas;
    }
    public Integer getQuantidadePessoas() {
        return quantidadePessoas;
    }
    public void setQuantidadePessoas(Integer quantidadePessoas) {
        this.quantidadePessoas = quantidadePessoas;
    }
    
    public String toString() {
		return modelo + ", Placa: " + placa + ", Quantidade de bancos: " + vagas + ", Quantidade de pessoas: " + quantidadePessoas;
	}

}
