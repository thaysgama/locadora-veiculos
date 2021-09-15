import java.time.LocalDateTime;

public class Locacao {

    private int codigo;
    private Cliente cliente;
    private Veiculo veiculo;
    private LocalDateTime dataHoraEntrada;
    private LocalDateTime dataHoraSaida;


    public Locacao(int codigo, LocalDateTime dataHoraEntrada, LocalDateTime dataHoraSaida) {
        this.codigo = codigo;
        this.dataHoraEntrada = dataHoraEntrada;
        this.dataHoraSaida = dataHoraSaida;
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
                "cliente=" + cliente +
                ", veiculo=" + veiculo +
                ", dataHoraEntrada=" + dataHoraEntrada +
                ", dataHoraSaida=" + dataHoraSaida +
                '}';
    }
}
