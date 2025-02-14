package gui;

import java.util.Calendar;


public class FrameLogin extends javax.swing.JFrame {

    public FrameLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlLogin = new javax.swing.JPanel();
        tfNomeCompleto = new javax.swing.JTextField();
        lblNomeCompleto = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        btLogar = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        tfSenha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setResizable(false);

        pnlLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tfNomeCompleto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tfNomeCompleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNomeCompletoActionPerformed(evt);
            }
        });

        lblNomeCompleto.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        lblNomeCompleto.setText("Nome Completo");

        lblSenha.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        lblSenha.setText("Senha");

        btLogar.setText("Logar");
        btLogar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btLogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLogarActionPerformed(evt);
            }
        });

        lblTitulo.setBackground(new java.awt.Color(51, 204, 255));
        lblTitulo.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Login");
        lblTitulo.setToolTipText("");
        lblTitulo.setMaximumSize(new java.awt.Dimension(191, 40));
        lblTitulo.setMinimumSize(new java.awt.Dimension(150, 50));
        lblTitulo.setPreferredSize(new java.awt.Dimension(150, 50));

        tfSenha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tfSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSenhaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlLoginLayout = new javax.swing.GroupLayout(pnlLogin);
        pnlLogin.setLayout(pnlLoginLayout);
        pnlLoginLayout.setHorizontalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblNomeCompleto))
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblSenha))
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(btLogar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfNomeCompleto, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                            .addComponent(tfSenha))))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        pnlLoginLayout.setVerticalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblNomeCompleto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfNomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(lblSenha)
                .addGap(1, 1, 1)
                .addComponent(tfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btLogar)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfNomeCompletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNomeCompletoActionPerformed
        
    }//GEN-LAST:event_tfNomeCompletoActionPerformed


    private void btLogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLogarActionPerformed
        
        String  primeironome, usuario, senha, senhausuario; 
        usuario = tfNomeCompleto.getText();
        String[] nomes = usuario.split(" ");
        primeironome = nomes[0];
        primeironome = primeironome.toUpperCase();
      
        Calendar hoje = Calendar.getInstance();
        int ano = hoje.get(Calendar.YEAR);
        int mes = hoje.get(Calendar.MONTH);
        int dia = hoje.get(Calendar.DAY_OF_MONTH);
        senha = primeironome+dia+(mes+1)+ano;
        
        if((tfNomeCompleto.getText().equals(usuario)) &&
           (tfSenha.getText().equals(senha))){
            this.dispose();
            FrameOpcoes frameopcoes = new FrameOpcoes();
            frameopcoes.setLocationRelativeTo(null);
            frameopcoes.setVisible(true);
        }
        else{
            tfNomeCompleto.setText(null);
            tfSenha.setText(null);
        }
        
    }//GEN-LAST:event_btLogarActionPerformed

    private void tfSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSenhaActionPerformed
        tfSenha.setText(null);
    }//GEN-LAST:event_tfSenhaActionPerformed


    public static void main(String args[]) {



        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btLogar;
    private javax.swing.JLabel lblNomeCompleto;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlLogin;
    private javax.swing.JTextField tfNomeCompleto;
    private javax.swing.JPasswordField tfSenha;
    // End of variables declaration//GEN-END:variables
}
