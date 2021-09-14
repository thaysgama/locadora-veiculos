public class Carro extends Veiculo {

    //atributos
    private boolean arCondicionado;
    private int numPessoas;
    private boolean direcaoHidraulica;
    private boolean airbag;
    private int quantPortas;

    //construtor
    public Carro(String cor, int ano, String placa, String motor,
                 boolean arCondicionado, int numPessoas, boolean direcaoHidraulica,
                 boolean airbag, int quantPortas) {
        super(cor, ano, placa, motor);
        this.arCondicionado = arCondicionado;
        this.numPessoas = numPessoas;
        this.direcaoHidraulica = direcaoHidraulica;
        this.airbag = airbag;
        this.quantPortas = quantPortas;
    }

    //métodos


    public boolean isArCondicionado() {
        return arCondicionado;
    }

    public void setArCondicionado(boolean arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

    public int getNumPessoas() {
        return numPessoas;
    }

    public void setNumPessoas(int numPessoas) {
        this.numPessoas = numPessoas;
    }

    public boolean isDirecaoHidraulica() {
        return direcaoHidraulica;
    }

    public void setDirecaoHidraulica(boolean direcaoHidraulica) {
        this.direcaoHidraulica = direcaoHidraulica;
    }

    public boolean isAirbag() {
        return airbag;
    }

    public void setAirbag(boolean airbag) {
        this.airbag = airbag;
    }

    public int getQuantPortas() {
        return quantPortas;
    }

    public void setQuantPortas(int quantPortas) {
        this.quantPortas = quantPortas;
    }

    @Override
    public void calcularDiaria() {

    }

}
