import Model.Cliente.Cliente;
import Model.Pedido.Pedido;
import Model.Produto.Produto;

import java.util.ArrayList;
import java.util.List;

public class AppLoja{

    public static void main(String[] args) {
            // Exemplo de uso
           // Cliente cliente = new Cliente("João", "12345678900");
           // Produto produto = new Produto("Laptop", 3000);

            List<Cliente> clientes = new ArrayList<>();
            clientes.add(cliente);
           // Persistencia.salvarDadosClientes(clientes);

            List<Produto> produtos = new ArrayList<>();
            produtos.add(produto);
         //   Persistencia.salvarDadosProdutos(produtos);

            Pedido pedido = new Pedido(cliente.getNome());
        //    pedido.addItemPedido(produto, 1, 2800);

            List<Pedido> pedidos = new ArrayList<>();
            pedidos.add(pedido);
         //   Persistencia.salvarDadosPedidos(pedidos);
        }










       /* System.out.println("***************  Bem vindo ao App Loja  ***************");
        System.out.println("\tSelecione uma opção");

        String menu1 = "\t1 - Operações Administrativas\n\t2 - Ir para Lojas\n\t3 - Sair";
        System.out.printf(menu1);

        */

        // to do opções administrativas
        //to do: add/listar cliente
        //to do: add/listar produto
        //to do: listar pedidos


        // Opções Loja
        // to do fazer pedido/pagar
        // to do listar produtos
        // to do listar pedido do cliente
        // to do listar evento de entrega pós-pagamento








    }


}

