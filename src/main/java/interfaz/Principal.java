/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.Metodo;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bnieto
 */
public class Principal extends javax.swing.JFrame {

    private int[][] mInit;
    private int row, cols;

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtFila = new javax.swing.JTextField();
        label1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtColumn = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnCrear = new javax.swing.JButton();
        btnLlenar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        lbl1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblInicial = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblFinal = new javax.swing.JTable();
        cmbOpcion = new javax.swing.JComboBox<>();
        btnAccion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Iniciales"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtFila.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFilaKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFilaKeyReleased(evt);
            }
        });
        jPanel1.add(txtFila, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 32, 80, 30));

        label1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label1.setText("Filas:");
        jPanel1.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 33, 40, 30));

        jLabel1.setText("Columna:");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 35, -1, 20));

        txtColumn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtColumnKeyReleased(evt);
            }
        });
        jPanel1.add(txtColumn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 32, 80, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 290, 90));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCrear.setText("Crear");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });
        jPanel2.add(btnCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 100, -1));

        btnLlenar.setText("Llenar");
        btnLlenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLlenarActionPerformed(evt);
            }
        });
        jPanel2.add(btnLlenar, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 30, 100, -1));

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel2.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 30, 99, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 290, 90));

        lbl1.setFont(new java.awt.Font("Lucida Grande", 1, 17)); // NOI18N
        lbl1.setText("Manejo de matrices");
        getContentPane().add(lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

        tblInicial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblInicial);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 210, 230));

        tblFinal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblFinal);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 190, 230));

        cmbOpcion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Diagonal Principal.", "Diagonal Secundaria.", "Triangular superior.", "Transpuesta.", "Formar letra A.", "Formar letra Z.", "Formar letra T.", "Formar letra V.", "Formar letra E.", "Formar letra F.", "Formar letra P.", "Formar letra I.", "Formar letra N.", "Formar letra Y.", "Formar letra X." }));
        getContentPane().add(cmbOpcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 180, -1));

        btnAccion.setText("Acción");
        btnAccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccionActionPerformed(evt);
            }
        });
        getContentPane().add(btnAccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 120, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFilaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFilaKeyTyped

    }//GEN-LAST:event_txtFilaKeyTyped

    private void txtFilaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFilaKeyReleased
        // TODO add your handling code here:
        valida_fields(txtFila);
    }//GEN-LAST:event_txtFilaKeyReleased

    private void txtColumnKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtColumnKeyReleased
        // TODO add your handling code here:
        valida_fields(txtColumn);
    }//GEN-LAST:event_txtColumnKeyReleased

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed

        row = Integer.parseInt(txtFila.getText());
        cols = Integer.parseInt(txtColumn.getText());

        DefaultTableModel dtbl1, dtbl2;

        dtbl1 = (DefaultTableModel) tblInicial.getModel();
        dtbl2 = (DefaultTableModel) tblFinal.getModel();

        dtbl1.setColumnCount(cols);
        dtbl1.setRowCount(row);

        dtbl2.setColumnCount(cols);
        dtbl2.setRowCount(row);


    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnLlenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLlenarActionPerformed

        mInit = Metodo.matriz_aleatoria(row, cols); // llena la matriz aleatoriamente
        Metodo.llenar(mInit, tblInicial); // la matriz que insertara en el default table


    }//GEN-LAST:event_btnLlenarActionPerformed

    private void btnAccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccionActionPerformed
        // TODO add your handling code here:
        int op = cmbOpcion.getSelectedIndex();
        switch (op) {
            case 0:
                if (cols == row) {
                   int[][] diagp = mInit;
                   diagp = Metodo.diag_principal(diagp);
                   Metodo.llenar(diagp, tblFinal);
                   break;
                } else {
                   JOptionPane.showMessageDialog(this,"cantidad de columnas y filas diferentes.\n","Columnas y filas",NORMAL);
                   break;
                }
            case 1:
                if (cols == row) {
                   int[][] diagp = mInit;
                   diagp = Metodo.diag_sec(diagp);
                   Metodo.llenar(diagp, tblFinal);
                   break;
                } else {
                   JOptionPane.showMessageDialog(this,"cantidad de columnas y filas diferentes.\n","Columnas y filas",NORMAL);
                   break;
                }
                
        }
    }//GEN-LAST:event_btnAccionActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        
        limpiar_template();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void valida_fields(JTextField fild) {
        int tv1;
        StringBuffer aux = new StringBuffer(); // requerido para convertir array to string
        try {
            tv1 = Integer.parseInt(fild.getText()); // si valor es numero, bien
        } catch (NumberFormatException e) { // si no es numero, entonces
            JOptionPane.showMessageDialog(this, "Valor no valido solo numeros"); // mensaje de error y
            fild.requestFocus();
            String s = fild.getText(); // luego de poner el foco busco el texto
            String[] ray = s.split("([Aa-zZ]|[' '])", -1); // valido las letras en el texto y las inserto en ARRAY[]
            for (int i = 0; i < ray.length; i++) { // recorro array sin letras para insertarlo en variable STRINGBUFFER
                aux = aux.append(ray[i]); // variable llena
            }
            fild.setText(aux.toString()); // variable devuelta al field
        }

    }

    private void limpiar_template() {
        txtFila.setText("");
        txtColumn.setText("");
        mInit = new int[0][0];

        DefaultTableModel dtbl1, dtbl2;

        dtbl1 = (DefaultTableModel) tblInicial.getModel();
        dtbl2 = (DefaultTableModel) tblFinal.getModel();

        dtbl1.setColumnCount(0);
        dtbl1.setRowCount(0);

        dtbl2.setColumnCount(0);
        dtbl2.setRowCount(0);

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccion;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnLlenar;
    private javax.swing.JComboBox<String> cmbOpcion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel lbl1;
    private javax.swing.JTable tblFinal;
    private javax.swing.JTable tblInicial;
    private javax.swing.JTextField txtColumn;
    private javax.swing.JTextField txtFila;
    // End of variables declaration//GEN-END:variables
}
