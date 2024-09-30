package Questao09;

public class Comodo {
    private String nome;
    private double largura;
    private double comprimento;
    private String tipo;
    private int janelas;

    public Comodo(String nome, double largura, double comprimento, String tipo, int janelas) {
        this.nome = nome;
        this.largura = largura;
        this.comprimento = comprimento;
        this.tipo = tipo;
        this.janelas = janelas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getJanelas() {
        return janelas;
    }

    public void setJanelas(int janelas) {
        this.janelas = janelas;
    }

    public double calcularArea() {
        return largura * comprimento;
    }
}
