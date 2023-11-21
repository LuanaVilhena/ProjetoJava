import java.util.ArrayList;
public class ListaCadastro {
    private final ArrayList<Cadastro> pessoas = new ArrayList<>();
    private final ArrayList<String> fotos = new ArrayList<String>();
    private final ArrayList<String> projetos = new ArrayList<>();

    public void cadastrarProjeto(String projeto){
        projetos.add(projeto);
        System.out.println("Projeto cadastrado com sucesso!");
    }

    public void cadastrarPessoa(Cadastro pessoa) {
    pessoas.add(pessoa);
    System.out.println("Pessoa cadastrada com sucesso!");
    }

    public void cadastrarFoto(String foto){
        fotos.add(foto);
        System.out.println("Foto cadastrada com sucesso!");
    }
    public void listar() {
        for (Cadastro c : pessoas) {
        System.out.println(c);
        }
    }   public void listarFotos(){
        for(String foto : fotos){
            System.out.println(foto);
        }
    }
   public void listarProjeto(){
    for(String projeto : projetos){
        System.out.println(projeto);
    }
}
}
