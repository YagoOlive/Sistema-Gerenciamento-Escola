package gui;

import bean.Aluno;
import dao.AlunoDAO;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JFrameAluno extends javax.swing.JFrame {
    
    List<Aluno> alunos = new ArrayList<>();
    Aluno alunoSelecionado = new Aluno();
    static int linha;
    
    public JFrameAluno() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoSexo = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtfTelefone = new javax.swing.JTextField();
        jtfRA = new javax.swing.JTextField();
        jtfIRA = new javax.swing.JTextField();
        jftfCPF = new javax.swing.JFormattedTextField();
        tfCodigo = new javax.swing.JTextField();
        jftfData = new javax.swing.JFormattedTextField();
        jtfNome = new javax.swing.JTextField();
        jbCadastro = new javax.swing.JButton();
        jbEditar = new javax.swing.JButton();
        rbMasculino = new javax.swing.JRadioButton();
        rbFeminino = new javax.swing.JRadioButton();
        voltar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jbExcluir = new javax.swing.JButton();
        btConsultar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("Nome:");

        jLabel2.setText("CPF:");

        jLabel3.setText("Data Nasc:");

        jLabel7.setText("IRA:");

        jLabel8.setText("Codigo");

        jLabel9.setText("Sexo:");

        jLabel4.setText("Telefone:");

        jLabel6.setText("RA:");

        try {
            jftfCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jftfCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jftfCPFActionPerformed(evt);
            }
        });

        tfCodigo.setEditable(false);
        tfCodigo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tfCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCodigoActionPerformed(evt);
            }
        });

        try {
            jftfData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jftfData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jftfDataActionPerformed(evt);
            }
        });

        jtfNome.setToolTipText("");
        jtfNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNomeActionPerformed(evt);
            }
        });

        jbCadastro.setText("Cadastrar");
        jbCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastroActionPerformed(evt);
            }
        });

        jbEditar.setText("Editar");
        jbEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarActionPerformed(evt);
            }
        });

        grupoSexo.add(rbMasculino);
        rbMasculino.setText("Masculino");
        rbMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMasculinoActionPerformed(evt);
            }
        });

        grupoSexo.add(rbFeminino);
        rbFeminino.setText("Feminino");

        voltar.setText("Voltar");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jftfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jftfData, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtfRA, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtfIRA, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rbMasculino)
                                    .addComponent(rbFeminino)
                                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(169, 299, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(voltar)
                                .addGap(18, 18, 18)
                                .addComponent(jbEditar)
                                .addGap(18, 18, 18)
                                .addComponent(jbCadastro))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jftfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jftfData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtfRA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfIRA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(rbMasculino))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbEditar)
                            .addComponent(jbCadastro)
                            .addComponent(voltar))
                        .addGap(14, 14, 14))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbFeminino)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jTabbedPane1.addTab("Cadastrar", jPanel1);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "CPF", "Idade", "Telefone", "RA", "IRA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(6).setResizable(false);
        }

        jbExcluir.setText("Excluir");
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });

        btConsultar.setText("Consultar");
        btConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 667, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btConsultar)
                .addGap(18, 18, 18)
                .addComponent(jbExcluir)
                .addGap(214, 214, 214))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btConsultar)
                    .addComponent(jbExcluir))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Consultar/Excluir", jPanel2);

        jLabel5.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel5.setText("Alunos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jTabbedPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(311, 311, 311)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastroActionPerformed
        AlunoDAO alunoDAO = new AlunoDAO();
        boolean checagem = true;
        String mensagemErro = "";

        if (jtfNome.getText().trim().isEmpty()) {
            checagem = false;
            mensagemErro += "Obrigatório preencher o nome\n";
        }
        if (jftfCPF.getText().trim().isEmpty() || jftfCPF.getText().equals("   .   .   -  ")) {
            checagem = false;
            mensagemErro += "Obrigatório preencher o CPF\n";
        }
        if (jtfRA.getText().trim().isEmpty()) {
            checagem = false;
            mensagemErro += "Obrigatório preencher o RA\n";
        }
        if (jtfIRA.getText().trim().isEmpty()) {
            checagem = false;
            mensagemErro += "Obrigatório preencher o IRA\n";
        }
        if (jtfTelefone.getText().trim().isEmpty()) {
            checagem = false;
            mensagemErro += "Obrigatório preencher o Telefone\n";
        }
        if (!rbFeminino.isSelected() && !rbMasculino.isSelected()) {
            checagem = false;
            mensagemErro += "Obrigatório selecionar o sexo (F/M)\n";
        }
        if (jftfData.getText().trim().isEmpty() || jftfData.getText().equals("  /  /    ")) {
            checagem = false;
            mensagemErro += "Obrigatória a data de nascimento\n";
        }

        if (!checagem) {
            JOptionPane.showMessageDialog(null, mensagemErro, "ERRO!!!", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                String nome = jtfNome.getText();
                String cpf = jftfCPF.getText().replaceAll("\\D", "");
                String ra = jtfRA.getText();
                float ira = Float.parseFloat(jtfIRA.getText());
                String telefone = jtfTelefone.getText();
                char sexo = rbFeminino.isSelected() ? 'F' : 'M';
                LocalDate dataNasc = LocalDate.parse(jftfData.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

               Aluno aluno = new Aluno(nome, cpf, dataNasc.getDayOfMonth(), dataNasc.getMonthValue(), dataNasc.getYear(), sexo, telefone, ra, ira);
                alunoDAO.gravar(aluno);
                JOptionPane.showMessageDialog(this, "Aluno cadastrado com sucesso!");
                limparCampos();
                atualizarTabela();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Erro ao cadastrar aluno: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }  
    }//GEN-LAST:event_jbCadastroActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int linha = jTable1.getSelectedRow();
        if (linha >= 0) {
            alunoSelecionado = alunos.get(linha);
            tfCodigo.setText(String.valueOf(alunoSelecionado.getCod()));
            jtfNome.setText(alunoSelecionado.getNome());
            jftfCPF.setText(alunoSelecionado.getCpf());
            jtfRA.setText(alunoSelecionado.getRa());
            jtfIRA.setText(String.valueOf(alunoSelecionado.getIra()));
            rbFeminino.setSelected(alunoSelecionado.getSexo() == 'F');
            rbMasculino.setSelected(alunoSelecionado.getSexo() == 'M');
            jftfData.setText(alunoSelecionado.getDataNasc().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
            jtfTelefone.setText(alunoSelecionado.getTelefone());
            jTabbedPane1.setSelectedIndex(0);
        }         
    }//GEN-LAST:event_jTable1MouseClicked

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        if (alunoSelecionado != null) {
            AlunoDAO alunoDAO = new AlunoDAO();
            alunoDAO.excluir(alunoSelecionado);
            JOptionPane.showMessageDialog(this, "Aluno excluído com sucesso!");
            limparCampos();
            atualizarTabela();
        } else {
            JOptionPane.showMessageDialog(this, "Nenhum aluno selecionado!", "Erro", JOptionPane.ERROR_MESSAGE);
        }     
    }//GEN-LAST:event_jbExcluirActionPerformed

    private void jftfDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jftfDataActionPerformed
     
    }//GEN-LAST:event_jftfDataActionPerformed

    private void tfCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCodigoActionPerformed
       
    }//GEN-LAST:event_tfCodigoActionPerformed

    private void rbMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMasculinoActionPerformed
    
    }//GEN-LAST:event_rbMasculinoActionPerformed

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        dispose();
    }//GEN-LAST:event_voltarActionPerformed

    private void jtfNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNomeActionPerformed
        
    }//GEN-LAST:event_jtfNomeActionPerformed

    private void jbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarActionPerformed
        if (alunoSelecionado != null) {
            try {
                alunoSelecionado.setNome(jtfNome.getText());
                alunoSelecionado.setCpf(jftfCPF.getText().replaceAll("\\D", ""));
                alunoSelecionado.setRa(jtfRA.getText());
                alunoSelecionado.setIra(Float.parseFloat(jtfIRA.getText()));
                alunoSelecionado.setTelefone(jtfTelefone.getText());
                alunoSelecionado.setSexo(rbFeminino.isSelected() ? 'F' : 'M');
                alunoSelecionado.setDataNasc(LocalDate.parse(jftfData.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy")));

                AlunoDAO alunoDAO = new AlunoDAO();
                alunoDAO.alterar(alunoSelecionado);
                JOptionPane.showMessageDialog(this, "Aluno atualizado com sucesso!");
                limparCampos();
                atualizarTabela();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Erro ao atualizar aluno: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Nenhum aluno selecionado!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbEditarActionPerformed

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
        atualizarTabela();
    }//GEN-LAST:event_btConsultarActionPerformed

    private void jftfCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jftfCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jftfCPFActionPerformed

    private void atualizarTabela() {
        AlunoDAO alunoDAO = new AlunoDAO();
        alunos = alunoDAO.consultar();
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setNumRows(0);
        for (Aluno aluno : alunos) {
            Vector linha = new Vector();
            linha.add(aluno.getCod());
            linha.add(aluno.getNome());
            linha.add(aluno.getCpf());
            linha.add(calcularIdade(aluno.getDataNasc()));
            linha.add(aluno.getTelefone());
            linha.add(aluno.getRa());
            linha.add(aluno.getIra());
            modelo.addRow(linha);
        }
    }

    private int calcularIdade(LocalDate dataNasc) {
        return Period.between(dataNasc, LocalDate.now()).getYears();
    }

    private void limparCampos() {
        tfCodigo.setText("");
        jtfNome.setText("");
        jftfCPF.setText("");
        jtfRA.setText("");
        jtfIRA.setText("");
        jtfTelefone.setText("");
        rbFeminino.setSelected(false);
        rbMasculino.setSelected(false);
        jftfData.setText("");
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new JFrameAluno().setVisible(true);
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btConsultar;
    private javax.swing.ButtonGroup grupoSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbCadastro;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JFormattedTextField jftfCPF;
    private javax.swing.JFormattedTextField jftfData;
    private javax.swing.JTextField jtfIRA;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JTextField jtfRA;
    private javax.swing.JTextField jtfTelefone;
    private javax.swing.JRadioButton rbFeminino;
    private javax.swing.JRadioButton rbMasculino;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
