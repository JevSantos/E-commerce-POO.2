package Model.Produto;

public class ProdutoEletrodomestico extends Produto {
    protected String corProduto;

    public ProdutoEletrodomestico(String nomeProduto,
                                  double precoProduto,
                                  boolean produtoAtivo,
                                  Categoria categoria,
                                  String corProduto) {
        super(nomeProduto, precoProduto, Categoria.Eletrodomestico);
        this.corProduto = corProduto;
    }

    public String getCorProduto() {
        return corProduto;
    }

    public void setOrigem(String origem) {
        this.corProduto = origem;
    }
}