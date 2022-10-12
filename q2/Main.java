package q2;

public class Main {
    public static void main(String[] args){
        Estacionamento estacionamento = new Estacionamento();

        Carros carro1 = new Carros("FIAT STRADA ", "MSG-7952",2,1);
        Carros carro2 = new Carros("CHEVROLET ONIX", "JYY-6463",5,3);
        Carros carro3 = new Carros ("BMW 320i", "MVC-8989",5,2);
        Carros carro4 = new Carros ("MITSUBISHI PAJERO", "MOQ-8496",7,5);
        
        estacionamento.addCarros(carro1);
        estacionamento.addCarros(carro2);
        estacionamento.addCarros(carro3);
        estacionamento.addCarros(carro4);
        
        System.out.println(estacionamento);
    }
}
