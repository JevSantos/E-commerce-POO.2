package Model.Produto;

public class ProdutoTecnologia extends Produto {
    protected String paisOrigem;

    public ProdutoTecnologia(String nomeProduto,
                             double precoProduto,
                             boolean produtoAtivo,
                             Categoria categoria,
                             String paisOrigem) {
            super(nomeProduto, precoProduto, Categoria.Tecnologia);
            this.paisOrigem = paisOrigem;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }
}
