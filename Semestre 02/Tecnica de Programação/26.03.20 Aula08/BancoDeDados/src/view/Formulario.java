/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.AlunoBean;
import classes.Aluno;
import dao.AlunoDAO;

/**
 *
 * @author igor
 */
public class Formulario extends javax.swing.JFrame {

    /**
     * Creates new form Formulario
     */
    public Formulario() {
        initComponents();
    }
    
    private Aluno montaAluno() {
        Aluno aluno = new Aluno();
        aluno.setNome(txtNome.getText());
        aluno.setRGM(txtRgm.getText());
        aluno.setNota1(Float.parseFloat(txtNota1.getText()));
        aluno.setNota2(Float.parseFloat(txtNota2.getText()));
        return aluno;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNota2 = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtRgm = new javax.swing.JTextField();
        txtNota1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        lblMensagem = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnAlterar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        btnCalcular = new javax.swing.JButton();
        btnSair1 = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Nota2");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 140, 34, 14);

        jLabel2.setText("RGM");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 50, 22, 14);

        jLabel3.setText("Nome");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 80, 34, 14);

        jLabel4.setText("Nota1");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 110, 34, 14);

        txtNota2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNota2ActionPerformed(evt);
            }
        });
        getContentPane().add(txtNota2);
        txtNota2.setBounds(90, 140, 80, 20);

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        getContentPane().add(txtNome);
        txtNome.setBounds(90, 80, 80, 20);

        txtRgm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRgmActionPerformed(evt);
            }
        });
        getContentPane().add(txtRgm);
        txtRgm.setBounds(90, 50, 80, 20);

        txtNota1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNota1ActionPerformed(evt);
            }
        });
        getContentPane().add(txtNota1);
        txtNota1.setBounds(90, 110, 80, 20);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Mensagem"));
        jPanel1.setLayout(null);

        lblMensagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblMensagem);
        lblMensagem.setBounds(10, 10, 200, 80);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(30, 179, 220, 100);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Comandos"));
        jPanel2.setLayout(null);

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        jPanel2.add(btnAlterar);
        btnAlterar.setBounds(20, 150, 100, 23);

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        jPanel2.add(btnSalvar);
        btnSalvar.setBounds(20, 20, 100, 23);

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        jPanel2.add(btnPesquisar);
        btnPesquisar.setBounds(20, 50, 100, 23);

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        jPanel2.add(btnCalcular);
        btnCalcular.setBounds(20, 80, 100, 23);

        btnSair1.setText("Sair");
        jPanel2.add(btnSair1);
        btnSair1.setBounds(20, 210, 100, 23);

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        jPanel2.add(btnExcluir);
        btnExcluir.setBounds(20, 180, 100, 23);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(270, 30, 150, 250);

        setSize(new java.awt.Dimension(460, 349));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNota2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNota2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNota2ActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtRgmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRgmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRgmActionPerformed

    private void txtNota1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNota1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNota1ActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (txtRgm.getText().equals("")) {
            lblMensagem.setText("Preencha o RGM do aluno");
        } else if (txtNome.getText().equals("")) {
            lblMensagem.setText("Preencha o nome do aluno");
        } else if (txtNota1.getText().equals("")) {
            lblMensagem.setText("Preencha a nota 1 do aluno");
        } else if (txtNota2.getText().equals("")) {
            lblMensagem.setText("Preencha a nota 2 do aluno");
        } else {
            Aluno aluno = montaAluno();
            String resp = new AlunoDAO().gravarAluno(aluno);
            if (resp.equals("OK")) {
                lblMensagem.setText("Aluno Gravado com sucesso");
            } else {
                lblMensagem.setText((resp));
            }
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        if (txtRgm.getText().equals("")) {
            lblMensagem.setText("Preencha o RGM do aluno");
        } else {
            Aluno aluno = new AlunoDAO().getAluno(txtRgm.getText());
            if (aluno == null) {
                txtNome.setText("");
                txtNota1.setText("");
                txtNota2.setText("");
                lblMensagem.setText("Não encontrado");
            } else {
                txtNome.setText(aluno.getNome());
                txtNota1.setText(aluno.getNota1() + "");
                txtNota2.setText(aluno.getNota2() + "");
                lblMensagem.setText("Aluno encontrado");
            }
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        if (txtRgm.getText().equals("")) {
            lblMensagem.setText("Preencha o RGM do aluno");
        } else if (txtNome.getText().equals("")) {
            lblMensagem.setText("Preencha o nome do aluno");
        } else if (txtNota1.getText().equals("")) {
            lblMensagem.setText("Preencha a nota 1 do aluno");
        } else if (txtNota2.getText().equals("")) {
            lblMensagem.setText("Preencha a nota 2 do aluno");
        } else {
            float media = new AlunoBean().calculaMedia(
                    Float.parseFloat(txtNota1.getText()),
                    Float.parseFloat(txtNota2.getText())
            );
            lblMensagem.setText(media+"");
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        if (txtRgm.getText().equals("")) {
            lblMensagem.setText("Preencha o RGM do aluno");
        } else if (txtNome.getText().equals("")) {
            lblMensagem.setText("Preencha o nome do aluno");
        } else if (txtNota1.getText().equals("")) {
            lblMensagem.setText("Preencha a nota 1 do aluno");
        } else if (txtNota2.getText().equals("")) {
            lblMensagem.setText("Preencha a nota 2 do aluno");
        } else {
            Aluno aluno = montaAluno();
            String resp = new AlunoDAO().alterarAluno(aluno);
            if (resp.equals("OK")) {
                lblMensagem.setText("Aluno Gravado com sucesso");
            } else {
                lblMensagem.setText((resp));
            }
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (txtRgm.getText().equals("")) {
            lblMensagem.setText("Preencha o RGM do aluno");
        } else {
            Aluno aluno = montaAluno();
            String resp = new AlunoDAO().excluirAluno(aluno);
            if (resp.equals("OK")) {
                lblMensagem.setText("Aluno Gravado com sucesso");
            } else {
                lblMensagem.setText((resp));
            }
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSair1;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblMensagem;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNota1;
    private javax.swing.JTextField txtNota2;
    private javax.swing.JTextField txtRgm;
    // End of variables declaration//GEN-END:variables
}
