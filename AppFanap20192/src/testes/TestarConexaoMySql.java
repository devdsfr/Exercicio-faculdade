package testes;

import conexoes.ConexaoMySql;

public class TestarConexaoMySql {
    public static void main(String[] args) {
        ConexaoMySql c = new ConexaoMySql();
        
        c.conectar();
        
    }
    
}
