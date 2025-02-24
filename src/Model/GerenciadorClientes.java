package Model;

import java.util.ArrayList;
import java.util.List;

class GerenciadorClientes {

    private List<Cliente> clientes;

    public GerenciadorClientes() {
        this.clientes = new ArrayList<>();
    }

    public void cadastrar(String nome, String documento) {
        Cliente cliente = new Cliente(nome, documento);
        clientes.add(cliente);
        System.out.println("Model.Cliente cadastrado: " + cliente);
    }

    public void listar() {
        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
        } else {
            System.out.println("Lista de clientes:");
            clientes.forEach(System.out::println);
        }
    }

    public void atualizar(String documento, String novoNome, String novoDocumento) {
        for (Cliente cliente : clientes) {
            if (cliente.getDocumento().equals(documento)) {
                cliente.setNome(novoNome);
                cliente.setDocumento(novoDocumento);
                System.out.println("Model.Cliente atualizado: " + cliente);
                return;
            }
        }
        System.out.println("Model.Cliente com documento " + documento + " não encontrado.");
    }
}