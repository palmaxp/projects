package DAO;

import Models.Endereco;

public class EnderecoDAO {
 
    public static Endereco buscarEndPorId(int codigo){
        String sql = "SELECT * FROM endereco WHERE codigo = ?";
              
        setInt(1, codigo);;
        return null;
        
    }
}
