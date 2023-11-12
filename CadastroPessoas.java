import java.util.ArrayList;
public class CadastroPessoas {
    private final ArrayList<Cadastro> pessoas = new ArrayList<>();

    public void cadastrarPessoa(Cadastro pessoa) {
    pessoas.add(pessoa);
    System.out.println("Pessoa cadastrada com sucesso!");
    }
    public void listar() {
    for (Cadastro c : pessoas) {
    System.out.println(c);
    }
    }
}
