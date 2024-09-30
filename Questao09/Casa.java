package Questao09;

import java.util.ArrayList;

public class Casa {
    private String endereco;
    private int numeroComodos;
    private double tamanhoTerreno;
    private ArrayList<Comodo> comodos;
    private String proprietario;

    public Casa(String endereco, int numeroComodos, double tamanhoTerreno, String proprietario) {
        this.endereco = endereco;
        this.numeroComodos = numeroComodos;
        this.tamanhoTerreno = tamanhoTerreno;
        this.proprietario = proprietario;
        this.comodos = new ArrayList<>();
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getNumeroComodos() {
        return numeroComodos;
    }

    public void setNumeroComodos(int numeroComodos) {
        this.numeroComodos = numeroComodos;
    }

    public double getTamanhoTerreno() {
        return tamanhoTerreno;
    }

    public void setTamanhoTerreno(double tamanhoTerreno) {
        this.tamanhoTerreno = tamanhoTerreno;
    }

    public ArrayList<Comodo> getComodos() {
        return comodos;
    }

    public void setComodos(ArrayList<Comodo> comodos) {
        this.comodos = comodos;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public void adicionarComodo(Comodo comodo) {
        comodos.add(comodo);
    }

    public void removerComodo(String nomeComodo) {
        
        comodos.removeIf(comodo -> comodo.getNome().equals(nomeComodo));
    }

    public double calcularAreaTotal() {

        double areaTotal = 0;

        for (Comodo comodo : comodos) {

            areaTotal += comodo.calcularArea();
        }

        return areaTotal;
    }
}
