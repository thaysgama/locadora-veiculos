public abstract class Veiculo implements Comparable<Veiculo>{

    //atributos
    private static int idx=1;
    private int codigo;
    private String marca;
    private String modelo;
    private int ano;
    private double motor;

    //construtor
    public Veiculo(String marca, String modelo, int ano, double motor) {
        this.codigo = idx++;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.motor = motor;
    }

    //métodos
    public abstract double calcularDiaria();

    public int getCodigo() {
        return codigo;
    }

    public int getAno() {
        return ano;
    }

    public double getMotor() {
        return motor;
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

    @Override
    public String toString() {
        return  "Codigo: " + codigo +
                ", Marca: " + marca +
                ", Modelo: " + modelo +
                ", Ano Fabricação: " + ano +
                ", Motor: " + motor;
    }
}
