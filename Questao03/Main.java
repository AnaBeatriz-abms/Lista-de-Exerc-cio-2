package Questao03;

public class Main {
    
    public static void main(String[] args) {
        
        Curso curso = new Curso("Engenharia de Software", "ES2024", 8, "Curso focado em desenvolvimento de software", 3600, null);

        
        Aluno aluno1 = new Aluno("João Silva", 30, "2024001", "joao.silva@email.com", 8.5);
        Aluno aluno2 = new Aluno("Maria Oliveira", 21, "2024002", "maria.oliveira@email.com", 9.0);
        Aluno aluno3 = new Aluno("Carlos Souza", 25, "2024003", "carlos.souza@email.com", 7.5);

        
        curso.adicionarAluno(aluno1);
        curso.adicionarAluno(aluno2);
        curso.adicionarAluno(aluno3);

        
        curso.listarAlunos();
    }
}
