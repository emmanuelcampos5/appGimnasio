package Gimnasio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmRifas extends javax.swing.JFrame {

    DefaultTableModel ListadoGanadores;
    Inscripcion inscripciones = new Inscripcion();
    Rifa rifas = new Rifa();

    public FrmRifas() {
        initComponents();
        setLocationRelativeTo(null);
        ListadoGanadores = (DefaultTableModel) tblListadoGanadores.getModel();
        ListadoRifa();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblListadoGanadores = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnRealizarRifa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tblListadoGanadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Cedula", "Nombre", "Telefono", "Fecha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblListadoGanadores);
        if (tblListadoGanadores.getColumnModel().getColumnCount() > 0) {
            tblListadoGanadores.getColumnModel().getColumn(0).setResizable(false);
            tblListadoGanadores.getColumnModel().getColumn(1).setResizable(false);
            tblListadoGanadores.getColumnModel().getColumn(2).setResizable(false);
            tblListadoGanadores.getColumnModel().getColumn(3).setResizable(false);
            tblListadoGanadores.getColumnModel().getColumn(4).setResizable(false);
        }

        btnBuscar.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel1.setText("Listado de Ganadores");

        btnRealizarRifa.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btnRealizarRifa.setText("Realizar Rifa");
        btnRealizarRifa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRealizarRifaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 896, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRealizarRifa, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(338, 338, 338))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRealizarRifa))
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRealizarRifaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealizarRifaActionPerformed
        generarRifa();
    }//GEN-LAST:event_btnRealizarRifaActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        ListadoRifa(txtBuscar.getText());
    }//GEN-LAST:event_btnBuscarActionPerformed

    //This method generates three winning clients for the raffle. It returns an array of Inscripcion objects representing the winning clients      
    public Inscripcion[] generarCodigosGanadores() {
        Inscripcion clientesGanadores[] = new Inscripcion[3];
        Random random = new Random();
        Set<Integer> indicesSeleccionados = new HashSet<>();

        List<Inscripcion> inscripcionesActivas = new ArrayList<>();
        for (Inscripcion inscripcion : inscripciones.ListInscripcion) {
            if (inscripcion.getEstadoActivo()) {
                inscripcionesActivas.add(inscripcion);
            }
        }

        if (inscripcionesActivas.size() < clientesGanadores.length) {
            JOptionPane.showMessageDialog(null, "No existen clientes suficientes para realizar una rifa");
        } else {
            int i = 0;
            while (i < clientesGanadores.length) {
                int index = random.nextInt(inscripcionesActivas.size());
                if (!indicesSeleccionados.contains(index)) {
                    indicesSeleccionados.add(index);
                    clientesGanadores[i] = inscripcionesActivas.get(index);
                    i++;
                }
            }
        }
        return clientesGanadores;
    }

    //This method executes the process of generating the raffle. it creates a new Rifa object and adds it to the rifas.listRifas
    public void generarRifa() {
        try {
            Inscripcion[] inscripcionesGanadoras = generarCodigosGanadores();

            for (Inscripcion inscripcion : inscripcionesGanadoras) {
                Rifa rifa = new Rifa(inscripcion.getCodigoCliente(), inscripcion.getCedula(), inscripcion.getNombre(), inscripcion.getApellido(), inscripcion.getTelefono());
                rifa.agregaRifa(rifas.listRifas, rifa);
            }
            ListadoRifa();
        } catch (Exception e) {
            System.out.println("Error al realizar la rifa: " + e.getMessage());
        }
    }

    //This method fills the table for displaying the list of raffle winners
    public void ListadoRifa() {

        String datos[] = new String[5];

        ListadoGanadores.setRowCount(0);

        Collections.sort(rifas.listRifas);

        for (int i = 0; i < rifas.listRifas.size(); i++) {
            datos[0] = Integer.toString(rifas.listRifas.get(i).getCodigoCliente());
            datos[1] = rifas.listRifas.get(i).getCedula();
            datos[2] = rifas.listRifas.get(i).getNombre() + " " + rifas.listRifas.get(i).getApellido();
            datos[3] = rifas.listRifas.get(i).getTelefono();
            datos[4] = rifas.listRifas.get(i).getFechaRifaFormato();

            ListadoGanadores.addRow(datos);
        }
    }

    //This overloaded method updates the list of raffle winners based on the provided nombreCliente
    private void ListadoRifa(String nombreCliente) {

        String datos[] = new String[5];

        if (!nombreCliente.isEmpty()) {

            ListadoGanadores.setRowCount(0);

            Collections.sort(rifas.listRifas);

            for (Rifa rifaActual : rifas.listRifas) {
                if (rifaActual.getNombre().equalsIgnoreCase(nombreCliente)) {
                    datos[0] = Integer.toString(rifaActual.getCodigoCliente());
                    datos[1] = rifaActual.getCedula();
                    datos[2] = rifaActual.getNombre() + " " + rifaActual.getApellido();
                    datos[3] = rifaActual.getTelefono();
                    datos[4] = rifaActual.getFechaRifaFormato();
                    ListadoGanadores.addRow(datos);
                }
            }

        } else {
            ListadoRifa();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnRealizarRifa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblListadoGanadores;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
