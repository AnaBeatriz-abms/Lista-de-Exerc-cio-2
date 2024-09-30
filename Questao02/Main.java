package Questao02;

public class Main {
    public static void main(String[] args) {
        
        Cliente c1 = new Cliente("Rogerio", "Celular", 3000.0);
        Cliente c2 = new Cliente("Ágata", "Microfone", 250.0);

        Pedido pedido = new Pedido();

        
        pedido.adicionarCliente(c1);
        pedido.adicionarCliente(c2);
    }
}
