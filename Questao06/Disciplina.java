package Questao06;


import java.util.ArrayList;

public class Disciplina {
    private String nome;
    private String codigo;
    private int cargaHoraria;
    private String nivel;
    private String descricao;
    private ArrayList<Professor> professores;

    public Disciplina(String nome, String codigo, int cargaHoraria, String nivel, String descricao) {
        this.nome = nome;
        this.codigo = codigo;
        this.cargaHoraria = cargaHoraria;
        this.nivel = nivel;
        this.descricao = descricao;
        this.professores = new ArrayList<>();
    }

    public void adicionarProfessor(Professor professor) {
        professores.add(professor);
    }

    public void listarProfessores() {

        if (professores.isEmpty()) {

            System.out.println("Nenhum professor cadastrado na disciplina " + nome);

        } else {

            System.out.println("Lista de professores da disciplina " + nome + ":");

            for (Professor professor : professores) {

                System.out.println("Nome: " + professor.getNome() + ", Especialidade: " + professor.getEspecialidade() + ", Titulação: " + professor.getTitulacao() +  ", Idade: " + professor.getIdade() + ", Salário: " + professor.getSalario());
            }
        }
    }

    public Professor obterProfessorComMaiorSalario() {

        if (professores.isEmpty()) {

            return null;
        }
        Professor professorMaiorSalario = professores.get(0);

        for (Professor professor : professores) {

            if (professor.getSalario() > professorMaiorSalario.getSalario()) {

                professorMaiorSalario = professor;
            }
        }
        return professorMaiorSalario;
    }
}
