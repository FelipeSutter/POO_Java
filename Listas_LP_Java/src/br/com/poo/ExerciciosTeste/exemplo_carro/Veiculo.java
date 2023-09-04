package br.com.poo.ExerciciosTeste.exemplo_carro;

public class Veiculo { // super classe / classe pai
    protected String marca;
    protected String modelo;

    public Veiculo(String marca, String modelo) { // construtor
        this.marca = marca;
        this.modelo = modelo;
    }

    public void ligar() {
        System.out.println("O veículo está ligado.");
    }

    public void desligar() {
        System.out.println("O veículo está desligado.");
    }

    public void acelerar() {
        System.out.println("O veículo está acelerando.");
    }
}
