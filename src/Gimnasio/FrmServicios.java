package Gimnasio;

import javax.swing.JOptionPane;

public class FrmServicios extends javax.swing.JFrame {

    private final int validacion;

    private String nombreServicio;
    private int costoServicio;
    private String horarioServicio;
    private boolean estadoActivo;

    Servicio servicios = new Servicio();

    public FrmServicios(int validacion) {
        this.validacion = validacion;
        initComponents();
        cargarFrame();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombreServicio = new javax.swing.JTextField();
        txtCostoServicio = new javax.swing.JTextField();
        txtHorarioServicio = new javax.swing.JTextField();
        lbAgregar = new javax.swing.JLabel();
        btnPrincipal = new javax.swing.JButton();
        lbEstado = new javax.swing.JLabel();
        boxEstado = new javax.swing.JCheckBox();
        btnBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel1.setText("Nombre del servicio:");

        jLabel2.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel2.setText("Costo del servicio:");

        jLabel3.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel3.setText("Horario del Servicio:");

        lbAgregar.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N

        btnPrincipal.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btnPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrincipalActionPerformed(evt);
            }
        });

        lbEstado.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N

        boxEstado.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        boxEstado.setText("Activo");

        btnBuscar.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lbEstado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNombreServicio, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                                    .addComponent(txtCostoServicio)
                                    .addComponent(txtHorarioServicio)
                                    .addComponent(boxEstado))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(btnPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(lbAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombreServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCostoServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtHorarioServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxEstado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(btnPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrincipalActionPerformed
        if(validacion == 1){
            agregaServicio();
            this.dispose();
        }
        if(validacion == 2){
            modificaServicio();
            this.dispose();
        }
    }//GEN-LAST:event_btnPrincipalActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        BuscaServicio();
    }//GEN-LAST:event_btnBuscarActionPerformed

    public void capturarDatos() {
        try {
            nombreServicio = String.valueOf(txtNombreServicio.getText());
            costoServicio = Integer.parseInt(txtCostoServicio.getText());
            horarioServicio = String.valueOf(txtHorarioServicio.getText());
            if (validacion == 2) {
                estadoActivo = boxEstado.isSelected();
            }
        } catch (Exception e) {
            System.err.println("Error en capturar datos: " + e.getMessage());
        }
    }

    public boolean revisaCampos(String nombreServicio, int costoServicio) {
        boolean validacion = false;
        try {
            if (!nombreServicio.equalsIgnoreCase("") && costoServicio > 0) {
                validacion = true;
            }
        } catch (Exception e) {
            System.err.println("Error en los campos: " + e.getMessage());
        }
        return validacion;
    }

    public void agregaServicio() {
        try {
            capturarDatos();

            if (revisaCampos(nombreServicio, costoServicio)) {           
                
                Servicio servicio = new Servicio(nombreServicio, costoServicio, horarioServicio);
                servicios.agregaServicio(servicios.ListServicio, servicio);
                
            } else {
                JOptionPane.showMessageDialog(null, "Error en uno de los campos");
            }
        } catch (Exception e) {           
            JOptionPane.showMessageDialog(null, "Error al agregar el servicio: " + e.getMessage());
        }
    }
    
    public void modificaServicio() {
        try {
            capturarDatos();

            if (revisaCampos(nombreServicio, costoServicio)) {           
                
                Servicio servicio = new Servicio(nombreServicio, costoServicio, horarioServicio);
                int pos = servicios.buscaServicio(servicios.ListServicio, txtNombreServicio.getText());
                servicios.modificaServicio(servicios.ListServicio, pos ,servicio, boxEstado.isSelected());
                
                if(!boxEstado.isSelected()){
                    Servicio servicioTemp = servicios.ListServicio.get(pos);
                    Inscripcion inscripcion = new Inscripcion();
                    inscripcion.removerServiciosInactivos(inscripcion.ListInscripcion, servicioTemp);
                    
                    Instructor instructor = new Instructor();
                    instructor.removerServiciosInactivos(instructor.ListInstructor, servicioTemp);
                }
                
            } else {
                JOptionPane.showMessageDialog(null, "Error en uno de los campos");
            }
        } catch (Exception e) {           
            JOptionPane.showMessageDialog(null, "Error al modificar el servicio: " + e.getMessage());
        }
    }
    
    public void BuscaServicio() {
        try {
            if(!txtNombreServicio.getText().equalsIgnoreCase("")){
                int pos = servicios.buscaServicio(servicios.ListServicio, txtNombreServicio.getText());
                if(pos != -1){
                    txtCostoServicio.setText(Integer.toString(servicios.ListServicio.get(pos).getCostoMensual()));
                    txtHorarioServicio.setText(servicios.ListServicio.get(pos).getHorario());
                    boxEstado.setSelected(servicios.ListServicio.get(pos).getEstadoActivo());
                }else{
                    JOptionPane.showMessageDialog(null, "El servicio no existe");
                }             
            } else {
                JOptionPane.showMessageDialog(null, "Error en el campo Nombre");
            }
        } catch (Exception e) {           
            JOptionPane.showMessageDialog(null, "Error al buscar el servicio: " + e.getMessage());
        }
    }

    public void cargarFrame() {
        setLocationRelativeTo(null);
        if (validacion == 1) {
            lbAgregar.setText("Agregar");
            btnPrincipal.setText("Agregar");
            boxEstado.setVisible(false);
            btnBuscar.setVisible(false);
        }
        if (validacion == 2) {
            lbAgregar.setText("Modificar");
            btnPrincipal.setText("Modificar");
            lbEstado.setText("Estado");
            boxEstado.setVisible(true);
            btnBuscar.setVisible(true);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox boxEstado;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnPrincipal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbAgregar;
    private javax.swing.JLabel lbEstado;
    private javax.swing.JTextField txtCostoServicio;
    private javax.swing.JTextField txtHorarioServicio;
    private javax.swing.JTextField txtNombreServicio;
    // End of variables declaration//GEN-END:variables
}
