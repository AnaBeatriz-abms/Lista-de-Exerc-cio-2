package Questao07;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central", "Rua Principal, 123", 1000, "08:00 - 18:00", 200);

        Usuario usuario1 = new Usuario("Ana Santos", "M001", "123456789", "ana@gmail.com", "01/01/1990");
        Usuario usuario2 = new Usuario("Carlos Almeida", "M002", "987654321", "carlos@gmail.com", "02/02/1985");
        Usuario usuario3 = new Usuario("Mariana Costa", "M003", "456123789", "mariana@gmail.com", "03/03/1992");

        biblioteca.adicionarUsuario(usuario1);
        biblioteca.adicionarUsuario(usuario2);
        biblioteca.adicionarUsuario(usuario3);

        biblioteca.removerUsuario("M002");
        biblioteca.listarUsuarios();
    }
}
