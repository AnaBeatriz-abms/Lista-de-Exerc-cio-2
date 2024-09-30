package Questao01;

public class Main {

    public static void main(String[] args) {
       
        Biblioteca biblioteca = new Biblioteca();

       
        Livro livro1 = new Livro("A Culpa é das estrelas", "Joice");
        Livro livro2 = new Livro("Trono de Vidro", "Sarah j Mass");

        
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
    }
}
