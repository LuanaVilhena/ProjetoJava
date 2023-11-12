import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CadastroPessoas pc = new CadastroPessoas();

        while (true) {
        System.out.println("Escolha uma opção:");
        System.out.println("1. Cadastrar Voluntário");
        System.out.println("2. Cadastrar Associação");

        int opcao = scanner.nextInt();
            scanner.nextLine();

        switch (opcao) {
        case 1:
        cadastrarPessoa(pc, new CadVoluntarios(), scanner);
        break;
        case 2:
        cadastrarPessoa(pc, new CadAssociacoes(), scanner);
        //A parte de associações tem que ficar exatamente com esse nome
        break;
        case 3:
        pc.listar();
        break;
        default:
        System.out.println("Opção inválida");
        }
        }
    }
    private static void cadastrarPessoa(CadastroPessoas pc, Cadastro pessoa, Scanner scanner) {
    System.out.println("Digite o nome: ");
    pessoa.setNome(scanner.nextLine());
    System.out.println("Digite o e-mail: ");
    pessoa.setEmail(scanner.nextLine());
    System.out.println("Digite o telefone: ");
    pessoa.setTelefone(scanner.nextLong());
    System.out.println("Digite a idade da pessoa:");
    if (pessoa instanceof CadVoluntarios) {
        System.out.println("Digite a idade: ");
        ((CadVoluntarios) pessoa).setIdade(scanner.nextInt());
        System.out.println("Digite o endereço: ");
        ((CadVoluntarios) pessoa).setEndereco(scanner.next());
        }
    //Adicionar a parte de associações
    pc.cadastrarPessoa(pessoa);
    }
}
