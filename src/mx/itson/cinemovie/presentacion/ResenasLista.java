/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mx.itson.cinemovie.presentacion;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import mx.itson.cinemovie.entidades.Pelicula;
import mx.itson.cinemovie.entidades.Resena;

/**
 * Lista de reseñas y peliculas
 * @author Emmanuel
 */
public class ResenasLista extends javax.swing.JFrame {

    /**
     * Creates new form Resenas
     */
    public ResenasLista() {
        initComponents();
        
        // Metodos para que la descripción no genere una barra horizontal cuando exista mucho texto
        txtDescripcion.setLineWrap(true);
        txtDescripcion.setWrapStyleWord(true);
        
        DefaultTableModel modelo1 = (DefaultTableModel)tblPeliculas.getModel();
        DefaultTableModel modelo2 = (DefaultTableModel)tblResenas.getModel();
        // Eliminar la columna id
        tblResenas.removeColumn(tblResenas.getColumnModel().getColumn(0));
        tblPeliculas.removeColumn(tblPeliculas.getColumnModel().getColumn(0));
        modelo2.setRowCount(0);
        
        Pelicula.cargarTabla(modelo1);
        
        // Desactivar los botones de agregar, editar y eliminar resena
        btnAgregarRese.setEnabled(false);
        btnEditarRese.setEnabled(false);
        btnEliminarRese.setEnabled(false);       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblPeliculas = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblResenas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        btnAgregarRese = new javax.swing.JButton();
        btnEditarRese = new javax.swing.JButton();
        btnEliminarRese = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblPeliculas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Título", "Duración", "Genero", "Calificación"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPeliculas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPeliculasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPeliculas);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Peliculas:");

        tblResenas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Usuario", "Descripción", "Calificación"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblResenas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblResenasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblResenas);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Reseñas:");

        txtDescripcion.setEditable(false);
        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        jScrollPane3.setViewportView(txtDescripcion);

        jLabel3.setText("Descripción:");

        btnAgregarRese.setText("Agregar reseña");
        btnAgregarRese.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarReseActionPerformed(evt);
            }
        });

        btnEditarRese.setText("Editar reseña");
        btnEditarRese.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarReseActionPerformed(evt);
            }
        });

        btnEliminarRese.setText("Eliminar reseña");
        btnEliminarRese.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarReseActionPerformed(evt);
            }
        });

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane3)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnAgregarRese)
                        .addGap(138, 138, 138)
                        .addComponent(btnEditarRese)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                        .addComponent(btnEliminarRese)
                        .addGap(16, 16, 16))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRegresar)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(btnRegresar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarRese)
                    .addComponent(btnEditarRese)
                    .addComponent(btnEliminarRese))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblPeliculasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPeliculasMouseClicked
        DefaultTableModel modelo = (DefaultTableModel)tblResenas.getModel();
        
        if (tblPeliculas.getSelectedRowCount() == 1){
            Resena.cargarTabla(modelo, tblPeliculas);
            btnAgregarRese.setEnabled(true);
        } else {
            modelo.setRowCount(0);
            btnAgregarRese.setEnabled(false);
            btnEditarRese.setEnabled(false);
            btnEliminarRese.setEnabled(false);
        }
        
        txtDescripcion.setText("");
    }//GEN-LAST:event_tblPeliculasMouseClicked

    private void tblResenasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblResenasMouseClicked
        DefaultTableModel modelo = (DefaultTableModel)tblResenas.getModel();
        
        // Si se selecciona una reseña mostrar la descripción en txtDescripción
        if (tblResenas.getSelectedRowCount() == 1){
            txtDescripcion.setText(modelo.getValueAt(tblResenas.getSelectedRow(), 2).toString());
            // Habilitar los botones editar y eliminar
            btnEditarRese.setEnabled(true);
            btnEliminarRese.setEnabled(true);
        } else if (tblResenas.getSelectedRowCount() > 1){
            txtDescripcion.setText("");
            // Deshabilitar el boton editar y habilitar eliminar
            btnEditarRese.setEnabled(false);
            btnEliminarRese.setEnabled(true);
        } else {
            txtDescripcion.setText("");
            // Deshabilitar los botones editar y eliminar
            btnEditarRese.setEnabled(false);
            btnEliminarRese.setEnabled(false);
        }
    }//GEN-LAST:event_tblResenasMouseClicked

    private void btnAgregarReseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarReseActionPerformed
        ResenasForm resenasForm = new ResenasForm(this, true);
        // Modelos de las tablas
        DefaultTableModel modeloR = (DefaultTableModel)tblResenas.getModel();
        DefaultTableModel modeloP = (DefaultTableModel)tblPeliculas.getModel();
        
        // Variable que almacena el índice de la fila seleccionada en la tabla peliculas
        int filaPelicula = tblPeliculas.getSelectedRow();
        resenasForm.setIdpelicula(Integer.parseInt(tblPeliculas.getModel().getValueAt(filaPelicula, 0).toString()));
        resenasForm.setVisible(true);
        
        Resena.cargarTabla(modeloR, tblPeliculas);
        Pelicula.cargarTabla(modeloP);
        
        // Selecciona la fila nuevamente (al pasar el metodo cargarTabla se pierden las selecciones en las tablas)
        tblPeliculas.setRowSelectionInterval(filaPelicula, filaPelicula);
        
        btnEditarRese.setEnabled(false);
        btnEliminarRese.setEnabled(false);
        
    }//GEN-LAST:event_btnAgregarReseActionPerformed

    private void btnEditarReseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarReseActionPerformed
        // Variable que almacena el índice de la fila seleccionada en la tabla peliculas
        int filaPelicula = tblPeliculas.getSelectedRow();
        // Id de la reseña a editar
        int id = Integer.parseInt(tblResenas.getModel().getValueAt(tblResenas.getSelectedRow(), 0).toString());
        int idPelicula = Integer.parseInt(tblPeliculas.getModel().getValueAt(filaPelicula, 0).toString());
        String usuario = tblResenas.getValueAt(tblResenas.getSelectedRow(), 0).toString();
        String descripcion = tblResenas.getValueAt(tblResenas.getSelectedRow(), 1).toString();
        float calificacion = Float.parseFloat(tblResenas.getValueAt(tblResenas.getSelectedRow(), 2).toString());
        
        ResenasForm resenasForm = new ResenasForm(this, true);
        // Modelos de las tablas
        DefaultTableModel modeloR = (DefaultTableModel)tblResenas.getModel();
        DefaultTableModel modeloP = (DefaultTableModel)tblPeliculas.getModel();
        
        // Asigna los valores de la tabla a los campos que existen en el formulario reseñas
        resenasForm.setId(id);
        resenasForm.setIdpelicula(idPelicula);
        resenasForm.setUsuario(usuario);
        resenasForm.setDescripcion(descripcion);
        resenasForm.setCalificacion(calificacion);
        
        resenasForm.setVisible(true);
        Resena.cargarTabla(modeloR, tblPeliculas);
        Pelicula.cargarTabla(modeloP);
        
        // Selecciona la fila nuevamente (al pasar el metodo cargarTabla se pierden las selecciones en las tablas)
        tblPeliculas.setRowSelectionInterval(filaPelicula, filaPelicula);
        
        btnEditarRese.setEnabled(false);
        btnEliminarRese.setEnabled(false);
    }//GEN-LAST:event_btnEditarReseActionPerformed

    private void btnEliminarReseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarReseActionPerformed
        // Variable que almacena el índice de la fila seleccionada en la tabla peliculas
        int filaPelicula = tblPeliculas.getSelectedRow();
        // Modelos de las tablas
        DefaultTableModel modeloR = (DefaultTableModel)tblResenas.getModel();
        DefaultTableModel modeloP = (DefaultTableModel)tblPeliculas.getModel();
        
        // Crea una variable que almacenara la id de cada columna seleccionada
        int ids[] = tblResenas.getSelectedRows();
        // Asigna la id correspondiente a cada campo que existe en ids
        for (int i=0; tblResenas.getSelectedRowCount()>i; i++){
            ids[i] = Integer.parseInt(tblResenas.getModel().getValueAt(tblResenas.getSelectedRows()[i], 0).toString());
        }
        boolean resultado = Resena.eliminar(ids);
        
        // Mostrar un mensaje de dialogo dependiendo del valor de resultado
        if(resultado){
            JOptionPane.showMessageDialog(this, "El registro se actualizo correctamente", "Registro borrado", JOptionPane.INFORMATION_MESSAGE);
            btnEliminarRese.setEnabled(false);
            btnEditarRese.setEnabled(false);
        } else {
            JOptionPane.showMessageDialog(this, "Ocurrió un error al borrar", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        Resena.cargarTabla(modeloR, tblPeliculas);
        Pelicula.cargarTabla(modeloP);
        // Selecciona la fila en la tabla peliculas nuevamente (al pasar el metodo cargarTabla se pierden las selecciones en las tablas)
        tblPeliculas.setRowSelectionInterval(filaPelicula, filaPelicula);
        
        btnEditarRese.setEnabled(false);
        btnEliminarRese.setEnabled(false);
    }//GEN-LAST:event_btnEliminarReseActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // Regresa al Jframe principal
        Principal principal = new Principal();
        principal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

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
            java.util.logging.Logger.getLogger(ResenasLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResenasLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResenasLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResenasLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ResenasLista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarRese;
    private javax.swing.JButton btnEditarRese;
    private javax.swing.JButton btnEliminarRese;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblPeliculas;
    private javax.swing.JTable tblResenas;
    private javax.swing.JTextArea txtDescripcion;
    // End of variables declaration//GEN-END:variables
}
