package br.com.poo.ExerciciosTeste.ExCarro;

public class Carro extends Veiculo {
    private int numeroPortas;

    public Carro(String marca, String modelo, int numeroPortas) { // construtor
        super(marca, modelo); // serve para pegar os atributos da super classe
        this.numeroPortas = numeroPortas;
    }

    @Override // Override sempre quando for mudar um método já herdado
    public void acelerar() {
        System.out.println("O carro está acelerando.");
    }

    public void abrirPortas() {
        System.out.println("As portas do carro estão abertas.");
    }

	@Override
	public String toString() {
		return "Carro [numeroPortas=" + numeroPortas + "]";
	}
}
