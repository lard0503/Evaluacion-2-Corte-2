/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package formulario;

import dao.DNumero;
import dao.DNumeroImpar;
import javax.swing.JOptionPane;

/**
 *
 * @author ale05
 */
public class Formulario_examen extends javax.swing.JFrame {

    DNumero dN = new DNumero();
    DNumeroImpar dNi = new DNumeroImpar();

    /**
     * Creates new form Formulario_examen
     */
    public Formulario_examen() {
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

        jLabel1 = new javax.swing.JLabel();
        jTfNum1 = new javax.swing.JTextField();
        jBtnAgregar = new javax.swing.JButton();
        jBtnPares = new javax.swing.JButton();
        jBtnImpares = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Ingrese un #:");

        jBtnAgregar.setText("Agregar");
        jBtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAgregarActionPerformed(evt);
            }
        });

        jBtnPares.setText("Mostrar # Pares");
        jBtnPares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnParesActionPerformed(evt);
            }
        });

        jBtnImpares.setText("Mostrar # Impares");
        jBtnImpares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnImparesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBtnPares, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtnImpares, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTfNum1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnAgregar)))
                .addContainerGap(121, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTfNum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnAgregar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnPares)
                    .addComponent(jBtnImpares))
                .addContainerGap(200, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAgregarActionPerformed
        // TODO add your handling code here:
        int num = Integer.parseInt(jTfNum1.getText());
        if (num % 2 == 0) {
            int b = dN.agregarNumeroPar(num);
            if (b == 1) {
                JOptionPane.showMessageDialog(this, "Numero agregado", "Status", JOptionPane.INFORMATION_MESSAGE);
                jTfNum1.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "Error al guardar", "Status", JOptionPane.WARNING_MESSAGE);
                jTfNum1.setText("");
            }

        } else {
            int b = dNi.agregarNumeroImpar(num);
            if (b == 1) {
                JOptionPane.showMessageDialog(this, "Numero agregado", "Status", JOptionPane.INFORMATION_MESSAGE);
                jTfNum1.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "Error al guardar", "Status", JOptionPane.WARNING_MESSAGE);
                jTfNum1.setText("");
            }

        }

    }//GEN-LAST:event_jBtnAgregarActionPerformed

    private void jBtnParesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnParesActionPerformed
        // TODO add your handling code here:
        

        for (int i = 0; i < dN.getListanum().size(); i++) {

            JOptionPane.showMessageDialog(this, dN.getListanum().get(i));

        }
    }//GEN-LAST:event_jBtnParesActionPerformed

    private void jBtnImparesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnImparesActionPerformed
        // TODO add your handling code here:
        for (int i = 0; i < dNi.getListanumImpar().size(); i++) {

            JOptionPane.showMessageDialog(this, dNi.getListanumImpar().get(i));

        }
    }//GEN-LAST:event_jBtnImparesActionPerformed

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
            java.util.logging.Logger.getLogger(Formulario_examen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario_examen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario_examen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario_examen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario_examen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAgregar;
    private javax.swing.JButton jBtnImpares;
    private javax.swing.JButton jBtnPares;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTfNum1;
    // End of variables declaration//GEN-END:variables
}