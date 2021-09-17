public class Moto extends Veiculo {

    //atributos
    private int peso;
    private int alturaBanco;

    //construtor
    public Moto(String marca, String modelo, int ano, double motor, int peso, int alturaBanco) {
        super(marca, modelo, ano, motor);
        this.peso = peso;
        this.alturaBanco = alturaBanco;
    }

    public Moto(String marca, String modelo, int ano, double motor){
        super(marca, modelo, ano, motor);
    }

    //métodos
    @Override
    public double calcularDiaria() {
        double valor = 50.0;
        if(this.getAno() > 2019){
            valor += 20;
        } if (this.getMotor() > 250) {
            valor += 20;
        }
        return valor;
    }


    @Override
    public String toString() {
        return "Moto [" + super.toString() +
                ", Peso: " + peso +
                ", Altura do banco:" + alturaBanco +
                "]";
    }
}
