package Models;

public class Endereco {
    public Endereco(int codigo, String estado, String cidade, String logradouro) {
        this.codigo = codigo;
        this.estado = estado;
        this.cidade = cidade;
        this.logradouro = logradouro;
    }
    int codigo;
    String estado;
    String cidade;
    String logradouro;
}
