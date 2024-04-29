package Gimnasio;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;


public class FrmInstructores extends javax.swing.JFrame {

    // Private variables used for instructor information
    private final int validacion;
    private String cedulaInstructor;
    private String nombreInstructor;
    private String apellidoInstructor;
    private String telefonoInstructor;
    private List<Servicio> serviciosAsignados = new ArrayList<>();
    private boolean estadoActivo;

    Servicio servicios = new Servicio();
    Instructor instructor = new Instructor();

    public FrmInstructores(int validacion) {
        this.validacion = validacion;
        initComponents();
        cargarFrame();
        cargarDatoslista();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        listServicios = new javax.swing.JList<>();
        btnPrincipal = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        boxEstado = new javax.swing.JCheckBox();
        lbEstado = new javax.swing.JLabel();
        lbPrincipal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel1.setText("Nombre:");

        jLabel2.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel2.setText("Cedula:");

        jLabel3.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel3.setText("Apellido:");

        jLabel4.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel4.setText("telefono:");

        listServicios.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        listServicios.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listServicios);

        btnPrincipal.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btnPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrincipalActionPerformed(evt);
            }
        });

        btnBuscar.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        boxEstado.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        boxEstado.setText("Activo");

        lbEstado.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        lbEstado.setText("Estado:");

        lbPrincipal.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(lbEstado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCedula)
                            .addComponent(txtNombre)
                            .addComponent(txtApellido)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(boxEstado)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(btnPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(184, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(278, 278, 278))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lbPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEstado)
                    .addComponent(boxEstado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(btnPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrincipalActionPerformed
        if (validacion == 1) {
            agregaInstructores();
            this.dispose();
        }
        if (validacion == 2) {
            serviciosAsignados.clear();
            modificaInstructor();
            this.dispose();
        }
    }//GEN-LAST:event_btnPrincipalActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        BuscaInstructor();
    }//GEN-LAST:event_btnBuscarActionPerformed

    //This method gathers the selected list from the interface and returns the selected Service object.
    public List<Servicio> asignarServicios() {
        List<Servicio> listTemp = new ArrayList<>();
        for (String nombre : listServicios.getSelectedValuesList()) {        
            listTemp.add(servicios.ListServicio.get(servicios.buscaServicio(servicios.ListServicio, nombre)));
        }
        return listTemp;
    }

    public void cargarDatoslista() {
        DefaultListModel<String> modeloLista = new DefaultListModel<>();
        for (Servicio servicio : servicios.ListServicio) {
            if(servicio.getEstadoActivo()){
                modeloLista.addElement(servicio.getNombreServicio());
            }          
        }
        listServicios.setModel(modeloLista);
    }

    //This method is responsible for loading the names of the services into the JList.
    public void cargarDatosLista(List<Servicio> serviciosAsignados) {
    HashSet<String> nombresAsignados = new HashSet<>();

    
    for (Servicio servicio : serviciosAsignados) {
        nombresAsignados.add(servicio.getNombreServicio());
    }

    
    listServicios.clearSelection();

   
    for (int i = 0; i < listServicios.getModel().getSize(); i++) {
        String nombreServicio = listServicios.getModel().getElementAt(i);
        if (nombresAsignados.contains(nombreServicio)) {
            listServicios.addSelectionInterval(i, i);
        }
    }
}

    public void capturarDatos() {
        try {
            cedulaInstructor = String.valueOf(txtCedula.getText());
            nombreInstructor = String.valueOf(txtNombre.getText());
            apellidoInstructor = String.valueOf(txtApellido.getText());
            telefonoInstructor = String.valueOf(txtTelefono.getText());
            serviciosAsignados = asignarServicios();
            if (validacion == 2) {
                estadoActivo = boxEstado.isSelected();
            }
        } catch (Exception e) {
            System.err.println("Error en capturar datos: " + e.getMessage());
        }
    }

    public boolean revisaCampos(String cedulaInstructor, String nombreInstructor, String ApellidoInstructor, String telefonoInstructor, List<Servicio> serviciosAsignados) {
        boolean validacion = false;
        try {
            if (!cedulaInstructor.equalsIgnoreCase("") && !nombreInstructor.equalsIgnoreCase("") && !ApellidoInstructor.equalsIgnoreCase("") && !telefonoInstructor.equalsIgnoreCase("")) {              
                if(!listServicios.isSelectionEmpty()){
                    validacion = true;
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en uno de los campos");
        }
        return validacion;
    }

    public void agregaInstructores() {
        try {
            capturarDatos();

            if (revisaCampos(cedulaInstructor, nombreInstructor, apellidoInstructor, telefonoInstructor, serviciosAsignados)) {

                Instructor instructor = new Instructor(cedulaInstructor, nombreInstructor, apellidoInstructor, telefonoInstructor, serviciosAsignados);
                instructor.agregaInstructor(instructor.ListInstructor, instructor);

            } else {
                JOptionPane.showMessageDialog(null, "Error en uno de los campos");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al agregar el servicio: " + e.getMessage());
        }
    }

    public void modificaInstructor() {
        try {
            capturarDatos();

            if (revisaCampos(cedulaInstructor, nombreInstructor, apellidoInstructor, telefonoInstructor, serviciosAsignados)) {

                Instructor instructor = new Instructor(cedulaInstructor, nombreInstructor, apellidoInstructor, telefonoInstructor, serviciosAsignados);               
                int pos = instructor.buscaInstructor(instructor.ListInstructor, txtCedula.getText());
                instructor.modificaInstrutor(instructor.ListInstructor, pos, instructor, boxEstado.isSelected());
            } else {
                JOptionPane.showMessageDialog(null, "Error en uno de los campos");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al modificar el servicio: " + e.getMessage());
        }
    }

    public void BuscaInstructor() {
        try {
            if (!txtCedula.getText().equalsIgnoreCase("")) {
                int pos = instructor.buscaInstructor(instructor.ListInstructor, txtCedula.getText());
                if (pos != -1) {
                    txtNombre.setText(instructor.ListInstructor.get(pos).getNombre());
                    txtApellido.setText(instructor.ListInstructor.get(pos).getApellido());
                    txtTelefono.setText(instructor.ListInstructor.get(pos).getTelefono());
                    cargarDatosLista(instructor.ListInstructor.get(pos).getServiciosAsignados());
                    boxEstado.setSelected(instructor.ListInstructor.get(pos).getEstadoActivo());
                } else {
                    JOptionPane.showMessageDialog(null, "El instructor no existe");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Error en el campo cedula");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al buscar el instructor: " + e.getMessage());
        }
    }

    /*This method configures the GUI frame based on the validacion parameter
     * If validacion is 1, it sets the form for new instructor registration
     * If validacion is 2, it sets the form for modifying existing instructor details*/
    public void cargarFrame() {
        setLocationRelativeTo(null);
        if (validacion == 1) {
            lbPrincipal.setText("Agregar");
            btnPrincipal.setText("Agregar");
            lbEstado.setVisible(false);
            boxEstado.setVisible(false);
            btnBuscar.setVisible(false);
        }
        if (validacion == 2) {
            lbPrincipal.setText("Modificar");
            btnPrincipal.setText("Modificar");
            lbEstado.setVisible(true);
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbEstado;
    private javax.swing.JLabel lbPrincipal;
    private javax.swing.JList<String> listServicios;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
