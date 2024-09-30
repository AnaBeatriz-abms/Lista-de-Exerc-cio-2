package Questao09;

public class Main {
    public static void main(String[] args) {
        
        Casa casa = new Casa("Rua das Flores, 123", 4, 500, "João");

        Comodo comodo1 = new Comodo("Sala", 5, 4, "Sala", 2);
        Comodo comodo2 = new Comodo("Cozinha", 4, 3, "Cozinha", 1);
        Comodo comodo3 = new Comodo("Quarto", 4, 4, "Quarto", 1);

        casa.adicionarComodo(comodo1);
        casa.adicionarComodo(comodo2);
        casa.adicionarComodo(comodo3);

        casa.removerComodo("Cozinha");

        double areaTotal = casa.calcularAreaTotal();

        System.out.println("Área total da casa: " + areaTotal + " m²");
    }
}
