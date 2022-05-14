
package dao;

import factory.Conexao;
import gui.CadastroUsuario;
import gui.Login;
import gui.MenuUsuario;
import gui.MenuAdmin;
import gui.MenuMotorista;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Usuario;


public class LoginDAO {
    
    private Connection connection;
    private int id;
    private String username;
    private String senha;
    private String perfil;
    private Login gui;
    private CadastroUsuario cu;
    
    
     public LoginDAO(Login gui){ 
        this.connection = new Conexao().getConnection();
        this.gui = gui;
    
     }
    
     
     public void logar(){
       
         
         String username = gui.getTxtUsername().getText();
         String senha = gui.getTxtSenha().getText();
         
         try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        try (Connection conn = (Connection) 
                
                DriverManager.getConnection("jdbc:mysql://localhost:3306/transporte?useTimezone=true&serverTimezone=UTC","root","12345"); 
                Statement stmt = (Statement) conn.createStatement()) {

            String query = "select * from usuarios where username = '" + username +"' and senha = '" + senha + "'";

                try (ResultSet rs = stmt.executeQuery(query)) {
                    if (rs.next()) {
                        
                       String perfil = rs.getString("perfil");
       
                        if("Administrador".equals(perfil)){
                           JOptionPane.showMessageDialog(null,"Conectado com sucesso! Seja Bem-Vindo!");
                           MenuAdmin menu = new MenuAdmin();
                           menu.setVisible(true);
                           this.gui.dispose();
                        }
                        
                        else if("Motorista".equals(perfil)){
                           JOptionPane.showMessageDialog(null,"Conectado com sucesso! Seja Bem-Vindo!");
                           MenuMotorista med = new MenuMotorista();
                           med.setVisible(true);
                           this.gui.dispose();
                        }
                        
                        else if("Usuário".equals(perfil)){
                           JOptionPane.showMessageDialog(null,"Conectado com sucesso! Seja Bem-Vindo!");
                           MenuUsuario med2 = new MenuUsuario();
                           med2.setVisible(true);
                           this.gui.dispose();
                        }
                    }
                    

                    else {
                        JOptionPane.showMessageDialog(null,"Usuário ou senha incorretos! Tente Novamente!");
                        gui.getTxtUsername().setText("");
                        gui.getTxtSenha().setText("");
                        
                    }   
                }
        

    
        }
        } catch (SQLException | ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }

        
   }
     
     
     
    
}
