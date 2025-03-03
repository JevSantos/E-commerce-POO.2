package Model;

class Cliente {
    private String nome;
    private String documento;

    public Cliente(String nome) {
        this.nome = nome;
        this.documento = documento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    @Override
    public String toString() {
        return "Model.Cliente{nome='" + nome + "', documento='" + documento + "'}";
    }
}