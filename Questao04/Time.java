package Questao04;

import java.util.ArrayList;

public class Time {
    private String nome;
    private String cidade;
    private int fundacao;
    private String estadio;
    private int numeroTitulos;
    private ArrayList<Jogador> jogadores;

    public Time(){
        
    }
    public Time(String nome, String cidade, int fundacao, String estadio, int numeroTitulos) {
        this.nome = nome;
        this.cidade = cidade;
        this.fundacao = fundacao;
        this.estadio = estadio;
        this.numeroTitulos = numeroTitulos;
        this.jogadores = new ArrayList<>(); // Inicializando a lista de jogadores
    }


    public void adicionarJogador(Jogador jogador) {
        jogadores.add(jogador);
    }

    public void listarJogadores() {
        if (jogadores.isEmpty()) {
            System.out.println("Nenhum jogador cadastrado no time " + nome);
        } else {
            System.out.println("Lista de jogadores do time " + nome + ":");
            for (Jogador jogador : jogadores) {

                System.out.println("Nome: " + jogador.getNome() +  ", Posição: " + jogador.getPosicao() + ", Camisa Nº: " + jogador.getNumeroCamisa() + ", Gols Marcados: " + jogador.getGolsMarcados() +", Altura: " + jogador.getAltura());
            }
        }
    }
}
