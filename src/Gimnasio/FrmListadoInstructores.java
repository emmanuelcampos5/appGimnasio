package Gimnasio;

import java.awt.Component;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

public class FrmListadoInstructores extends javax.swing.JFrame {

    Instructor instructor = new Instructor();
    DefaultTableModel ListadoInstructores;

    public FrmListadoInstructores() {
        initComponents();
        setLocationRelativeTo(null);
        ListadoInstructores = (DefaultTableModel) tableInstructores.getModel();
        ListadoInstructores();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableInstructores = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        tableInstructores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Cedula", "Nombre", "Apellido", "Telefono", "Servicios Asignados", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableInstructores);
        if (tableInstructores.getColumnModel().getColumnCount() > 0) {
            tableInstructores.getColumnModel().getColumn(0).setResizable(false);
            tableInstructores.getColumnModel().getColumn(1).setResizable(false);
            tableInstructores.getColumnModel().getColumn(2).setResizable(false);
            tableInstructores.getColumnModel().getColumn(3).setResizable(false);
            tableInstructores.getColumnModel().getColumn(4).setResizable(false);
            tableInstructores.getColumnModel().getColumn(5).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel1.setText("Listado de Instructores");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1040, Short.MAX_VALUE)
                .addGap(27, 27, 27))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(399, 399, 399))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //This method fills with information about each instructor and their assigned services
    public void ListadoInstructores() {

        String datos[] = new String[6];

        ListadoInstructores.setRowCount(0);

        for (int i = 0; i < instructor.ListInstructor.size(); i++) {
            datos[0] = instructor.ListInstructor.get(i).getCedula();
            datos[1] = instructor.ListInstructor.get(i).getNombre();
            datos[2] = instructor.ListInstructor.get(i).getApellido();
            datos[3] = instructor.ListInstructor.get(i).getTelefono();
            datos[4] = nombreServicios(i);
            if (instructor.ListInstructor.get(i).getEstadoActivo()) {
                datos[5] = "Activo";
            } else {
                datos[5] = "Inactivo";
            }
            ListadoInstructores.addRow(datos);
        }

        for (int column = 0; column < tableInstructores.getColumnCount(); column++) {
            int maxWidth = 0;
            for (int row = 0; row < tableInstructores.getRowCount(); row++) {
                TableCellRenderer cellRenderer = tableInstructores.getCellRenderer(row, column);
                Object value = tableInstructores.getValueAt(row, column);
                Component comp = cellRenderer.getTableCellRendererComponent(tableInstructores, value, false, false, row, column);
                maxWidth = Math.max(comp.getPreferredSize().width, maxWidth);
            }
            tableInstructores.getColumnModel().getColumn(column).setPreferredWidth(maxWidth + 10); // Agrega un margen
        }
    }

    //This method is a helper function used by the "ListadoInstructores()" method to retrieve the names of services assigned to a specific instructor
    public String nombreServicios(int index) {
        String nombres = "";
        for (Servicio servicio : instructor.ListInstructor.get(index).getServiciosAsignados()) {
            nombres += servicio.getNombreServicio() + ", ";         
        }
        return nombres;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableInstructores;
    // End of variables declaration//GEN-END:variables
}
