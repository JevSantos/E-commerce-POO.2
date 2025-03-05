package Model.Pedido;

import Model.Produto.Produto;

public class ItemPedido {
    protected Produto nomeProduto;
    protected int quantidade;
    protected double preco;;

    public ItemPedido(Produto nomeProduto, int quantidade, double preco) {
        this.nomeProduto = nomeProduto;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public Produto getNomeProduto() {
        return nomeProduto;
    }

     public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
