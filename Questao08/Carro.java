package Questao08;

public class Carro {
    private String modelo;
    private int ano;
    private String cor;
    private Motor motor;
    private double velocidadeAtual;

    public Carro(String modelo, int ano, String cor, Motor motor) {
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.motor = motor;
        this.velocidadeAtual = 0;
    }

    public void mostrarDetalhes() {
        System.out.println("Modelo: " + modelo + ", Ano: " + ano + ", Cor: " + cor);
        System.out.println("Motor: " + motor.getTipo() + ", Potência: " + motor.getPotencia() + " HP");
    }

    public void verificarVelocidadeMaxima() {
        double velocidadeMaxima = motor.getPotencia() * 2; // Exemplo simples de cálculo
        System.out.println("A velocidade máxima do carro é: " + velocidadeMaxima + " km/h");
    }
}
