/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceGrafica;

import Trabalho1.Sistema;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Fallen1
 */
public class InterAdicionar extends javax.swing.JFrame {

    /**
     * Creates new form InterAdicionar
     */
    public InterAdicionar() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblInfunidade = new javax.swing.JLabel();
        btnId = new javax.swing.JTextField();
        lblId = new javax.swing.JLabel();
        btnOrdenada = new javax.swing.JTextField();
        lblAbscissa = new javax.swing.JLabel();
        btnAbscissa = new javax.swing.JTextField();
        lblOrdenada = new javax.swing.JLabel();
        btnVideo = new javax.swing.JCheckBox();
        btnTermometro = new javax.swing.JCheckBox();
        btnCh4 = new javax.swing.JCheckBox();
        btnCo2 = new javax.swing.JCheckBox();
        btnEuclidiana = new javax.swing.JButton();
        btnManhattan = new javax.swing.JButton();
        lblTipounidade = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblInfunidade.setText("Informacoes das Unidades");

        lblId.setText("ID Unidade");

        lblAbscissa.setText("Abscissa");

        lblOrdenada.setText("Ordenada");

        btnVideo.setText("Video");

        btnTermometro.setText("Termometro");

        btnCh4.setText("Metano");

        btnCo2.setText("CO2");

        btnEuclidiana.setText("Euclidiana");
        btnEuclidiana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					btnEuclidianaActionPerformed(evt);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        btnManhattan.setText("Manhattan");
        btnManhattan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					btnManhattanActionPerformed(evt);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        lblTipounidade.setText("Tipo de Unidade");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(lblInfunidade))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnEuclidiana)
                                .addGap(99, 99, 99)
                                .addComponent(btnManhattan, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnId)
                                    .addComponent(btnOrdenada)
                                    .addComponent(btnAbscissa, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblId)
                                    .addComponent(lblAbscissa)
                                    .addComponent(lblOrdenada))
                                .addGap(58, 58, 58)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnCh4)
                                    .addComponent(btnTermometro)
                                    .addComponent(btnVideo)
                                    .addComponent(btnCo2)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(lblTipounidade, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(lblInfunidade)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnVideo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnTermometro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCh4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCo2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnId, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblId))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnOrdenada, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblOrdenada))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAbscissa, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAbscissa))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(lblTipounidade, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEuclidiana, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(btnManhattan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEuclidianaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {//GEN-FIRST:event_btnEuclidianaActionPerformed
        Sistema sistema = new Sistema();
        try {
            // TODO add your handling code here:
            sistema.addEuclidiana(Integer.parseInt(btnId.getText()), Double.parseDouble(btnAbscissa.getText()), Double.parseDouble(btnOrdenada.getText()), btnVideo.isSelected(), btnTermometro.isSelected(), btnCo2.isSelected(), btnCh4.isSelected());
            this.dispose();
        }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Verifique o formato:\n" 
                    + "ID (INTEIRO)\n"
                    + "ABSCISSA (DECIMAL)\n"
                    + "ORDENADA(DECIMAL)\n");
        }
        
        
    }//GEN-LAST:event_btnEuclidianaActionPerformed

    private void btnManhattanActionPerformed(java.awt.event.ActionEvent evt) throws Exception {//GEN-FIRST:event_btnManhattanActionPerformed
        // TODO add your handling code here:
        Sistema sistema = new Sistema();
        try {
            // TODO add your handling code here:
            sistema.addManhattan(Integer.parseInt(btnId.getText()), Double.parseDouble(btnAbscissa.getText()), Double.parseDouble(btnOrdenada.getText()), btnVideo.isSelected(), btnTermometro.isSelected(), btnCo2.isSelected(), btnCh4.isSelected());
            this.dispose();
        }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Verifique o formato:\n" 
                    + "ID (INTEIRO)\n"
                    + "ABSCISSA (DECIMAL)\n"
                    + "ORDENADA(DECIMAL)\n");
        }
    }//GEN-LAST:event_btnManhattanActionPerformed

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
            java.util.logging.Logger.getLogger(InterAdicionar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterAdicionar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterAdicionar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterAdicionar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterAdicionar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField btnAbscissa;
    private javax.swing.JCheckBox btnCh4;
    private javax.swing.JCheckBox btnCo2;
    private javax.swing.JButton btnEuclidiana;
    private javax.swing.JTextField btnId;
    private javax.swing.JButton btnManhattan;
    private javax.swing.JTextField btnOrdenada;
    private javax.swing.JCheckBox btnTermometro;
    private javax.swing.JCheckBox btnVideo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAbscissa;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblInfunidade;
    private javax.swing.JLabel lblOrdenada;
    private javax.swing.JLabel lblTipounidade;
    // End of variables declaration//GEN-END:variables
}
