public class Cadastro {
    private String nome;
    private String email;
    private long telefone;

    public String getNome() {
    return nome;
    }

    public String getEmail() {
        return email;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNome(String nome) {
    this.nome = nome;
    }

    @Override
    public String toString() {
    return "Nome: " + nome + "E-mail: " + email + "Telefone: " + telefone;
    }
}
