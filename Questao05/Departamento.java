package Questao05;

public class Departamento {
    private String nome;
    private String codigo;
    private int numeroFuncionarios;
    private double orcamentoAnual;
    private String gerenteResponsavel;

  
    public Departamento(String nome, String codigo, int numeroFuncionarios, double orcamentoAnual, String gerenteResponsavel) {
        this.nome = nome;
        this.codigo = codigo;
        this.numeroFuncionarios = numeroFuncionarios;
        this.orcamentoAnual = orcamentoAnual;
        this.gerenteResponsavel = gerenteResponsavel;
    }

   
    public String getNome() {
        return nome;
    }
    

    public String getCodigo() {
        return codigo;
    }

    public int getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    public double getOrcamentoAnual() {
        return orcamentoAnual;
    }

    public String getGerenteResponsavel() {
        return gerenteResponsavel;
    }
}
