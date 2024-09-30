package Questao01;

public class Biblioteca {

    
    public void adicionarLivro(Livro livro) {
        System.out.println("O livro '" + livro.getTitulo() + " de " + livro.getAutor() + " foi adicionado à biblioteca.");
    }
}
