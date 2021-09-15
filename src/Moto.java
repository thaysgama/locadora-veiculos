public class Moto extends Veiculo {

    //atributos
    private int peso;
    private int alturaBanco;

    //construtor

    public Moto(String cor, int ano, String placa, String motor, int peso, int alturaBanco) {
        super(cor, ano, placa, motor);
        this.peso = peso;
        this.alturaBanco = alturaBanco;
    }

    //métodos
    @Override
    public void calcularDiaria() {

    }


    @Override
    public String toString() {
        return "Moto{" +
                "peso=" + peso +
                ", alturaBanco=" + alturaBanco +
                "} " + super.toString();
    }
}
