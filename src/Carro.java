public class Carro extends Veiculo {

    //atributos
    private boolean arCondicionado;
    private int numPessoas;
    private boolean direcaoHidraulica;
    private boolean airbag;
    private int quantPortas;

    //construtor

    public Carro(String marca, String modelo, int ano, double motor, boolean arCondicionado, int numPessoas,
                 boolean direcaoHidraulica, boolean airbag, int quantPortas) {
        super(marca, modelo, ano, motor);
        this.arCondicionado = arCondicionado;
        this.numPessoas = numPessoas;
        this.direcaoHidraulica = direcaoHidraulica;
        this.airbag = airbag;
        this.quantPortas = quantPortas;
    }


    //métodos

    @Override
    public double calcularDiaria() {
        double valor = 50.0;
        if(this.getAno() > 2019){
            valor += 20;
        } if (this.getMotor() > 1.0) {
            valor += 20;
        } if (this.airbag){
            valor += 20;
        } if (this.numPessoas >5){
            valor += 20;
        } if (this.direcaoHidraulica){
            valor += 20;
        } if (this.arCondicionado){
            valor += 20;
        } if (this.quantPortas>2){
            valor += 20;
        }
        return valor;
    }

    @Override
    public String toString() {
        return "Carro [" +super.toString()+
                "Ar Condicionado: " + arCondicionado +
                ", Capacidade: " + numPessoas +
                ", Direção Hidráulica: " + direcaoHidraulica +
                ", Airbag: " + airbag +
                ", Quantidade Portas: " + quantPortas +
                "]";
    }
}
