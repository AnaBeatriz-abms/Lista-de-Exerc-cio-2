package Questao03;

import java.util.ArrayList;

public class Curso {

    private String nome;
    private String codigo;
    private int duracao;
    private String descricao;
    private int cargaHoraria;
    private ArrayList<Aluno> alunos;


    public Curso(String nome, String codigo, int duracao, String descricao, int cargaHoraria, ArrayList<Aluno> alunos){
                       
        this.nome = nome;
        this.codigo = codigo;
        this.duracao = duracao;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
        this.alunos = new ArrayList<>();

    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void listarAlunos() {
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
        } else {
            System.out.println("Lista de alunos cadastrados no curso " + nome + ":");
            for (Aluno aluno : alunos) {
                System.out.println("Nome: " + aluno.getNome() + ", Matrícula: " + aluno.getMatricula());
            }
        }
    }
}
