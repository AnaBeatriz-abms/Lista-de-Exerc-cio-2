package Questao02;


public class Cliente {
    private String nome;
    private String pedido;
    private double valorTotal;


    public Cliente(String nome, String pedido, double valorTotal) {
        this.nome = nome;
        this.pedido = pedido;
        this.valorTotal = valorTotal;
    }

    
    public String getNome() {
        return nome;
    }

    public String getPedido() {
        return pedido;
    }

    public double getValorTotal() {
        return valorTotal;
    }
}
