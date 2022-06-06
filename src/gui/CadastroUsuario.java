
package gui;

import com.sun.org.apache.bcel.internal.generic.CPInstruction;
import dao.UsuarioDAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import model.Usuario;

public class CadastroUsuario extends javax.swing.JFrame {

    private final UsuarioDAO controller;
    
    public CadastroUsuario() {
        setTitle("Cadastro de Usuário");
        setExtendedState(MAXIMIZED_BOTH);
        initComponents();
        carregaTabela();
        
        this.setLocationRelativeTo(null); 
        controller = new UsuarioDAO();
    }
     public void PopularJTable(String sql) {
          try
          {
           Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/transporte?useTimezone=true"+"&serverTimezone=UTC","root","12345");
           PreparedStatement banco = (PreparedStatement)conn.prepareStatement(sql);
           banco.execute();

           ResultSet resultado = banco.executeQuery(sql);

           DefaultTableModel model =(DefaultTableModel) jUsuarios.getModel();
           model.setNumRows(0);

           while(resultado.next())
           {
               model.addRow(new Object[] 
               { 
                  resultado.getString("id"),
                  resultado.getString("username"),
                  resultado.getString("senha"),
                  resultado.getString("perfil"),
                  
               }); 
          } 
           banco.close();
           conn.close();
          }
         catch (SQLException ex)
         {
            System.out.println("o erro foi " +ex);
          }
         }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        jComboBoxPerfil = new javax.swing.JComboBox<>();
        btnNovoUsuario = new javax.swing.JButton();
        btnVoltarUsuario = new javax.swing.JButton();
        btnLimparUsuario = new javax.swing.JButton();
        btnInserirUsuario = new javax.swing.JButton();
        btnAtualizarUsuario = new javax.swing.JButton();
        btnApagarUsuario = new javax.swing.JButton();
        btnPesquisarUsuario = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jUsuarios = new javax.swing.JTable();
        jLabelMin = new javax.swing.JLabel();
        jLabelClose = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("ID");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel11MousePressed(evt);
            }
        });
        jLabel11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jLabel11KeyTyped(evt);
            }
        });
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 40, 30));

        jLabel9.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Nome");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel9MousePressed(evt);
            }
        });
        jLabel9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jLabel9KeyTyped(evt);
            }
        });
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 320, 20));

        jLabel10.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Senha");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel10MousePressed(evt);
            }
        });
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, 320, 30));

        txtUsername.setBackground(new java.awt.Color(238, 238, 238));
        txtUsername.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtUsername.setEnabled(false);
        txtUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUsernameKeyTyped(evt);
            }
        });
        getContentPane().add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 217, 348, -1));

        txtSenha.setBackground(new java.awt.Color(238, 238, 238));
        txtSenha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtSenha.setEnabled(false);
        txtSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSenhaKeyTyped(evt);
            }
        });
        getContentPane().add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 322, 348, -1));

        jComboBoxPerfil.setBackground(new java.awt.Color(238, 238, 238));
        jComboBoxPerfil.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBoxPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Motorista", "Usuário" }));
        jComboBoxPerfil.setEnabled(false);
        getContentPane().add(jComboBoxPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 407, 208, -1));

        btnNovoUsuario.setBackground(new java.awt.Color(255, 255, 255));
        btnNovoUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNovoUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnNovoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/icons8-pasta-hospitalar-32.png"))); // NOI18N
        btnNovoUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnNovoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(btnNovoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 492, 66, -1));

        btnVoltarUsuario.setBackground(new java.awt.Color(255, 255, 255));
        btnVoltarUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnVoltarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/icons8-retornar-32.png"))); // NOI18N
        btnVoltarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnVoltarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 492, -1, -1));

        btnLimparUsuario.setBackground(new java.awt.Color(255, 255, 255));
        btnLimparUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLimparUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnLimparUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/icons8-cloth-32.png"))); // NOI18N
        btnLimparUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnLimparUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimparUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 492, 68, -1));

        btnInserirUsuario.setBackground(new java.awt.Color(255, 255, 255));
        btnInserirUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnInserirUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnInserirUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/icons8-inserir-32.png"))); // NOI18N
        btnInserirUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnInserirUsuario.setEnabled(false);
        btnInserirUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(btnInserirUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 551, 68, -1));

        btnAtualizarUsuario.setBackground(new java.awt.Color(255, 255, 255));
        btnAtualizarUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAtualizarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/icons8-editar-32.png"))); // NOI18N
        btnAtualizarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAtualizarUsuario.setEnabled(false);
        btnAtualizarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtualizarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 551, -1, -1));

        btnApagarUsuario.setBackground(new java.awt.Color(255, 255, 255));
        btnApagarUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnApagarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnApagarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/icons8-lixo-32.png"))); // NOI18N
        btnApagarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnApagarUsuario.setEnabled(false);
        btnApagarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApagarUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(btnApagarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(471, 551, 62, -1));

        btnPesquisarUsuario.setBackground(new java.awt.Color(255, 255, 255));
        btnPesquisarUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPesquisarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnPesquisarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/icons8-pesquisar-32.png"))); // NOI18N
        btnPesquisarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnPesquisarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(btnPesquisarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(392, 139, 45, 35));

        txtId.setBackground(new java.awt.Color(238, 238, 238));
        txtId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        txtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdKeyTyped(evt);
            }
        });
        getContentPane().add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 139, 50, -1));

        jPanel3.setBackground(new java.awt.Color(83, 17, 55));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setBackground(new java.awt.Color(51, 51, 51));
        jLabel8.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("- Usuário");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel8MouseMoved(evt);
            }
        });
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 64, -1, -1));

        jLabel14.setBackground(new java.awt.Color(51, 51, 51));
        jLabel14.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("- Motorista");
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 93, -1, -1));
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(418, 647, -1, -1));
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(456, 653, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/icons8-editar-usuário-masculino-48.png"))); // NOI18N
        jLabel7.setText("Cadastro de Usuários");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 246, 58));

        jLabel16.setBackground(new java.awt.Color(51, 51, 51));
        jLabel16.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("-Administrador");
        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 122, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/Screenshot_2.png"))); // NOI18N
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 830, 160, 200));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 257, 1164));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/icons8-procurar-usuário-masculino-30 (1).png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(283, 132, 39, 35));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/icons8-adicionar-usuário-masculino-30.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 204, 38, 41));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/icons8-mostrar-a-senha-30 (2).png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 313, 34, 37));

        jUsuarios.setAutoCreateRowSorter(true);
        jUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "USERNAME", "SENHA", "PERFIL"
            }
        ));
        jUsuarios.setGridColor(new java.awt.Color(210, 215, 211));
        jUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jUsuarios);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 640, 1490, 530));

        jLabelMin.setBackground(new java.awt.Color(204, 204, 204));
        jLabelMin.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabelMin.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMin.setText("-");
        jLabelMin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinMouseClicked(evt);
            }
        });
        getContentPane().add(jLabelMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(1700, 0, -1, -1));

        jLabelClose.setBackground(new java.awt.Color(204, 204, 204));
        jLabelClose.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabelClose.setForeground(new java.awt.Color(255, 255, 255));
        jLabelClose.setText("X");
        jLabelClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseClicked(evt);
            }
        });
        getContentPane().add(jLabelClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(1720, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoUsuarioActionPerformed

        txtId.setEnabled(false);
        btnPesquisarUsuario.setEnabled(false);
        btnNovoUsuario.setEnabled(false);
        btnInserirUsuario.setEnabled(true);
        btnAtualizarUsuario.setEnabled(true);
        btnApagarUsuario.setEnabled(true);
        txtUsername.setEnabled(true);
        txtSenha.setEnabled(true);
        jComboBoxPerfil.setEnabled(true);

    }//GEN-LAST:event_btnNovoUsuarioActionPerformed

    private void btnVoltarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarUsuarioActionPerformed

        txtId.setEnabled(true);
        btnPesquisarUsuario.setEnabled(true);
        btnNovoUsuario.setEnabled(true);
        btnInserirUsuario.setEnabled(false);
        btnAtualizarUsuario.setEnabled(false);
        btnApagarUsuario.setEnabled(false);
        txtUsername.setEnabled(false);
        txtSenha.setEnabled(false);
        jComboBoxPerfil.setEnabled(false);
        txtId.setText("");
        txtUsername.setText("");
        txtSenha.setText("");

    }//GEN-LAST:event_btnVoltarUsuarioActionPerformed

    private void btnLimparUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparUsuarioActionPerformed

        txtId.setText("");
        txtUsername.setText("");
        txtSenha.setText("");

    }//GEN-LAST:event_btnLimparUsuarioActionPerformed

    private void btnInserirUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirUsuarioActionPerformed

        Usuario usuario = new Usuario();
        usuario.setUsername(txtUsername.getText());
        usuario.setSenha(txtSenha.getText());
        usuario.setPerfil((String) jComboBoxPerfil.getSelectedItem());

        if (txtUsername.getText().isEmpty() ||
            txtSenha.getText().isEmpty()){

            JOptionPane.showMessageDialog(null, "Os campos não podem retornar vazios");

        }
        else{

            UsuarioDAO dao = new UsuarioDAO();
            dao.inserir(usuario);

            JOptionPane.showMessageDialog(null, "Usuario "+ txtUsername.getText()
                +" foi inserido com sucesso");

        }

        txtUsername.setText("");
        txtSenha.setText("");
        jComboBoxPerfil.setSelectedItem("");

    }//GEN-LAST:event_btnInserirUsuarioActionPerformed

    private void btnAtualizarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarUsuarioActionPerformed

        if (txtId.getText().isEmpty()) { //jTextField6 se refere ao campo de texto do ID
            JOptionPane.showMessageDialog(null, "Digite o ID.");
        }
        else {
            try {
                //Registra JDBC driver
                Class.forName("com.mysql.jdbc.Driver");
                //Abrindo a conexão
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/transporte?useTimezone=true"+"&serverTimezone=UTC","root","12345");
                //Executa a query de atualização
                java.sql.Statement st = conn.createStatement();
                st.executeUpdate("UPDATE usuarios SET username='"
                    + this.txtUsername.getText() + "',senha='"
                    + this.txtSenha.getText()+ "',perfil='"
                    + this.jComboBoxPerfil.getSelectedItem()
                    + "' WHERE id='" + this.txtId.getText() + "'");
                JOptionPane.showMessageDialog(rootPane, "Usuário atualizado com sucesso!");
            } catch (SQLException | ClassNotFoundException e) {
                JOptionPane.showMessageDialog(rootPane, e);
            }//Fim try
            txtUsername.setText("");
            txtSenha.setText("");
            jComboBoxPerfil.setSelectedItem("");

        }

    }//GEN-LAST:event_btnAtualizarUsuarioActionPerformed

    private void btnApagarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApagarUsuarioActionPerformed

        if (txtId.getText().isEmpty()) { //jTextField6 se refere ao campo de texto do ID
            JOptionPane.showMessageDialog(null, "Digite o ID.");
        }
        else {
            try {
                //Registra JDBC driver
                Class.forName("com.mysql.jdbc.Driver");
                //Abrindo a conexão
                Connection conn =
                DriverManager.getConnection("jdbc:mysql://localhost/transporte?useTimezone=true"+"&serverTimezone=UTC","root","12345");
                //Executa a query de exclusão
                java.sql.Statement st = conn.createStatement();
                st.executeUpdate("DELETE FROM usuarios WHERE id='" + this.txtId.getText() + "'");
                JOptionPane.showMessageDialog(rootPane, "Usuário excluído com sucesso!");
            }
            catch (SQLException | ClassNotFoundException e) {
                JOptionPane.showMessageDialog(rootPane, e);
            }//Fim try
            txtUsername.setText("");
            txtSenha.setText("");
            jComboBoxPerfil.setSelectedItem("");

        }

    }//GEN-LAST:event_btnApagarUsuarioActionPerformed

    private void btnPesquisarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarUsuarioActionPerformed
        txtId.setEnabled(true);
        btnPesquisarUsuario.setEnabled(true);
        btnNovoUsuario.setEnabled(true);
        btnInserirUsuario.setEnabled(false);
        btnAtualizarUsuario.setEnabled(true);
        btnApagarUsuario.setEnabled(true);
        txtUsername.setEnabled(true);
        txtSenha.setEnabled(true);
        jComboBoxPerfil.setEnabled(true);
        
        
        if (txtId.getText().isEmpty()){
            
            JOptionPane.showMessageDialog(null, "Digite o ID para busca!");
            
            
        }else{
            
            Usuario usuario = new Usuario();
            
            usuario.setId(Integer.parseInt(txtId.getText()));
           
            UsuarioDAO dao = new UsuarioDAO();
            
            usuario = dao.consultar(usuario);
            
            if(usuario!=null){
                
                txtUsername.setText(usuario.getUsername());
                txtSenha.setText(usuario.getSenha());
                jComboBoxPerfil.setSelectedItem(usuario.getPerfil());
            }
            
            else{
                
                JOptionPane.showMessageDialog(null, "Id Inválido");
                
            }
            {
                
            }
        }
        
    }//GEN-LAST:event_btnPesquisarUsuarioActionPerformed

    private void jLabel8MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseMoved

    }//GEN-LAST:event_jLabel8MouseMoved

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked


    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked


    }//GEN-LAST:event_jLabel14MouseClicked

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void jUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jUsuariosMouseClicked

        /*
        txtIdMedicos.setEnabled(true);
        txtNomeMedicos.setEnabled(true);
        txtCrmMedicos.setEnabled(true);
        txtEspecialidadeMedicos.setEnabled(true);
        txtSalarioMedicos.setEnabled(true);
        btnPesquisar.setEnabled(true);
        btnSalvar.setEnabled(true);
        btnAlterar.setEnabled(true);
        btnExcluir.setEnabled(true);
        btnLimpar.setEnabled(true);
        */

        txtId.setEnabled(true);
        btnPesquisarUsuario.setEnabled(true);
        btnNovoUsuario.setEnabled(true);
        btnInserirUsuario.setEnabled(false);
        btnAtualizarUsuario.setEnabled(true);
        btnApagarUsuario.setEnabled(true);
        txtUsername.setEnabled(true);
        txtSenha.setEnabled(true);
        jComboBoxPerfil.setEnabled(true);

        int linha = jUsuarios.getSelectedRow(); // retorna a linha selecionada pelo usuario
        txtId.setText(jUsuarios.getValueAt(linha,0).toString()); // retorna o valor da celula linha X 0
        txtUsername.setText(jUsuarios.getValueAt(linha,1).toString()); // retorna o valor da celula linha X 1
        txtSenha.setText(jUsuarios.getValueAt(linha,2).toString()); // retorna o valor da celula linha X 2
        jComboBoxPerfil.setSelectedItem(jUsuarios.getValueAt(linha,3).toString()); // retorna o valor da celula linha X 2

    }//GEN-LAST:event_jUsuariosMouseClicked

    private void jLabelMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseClicked

        this.setState(JFrame.ICONIFIED);

    }//GEN-LAST:event_jLabelMinMouseClicked

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked

        System.exit(0);

    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel16MouseClicked

    private void txtUsernameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsernameKeyTyped
       jLabel9.setVisible(false);
if(txtUsername.getText().isEmpty())
   jLabel9.setVisible(true);
    }//GEN-LAST:event_txtUsernameKeyTyped

    private void jLabel9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MousePressed
        txtUsername.setVisible(true);
        jLabel9.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MousePressed

    private void jLabel9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel9KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9KeyTyped

    private void jLabel10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MousePressed
        txtSenha.setVisible(true);
        jLabel10.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel10MousePressed

    private void jLabel11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MousePressed
        txtId.setVisible(true);
        jLabel11.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel11MousePressed

    private void jLabel11KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel11KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel11KeyTyped

    private void txtIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyTyped
    jLabel11.setVisible(false);
if(txtId.getText().isEmpty())
   jLabel11.setVisible(true);
    }//GEN-LAST:event_txtIdKeyTyped

    private void txtSenhaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSenhaKeyTyped
      jLabel10.setVisible(false);
if(txtSenha.getText().isEmpty())
   jLabel10.setVisible(true);
    }//GEN-LAST:event_txtSenhaKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroUsuario().setVisible(true);
            }
        });
    }
    
      private void carregaTabela(){
        
        DefaultTableModel modelo = (DefaultTableModel) jUsuarios.getModel();
        modelo.setNumRows(0);
        
        jUsuarios.getColumnModel().getColumn(0).setPreferredWidth(20);
        jUsuarios.getColumnModel().getColumn(1).setPreferredWidth(25);
        jUsuarios.getColumnModel().getColumn(2).setPreferredWidth(25);
        jUsuarios.getColumnModel().getColumn(3).setPreferredWidth(25);
        
        
        try {
            
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/transporte?useTimezone=true"+"&serverTimezone=UTC","root","12345");
            PreparedStatement pstm;
            ResultSet rs;
            pstm = conn.prepareStatement("select*from usuarios");
            rs  = pstm.executeQuery();
            
            while(rs.next()){
                modelo.addRow(new Object[]{
                    
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4)
                   
                    
                    
                    
                
            });
            }
            pstm.close();
            conn.close();
            
            
        } catch (Exception ErroSql) {
            
            JOptionPane.showMessageDialog(null, "Erro ao carregar os dados da tabela" + ErroSql, "Erro", JOptionPane.ERROR_MESSAGE );
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApagarUsuario;
    private javax.swing.JButton btnAtualizarUsuario;
    private javax.swing.JButton btnInserirUsuario;
    private javax.swing.JButton btnLimparUsuario;
    private javax.swing.JButton btnNovoUsuario;
    private javax.swing.JButton btnPesquisarUsuario;
    private javax.swing.JButton btnVoltarUsuario;
    private javax.swing.JComboBox<String> jComboBoxPerfil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jUsuarios;
    private javax.swing.JTextField txtId;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

      public JButton getBtnLogin() {
        return btnNovoUsuario;
    }

    public void setBtnLogin(JButton btnLogin) {
        this.btnNovoUsuario = btnLogin;
    }

    public JPasswordField getTxtSenha() {
        return txtSenha;
    }

    public void setTxtSenha(JPasswordField txtSenha) {
        this.txtSenha = txtSenha;
    }

    

    public JTextField getTxtUsername() {
        return txtId;
    }

    public void setTxtUsername(JTextField txtUsername) {
        this.txtId = txtUsername;
    }

    public JComboBox<String> getjComboBoxPerfil() {
        return jComboBoxPerfil;
    }

    public void setjComboBoxPerfil(JComboBox<String> jComboBoxPerfil) {
        this.jComboBoxPerfil = jComboBoxPerfil;
    }

}


