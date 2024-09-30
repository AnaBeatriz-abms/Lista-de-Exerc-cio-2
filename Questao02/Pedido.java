package Questao02;

public class Pedido {

    
        public void adicionarCliente(Cliente cliente) {
            System.out.println("Cliente: " + cliente.getNome() +  ", Pedido: " + cliente.getPedido() + ", Valor total: R$" + cliente.getValorTotal());
            
        }
    }
    
