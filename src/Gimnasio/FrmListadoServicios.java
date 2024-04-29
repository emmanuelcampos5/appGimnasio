package Gimnasio;

import javax.swing.table.DefaultTableModel;

public class FrmListadoServicios extends javax.swing.JFrame {

    Servicio servicios = new Servicio();
    Instructor instructores = new Instructor();
    DefaultTableModel ListadoServicios;

    public FrmListadoServicios() {
        initComponents();
        setLocationRelativeTo(null);
        ListadoServicios = (DefaultTableModel) tableServicios.getModel();
        ListadoServicios();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableServicios = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        tableServicios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre Servicio", "Costo Servicio", "Horario", "Estado Activo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableServicios);
        if (tableServicios.getColumnModel().getColumnCount() > 0) {
            tableServicios.getColumnModel().getColumn(0).setResizable(false);
            tableServicios.getColumnModel().getColumn(1).setResizable(false);
            tableServicios.getColumnModel().getColumn(2).setResizable(false);
            tableServicios.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel1.setText("Listado de Servicios");

        txtBuscar.setText("Instructor");
        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });

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
                        .addGap(257, 257, 257)
                        .addComponent(jLabel1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(27, 27, 27)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 683, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        ListadoServicios(txtBuscar.getText());
    }//GEN-LAST:event_btnBuscarActionPerformed

    //This method fills the JTable with information about each service
    public void ListadoServicios() {

        String datos[] = new String[4];

        ListadoServicios.setRowCount(0);

        for (int i = 0; i < servicios.ListServicio.size(); i++) {
            datos[0] = servicios.ListServicio.get(i).getNombreServicio();
            datos[1] = Integer.toString(servicios.ListServicio.get(i).getCostoMensual());
            datos[2] = servicios.ListServicio.get(i).getHorario();
            if (servicios.ListServicio.get(i).getEstadoActivo()) {
                datos[3] = "Activo";
            } else {
                datos[3] = "Inactivo";
            }
            ListadoServicios.addRow(datos);
        }
    }

    //This overloaded method is used to filter the services based on a specific instructor's name provided as "nombreInstructor"
    private void ListadoServicios(String nombreInstructor) {
    String datos[] = new String[4];
    if (!nombreInstructor.isEmpty()) {
        ListadoServicios.setRowCount(0);

        for (Instructor instructorActual : instructores.ListInstructor) {
            if (instructorActual.getNombre().equalsIgnoreCase(nombreInstructor)) {             
                for (Servicio servicio : instructorActual.getServiciosAsignados()) {
                    datos[0] = servicio.getNombreServicio();
                    datos[1] = Integer.toString(servicio.getCostoMensual());
                    datos[2] = servicio.getHorario();
                    datos[3] = servicio.getEstadoActivo() ? "Activo" : "Inactivo";
                    ListadoServicios.addRow(datos);
                }
            }
        }   
    }else{
        ListadoServicios();
    }
}



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableServicios;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
