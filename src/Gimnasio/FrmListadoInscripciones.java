package Gimnasio;

import java.awt.Component;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

public class FrmListadoInscripciones extends javax.swing.JFrame {

    Inscripcion inscripcion = new Inscripcion();
    DefaultTableModel ListadoInscripciones;

    public FrmListadoInscripciones() {
        initComponents();
        setLocationRelativeTo(null);
        ListadoInscripciones = (DefaultTableModel) tableInscripcion.getModel();
        ListadoInscripciones();
    }

    /*This method fills the JTable with information about each client's inscription 
    and the corresponding services they are enrolled in*/
    public void ListadoInscripciones() {

        String datos[] = new String[7];

        ListadoInscripciones.setRowCount(0);

        for (int i = 0; i < inscripcion.ListInscripcion.size(); i++) {

            if (inscripcion.ListInscripcion.get(i).getEstadoActivo()) {

                datos[0] = Integer.toString(inscripcion.ListInscripcion.get(i).getCodigoCliente());
                datos[1] = inscripcion.ListInscripcion.get(i).getNombre();
                datos[2] = inscripcion.ListInscripcion.get(i).getApellido();
                datos[3] = inscripcion.ListInscripcion.get(i).getServiciosInscritos().get(0).getNombreServicio();
                datos[4] = inscripcion.ListInscripcion.get(i).getServiciosInscritos().get(0).getHorario();
                datos[5] = inscripcion.ListInscripcion.get(i).profesorAsignado(inscripcion.ListInscripcion.get(i).getServiciosInscritos().get(0));
                datos[6] = Integer.toString(inscripcion.ListInscripcion.get(i).getMensualidad());

                for (int x = 0; x < inscripcion.ListInscripcion.get(i).getServiciosInscritos().size(); x++) {
                    datos[3] = inscripcion.ListInscripcion.get(i).getServiciosInscritos().get(x).getNombreServicio();
                    datos[4] = inscripcion.ListInscripcion.get(i).getServiciosInscritos().get(x).getHorario();
                    datos[5] = inscripcion.ListInscripcion.get(i).profesorAsignado(inscripcion.ListInscripcion.get(i).getServiciosInscritos().get(x));
                    ListadoInscripciones.addRow(datos);
                }
            }
        }

        for (int column = 0; column < tableInscripcion.getColumnCount(); column++) {
            int maxWidth = 0;
            for (int row = 0; row < tableInscripcion.getRowCount(); row++) {
                TableCellRenderer cellRenderer = tableInscripcion.getCellRenderer(row, column);
                Object value = tableInscripcion.getValueAt(row, column);
                Component comp = cellRenderer.getTableCellRendererComponent(tableInscripcion, value, false, false, row, column);
                maxWidth = Math.max(comp.getPreferredSize().width, maxWidth);
            }
            tableInscripcion.getColumnModel().getColumn(column).setPreferredWidth(maxWidth + 10); // Agrega un margen
        }
    }

    //This overloaded method is used to filter the inscriptions based on a specific service name provided as "nombreServicio"
    private void ListadoInscripciones(String nombreServicio) {
        if (!nombreServicio.isEmpty()) {
            ListadoInscripciones.setRowCount(0);

            for (int i = 0; i < inscripcion.ListInscripcion.size(); i++) {
                Inscripcion inscripcionActual = inscripcion.ListInscripcion.get(i);
                for (Servicio servicio : inscripcionActual.getServiciosInscritos()) {
                    if (servicio.getNombreServicio().equalsIgnoreCase(nombreServicio)) {
                        String[] datos = new String[7];
                        datos[0] = Integer.toString(inscripcionActual.getCodigoCliente());
                        datos[1] = inscripcionActual.getNombre();
                        datos[2] = inscripcionActual.getApellido();
                        datos[3] = servicio.getNombreServicio();
                        datos[4] = servicio.getHorario();
                        datos[5] = inscripcionActual.profesorAsignado(servicio);
                        datos[6] = Integer.toString(inscripcionActual.getMensualidad());
                        ListadoInscripciones.addRow(datos);
                    }
                }
            }
        } else {
            ListadoInscripciones();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableInscripcion = new javax.swing.JTable();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        tableInscripcion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Apellido", "Servicio", "Horario", "Instructor", "Mensualidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableInscripcion);
        if (tableInscripcion.getColumnModel().getColumnCount() > 0) {
            tableInscripcion.getColumnModel().getColumn(0).setResizable(false);
            tableInscripcion.getColumnModel().getColumn(1).setResizable(false);
            tableInscripcion.getColumnModel().getColumn(2).setResizable(false);
            tableInscripcion.getColumnModel().getColumn(3).setResizable(false);
            tableInscripcion.getColumnModel().getColumn(4).setResizable(false);
            tableInscripcion.getColumnModel().getColumn(5).setResizable(false);
            tableInscripcion.getColumnModel().getColumn(6).setResizable(false);
        }

        txtBuscar.setText("Servicio");

        btnBuscar.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel1.setText("Listado de Inscripciones");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 994, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(381, 381, 381)
                        .addComponent(jLabel1)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        ListadoInscripciones(txtBuscar.getText());
    }//GEN-LAST:event_btnBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableInscripcion;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
