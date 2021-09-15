import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        //classe para receber inputs do usuário
        Scanner leitor = new Scanner(System.in);

        Moto moto = new Moto("prata",2018,"00", "250cc", 200,85);

//        LocalDateTime localDateTime1 = LocalDateTime.of(2021, 11, 15, 10, 15);
//        LocalDateTime localDateTime2 = LocalDateTime.of(2021, 11, 20, 13, 0);
        LocalDate localDate1 = LocalDate.of(2021, 11, 15);
        LocalDate localDate2 = LocalDate.of(2021, 11, 20);
        long period1 = ChronoUnit.DAYS.between(localDate1, localDate2);

        Cliente cli = new Cliente("thays", "001", "8599656801");
        Carro carro = new Carro("preto", 2018, "54y", "1.0", true, 5, true, true, 4);

        System.out.println(moto);
        Loja locadora = new Loja("LocaVeic", "000");
        locadora.cadastrarLocacao(new Locacao(cli,carro,localDate1,localDate2));
        locadora.cadastrarLocacao(new Locacao(cli,carro,localDate1,localDate2));

        locadora.exibirLocacao();

        //esquecemos de colocar marca e modelo dos veiculos -
        System.out.println(period1);
        //inputs do cadastro da locacao
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

        locadora.cadastrarLocacao(new Locacao(cliente, veiculo,localDateRetirada, localDateDevolucao));

    }

}
