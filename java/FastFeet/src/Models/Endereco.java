package Models;

public class Endereco {

    public Endereco(String cidade, String estado, String logradouro) {
        this.cod_endereco = cod_endereco;
        this.estado = estado;
        this.cidade = cidade;
        this.logradouro = logradouro;
    }
    private int cod_endereco;
    private String estado;
    private String cidade;
    private String logradouro;
    private static int idGlobal = 1;

    public int getCodigo() {
        return cod_endereco;
    }

    public void setCodigo(int cod_endereco) {
        this.cod_endereco = cod_endereco;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }


}
