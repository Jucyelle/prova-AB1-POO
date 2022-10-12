package q2;

import java.util.ArrayList;

public class  Estacionamento{
    ArrayList<Carros> carros = new ArrayList<>();

    public ArrayList<Carros> getCarros() {
        return carros;
    }

        
    public void addCarros(Carros carro){
        carros.add(carro);
    }

    public Integer total(){
        Integer totalPessoas = 0;

        for(Carros carro : carros) {
            totalPessoas = totalPessoas + carro.getQuantidadePessoas();
        }
        
        return totalPessoas;
    }

    public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Carros estacionados:\n");
		for (Carros carros : carros) {
			sb.append(carros + "\n");
		}
        
		sb.append("\nQuantidade de pessoas no estacionamento: ");
		sb.append(total());
		return sb.toString();
	}
}