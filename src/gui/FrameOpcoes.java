package gui;

public class FrameOpcoes extends javax.swing.JFrame {

    
    public FrameOpcoes() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AlunoJB = new javax.swing.JButton();
        TecnicoAdJB = new javax.swing.JButton();
        ProfessorJB = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        AlunoJB.setText("Aluno");
        AlunoJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlunoJBActionPerformed(evt);
            }
        });

        TecnicoAdJB.setText("Técnico Administrativo");
        TecnicoAdJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TecnicoAdJBActionPerformed(evt);
            }
        });

        ProfessorJB.setText("Professor");
        ProfessorJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProfessorJBActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Opções");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Selecione a entidade ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AlunoJB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TecnicoAdJB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ProfessorJB))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AlunoJB)
                    .addComponent(TecnicoAdJB)
                    .addComponent(ProfessorJB))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AlunoJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlunoJBActionPerformed
        
       JFrameAluno formaluno = new JFrameAluno();
        formaluno.setLocationRelativeTo(null);
        formaluno.setVisible(true);
    }//GEN-LAST:event_AlunoJBActionPerformed

    private void TecnicoAdJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TecnicoAdJBActionPerformed
        
        JFrameTecnicoAdministrativo formTecAd = new JFrameTecnicoAdministrativo();
        formTecAd.setLocationRelativeTo(null);
        formTecAd.setVisible(true);
    }//GEN-LAST:event_TecnicoAdJBActionPerformed

    private void ProfessorJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProfessorJBActionPerformed
        
        JFrameProfessor formprofessor = new JFrameProfessor();
        formprofessor.setLocationRelativeTo(null);
        formprofessor.setVisible(true);
    }//GEN-LAST:event_ProfessorJBActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameOpcoes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AlunoJB;
    private javax.swing.JButton ProfessorJB;
    private javax.swing.JButton TecnicoAdJB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
