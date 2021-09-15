public abstract class Veiculo implements Comparable<Veiculo>{

    //atributos
    private int codigo;
    private String cor;
    private int ano;
    private String placa;
    private String motor;

    //construtor
    public Veiculo(int codigo, String cor, int ano, String placa, String motor) {
        this.codigo = codigo;
        this.cor = cor;
        this.ano = ano;
        this.placa = placa;
        this.motor = motor;
    }

    //métodos
    public abstract void calcularDiaria();

    public int getCodigo() {
        return codigo;
    }

//    public String getCor() {
//        return cor;
//    }
//
//    public void setCor(String cor) {
//        this.cor = cor;
//    }

    public int getAno() {
        return ano;
    }

//    public void setAno(int ano) {
//        this.ano = ano;
//    }

//    public String getPlaca() {
//        return placa;
//    }
//
//    public void setPlaca(String placa) {
//        this.placa = placa;
//    }
//
//    public String getMotor() {
//        return motor;
//    }
//
//    public void setMotor(String motor) {
//        this.motor = motor;
//    }


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
        return "Veiculo{" +
                "cor='" + cor + '\'' +
                ", ano=" + ano +
                ", placa='" + placa + '\'' +
                ", motor='" + motor + '\'' +
                '}';
    }
}
