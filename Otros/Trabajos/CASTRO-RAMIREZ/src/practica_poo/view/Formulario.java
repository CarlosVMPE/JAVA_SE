/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_poo.view;

import practica_poo.service.ProgramadorWeb;
import practica_poo.service.SoporteTecnico;

/**
 *
 * @author Alumno
 */
public class Formulario extends javax.swing.JFrame {

    /**
     * Creates new form Formulario
     */
    public Formulario() {
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
        jtxtnombres = new javax.swing.JTextField();
        jtxtapellidos = new javax.swing.JTextField();
        jtxtdni = new javax.swing.JTextField();
        jcbxsexo = new javax.swing.JComboBox();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jcbxcategoria1 = new javax.swing.JComboBox();
        jcbxespecialidad1 = new javax.swing.JComboBox();
        btncalcular = new javax.swing.JButton();
        jbtnlimpiar = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxaprogramadorweb = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jcbxcategoria2 = new javax.swing.JComboBox();
        jcbxespecialidad2 = new javax.swing.JComboBox();
        jtxtaños = new javax.swing.JTextField();
        btncalcular2 = new javax.swing.JButton();
        btnlimpiar2 = new javax.swing.JButton();
        btnsalir2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtxasoportetecnico = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "INFORMACION ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));
        jPanel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxtnombres.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "NOMBRES", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));
        jPanel1.add(jtxtnombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 240, 70));

        jtxtapellidos.setBorder(javax.swing.BorderFactory.createTitledBorder("APELLIDOS"));
        jtxtapellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtapellidosActionPerformed(evt);
            }
        });
        jPanel1.add(jtxtapellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 270, 70));

        jtxtdni.setBorder(javax.swing.BorderFactory.createTitledBorder("DNI"));
        jPanel1.add(jtxtdni, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 270, 70));

        jcbxsexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "FEMENINO", "MASCULINO" }));
        jcbxsexo.setBorder(javax.swing.BorderFactory.createTitledBorder("SEXO"));
        jPanel1.add(jcbxsexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 240, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 630, 220));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jcbxcategoria1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SENIOR", "MASTER" }));
        jcbxcategoria1.setBorder(javax.swing.BorderFactory.createTitledBorder("CATEGORIA"));
        jPanel2.add(jcbxcategoria1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 191, 65));

        jcbxespecialidad1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "JAVA DEVELOPER", "NET DEVELOPER" }));
        jcbxespecialidad1.setBorder(javax.swing.BorderFactory.createTitledBorder("ESPECIALIDAD"));
        jPanel2.add(jcbxespecialidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 200, 70));

        btncalcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practica_poo/iconos/calculator.png"))); // NOI18N
        btncalcular.setText("CALCULAR");
        btncalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncalcularActionPerformed(evt);
            }
        });
        jPanel2.add(btncalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, 70));

        jbtnlimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practica_poo/iconos/limpiar.png"))); // NOI18N
        jbtnlimpiar.setText("LIMPIAR");
        jbtnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnlimpiarActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnlimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 140, 70));

        btnsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practica_poo/iconos/exit.png"))); // NOI18N
        btnsalir.setText("SALIR");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });
        jPanel2.add(btnsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 140, 70));

        jtxaprogramadorweb.setColumns(20);
        jtxaprogramadorweb.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jtxaprogramadorweb.setLineWrap(true);
        jtxaprogramadorweb.setRows(5);
        jtxaprogramadorweb.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "RESUMEN ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Aharoni", 1, 24))); // NOI18N
        jScrollPane1.setViewportView(jtxaprogramadorweb);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 540, 210));

        jTabbedPane1.addTab("Programador Web", jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jcbxcategoria2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "NIVEL 1", "NIVEL 2" }));
        jcbxcategoria2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CATEGORIA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N
        jPanel3.add(jcbxcategoria2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 180, 60));

        jcbxespecialidad2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "REDES", "SOPORTE PC" }));
        jcbxespecialidad2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ESPECIALIDAD", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N
        jPanel3.add(jcbxespecialidad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 170, 60));

        jtxtaños.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "AÑOS DE SERVICIO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N
        jPanel3.add(jtxtaños, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, 170, 60));

        btncalcular2.setText("CALCULAR");
        btncalcular2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncalcular2ActionPerformed(evt);
            }
        });
        jPanel3.add(btncalcular2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 90, 30));

        btnlimpiar2.setText("LIMPIAR");
        btnlimpiar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiar2ActionPerformed(evt);
            }
        });
        jPanel3.add(btnlimpiar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 100, 30));

        btnsalir2.setText("SALIR");
        btnsalir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalir2ActionPerformed(evt);
            }
        });
        jPanel3.add(btnsalir2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 120, 30));

        jtxasoportetecnico.setColumns(20);
        jtxasoportetecnico.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jtxasoportetecnico.setRows(5);
        jtxasoportetecnico.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "RESUMEN", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Aharoni", 1, 24))); // NOI18N
        jScrollPane2.setViewportView(jtxasoportetecnico);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 630, 230));

        jTabbedPane1.addTab("Soporte Tecnico", jPanel3);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 690, 430));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practica_poo/iconos/java_20131025_1864663017.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtapellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtapellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtapellidosActionPerformed

    private void btncalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncalcularActionPerformed
        // TODO add your handling code here:
        String nom=this.jtxtnombres.getText();
        String ape=this.jtxtapellidos.getText();
        String sex=this.jcbxsexo.getSelectedItem().toString();
        String dni=this.jtxtdni.getText();
        String esp=this.jcbxespecialidad1.getSelectedItem().toString();
        String cat=this.jcbxcategoria1.getSelectedItem().toString();
       
        ProgramadorWeb pw=new ProgramadorWeb(nom,ape,sex,dni,esp,cat);
        this.jtxaprogramadorweb.setText(pw.Datos());
       
                
                
    }//GEN-LAST:event_btncalcularActionPerformed

    private void btnlimpiar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiar2ActionPerformed
        // TODO add your handling code here:
         this.jtxtnombres.setText("");
    this.jtxtapellidos.setText("");
    this.jcbxsexo.setSelectedIndex(0);
    this.jtxtdni.setText("");
    this.jcbxespecialidad2.setSelectedIndex(0);
     this.jcbxcategoria2.setSelectedIndex(0);    
    this.jtxtnombres.requestFocus();
    }//GEN-LAST:event_btnlimpiar2ActionPerformed

    private void btnsalir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalir2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnsalir2ActionPerformed

    private void jbtnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnlimpiarActionPerformed
        // TODO add your handling code here:
        this.jtxtnombres.setText("");
    this.jtxtapellidos.setText("");
    this.jcbxsexo.setSelectedIndex(0);
    this.jtxtdni.setText("");
    this.jcbxespecialidad1.setSelectedIndex(0);
     this.jcbxcategoria1.setSelectedIndex(0);
     this.jtxaprogramadorweb.setText("");
     this.jtxasoportetecnico.setText("");
    this.jtxtnombres.requestFocus();
    }//GEN-LAST:event_jbtnlimpiarActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnsalirActionPerformed

    private void btncalcular2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncalcular2ActionPerformed
        // TODO add your handling code here:
        String nom=this.jtxtnombres.getText();
        String ape=this.jtxtapellidos.getText();
        String sex=this.jcbxsexo.getSelectedItem().toString();
        String dni=this.jtxtdni.getText();
        String esp=this.jcbxespecialidad2.getSelectedItem().toString();
        String cat=this.jcbxcategoria2.getSelectedItem().toString();
        int a=Integer.parseInt(this.jtxtaños.getText());
       
        SoporteTecnico st=new SoporteTecnico(nom,ape,sex,dni,esp,cat,a);
        this.jtxasoportetecnico.setText(st.Datos());
    }//GEN-LAST:event_btncalcular2ActionPerformed


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
    private javax.swing.JButton btncalcular;
    private javax.swing.JButton btncalcular2;
    private javax.swing.JButton btnlimpiar2;
    private javax.swing.JButton btnsalir;
    private javax.swing.JButton btnsalir2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jbtnlimpiar;
    private javax.swing.JComboBox jcbxcategoria1;
    private javax.swing.JComboBox jcbxcategoria2;
    private javax.swing.JComboBox jcbxespecialidad1;
    private javax.swing.JComboBox jcbxespecialidad2;
    private javax.swing.JComboBox jcbxsexo;
    private javax.swing.JTextArea jtxaprogramadorweb;
    private javax.swing.JTextArea jtxasoportetecnico;
    private javax.swing.JTextField jtxtapellidos;
    private javax.swing.JTextField jtxtaños;
    private javax.swing.JTextField jtxtdni;
    private javax.swing.JTextField jtxtnombres;
    // End of variables declaration//GEN-END:variables
}