package Questao10;

public class Computador {
    private String marca;
    private int memoriaRAM;
    private int armazenamento; 
    private Processador processador;
    private String placaDeVideo;

    public Computador(String marca, int memoriaRAM, int armazenamento, Processador processador, String placaDeVideo) {
        this.marca = marca;
        this.memoriaRAM = memoriaRAM;
        this.armazenamento = armazenamento;
        this.processador = processador;
        this.placaDeVideo = placaDeVideo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public int getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(int armazenamento) {
        this.armazenamento = armazenamento;
    }

    public Processador getProcessador() {
        return processador;
    }

    public void setProcessador(Processador processador) {
        this.processador = processador;
    }

    public String getPlacaDeVideo() {

        return placaDeVideo;

    }
    public void trocarProcessador(Processador processador) {

        this.processador = processador;
    }

    public double verificarDesempenho() {
        
        return processador.getFrequencia() * processador.getNumeroNucleos();
    }
}
