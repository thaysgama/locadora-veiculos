import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    static Loja locadora = new Loja("Locadora Veiculos T&M", "000");

    private static void exibirMenu(){
        System.out.println("\n\n");
        System.out.println("+-------------------------------------------+");
        System.out.println("|        Menu de Opções                     |");
        System.out.println("+-------------------------------------------+");
        System.out.println("| 1 - Cadastrar Cliente                     |");
        System.out.println("| 2 - Cadastrar Carro                       |");
        System.out.println("| 3 - Cadastrar Moto                        |");
        System.out.println("| 4 - Locar Veiculo                         |");
        System.out.println("| 5 - Imprimir relatório de clientes        |");
        System.out.println("| 6 - Imprimir relatório de veiculos        |");
        System.out.println("| 7 - Imprimir relatório de locações        |");
        System.out.println("| 8 - Excluir cadastro de cliente           |");
        System.out.println("| 9 - Excluir cadastro de carro             |");
        System.out.println("| 10 - Excluir cadastro de moto             |");
        System.out.println("| 11 - Excluir cadastro de locação          |");
        System.out.println("| 12 - Sair                                 |");
        System.out.println("+-------------------------------------------+");
    }

    public static void main(String[] args) {
        //classe para receber inputs do usuário
        Scanner leitor = new Scanner(System.in);
        int opcao=0;


        while (opcao !=12){
            exibirMenu();
            System.out.print("Opção escolhida: ");
            opcao = leitor.nextInt();

            switch(opcao){
                case 1:
                    cadastrarCliente();
                    break;
                case 2:
                    cadastrarCarro();
                    break;
                case 3:
                    cadastrarMoto();
                    break;
                case 4:
                    cadastrarLocacao();
                    break;
                case 5:
                    locadora.exibirCliente();
                    break;
                case 6:
                    locadora.exibirVeiculo();
                    break;
                case 7:
                    locadora.exibirLocacao();
                    break;
                case 8:
                    excluirCliente();
                    break;
                case 9:
                    excluirCarro();
                    break;
                case 10:
                    excluirMoto();
                    break;
                case 11:
                    excluirLocacao();
                    break;
                case 12:
                    System.out.println("Volte sempre!");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }

    private static void cadastrarCliente(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o nome do cliente");
        String nome = leitor.nextLine();
        System.out.println("Digite o numero do documento");
        String numDoc = leitor.nextLine();
        System.out.println("Digite o telefone para contato");
        String contato = leitor.nextLine();
        locadora.cadastrarCliente(new Cliente(nome,numDoc,contato));
    }

    private static void cadastrarCarro(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a marca:");
        String marca = leitor.nextLine();
        System.out.println("Digite a modelo:");
        String modelo = leitor.nextLine();
        System.out.println("Digite o ano de fabricação:");
        int ano = leitor.nextInt();
        System.out.println("Digite a potência do motor:");
        double motor = leitor.nextDouble();
        System.out.println("Digite se tem ar condicionado(true/false):");
        boolean arCondicionado = leitor.nextBoolean();
        System.out.println("Digite a capacidade de passageiros:");
        int capacidade = leitor.nextInt();
        System.out.println("Digite se tem direção hidráulica(true/false):");
        boolean dirHidraulica = leitor.nextBoolean();
        System.out.println("Digite se tem airbag(true/false):");
        boolean airbag = leitor.nextBoolean();
        System.out.println("Digite a quantidade de portas:");
        int qtPortas = leitor.nextInt();
        locadora.cadastrarCarro(new Carro(marca,modelo,ano,motor,arCondicionado,capacidade,dirHidraulica,airbag,qtPortas));
    }

    private static void cadastrarMoto(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a marca:");
        String marca = leitor.nextLine();
        System.out.println("Digite a modelo:");
        String modelo = leitor.nextLine();
        System.out.println("Digite o ano de fabricação:");
        int ano = leitor.nextInt();
        System.out.println("Digite as cilindradas do motor:");
        double motor = leitor.nextDouble();
        System.out.println("Digite o peso em kg:");
        int peso = leitor.nextInt();
        System.out.println("Digite a altura do banco em cm:");
        int altura = leitor.nextInt();
        locadora.cadastrarMoto(new Moto(marca,modelo,ano,motor,peso,altura));
    }

    private static void cadastrarLocacao(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o número do documento de um cliente cadastrado:");
        String numCliente = leitor.nextLine();
        Cliente cliente = locadora.buscarCliente(numCliente);
        System.out.println("Digite [1] para selecionar Carro ou [2] para Moto.");
        int escolhaVeiculo = leitor.nextInt();
        System.out.println("Digite o código do veículo escolhido:");
        int codVeiculo = leitor.nextInt();
        Veiculo veiculo = locadora.buscarVeiculo(escolhaVeiculo,codVeiculo);
        System.out.println("Digite a data de recebimento do veiculo (YYYY-MM-DD):");
        String dataEmprestimo = leitor.nextLine();
        System.out.println("Digite a data de devolução do veiculo (YYYY-MM-DD):");
        String dataDevolucao = leitor.nextLine();

        //transforma a String no formato 2021-04-23 e transforma em tipo data
        LocalDate localDateRetirada = LocalDate.parse(dataEmprestimo, DateTimeFormatter.ISO_DATE);
        LocalDate localDateDevolucao = LocalDate.parse(dataDevolucao, DateTimeFormatter.ISO_DATE);

        Locacao locacao = new Locacao(cliente, veiculo,localDateRetirada, localDateDevolucao);
        locacao.calcularLocacao();

        locadora.cadastrarLocacao(locacao);

    }

    private static void excluirCliente(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o número do documento do cliente:");
        String numDoc = leitor.nextLine();
        if(locadora.buscarCliente(numDoc) != null){
            locadora.removerCliente(numDoc);
            System.out.println("Cliente removido com sucesso");
        } else {
            System.out.println("Cliente não cadastrado");
        }
    }

    private static void excluirCarro(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o código do carro:");
        int codigo = leitor.nextInt();
        if(locadora.buscarVeiculo(1,codigo) != null){
            locadora.removerCarro(codigo);
            System.out.println("Carro removido com sucesso");
        } else {
            System.out.println("Carro não cadastrado");
        }
    }

    private static void excluirMoto(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o código da moto:");
        int codigo = leitor.nextInt();
        if(locadora.buscarVeiculo(2,codigo) != null){
            locadora.removerMoto(codigo);
            System.out.println("Moto removida com sucesso");
        } else {
            System.out.println("Moto não cadastrada");
        }
    }

    private static void excluirLocacao(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o código da locação:");
        int codigo = leitor.nextInt();
        if(locadora.buscarLocacao(codigo) != null){
            locadora.removerLocacao(codigo);
            System.out.println("Locação removida com sucesso");
        } else {
            System.out.println("Locação não cadastrada");
        }
    }
}
