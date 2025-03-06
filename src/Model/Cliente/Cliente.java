package Model.Cliente;

public class Cliente {
    protected String nome;
    protected String documento;
    protected String email;
    protected String telefone;

    public Cliente(String nome, String documento, String email, String telefone) {
        this.nome = nome;
        this.documento = documento;
        this.email = email;
        this.telefone = telefone;
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
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }

    public String toString() {
        return String.format("Nome: %s, Documento: %s, Email: %s, Telefone: %s]",
                nome, documento, email, telefone);
    }
}