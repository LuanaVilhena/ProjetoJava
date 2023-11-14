import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CadastroPessoas pc = new CadastroPessoas();

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Cadastrar Voluntário");
            System.out.println("2. Cadastrar Associação");
            System.out.println("3. Listar Pessoas");
            System.out.println("4, Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarPessoa(pc, new CadVoluntarios(), scanner);
                    break;
                case 2:
                    cadastrarPessoa(pc, new CadAssociacoes(), scanner);
                    break;
                case 3:
                    pc.listar();
                    break;
                case 4:
                    System.out.println("Saindo");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
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

        if (pessoa instanceof CadVoluntarios) {
            System.out.println("Digite a idade: ");
            ((CadVoluntarios) pessoa).setIdade(scanner.nextInt());
            System.out.println("Digite o endereço: ");
            ((CadVoluntarios) pessoa).setEndereco(scanner.next());
        }
        else if (pessoa instanceof CadAssociacoes) {
            System.out.println("Digite a idade");
            ((CadAssociacoes) pessoa).setIdade(scanner.nextInt());
            System.out.println("Digite o endereço:");
            ((CadAssociacoes) pessoa).setEndereco(scanner.next());
            System.out.println("Digite o CNPJ:");
            ((CadAssociacoes) pessoa).setCnpj(scanner.nextInt());
        }

        pc.cadastrarPessoa(pessoa);
    }
}
