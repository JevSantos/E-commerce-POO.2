package Model.Pedido;

import Model.Cliente.Cliente;
import Model.Produto.Produto;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Pedido {
private UUID IdPedido;
public Cliente nomeCliente;
public StatusPedido statusPedido;
private LocalDate dataPedido;
private List<ItemPedido> itens;

public Pedido(String nomeCliente) {
    this.IdPedido = UUID.randomUUID();
    this.nomeCliente = new Cliente(nomeCliente);
    this.dataPedido = LocalDate.now();
    this.statusPedido = StatusPedido.ABERTO;
    this.itens = new ArrayList<>();
}

public void addItemPedido(Produto produto, int quantidade, double preco) {
    itens.add(new ItemPedido(produto, quantidade, preco));
}

public void removerItem(Produto produto) {
    itens.removeIf(item -> item.getNomeProduto().equals(produto));
}

public void alterarQuantidade(Produto produto, int novaQuantidade) {
    for (ItemPedido item : itens) {
        if (item.getNomeProduto().equals(produto)) {
            item.setQuantidade(novaQuantidade);
        }
    }
}

public void realizarPagamento () {
    //Todo
}
public void realizarEntrega() {}
    //Todo
}
