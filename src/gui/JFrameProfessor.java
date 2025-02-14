package gui;

import bean.Professor;
import dao.ProfessorDAO;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JFrameProfessor extends javax.swing.JFrame {
    
    List<Professor> professores = new ArrayList<>();
    Professor professorSelecionado = new Professor();
    static int linha;
    
    public JFrameProfessor() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoSexo = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfCodigo = new javax.swing.JTextField();
        tfNome = new javax.swing.JTextField();
        tfTelefone = new javax.swing.JTextField();
        tfCodFuncional = new javax.swing.JTextField();
        tfAreaAtuacao = new javax.swing.JTextField();
        ftfCPF = new javax.swing.JFormattedTextField();
        FTFData = new javax.swing.JFormattedTextField();
        jbEditar = new javax.swing.JButton();
        jbCadastrar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        rbMasculino = new javax.swing.JRadioButton();
        rbFeminino = new javax.swing.JRadioButton();
        voltar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jbExcluir = new javax.swing.JButton();
        jbConsultar1 = new javax.swing.JButton();
        jLabelTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel3.setText("Data Nasc:");

        jLabel4.setText("Telefone:");

        jLabel7.setText("Codigo Funcional:");

        jLabel6.setText("Area de Atuação:");

        jLabel8.setText("Codigo:");

        jLabel1.setText("Nome:");

        jLabel2.setText("CPF:");

        tfCodigo.setEditable(false);
        tfCodigo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tfCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCodigoActionPerformed(evt);
            }
        });

        tfNome.setToolTipText("");

        try {
            ftfCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            FTFData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        FTFData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FTFDataActionPerformed(evt);
            }
        });

        jbEditar.setText("Editar");
        jbEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarActionPerformed(evt);
            }
        });

        jbCadastrar.setText("Cadastrar");
        jbCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastrarActionPerformed(evt);
            }
        });

        jLabel9.setText("Sexo:");

        rbMasculino.setText("Masculino");
        rbMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMasculinoActionPerformed(evt);
            }
        });

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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel8)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tfCodFuncional, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(FTFData, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ftfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfAreaAtuacao, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rbMasculino)
                                            .addComponent(rbFeminino))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                        .addComponent(voltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbEditar)
                        .addGap(18, 18, 18)
                        .addComponent(jbCadastrar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(ftfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(FTFData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tfCodFuncional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbCadastrar)
                            .addComponent(jbEditar)
                            .addComponent(voltar))
                        .addGap(25, 25, 25))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfAreaAtuacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(rbMasculino)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbFeminino)
                        .addContainerGap(21, Short.MAX_VALUE))))
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
                "Código", "Nome", "CPF", "Idade", "Telefone", "Area de Atuação", "Codigo Funcional"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
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

        jbConsultar1.setText("Consultar");
        jbConsultar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConsultar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 762, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(261, 261, 261)
                .addComponent(jbConsultar1)
                .addGap(18, 18, 18)
                .addComponent(jbExcluir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbExcluir)
                    .addComponent(jbConsultar1))
                .addGap(12, 12, 12))
        );

        jTabbedPane1.addTab("Consultar/Excluir", jPanel2);

        jLabelTitulo.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabelTitulo.setText("Professor");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(352, 352, 352)
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastrarActionPerformed
        ProfessorDAO professorDAO = new ProfessorDAO();

        boolean checagem = true;
        String mensagemErro = "";

        if (tfNome.getText().trim().isEmpty()) {
            checagem = false;
            mensagemErro += "Obrigatório preencher o nome\n";
        }
        if (ftfCPF.getText().trim().isEmpty() || ftfCPF.getText().equals("   .   .   -  ")) {
            checagem = false;
            mensagemErro += "Obrigatório preencher o CPF\n";
        }
        if (tfCodFuncional.getText().trim().isEmpty()) {
            checagem = false;
            mensagemErro += "Obrigatório preencher o Código Funcional\n";
        }
        if (tfAreaAtuacao.getText().trim().isEmpty()) {
            checagem = false;
            mensagemErro += "Obrigatório preencher a Área de Atuação\n";
        }
        if (tfTelefone.getText().trim().isEmpty()) {
            checagem = false;
            mensagemErro += "Obrigatório preencher o Telefone\n";
        }
        if (!rbFeminino.isSelected() && !rbMasculino.isSelected()) {
            checagem = false;
            mensagemErro += "Obrigatório selecionar o sexo (F/M)\n";
        }
        if (FTFData.getText().trim().isEmpty() || FTFData.getText().equals("  /  /    ")) {
            checagem = false;
            mensagemErro += "Obrigatória a data de nascimento\n";
        }

        if (!checagem) {
            JOptionPane.showMessageDialog(null, mensagemErro, "ERRO!!!", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                String nome = tfNome.getText();
                String cpf = ftfCPF.getText().replaceAll("\\D", "");
                
                int codFuncional;
                try {
                    codFuncional = Integer.parseInt(tfCodFuncional.getText().trim()); 
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Por favor, insira um número válido!", "Erro de Entrada", JOptionPane.ERROR_MESSAGE);
                    return; // Saia do método ou lide com o erro
                }

                String areaAtuacao = tfAreaAtuacao.getText();
                String telefone = tfTelefone.getText();
                char sexo = rbFeminino.isSelected() ? 'F' : 'M';
                LocalDate dataNasc = LocalDate.parse(FTFData.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

                Professor professor = new Professor(nome, cpf, dataNasc.getDayOfMonth(), dataNasc.getMonthValue(), dataNasc.getYear(), sexo, codFuncional, areaAtuacao, telefone);
                professorDAO.gravar(professor);
                JOptionPane.showMessageDialog(this, "Professor cadastrado com sucesso!");
                limparCampos();
                atualizarTabela();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Erro ao cadastrar professor: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jbCadastrarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int linha = jTable1.getSelectedRow();
        if (linha >= 0) {
            professorSelecionado = professores.get(linha);
            tfCodigo.setText(String.valueOf(professorSelecionado.getCod()));
            tfNome.setText(professorSelecionado.getNome());
            ftfCPF.setText(professorSelecionado.getCpf());
            tfCodFuncional.setText(String.valueOf(professorSelecionado.getCodFuncional()));
            tfAreaAtuacao.setText(professorSelecionado.getAreaAtuacao());
            rbFeminino.setSelected(professorSelecionado.getSexo() == 'F');
            rbMasculino.setSelected(professorSelecionado.getSexo() == 'M');
            FTFData.setText(professorSelecionado.getDataNasc().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
            tfTelefone.setText(professorSelecionado.getTelefone());
            jTabbedPane1.setSelectedIndex(0);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        if (professorSelecionado != null) {
            ProfessorDAO professorDAO = new ProfessorDAO();
            professorDAO.excluir(professorSelecionado);
            JOptionPane.showMessageDialog(this, "Professor excluído com sucesso!");
            limparCampos();
            atualizarTabela();
        } else {
            JOptionPane.showMessageDialog(this, "Nenhum professor selecionado!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbExcluirActionPerformed

    private void FTFDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FTFDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FTFDataActionPerformed

    private void tfCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCodigoActionPerformed

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        dispose();
    }//GEN-LAST:event_voltarActionPerformed

    private void jbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarActionPerformed
        if (professorSelecionado != null) {
            try {
                professorSelecionado.setNome(tfNome.getText());
                professorSelecionado.setCpf(ftfCPF.getText().replaceAll("\\D", ""));
                professorSelecionado.setCodFuncional(Integer.parseInt(tfCodFuncional.getText()));
                professorSelecionado.setAreaAtuacao(tfAreaAtuacao.getText());
                professorSelecionado.setTelefone(tfTelefone.getText());
                professorSelecionado.setSexo(rbFeminino.isSelected() ? 'F' : 'M');
                professorSelecionado.setDataNasc(LocalDate.parse(FTFData.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy")));

                ProfessorDAO professorDAO = new ProfessorDAO();
                professorDAO.alterar(professorSelecionado);
                JOptionPane.showMessageDialog(this, "Professor atualizado com sucesso!");
                limparCampos();
                atualizarTabela();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Erro ao atualizar professor: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Nenhum professor selecionado!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbEditarActionPerformed

    private void jbConsultar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConsultar1ActionPerformed
        atualizarTabela();
    }//GEN-LAST:event_jbConsultar1ActionPerformed

    private void rbMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMasculinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbMasculinoActionPerformed

    private void atualizarTabela() {
        ProfessorDAO professorDAO = new ProfessorDAO();
        professores = professorDAO.consultar();
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setNumRows(0);
        for (Professor professor : professores) {
            Vector linha = new Vector();
            linha.add(professor.getCod());
            linha.add(professor.getNome());
            linha.add(professor.getCpf());
            linha.add(calcularIdade(professor.getDataNasc()));
            linha.add(professor.getTelefone());
            linha.add(professor.getCodFuncional());
            linha.add(professor.getAreaAtuacao());
            modelo.addRow(linha);
        }
    }

    private int calcularIdade(LocalDate dataNasc) {
        return Period.between(dataNasc, LocalDate.now()).getYears();
    }

    private void limparCampos() {
        tfCodigo.setText("");
        tfNome.setText("");
        ftfCPF.setText("");
        tfCodFuncional.setText("");
        tfAreaAtuacao.setText("");
        tfTelefone.setText("");
        rbFeminino.setSelected(false);
        rbMasculino.setSelected(false);
        FTFData.setText("");
    }
    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField FTFData;
    private javax.swing.JFormattedTextField ftfCPF;
    private javax.swing.ButtonGroup grupoSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbCadastrar;
    private javax.swing.JButton jbConsultar1;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JRadioButton rbFeminino;
    private javax.swing.JRadioButton rbMasculino;
    private javax.swing.JTextField tfAreaAtuacao;
    private javax.swing.JTextField tfCodFuncional;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfTelefone;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
