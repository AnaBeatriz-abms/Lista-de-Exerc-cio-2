package Questao05;


public class Main {
    public static void main(String[] args) {
        

        Empresa empresa = new Empresa("Tech Solutions", "12.345.678/0001-99", 500, "São Paulo", 10000000.00);

      
        Departamento departamento1 = new Departamento("Desenvolvimento", "DEV001", 100, 5000000.00, "Ana Silva");
        Departamento departamento2 = new Departamento("Recursos Humanos", "RH002", 30, 1000000.00, "Carlos Souza");
        Departamento departamento3 = new Departamento("Marketing", "MKT003", 50, 2000000.00, "Maria Oliveira");

      
        empresa.adicionarDepartamento(departamento1);
        empresa.adicionarDepartamento(departamento2);
        empresa.adicionarDepartamento(departamento3);

      
        empresa.listarDepartamentos();
    }
}

