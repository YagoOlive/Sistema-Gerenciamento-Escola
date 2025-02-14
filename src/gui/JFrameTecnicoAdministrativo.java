package gui;

import bean.TecnicoAdministrativo;
import dao.TecnicoAdministrativoDAO;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JFrameTecnicoAdministrativo extends javax.swing.JFrame {
    
    List<TecnicoAdministrativo> tecnicos = new ArrayList<>();
    TecnicoAdministrativo tecnicoSelecionado = new TecnicoAdministrativo();
    static int linha;

    public JFrameTecnicoAdministrativo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GupoSexo = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPcadastroTecAD1 = new javax.swing.JPanel();
        jLabelNome = new javax.swing.JLabel();
        jLabelCPF = new javax.swing.JLabel();
        jLabelDataNasc = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfTelefone = new javax.swing.JTextField();
        tfNome = new javax.swing.JTextField();
        tfCodFuncional = new javax.swing.JTextField();
        tfDepartamento = new javax.swing.JTextField();
        ftfCPF = new javax.swing.JFormattedTextField();
        ftfData = new javax.swing.JFormattedTextField();
        tfCodigo = new javax.swing.JTextField();
        jbEditar = new javax.swing.JButton();
        jbCadastrar = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        voltar = new javax.swing.JButton();
        jPanelCadExc = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jbExcluir = new javax.swing.JButton();
        jbConsultar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabelNome.setText("Nome:");

        jLabelCPF.setText("CPF:");

        jLabelDataNasc.setText("Data Nasc:");

        jLabel4.setText("Telefone:");

        jLabel9.setText("Sexo:");

        jLabel7.setText("Departamento:");

        jLabel8.setText("Codigo:");

        jLabel6.setText("Codigo Funcional:");

        tfNome.setToolTipText("");

        try {
            ftfCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            ftfData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftfData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftfDataActionPerformed(evt);
            }
        });

        tfCodigo.setEditable(false);
        tfCodigo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tfCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCodigoActionPerformed(evt);
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

        GupoSexo.add(jRadioButton1);
        jRadioButton1.setText("Masculino");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        GupoSexo.add(jRadioButton2);
        jRadioButton2.setText("Feminino");

        voltar.setText("Voltar");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPcadastroTecAD1Layout = new javax.swing.GroupLayout(jPcadastroTecAD1);
        jPcadastroTecAD1.setLayout(jPcadastroTecAD1Layout);
        jPcadastroTecAD1Layout.setHorizontalGroup(
            jPcadastroTecAD1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPcadastroTecAD1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPcadastroTecAD1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPcadastroTecAD1Layout.createSequentialGroup()
                        .addGroup(jPcadastroTecAD1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4)
                            .addComponent(jLabel9))
                        .addGroup(jPcadastroTecAD1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPcadastroTecAD1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPcadastroTecAD1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPcadastroTecAD1Layout.createSequentialGroup()
                                        .addComponent(jRadioButton2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(voltar)
                                        .addGap(18, 18, 18)
                                        .addComponent(jbEditar)
                                        .addGap(18, 18, 18)
                                        .addComponent(jbCadastrar))
                                    .addGroup(jPcadastroTecAD1Layout.createSequentialGroup()
                                        .addGroup(jPcadastroTecAD1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tfDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfCodFuncional, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jRadioButton1))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
                            .addGroup(jPcadastroTecAD1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(tfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPcadastroTecAD1Layout.createSequentialGroup()
                        .addGroup(jPcadastroTecAD1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabelCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelDataNasc)
                            .addComponent(jLabelNome))
                        .addGap(53, 53, 53)
                        .addGroup(jPcadastroTecAD1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ftfData, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ftfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 344, Short.MAX_VALUE))))
        );
        jPcadastroTecAD1Layout.setVerticalGroup(
            jPcadastroTecAD1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPcadastroTecAD1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPcadastroTecAD1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPcadastroTecAD1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNome)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPcadastroTecAD1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ftfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCPF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPcadastroTecAD1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDataNasc)
                    .addComponent(ftfData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPcadastroTecAD1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(tfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPcadastroTecAD1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(tfCodFuncional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPcadastroTecAD1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(tfDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPcadastroTecAD1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jRadioButton1))
                .addGroup(jPcadastroTecAD1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPcadastroTecAD1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPcadastroTecAD1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbCadastrar)
                            .addComponent(jbEditar)
                            .addComponent(voltar)))
                    .addGroup(jPcadastroTecAD1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton2)))
                .addGap(14, 14, 14))
        );

        jTabbedPane1.addTab("Cadastrar", jPcadastroTecAD1);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "CPF", "Idade", "Telefone", "Departamento", "Codigo Funcional"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
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
            jTable1.getColumnModel().getColumn(5).setResizable(false);
            jTable1.getColumnModel().getColumn(6).setResizable(false);
        }

        jbExcluir.setText("Excluir");
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });

        jbConsultar.setText("Consultar");
        jbConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConsultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCadExcLayout = new javax.swing.GroupLayout(jPanelCadExc);
        jPanelCadExc.setLayout(jPanelCadExcLayout);
        jPanelCadExcLayout.setHorizontalGroup(
            jPanelCadExcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadExcLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 747, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanelCadExcLayout.createSequentialGroup()
                .addGap(285, 285, 285)
                .addComponent(jbConsultar)
                .addGap(29, 29, 29)
                .addComponent(jbExcluir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelCadExcLayout.setVerticalGroup(
            jPanelCadExcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCadExcLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCadExcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbExcluir)
                    .addComponent(jbConsultar))
                .addGap(18, 18, 18))
        );

        jTabbedPane1.addTab("Consultar/Excluir", jPanelCadExc);

        jLabel5.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel5.setText("Técnico Administrativo ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(291, 291, 291)
                        .addComponent(jLabel5)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastrarActionPerformed
        TecnicoAdministrativoDAO tecnicoDAO = new TecnicoAdministrativoDAO();
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
        if (tfDepartamento.getText().trim().isEmpty()) {
            checagem = false;
            mensagemErro += "Obrigatório preencher o Departamento\n";
        }
        if (tfTelefone.getText().trim().isEmpty()) {
            checagem = false;
            mensagemErro += "Obrigatório preencher o Telefone\n";
        }
        if (!jRadioButton1.isSelected() && !jRadioButton2.isSelected()) {
            checagem = false;
            mensagemErro += "Obrigatório selecionar o sexo (M/F)\n";
        }
        if (ftfData.getText().trim().isEmpty() || ftfData.getText().equals("  /  /    ")) {
            checagem = false;
            mensagemErro += "Obrigatório preencher a data de nascimento\n";
        }
        if (!checagem) {
            JOptionPane.showMessageDialog(this, mensagemErro, "Erro", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                String nome = tfNome.getText();
                String cpf = ftfCPF.getText().replaceAll("\\D", ""); 
                
                int codFuncional;
                try {
                    codFuncional = Integer.parseInt(tfCodFuncional.getText().trim()); 
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Por favor, insira um número válido!", "Erro de Entrada", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                
                String departamento = tfDepartamento.getText();
                String telefone = tfTelefone.getText();
                char sexo = jRadioButton1.isSelected() ? 'M' : 'F'; 
                LocalDate dataNasc = LocalDate.parse(ftfData.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

                TecnicoAdministrativo tecnicoAdministrativo = new TecnicoAdministrativo(nome, cpf, dataNasc.getDayOfMonth(), dataNasc.getMonthValue(), dataNasc.getYear(), sexo, codFuncional, departamento, telefone);
                tecnicoDAO.gravar(tecnicoAdministrativo);

                JOptionPane.showMessageDialog(this, "Técnico cadastrado com sucesso!");
                limparCampos();
                atualizarTabela();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Código Funcional inválido! Insira um número inteiro.", "Erro", JOptionPane.ERROR_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Erro ao cadastrar técnico: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jbCadastrarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int linha = jTable1.getSelectedRow();
        if (linha >= 0) {
            tecnicoSelecionado = tecnicos.get(linha); 
            tfCodigo.setText(String.valueOf(tecnicoSelecionado.getCod()));
            tfNome.setText(tecnicoSelecionado.getNome());
            ftfCPF.setText(tecnicoSelecionado.getCpf());
            tfCodFuncional.setText(String.valueOf(tecnicoSelecionado.getCodFuncional()));
            tfDepartamento.setText(tecnicoSelecionado.getDepartamento());
            tfTelefone.setText(tecnicoSelecionado.getTelefone());
            ftfData.setText(tecnicoSelecionado.getDataNasc().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
            if (tecnicoSelecionado.getSexo() == 'M') {
                jRadioButton1.setSelected(true);
            } else {
                jRadioButton2.setSelected(true);
            }
            jTabbedPane1.setSelectedIndex(0);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        if (tecnicoSelecionado != null) {
            TecnicoAdministrativoDAO tecnicoDAO = new TecnicoAdministrativoDAO();
            tecnicoDAO.excluir(tecnicoSelecionado);
            JOptionPane.showMessageDialog(this, "Técnico excluído com sucesso!");
            limparCampos();
            atualizarTabela();
        } else {
            JOptionPane.showMessageDialog(this, "Nenhum técnico selecionado!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbExcluirActionPerformed

    private void ftfDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftfDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ftfDataActionPerformed

    private void tfCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCodigoActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
       dispose();
    }//GEN-LAST:event_voltarActionPerformed

    private void jbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarActionPerformed
        
        if (tecnicoSelecionado != null) {
            try {  
                tecnicoSelecionado.setNome(tfNome.getText());
                tecnicoSelecionado.setCpf(ftfCPF.getText().replaceAll("\\D", ""));
                tecnicoSelecionado.setCodFuncional(Integer.parseInt(tfCodFuncional.getText()));
                tecnicoSelecionado.setDepartamento(tfDepartamento.getText());
                tecnicoSelecionado.setTelefone(tfTelefone.getText());
                tecnicoSelecionado.setSexo(jRadioButton1.isSelected() ? 'M' : 'F');
                tecnicoSelecionado.setDataNasc(LocalDate.parse(ftfData.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy")));

                TecnicoAdministrativoDAO tecnicoDAO = new TecnicoAdministrativoDAO();
                tecnicoDAO.alterar(tecnicoSelecionado);

                JOptionPane.showMessageDialog(this, "Técnico atualizado com sucesso!");
                limparCampos();
                atualizarTabela();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Código Funcional inválido! Insira um número inteiro.", "Erro", JOptionPane.ERROR_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Erro ao atualizar técnico: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Nenhum técnico selecionado!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbEditarActionPerformed

    private void jbConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConsultarActionPerformed
        atualizarTabela();
    }//GEN-LAST:event_jbConsultarActionPerformed

    private void atualizarTabela() {
    TecnicoAdministrativoDAO tecnicoDAO = new TecnicoAdministrativoDAO();
    tecnicos = tecnicoDAO.consultar();
    DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
    modelo.setNumRows(0);

    for (TecnicoAdministrativo tecnico : tecnicos) {
        Vector linha = new Vector();
        linha.add(tecnico.getCod());
        linha.add(tecnico.getNome());
        linha.add(tecnico.getCpf());
        linha.add(calcularIdade(tecnico.getDataNasc()));
        linha.add(tecnico.getTelefone());
        linha.add(tecnico.getDepartamento());
        linha.add(tecnico.getCodFuncional());
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
        tfDepartamento.setText("");
        tfTelefone.setText("");
        ftfData.setText("");
        jRadioButton1.setSelected(false);
        jRadioButton2.setSelected(false);
        tecnicoSelecionado = null;
    }

    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GupoSexo;
    private javax.swing.JFormattedTextField ftfCPF;
    private javax.swing.JFormattedTextField ftfData;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelCPF;
    private javax.swing.JLabel jLabelDataNasc;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JPanel jPanelCadExc;
    private javax.swing.JPanel jPcadastroTecAD1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbCadastrar;
    private javax.swing.JButton jbConsultar;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JTextField tfCodFuncional;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfDepartamento;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfTelefone;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
