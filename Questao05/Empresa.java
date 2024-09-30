package Questao05;


import java.util.ArrayList;

public class Empresa {
    private String nome;
    private String cnpj;
    private int numeroFuncionarios;
    private String cidadeSede;
    private double faturamentoAnual;
    private ArrayList<Departamento> departamentos;

   
    public Empresa(String nome, String cnpj, int numeroFuncionarios, String cidadeSede, double faturamentoAnual) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.numeroFuncionarios = numeroFuncionarios;
        this.cidadeSede = cidadeSede;
        this.faturamentoAnual = faturamentoAnual;
        this.departamentos = new ArrayList<>(); // Inicializando a lista de departamentos
    }

    
    public void adicionarDepartamento(Departamento departamento) {
        departamentos.add(departamento);
    }

    
    public void listarDepartamentos() {
        
        if (departamentos.isEmpty()) {

            System.out.println("Nenhum departamento cadastrado na empresa " + nome);

        } else {

            System.out.println("Lista de departamentos da empresa " + nome + ":");

            for (Departamento departamento : departamentos) {

                System.out.println("Nome: " + departamento.getNome() + ", Código: " + departamento.getCodigo() + ", Número de Funcionários: " + departamento.getNumeroFuncionarios() + ", Orçamento Anual: " + departamento.getOrcamentoAnual() + ", Gerente Responsável: " + departamento.getGerenteResponsavel());
            }
        }
    }
}
