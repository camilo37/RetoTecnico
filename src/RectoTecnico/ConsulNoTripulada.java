/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RectoTecnico;

import Controlador.CNoTripuladas;
import javax.swing.JOptionPane;

/**
 *
 * @author CAMILO
 */
public class ConsulNoTripulada extends javax.swing.JFrame {

    /**
     * Creates new form ConsulNoTripulada
     */
    public ConsulNoTripulada() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        lblNombre = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblEmpuje = new javax.swing.JLabel();
        txtPeso = new javax.swing.JTextField();
        txtAltura = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtEmpuje = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(405, 450));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText(" NAVES ESPACIALES NO TRIPULADAS");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 50, 320, 40);

        lblNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNombre.setText("Ingrese el nombre de la nave a buscar");
        getContentPane().add(lblNombre);
        lblNombre.setBounds(60, 110, 260, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Peso");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 200, 60, 17);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Altura");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 240, 60, 20);

        lblEmpuje.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblEmpuje.setText("Empuje");
        getContentPane().add(lblEmpuje);
        lblEmpuje.setBounds(30, 280, 60, 20);

        txtPeso.setEditable(false);
        txtPeso.setRequestFocusEnabled(false);
        getContentPane().add(txtPeso);
        txtPeso.setBounds(160, 190, 190, 30);

        txtAltura.setEditable(false);
        txtAltura.setRequestFocusEnabled(false);
        getContentPane().add(txtAltura);
        txtAltura.setBounds(160, 230, 190, 30);
        getContentPane().add(txtNombre);
        txtNombre.setBounds(70, 140, 190, 30);

        txtEmpuje.setEditable(false);
        txtEmpuje.setRequestFocusEnabled(false);
        getContentPane().add(txtEmpuje);
        txtEmpuje.setBounds(160, 270, 190, 30);

        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar);
        btnBuscar.setBounds(50, 330, 110, 40);

        btnVolver.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnVolver.setText("VOLVER");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver);
        btnVolver.setBounds(0, 0, 86, 33);

        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar);
        btnLimpiar.setBounds(190, 330, 110, 40);

        jButton1.setText("SALIR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(310, 0, 80, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
      
        if(txtNombre.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Ingresa el nombre de la nave");
        }
        else{   
        
        String nom = txtNombre.getText();
        
        CNoTripuladas noTripulada = new CNoTripuladas();
        
        noTripulada.setNombre(nom);
        
        noTripulada.consultar();
        
        int peso = noTripulada.getTonelPeso();
        int altura = noTripulada.getAltura();
        int empuje = noTripulada.getEmpuje();
        
        txtPeso.setText(Integer.toString(peso));
        txtAltura.setText(Integer.toString(altura));
        txtEmpuje.setText(Integer.toString(empuje));
        }
        
        
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        TiposNave verTiposNave = new TiposNave();
        verTiposNave.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        
        txtNombre.setText("");
        txtPeso.setText("");
        txtAltura.setText("");
        txtEmpuje.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Inicio verInicio = new Inicio();
        verInicio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ConsulNoTripulada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsulNoTripulada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsulNoTripulada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsulNoTripulada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsulNoTripulada().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblEmpuje;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JTextField txtAltura;
    private javax.swing.JTextField txtEmpuje;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPeso;
    // End of variables declaration//GEN-END:variables
}