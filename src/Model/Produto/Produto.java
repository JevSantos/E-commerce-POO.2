package Model.Produto;

import java.util.UUID;

public abstract class Produto {
    protected UUID idProduto;
    protected String nomeProduto;
    protected double precoProduto;
    protected boolean produtoAtivo = true;
    protected Categoria categoria;

    public Produto(String nomeProduto,
                   double precoProduto,
                   Categoria categoria) {
        this.idProduto = UUID.nameUUIDFromBytes(nomeProduto.getBytes());
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
    }

    public boolean validarProdutoAtivo() {
        return produtoAtivo;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public UUID getIdProduto() {
        return idProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto= nomeProduto;
    }

    public void setProdutoAtivo(boolean produtoAtivo) {
        this.produtoAtivo = produtoAtivo;
    }

    @Override
    public String toString() {
        return String.format(
                "%s ID: %s, Nome: %s,\n Valor Base: R$ %.2f, Ativo: %b\n",
                categoria, idProduto.toString(), nomeProduto, precoProduto, produtoAtivo);
    }

}










