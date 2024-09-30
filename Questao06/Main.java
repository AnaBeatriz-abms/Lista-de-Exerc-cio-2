package Questao06;

public class Main {
    public static void main(String[] args) {


        Disciplina disciplina = new Disciplina("Matemática", "MAT101", 60, "Graduação", "Estudo de conceitos matemáticos fundamentais");

        Professor professor1 = new Professor("João Silva", "Matemática Aplicada", "Doutor", 40, 5000.00);
        Professor professor2 = new Professor("Maria Oliveira", "Geometria", "Mestre", 35, 4500.00);
        Professor professor3 = new Professor("Carlos Santos", "Cálculo", "Doutor", 50, 6000.00);

        disciplina.adicionarProfessor(professor1);
        disciplina.adicionarProfessor(professor2);
        disciplina.adicionarProfessor(professor3);

        disciplina.listarProfessores();
        
        Professor maiorSalario = disciplina.obterProfessorComMaiorSalario();

        if (maiorSalario != null) {

            System.out.println("Professor com o maior salário: " + maiorSalario.getNome() + ", Salário: " + maiorSalario.getSalario());
        
        }
    }
}
