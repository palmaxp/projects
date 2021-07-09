package DAO;

import Models.Pessoa;
import Utils.ConexaoBanco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class PessoaDAO {

    public static int inserirPessoa(Pessoa pessoa) {
        String sql = "INSERT INTO pessoa(usuario, telefone, senha)VALUES (?,?,?)";
        Connection conexao = ConexaoBanco.criarConexao();
        try {
            PreparedStatement stm;
            stm = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            stm.setString(1, pessoa.getUsuario());
            stm.setString(2, pessoa.getSenha());
            stm.setString(3, pessoa.getTelefone());
            stm.execute();
            ResultSet rs = stm.getGeneratedKeys();
            rs.next();
            return rs.getInt(1);
        } catch (SQLException e) {
            System.out.println("Não funcionou a conexão" + e);
        }
        return 0;
    }

    public static ArrayList<Pessoa> BuscarPessoas() {
        String sql = "SELECT * FROM pessoa";
        Connection conexao = ConexaoBanco.criarConexao();
        ArrayList<Pessoa> listaPessoa = new ArrayList<>();
        try {
            PreparedStatement stm = conexao.prepareStatement(sql);
            ResultSet resultado = stm.executeQuery();
            while (resultado.next()) {
                String usuario = resultado.getString("usuario");
                String telefone = resultado.getString("telefone");
                int codigo = resultado.getInt("cod_pessoa");
                int cod_endereco = resultado.getInt("cod_endereco");
                Pessoa p1 = new Pessoa(usuario, telefone);
                listaPessoa.add(p1);
            }
        } catch (SQLException e) {
            System.out.println("Não fui buscar ninguem");
        }
        return listaPessoa;
    }

    public static void DeletarPessoaPorCodigo(int codigo) {
        String sql = "DELETE FROM pessoa where codigo = ?";
        Connection conexao = ConexaoBanco.criarConexao();
        try {
            PreparedStatement stm = conexao.prepareCall(sql);
            stm.setInt(1, codigo);
            stm.executeUpdate();
        } catch (SQLException e) {
            System.out.println("DEU ERRO AO DELETAR" + e);
        }
    }
}
