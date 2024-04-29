
package Gimnasio;


public class FrmOpcionesCRUD extends javax.swing.JFrame {

    private int validacion = 0;
    
    public FrmOpcionesCRUD(int validacion) {
        initComponents();
        this.validacion = validacion;
        cargarFrame();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTexto = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnLista = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        lbTexto.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        lbTexto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTexto.setToolTipText("");
        lbTexto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnAgregar.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnModificar.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnLista.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btnLista.setText("Lista");
        btnLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(81, Short.MAX_VALUE)
                .addComponent(lbTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(lbTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLista, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //This method is called when the "Agregar" button is clicked. It checks the value of the "validacion" variable and opens a specific form accordingly
    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if(validacion == 1){
            FrmInscripcion frmInscripcion = new FrmInscripcion(1);
            frmInscripcion.setVisible(true);
        }
        if(validacion == 2){
            FrmServicios frmServicios = new FrmServicios(1);
            frmServicios.setVisible(true);
        }
        if(validacion == 3){
            FrmInstructores frmInstructores = new FrmInstructores(1);
            frmInstructores.setVisible(true);
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    //This method is called when the "Modificar" button is clicked. Similar to the previous method, it checks the "validacion" variable and opens the appropriate form
    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if(validacion == 1){
            FrmInscripcion frmInscripcion = new FrmInscripcion(2);
            frmInscripcion.setVisible(true);
        }
        if(validacion == 2){
            FrmServicios frmServicios = new FrmServicios(2);
            frmServicios.setVisible(true);
        }
        if(validacion == 3){
            FrmInstructores frmInstructores = new FrmInstructores(2);
            frmInstructores.setVisible(true);
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    //This method is called when the "Lista" button is clicked. Similar to the previous methods, it checks the "validacion" variable and opens the corresponding list form
    private void btnListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaActionPerformed
        if(validacion == 1){
            FrmListadoClientes frmListadoClientes = new FrmListadoClientes();
            frmListadoClientes.setVisible(true);
        }
        if(validacion == 2){
            FrmListadoServicios frmListadoServicios = new FrmListadoServicios();
            frmListadoServicios.setVisible(true);
        }
        if(validacion == 3){
            FrmListadoInstructores frmListadoInstructores = new FrmListadoInstructores();
            frmListadoInstructores.setVisible(true);
        }
    }//GEN-LAST:event_btnListaActionPerformed

    /*This helper method is used to set the text of a label "lbTexto" based on the value of the "validacion" variable. It sets the text to "Clientes" if "validacion" is 1,
    "Servicios" if it's 2, and "Instructores" if it's 3*/
    public void cargarFrame(){
        setLocationRelativeTo(null);
        if(validacion == 1){
            lbTexto.setText("Clientes");
        }
        if(validacion == 2){
            lbTexto.setText("Servicios");
        }
        if(validacion == 3){
            lbTexto.setText("Instructores");
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnLista;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel lbTexto;
    // End of variables declaration//GEN-END:variables
}
