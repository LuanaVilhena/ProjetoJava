public class CadVoluntarios extends Cadastro {

    private int idade;
    private String endereco;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
    return super.toString() + ", Tipo: Voluntário" + " Idade: " + idade + " Endereço: " + endereco;
    }
}
