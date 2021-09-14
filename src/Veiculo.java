public abstract class Veiculo implements Comparable<Veiculo>{

    //atributos
    private String cor;
    private int ano;
    private String placa;
    private String motor;

    //construtor
    public Veiculo(String cor, int ano, String placa, String motor) {
        this.cor = cor;
        this.ano = ano;
        this.placa = placa;
        this.motor = motor;
    }

    //métodos
    public abstract void calcularDiaria();

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }


    @Override
    public int compareTo(Veiculo veiculo) {
        if(this.ano == veiculo.getAno()){
            return 0;
        } else if(this.ano >veiculo.getAno()){
            return 1;
        } else
            return -1;
    }
}
