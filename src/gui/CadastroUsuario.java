
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
        
        initComponents();
        this.setLocationRelativeTo(null); 
        controller = new UsuarioDAO();
    }
    
    public void PopularJTable(String sql) {
          
          try{
           Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/transporte?useTimezone=true"+"&serverTimezone=UTC","root","12345");
           PreparedStatement banco = (PreparedStatement)conn.prepareStatement(sql);
           banco.execute(); 

           ResultSet resultado = banco.executeQuery(sql);

           DefaultTableModel model =(DefaultTableModel) jUsuarios1.getModel();
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
        jScrollPane2 = new javax.swing.JScrollPane();
        jUsuarios1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        txtUsername.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtUsername.setEnabled(false);

        txtSenha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtSenha.setEnabled(false);

        jComboBoxPerfil.setBackground(new java.awt.Color(238, 238, 238));
        jComboBoxPerfil.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBoxPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Motorista", "Usuário" }));
        jComboBoxPerfil.setEnabled(false);

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

        txtId.setBackground(new java.awt.Color(238, 238, 238));
        txtId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jUsuarios1.setAutoCreateRowSorter(true);
        jUsuarios1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "USERNAME", "SENHA", "PERFIL"
            }
        ));
        jUsuarios1.setGridColor(new java.awt.Color(210, 215, 211));
        jUsuarios1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jUsuarios1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jUsuarios1);

        jPanel3.setBackground(new java.awt.Color(78, 1, 45));

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

        jLabel9.setBackground(new java.awt.Color(51, 51, 51));
        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("- Orientador");

        jLabel10.setBackground(new java.awt.Color(51, 51, 51));
        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("- Empresa");

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

        jLabel15.setBackground(new java.awt.Color(51, 51, 51));
        jLabel15.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("- Administrador");
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/icons8-editar-usuário-masculino-48.png"))); // NOI18N
        jLabel7.setText("Cadastro de Usuários");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(350, 350, 350)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel5))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel8)
                            .addComponent(jLabel15)))
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel8))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(905, 905, 905)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/icons8-procurar-usuário-masculino-30 (1).png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/icons8-adicionar-usuário-masculino-30.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icons/icons8-mostrar-a-senha-30 (2).png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)
                                .addComponent(btnPesquisarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnNovoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnVoltarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnLimparUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnInserirUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnAtualizarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnApagarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap())
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1082, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnPesquisarUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addComponent(jComboBoxPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnNovoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnVoltarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnLimparUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(btnInserirUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(btnAtualizarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(btnApagarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(102, 102, 102)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

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

    private void jUsuarios1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jUsuarios1MouseClicked
       txtId.setEnabled(true);
        btnPesquisarUsuario.setEnabled(true);
        btnNovoUsuario.setEnabled(true);
        btnInserirUsuario.setEnabled(false);
        btnAtualizarUsuario.setEnabled(true);
        btnApagarUsuario.setEnabled(true);
        txtUsername.setEnabled(true);
        jComboBoxPerfil.setEnabled(true);
        
        int linha = jUsuarios1.getSelectedRow(); 
        txtId.setText(jUsuarios1.getValueAt(linha,0).toString());
        txtUsername.setText(jUsuarios1.getValueAt(linha,1).toString()); 
        txtSenha.setText(jUsuarios1.getValueAt(linha, 2).toString());
        jComboBoxPerfil.setSelectedItem(jUsuarios1.getValueAt(linha,3).toString()); 
        
    }//GEN-LAST:event_jUsuarios1MouseClicked

    private void jLabel8MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseMoved

    }//GEN-LAST:event_jLabel8MouseMoved

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        MenuAlunos menu1 = new MenuAlunos();
        menu1.show();

    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        MenuOrientador ori = new MenuOrientador();
        ori.show();

    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked

        MenuEmpresa emp = new MenuEmpresa();
        emp.show();

    }//GEN-LAST:event_jLabel15MouseClicked

    private void carregaTabela() throws SQLException{
        
        DefaultTableModel modelo = (DefaultTableModel) jUsuarios1.getModel();
        modelo.setNumRows(0);
        
        jUsuarios1.getColumnModel().getColumn(0).setPreferredWidth(20);
        jUsuarios1.getColumnModel().getColumn(1).setPreferredWidth(25);
        jUsuarios1.getColumnModel().getColumn(2).setPreferredWidth(25);
        jUsuarios1.getColumnModel().getColumn(3).setPreferredWidth(25);
        
        
         try{
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/transporte?useTimezone=true"+"&serverTimezone=UTC","root","12345");
            PreparedStatement pstm;
            ResultSet rs;
            pstm = conn.prepareStatement("select * from usuarios");
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
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jUsuarios1;
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


