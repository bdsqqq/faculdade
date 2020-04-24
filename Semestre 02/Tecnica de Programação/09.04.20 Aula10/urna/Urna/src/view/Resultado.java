/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import classes.Candidato;
import dao.CandidatoDAO;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class Resultado extends javax.swing.JInternalFrame {

    /**
     * Creates new form Resultado
     */
    public Resultado() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblGrade = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        getContentPane().setLayout(null);

        tblGrade.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero", "Candidato", "Votos"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblGrade);
        if (tblGrade.getColumnModel().getColumnCount() > 0) {
            tblGrade.getColumnModel().getColumn(2).setResizable(false);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 100, 453, 190);

        jLabel1.setText("RESULTADO");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(240, 20, 240, 16);

        jButton1.setText("Mostrar Resultado");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(190, 50, 160, 32);

        setBounds(0, 0, 573, 380);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ArrayList<Candidato> lista = new CandidatoDAO().listaVotos();
        
        DefaultTableModel modelo = (DefaultTableModel) tblGrade.getModel();
        for (int i = 0; i < lista.size(); i++) {
            modelo.addRow(new String[]{lista.get(i).getNumero()+"",
                lista.get(i).getCandidato(),lista.get(i).getVotos()+""});
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblGrade;
    // End of variables declaration//GEN-END:variables
}
