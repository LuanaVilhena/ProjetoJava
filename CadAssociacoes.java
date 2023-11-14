public class CadAssociacoes extends Cadastro{
    private int cnpj;

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public int getCnpj() {
        return cnpj;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tipo: Associado" + " CNPJ: " + cnpj;
    }
}
