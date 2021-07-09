package Models;

import java.math.BigInteger;
import java.security.MessageDigest;

public class Pessoa {

    public static boolean criptografarSenha;

    // buscar
    public Pessoa(String usuario, String telefone, int codigo, Endereco cod_endereco) {
        this.codigo = codigo;
        this.usuario = usuario;
        this.telefone = telefone;
        this.cod_endereco = cod_endereco;
    }

    // inserir
    public Pessoa(String usuario, String telefone, Endereco cod_endereco, String senha) {
        this.usuario = usuario;
        this.senha = senha;
        this.telefone = telefone;
        this.cod_endereco = cod_endereco;
    }
   
    private int codigo;
    private String usuario;
    private String senha;
    private String telefone;
    private Endereco cod_endereco;

    public static String criptografarSenha(String senha) {
        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            md5.update(senha.getBytes());
            senha = new BigInteger(1, md5.digest()).toString(16);
        } catch (Exception e) {
            System.out.println("Não Criptografou");
        }
        return senha;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public static boolean isCriptografarSenha() {
        return criptografarSenha;
    }

    public Endereco getCod_endereco() {
        return cod_endereco;
    }

    public void setCod_endereco(Endereco cod_endereco) {
        this.cod_endereco = cod_endereco;
    }
}
