package br.com.poo.ExerciciosTeste.ExCarro;

public class ExemploHierarquia {
	
    public static void main(String[] args) {
    	
        Carro carro = new Carro("Toyota", "Corolla", 4);
        Moto moto = new Moto("Honda", "CBR 600", true);

        // Exemplo de polimorfismo usando métodos sobrescritos
        Veiculo veiculo1 = carro;
        Veiculo veiculo2 = moto;

        veiculo1.ligar();
        veiculo1.acelerar();
        System.out.println(carro);

        veiculo2.ligar();
        veiculo2.acelerar();
        System.out.println(moto);

        // Chamando métodos específicos de Carro e Moto
        
        carro.abrirPortas(); // somente o carro e a moto tem esses métodos, 
        moto.usarCapacete(); // são os específicos de cada classe
        
    }
}
