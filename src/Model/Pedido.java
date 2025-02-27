package Model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Pedido {
private int IdPedido;
private Cliente nomeCliente;
private StatusPedido statusPedido;
private LocalDate dataPedido;
ArrayList<Produto> itens = new ArrayList<>();

public Pedido(int idPedido, Cliente nomeCliente, StatusPedido status, LocalDate dataPedido, ArrayList<Produto> itens) {
    IdPedido = idPedido;
    this.nomeCliente = nomeCliente;
    statusPedido = status;
    this.dataPedido = dataPedido;
    this.itens = itens;
}
    //public Pedido() { }
    //public void remover(Produto produto) { }
public void alterarQuantidade(Produto produto) {

}
public void realizarPagamento () {

}
public void realizarEntrega() {}
}
