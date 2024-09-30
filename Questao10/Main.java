package Questao10;

public class Main {
    public static void main(String[] args) {
        Processador processador1 = new Processador("Intel Core i7", 3.5, 8, 12, "Intel");
        Computador computador = new Computador("Dell", 16, 512, processador1, "NVIDIA GTX 1650");

        double desempenhoAntes = computador.verificarDesempenho();
        System.out.println("Desempenho antes da troca: " + desempenhoAntes);

        Processador processador2 = new Processador("AMD Ryzen 7", 3.9, 8, 16, "AMD");
        computador.trocarProcessador(processador2);

        double desempenhoDepois = computador.verificarDesempenho();
        System.out.println("Desempenho depois da troca: " + desempenhoDepois);
    }
}
