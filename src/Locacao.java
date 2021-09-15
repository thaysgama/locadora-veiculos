import java.time.LocalDate;

public class Locacao {

    private static int idx=1;
    private int codigo;
    private Cliente cliente;
    private Veiculo veiculo;
    private LocalDate dataEntrada;
    private LocalDate dataSaida;


    public Locacao(Cliente cliente, Veiculo veiculo, LocalDate dataEntrada, LocalDate dataSaida) {
        this.codigo = idx++;
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
    }

    //métodos

    public void calcularLocacao(){

    }

    public int getCodigo() {
        return codigo;
    }



    @Override
    public String toString() {
        return "Locacao{" +
                "codigo=" + codigo +
                ", cliente=" + cliente +
                ", veiculo=" + veiculo +
                ", dataHoraEntrada=" + dataEntrada +
                ", dataHoraSaida=" + dataSaida +
                '}';
    }
}
