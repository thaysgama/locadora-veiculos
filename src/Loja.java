import java.util.ArrayList;
import java.util.Collections;

public class Loja {

    private String nome;
    private String cnpj;
    private ArrayList<Carro>listaCarros = new ArrayList<>();
    private ArrayList<Moto>listaMotos = new ArrayList<>();
    private ArrayList<Locacao>listaLocacao = new ArrayList<>();
    private ArrayList<Cliente>listaClientes = new ArrayList<>();


    public Loja(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;

    }

    //métodos
    public void cadastrarCliente(Cliente cliente){
        listaClientes.add(cliente);
        System.out.println("Cliente cadastrado com sucesso!");
    }

    public void cadastrarCarro(Carro carro){
        listaCarros.add(carro);
        System.out.println("Carro cadastrado com sucesso!");
    }

    public void cadastrarMoto(Moto moto){
        listaMotos.add(moto);
        System.out.println("Moto cadastrada com sucesso!");
    }

    public void cadastrarLocacao(Locacao locacao){

        listaLocacao.add(locacao);
        System.out.println("Locação realizada com sucesso!");
    }

    public void exibirLocacao(){
        for (Locacao locacao : listaLocacao){
            System.out.println(locacao);
        }
    }

    public void exibirVeiculo(){
        Collections.sort(listaCarros);
        Collections.sort(listaMotos);
        for(Carro carro: listaCarros){
            System.out.println(carro);
        }
        for(Moto moto: listaMotos){
            System.out.println(moto);
        }
    }

    public void exibirCliente(){
        for(Cliente cliente : listaClientes){
            System.out.println(cliente);
        }
    }

    public void removerLocacao(int codigo){
        listaLocacao.removeIf(locacao -> locacao.getCodigo() == codigo);
    }

    public void removerCliente(String numDocumento){
        listaClientes.removeIf(cliente -> cliente.getNumDocumento().equals(numDocumento));
    }

    public void removerMoto(int codigo){
        listaMotos.removeIf(moto -> moto.getCodigo() == codigo);
    }

    public void removerCarro(int codigo){
        listaCarros.removeIf(carro -> carro.getCodigo() == codigo);
    }

    public Cliente buscarCliente(String numDocumento){
        for (Cliente cliente : listaClientes){
            if(cliente.getNumDocumento().equals(numDocumento)){
                return cliente;
            }
        } return null;
    }

    public Veiculo buscarVeiculo(int tipo, int codigo){
        if(tipo == 1){
            for (Carro carro: listaCarros){
                if(carro.getCodigo() == codigo){
                    return carro;
                }
            }
        } else if (tipo== 2){
            for (Moto moto : listaMotos){
                if(moto.getCodigo() == codigo){
                    return moto;
                }
            }
        } return null;
    }

    public Locacao buscarLocacao(int codigo){
        for (Locacao locacao: listaLocacao){
            if(locacao.getCodigo() == codigo){
                return locacao;
            }
        } return null;
    }
}
