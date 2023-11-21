import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaCadastro pc = new ListaCadastro();

        boolean naoSair = true;
        while (naoSair) {
        System.out.println("Escolha uma opção:");
        System.out.println("1. Cadastrar Voluntário");
        System.out.println("2. Cadastrar Associação");
        System.out.println("3. Listar cadastros");
        System.out.println("4. Fotos");
        System.out.println("5. Projetos");
        System.out.println("6. Sair");

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
            fotos(pc, new Fotos(), scanner);
            break;
        case 5:
            projetos(pc, new Projetos(), scanner);

        case 6:
            naoSair = false;
            break;
        default:
        System.out.println("Opção inválida");
        }
        }
    }
    public static void fotos(ListaCadastro pc, Fotos foto, Scanner scanner){
        System.out.println("1. Ver todas as imagens");
        System.out.println("2. Cadastrar Imagem");
        int escolher = scanner.nextInt();
        switch (escolher) {
            case 1:
                pc.listarFotos();
                break;
            case 2:
                System.out.println("Nome para a imagem cadastrada: ");
                foto.setFoto(scanner.nextLine());

                System.out.println("Informe a data da foto: ");
                foto.setData(Integer.parseInt(scanner.next()));
                System.out.println("Nome da pessoa que tirou a foto: ");
                foto.setResponsavel(scanner.next());
                String novaFoto = foto.cadstrarFoto();

                pc.cadastrarFoto(novaFoto);
                break;
            default:
                System.out.println("Opção invalida!");
        }


    }
    public static void projetos(ListaCadastro pc, Projetos projeto, Scanner scanner){
        System.out.println("1. Listar Projetos");
        System.out.println("2. Cadastrar Projetos");
        int escolher = scanner.nextInt();
        switch (escolher) {
            case 1:
                pc.listarProjeto();
                break;
            case 2:
                System.out.println("Nome do projeto: ");
                projeto.setNomeProjeto(scanner.nextLine());
                System.out.println("Instituição que o projeto é vinculado: ");
                projeto.setInstituicao(scanner.next());
                System.out.println("Destinado a: ");
                projeto.setDestinadoA(scanner.next());
                String novoProjeto = projeto.cadastrarProjeto();
                pc.cadastrarProjeto(novoProjeto);
                break;
            default:
                System.out.println("Opção invalida!");
        }


    }
    private static void cadastrarPessoa(ListaCadastro pc, Cadastro pessoa, Scanner scanner) {
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
        pc.cadastrarPessoa(pessoa);
        }
    if (pessoa instanceof CadAssociacoes) {
        System.out.println("Digite o CNPJ:");
        ((CadAssociacoes) pessoa).setCnpj(scanner.nextInt());
        pc.cadastrarPessoa(pessoa);
    }
    }
}
