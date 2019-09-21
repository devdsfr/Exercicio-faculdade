package conexoes;

import java.sql.Connection;    //Gerencia a conexão
import java.sql.Statement;     //Objetos no sentido App -> SGBD
import java.sql.ResultSet;     //Objetos no sentido SGBD -> App
import java.sql.DriverManager; //Gerencia conector para SGBD
import java.sql.SQLException;  //Trata exceptions SQL
import javax.swing.JOptionPane;

public class ConexaoMySql {
    private Connection con     = null;
    private String servidor    = "localhost";
    private String nomeDoBanco = "AppFanap20192";
    private String usuario     = "root";
    private String senha       = "root";
    private boolean status     = false;

    public ConexaoMySql() {
    }
    
    public Connection conectar(){
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            setCon((Connection)(DriverManager.getConnection("jdbc:mysql://" + servidor + "/" + nomeDoBanco, usuario, senha)));
        } catch (Exception e) {
        }
        
        setStatus(true);
        
        if (status = true){
            JOptionPane.showMessageDialog(null, "Conexão realizada com sucesso!");
        }
        
        return getCon();
        
    }
    
    public boolean fecharConexao(){
        try {
           getCon().close();
        } catch (Exception e) {
        }
        
        setStatus(false);
        if (status = false){
            JOptionPane.showMessageDialog(null, "Conexão fechada com sucesso!");
        }
        return getStatus();
    }
    
    public Connection getCon(){
        return this.con;
    }
    
    public void setCon(Connection con){
        this.con = con;
    }
    
    public boolean getStatus(){
        return this.status;
    }
    
    public void setStatus(boolean status){
        this.status = status;
    }
    
}
