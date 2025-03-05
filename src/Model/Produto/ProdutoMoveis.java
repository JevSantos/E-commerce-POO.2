package Model.Produto;

public class ProdutoMoveis extends Produto {
    private String material;

    public ProdutoMoveis(String nomeProduto,
                          double precoProduto,
                          boolean produtoAtivo,
                          Categoria categoria,
                          String material) {
        super(nomeProduto, precoProduto, Categoria.Moveis);
        this.nomeProduto = nomeProduto;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}