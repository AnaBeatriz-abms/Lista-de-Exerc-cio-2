package Questao03;

public class Aluno {

    private String nome;
    private int idade;
    private String matricula;
    private String email;
    private double mediaFinal;


    public Aluno(){
    }

    public Aluno(String nome, int idade, String matricula, String email, double mediaFinal){

        this.nome = nome;
        this.idade =  idade;
        this.matricula = matricula;
        this.mediaFinal = mediaFinal;

    }

    public String getNome(){

        return nome;
    }

    public int getIdade(){

         return idade;
    }

    public String getMatricula(){

        return matricula;
    }

    public String getEmail() {
        return email;
    }

    public double getMediaFinal(){

        return mediaFinal;
    }
    
}
