package Models;

public class Produto {
    public Produto(int codigo, String nome, int quantidade, float peso) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
        this.peso = peso;
    }    
    int codigo;
    String nome;
    int quantidade;
    float peso;
}
