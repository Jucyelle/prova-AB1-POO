package q1;

import java.util.ArrayList;

public class Compra {

    ArrayList<Itens> itens = new ArrayList<>();

    public ArrayList<Itens> getItens() {
		return itens;
	}
    
    public void addItem(Itens item){
        itens.add(item);
    }

    public double total(){
        double totalItens = 0;

        for(Itens item : itens) {
            totalItens = totalItens + item.subTotal();
        }
        
        return totalItens;
    }
    
    public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Itens do carrinho:\n");
		for (Itens item : itens) {
			sb.append(item + "\n");
		}
        
		sb.append("\nValor da compra: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}
}
