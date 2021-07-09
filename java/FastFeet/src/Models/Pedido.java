package Models;

public class Pedido {

    private static int idGlobal = 1;
    private int codigo;
    private String produto;
    private double peso;
    private Pessoa pessoa;

    public Pedido(int codigo, String produto, double peso, Pessoa pessoa) {
        this.codigo = codigo;
        this.produto = produto;
        this.peso = peso;
        this.pessoa = pessoa;
    }

    public static int getIdGlobal() {
        return idGlobal;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

}
