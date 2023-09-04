package br.com.poo.ExerciciosTeste.ExCarro;

public class Moto extends Veiculo {
    private boolean capacete;

    public Moto(String marca, String modelo, boolean capacete) { // construtor
        super(marca, modelo); // serve para pegar os atributos da super classe
        this.capacete = capacete;
    }

    @Override // Override sempre quando for mudar um método já herdado
    public void acelerar() {
        System.out.println("A moto está acelerando.");
    }

    public void usarCapacete() {
        System.out.println("O motociclista está usando capacete.");
    }

	@Override
	public String toString() {
		return "Moto [capacete=" + capacete + "]";
	}
}
