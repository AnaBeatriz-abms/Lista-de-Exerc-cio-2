package Questao08;

public class Main {
    public static void main(String[] args) {
        Motor motor1 = new Motor("Gasolina", 2.0, 150, "Fabricante A", 10.0);
        Motor motor2 = new Motor("Diesel", 3.0, 200, "Fabricante B", 8.0);

        Carro carro1 = new Carro("Cronos", 2020, "Preto", motor1);
        Carro carro2 = new Carro("Fusca", 2021, "Branco", motor2);

        carro1.mostrarDetalhes();
        carro1.verificarVelocidadeMaxima();

        carro2.mostrarDetalhes();
        carro2.verificarVelocidadeMaxima();
    }
}
