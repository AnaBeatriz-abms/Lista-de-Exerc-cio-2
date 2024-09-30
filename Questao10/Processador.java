package Questao10;

public class Processador {
    private String modelo;
    private double frequencia; // em GHz
    private int numeroNucleos;
    private double cache; // em MB
    private String fabricante;

    public Processador(String modelo, double frequencia, int numeroNucleos, double cache, String fabricante) {
        this.modelo = modelo;
        this.frequencia = frequencia;
        this.numeroNucleos = numeroNucleos;
        this.cache = cache;
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(double frequencia) {
        this.frequencia = frequencia;
    }

    public int getNumeroNucleos() {
        return numeroNucleos;
    }

    public void setNumeroNucleos(int numeroNucleos) {
        this.numeroNucleos = numeroNucleos;
    }

    public double getCache() {
        return cache;
    }

    public void setCache(double cache) {
        this.cache = cache;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
}
