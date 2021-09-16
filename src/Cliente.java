public class Cliente {

    private String nome;
    private String numDocumento;
    private String contato;

    public Cliente(String nome, String numDocumento, String contato) {
        this.nome = nome;
        this.numDocumento = numDocumento;
        this.contato = contato;
    }

    public String getNumDocumento() {
        return numDocumento;
    }

    @Override
    public String toString() {
        return "Cliente [" +
                "Nome: " + nome +
                ", Num. Documento: " + numDocumento +
                ", Contato: " + contato + ']';
    }
}
