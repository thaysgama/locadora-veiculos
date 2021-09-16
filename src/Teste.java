public class Teste {
    public static void main(String[] args) {
        Cliente cli = new Cliente("thays", "001", "8599656801");

//        Carro carro = new Carro("preto", 2018, "54y", "1.0", true, 5, true, true, 4);
//        Moto moto = new Moto("prata",2018,"00", "250cc", 200,85);

        Loja locadora = new Loja("LocaVeic", "000");

        locadora.cadastrarCliente(cli);
//        locadora.cadastrarCarro(carro);
//        locadora.cadastrarMoto(moto);

        locadora.exibirVeiculo();

        System.out.println(locadora.buscarCliente("001"));
        System.out.println(locadora.buscarVeiculo(1,1));
    }
}