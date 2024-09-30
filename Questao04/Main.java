package Questao04;

public class Main {
    public static void main(String[] args) {

        Time time = new Time("Seleção Brasileira", "Brasil", 1914, "Maracanã", 5);

        
        Jogador jogador1 = new Jogador("Neymar Jr.", "Atacante", 10, 77, 1.75);
        Jogador jogador2 = new Jogador("Alisson Becker", "Goleiro", 1, 0, 1.93);
        Jogador jogador3 = new Jogador("Casemiro", "Volante", 5, 11, 1.85);


        time.adicionarJogador(jogador1);
        time.adicionarJogador(jogador2);
        time.adicionarJogador(jogador3);

        
        time.listarJogadores();
    }
}