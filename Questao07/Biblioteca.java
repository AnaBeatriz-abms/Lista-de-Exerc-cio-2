package Questao07;

import java.util.ArrayList;

public class Biblioteca {
    private String nome;
    private String endereco;
    private int numeroLivros;
    private String horarioFuncionamento;
    private int capacidadeUsuarios;
    private ArrayList<Usuario> usuarios;

    public Biblioteca(String nome, String endereco, int numeroLivros, String horarioFuncionamento, int capacidadeUsuarios) {
        this.nome = nome;
        this.endereco = endereco;
        this.numeroLivros = numeroLivros;
        this.horarioFuncionamento = horarioFuncionamento;
        this.capacidadeUsuarios = capacidadeUsuarios;
        this.usuarios = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getNumeroLivros() {
        return numeroLivros;
    }

    public void setNumeroLivros(int numeroLivros) {
        this.numeroLivros = numeroLivros;
    }

    public String getHorarioFuncionamento() {
        return horarioFuncionamento;
    }

    public void setHorarioFuncionamento(String horarioFuncionamento) {
        this.horarioFuncionamento = horarioFuncionamento;
    }

    public int getCapacidadeUsuarios() {
        return capacidadeUsuarios;
    }

    public void setCapacidadeUsuarios(int capacidadeUsuarios) {
        this.capacidadeUsuarios = capacidadeUsuarios;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void removerUsuario(String matricula) {
        usuarios.removeIf(usuario -> usuario.getMatricula().equals(matricula));
    }

    public void listarUsuarios() {
        if (usuarios.isEmpty()) {
            System.out.println("Nenhum usuário cadastrado na biblioteca " + nome);
        } else {
            System.out.println("Lista de usuários da biblioteca " + nome + ":");
            for (Usuario usuario : usuarios) {
                System.out.println("Nome: " + usuario.getNome() + ", Matrícula: " + usuario.getMatricula() +
                                   ", Telefone: " + usuario.getTelefone() + ", Email: " + usuario.getEmail() +
                                   ", Data de Nascimento: " + usuario.getDataNascimento());
            }
        }
    }
}

