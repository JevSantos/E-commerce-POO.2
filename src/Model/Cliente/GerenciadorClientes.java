package Model.Cliente;

import java.util.ArrayList;
import java.util.List;

class GerenciadorClientes {

    private List<Cliente> clientes;

    public GerenciadorClientes() {
        this.clientes = new ArrayList<>();
    }

    public void cadastrar(String nome, String documento, String email, String telefone) {
        Cliente cliente = new Cliente(nome, documento, email, telefone);
        clientes.add(cliente);
        System.out.println("Cliente cadastrado: " + cliente);
    }

    public void listarClientes() {
        if (clientes == null || clientes.isEmpty()) {
            System.out.println("\n Não há clientes registrados no sistema.");
        } else {
            System.out.println("\n Lista de Clientes:");
            System.out.println("------------------------------");
            int index = 1;
            for (Cliente cliente : clientes) {
                System.out.println(index++ + ". " + cliente);
            }
            System.out.println("------------------------------\n");
        }
    }

    public void atualizar(String documento, String novoNome, String novoDocumento, String novoEmail, String novoTelefone) {
        for (Cliente cliente : clientes) {
            if (documento.equals(cliente.getDocumento())) {
                cliente.setNome(novoNome);
                cliente.setDocumento(novoDocumento);
                cliente.setEmail(novoEmail);
                cliente.setTelefone(novoTelefone);
                System.out.println("Cliente atualizado: " + cliente);
                return;
            }
        }
        System.out.println("Cliente com documento " + documento + " não encontrado.");
    }
}