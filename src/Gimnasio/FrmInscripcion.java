package Gimnasio;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

public class FrmInscripcion extends javax.swing.JFrame {

    // Private variables used for client information
    private final int validacion;
    private String cedulaCliente;
    private String nombreCliente;
    private String apellidoCliente;
    private String telefonoCliente;
    private List<Servicio> serviciosInscritos = new ArrayList<>();
    private boolean estadoActivo;

    Servicio servicios = new Servicio();
    Inscripcion inscripcion = new Inscripcion();

    public FrmInscripcion(int validacion) {
        this.validacion = validacion;
        initComponents();
        cargarFrame();
        cargarDatoslista();
    }

    //This method is called from within the constructor to initialize the form.    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        txtCedula = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listServicios = new javax.swing.JList<>();
        btnPrincipal = new javax.swing.JButton();
        lbEstado = new javax.swing.JLabel();
        boxEstado = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel1.setText("Cedula:");

        jLabel2.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel2.setText("Modulo de Inscripcion");

        btnBuscar.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel3.setText("Cliente");

        jLabel5.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel5.setText("Nombre:");

        jLabel6.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel6.setText("Apellido:");

        jLabel7.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel7.setText("Telefono:");

        jLabel8.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel8.setText("Servicios a Inscribir");

        listServicios.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        listServicios.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listServicios);

        btnPrincipal.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btnPrincipal.setText("INSCRIBIRSE");
        btnPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrincipalActionPerformed(evt);
            }
        });

        lbEstado.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        lbEstado.setText("Estado:");

        boxEstado.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        boxEstado.setText("Activo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(194, 194, 194))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(17, 17, 17)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel1)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel6)
                                                        .addComponent(jLabel7))
                                                    .addGap(1, 1, 1))))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addContainerGap()
                                            .addComponent(jLabel5)))
                                    .addComponent(lbEstado, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(boxEstado)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtCedula)
                                            .addComponent(txtNombre)
                                            .addComponent(txtApellido)
                                            .addComponent(txtTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(btnPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(btnBuscar)
                            .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbEstado)
                            .addComponent(boxEstado))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(btnPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrincipalActionPerformed
        if (validacion == 1) {
            agregaInscripcion();
            this.dispose();
        }
        if (validacion == 2) {
            modificaInscripcion();
            this.dispose();
        }
    }//GEN-LAST:event_btnPrincipalActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        BuscaInscripcion();
    }//GEN-LAST:event_btnBuscarActionPerformed

    //This method gathers the selected list from the interface and returns the selected Service object.
    public List<Servicio> asignarServicios() {
        List<Servicio> listTemp = new ArrayList<>();
        for (String nombre : listServicios.getSelectedValuesList()) {
            listTemp.add(servicios.ListServicio.get(servicios.buscaServicio(servicios.ListServicio, nombre)));
        }
        return listTemp;
    }

    //This method is responsible for loading the names of the services into the JList.
    public void cargarDatosLista(List<Servicio> serviciosInscritos) {
        HashSet<String> nombresAsignados = new HashSet<>();

        for (Servicio servicio : serviciosInscritos) {
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

    public void agregaInscripcion() {
        try {
            capturarDatos();

            if (revisaCampos(cedulaCliente, nombreCliente, apellidoCliente, telefonoCliente, serviciosInscritos)) {

                Inscripcion inscripcion = new Inscripcion(cedulaCliente, nombreCliente, apellidoCliente, telefonoCliente, serviciosInscritos);
                inscripcion.agregaInscripcion(this.inscripcion.ListInscripcion, inscripcion);
                exportarArchivoPlano(inscripcion.getCodigoCliente());
                generarFactura(inscripcion);

            } else {
                JOptionPane.showMessageDialog(null, "Error en uno de los campos");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al agregar la inscripcion: " + e.getMessage());
        }
    }

    public void BuscaInscripcion() {
        try {
            if (!txtCedula.getText().equalsIgnoreCase("")) {
                int pos = inscripcion.buscaInscripcion(inscripcion.ListInscripcion, txtCedula.getText());
                if (pos != -1) {
                    txtNombre.setText(inscripcion.ListInscripcion.get(pos).getNombre());
                    txtApellido.setText(inscripcion.ListInscripcion.get(pos).getApellido());
                    txtTelefono.setText(inscripcion.ListInscripcion.get(pos).getTelefono());
                    cargarDatosLista(inscripcion.ListInscripcion.get(pos).getServiciosInscritos());
                    boxEstado.setSelected(inscripcion.ListInscripcion.get(pos).getEstadoActivo());                   
                } else {
                    JOptionPane.showMessageDialog(null, "El cliente no existe");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Error en el campo cedula");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al buscar el cliente: " + e.getMessage());
        }
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

    public void capturarDatos() {
        try {
            cedulaCliente = String.valueOf(txtCedula.getText());
            nombreCliente = String.valueOf(txtNombre.getText());
            apellidoCliente = String.valueOf(txtApellido.getText());
            telefonoCliente = String.valueOf(txtTelefono.getText());
            serviciosInscritos = asignarServicios();
            if (validacion == 2) {
                estadoActivo = boxEstado.isSelected();
            }
        } catch (Exception e) {
            System.err.println("Error en capturar datos: " + e.getMessage());
        }
    }

    public void modificaInscripcion() {
        try {
            capturarDatos();

            if (revisaCampos(cedulaCliente, nombreCliente, apellidoCliente, telefonoCliente, serviciosInscritos)) {

                Inscripcion inscripcion = new Inscripcion(cedulaCliente, nombreCliente, apellidoCliente, telefonoCliente, serviciosInscritos);
                int pos = inscripcion.buscaInscripcion(inscripcion.ListInscripcion, txtCedula.getText());
                inscripcion.modificaInscripcion(this.inscripcion.ListInscripcion, pos, inscripcion, boxEstado.isSelected());
            } else {
                JOptionPane.showMessageDialog(null, "Error en uno de los campos");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al modificar la inscripcion: " + e.getMessage());
        }
    }

    public boolean revisaCampos(String cedulaCliente, String nombreCliente, String ApellidoCliente, String telefonoCliente, List<Servicio> serviciosInscritos) {
        boolean validacion = false;
        try {
            if (!cedulaCliente.equalsIgnoreCase("") && !nombreCliente.equalsIgnoreCase("") && !ApellidoCliente.equalsIgnoreCase("") && !telefonoCliente.equalsIgnoreCase("") && !listServicios.isSelectionEmpty()) {
                validacion = true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en uno de los campos");
        }
        return validacion;
    }

    //This method generates a formatted String message containing the client's information to be written to the text file.
    public String recogerDatosArchivoPlano(int codigo) {
        String mensaje = "";

        mensaje += "-------------Cliente-------------\n";
        mensaje += "Codigo de Cliente: " + codigo + "\n";
        mensaje += "Cedula de Cliente: " + cedulaCliente + "\n";
        mensaje += "Nombre Completo: " + nombreCliente + " " + apellidoCliente + "\n";
        mensaje += "Telefono: " + telefonoCliente + "\n";
        mensaje += "Servicios asignados: ";
        for(Servicio servicio: serviciosInscritos){
            mensaje += servicio.getNombreServicio() + ", ";
        }
        mensaje += "\n---------------------------------\n";

        return mensaje;
    }

    //This method exports the client's information to a text file.
    public void exportarArchivoPlano(int codigo) {
        File archivo;
        FileWriter w;
        BufferedWriter bw;
        PrintWriter pw;

        String rutaArchivo = "C:\\Users\\emman\\Downloads\\ListaClientes.txt"; // Ruta del archivo
        String mensaje = recogerDatosArchivoPlano(codigo);

        try {
            archivo = new File(rutaArchivo);

            if (archivo.createNewFile()) {
                System.out.println("Archivo creado: " + rutaArchivo);
            }

            w = new FileWriter(archivo, true);
            bw = new BufferedWriter(w);
            pw = new PrintWriter(bw);
            pw.println(mensaje);
            pw.close();
            System.out.println("guardado en archivo plano");

        } catch (IOException e) {
            System.err.println("Error al guardar en archivo: " + e);
        }
    }

    //This method generates a PDF invoice for the client's subscription.
    public void generarFactura(Inscripcion inscripcion) {
        try {
            PDDocument document = new PDDocument();
            PDPage page = new PDPage();
            document.addPage(page);

            PDPageContentStream contentStream = new PDPageContentStream(document, page);
            contentStream.beginText();
            contentStream.setFont(PDType1Font.TIMES_ROMAN, 12);
            contentStream.newLineAtOffset(100, 700);

            contentStream.showText("-------------Datos del Cliente-------------");
             contentStream.newLineAtOffset(0, -20);
            contentStream.showText("Codigo de Cliente: " + inscripcion.getCodigoCliente());
             contentStream.newLineAtOffset(0, -20);
            contentStream.showText("Cedula de Cliente: " + inscripcion.getCedula());
             contentStream.newLineAtOffset(0, -20);
            contentStream.showText("Nombre Completo: " + inscripcion.getNombre() + " " + inscripcion.getApellido());
             contentStream.newLineAtOffset(0, -20);
            contentStream.showText("Telefono: " + inscripcion.getTelefono());
             contentStream.newLineAtOffset(0, -20);

            int contador = 1;
            for (Servicio servicio : serviciosInscritos) {
                contentStream.showText("-------------Servicio " + contador + "-------------");
                 contentStream.newLineAtOffset(0, -20);
                contentStream.showText("Servicio: " + servicio.getNombreServicio());
                 contentStream.newLineAtOffset(0, -20);
                contentStream.showText("Horario: " + servicio.getHorario());
                 contentStream.newLineAtOffset(0, -20);
                contentStream.showText("Costo Mensual del Servicio: " + servicio.getCostoMensual());
                 contentStream.newLineAtOffset(0, -20);
                contentStream.showText("instructores asignados: " + inscripcion.profesorAsignado(servicio));
                 contentStream.newLineAtOffset(0, -20);
                 contador++;
            }
            contentStream.showText("---------------------------------");
             contentStream.newLineAtOffset(0, -20);
            contentStream.showText("Monto a pagar por Mes: " + inscripcion.getMensualidad());
             contentStream.newLineAtOffset(0, -20);

            contentStream.endText();
            contentStream.close();

            String rutaArchivoPDF = "C:\\Users\\emman\\Downloads\\FacturaCliente" + inscripcion.getCodigoCliente() + ".pdf";
            document.save(rutaArchivoPDF);
            document.close();
        } catch (IOException e) {
            System.err.println("Error al generar  PDF: " + e);
        }
    }

    /*This method configures the GUI frame based on the validacion parameter
     If validacion is 1, it sets the form for new client registration
     If validacion is 2, it sets the form for modifying existing client details*/ 
    public void cargarFrame() {
        setLocationRelativeTo(null);
        if (validacion == 1) {
            btnPrincipal.setText("INSCRIBIRSE");
            lbEstado.setVisible(false);
            boxEstado.setVisible(false);
            btnBuscar.setVisible(false);
        }
        if (validacion == 2) {
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbEstado;
    private javax.swing.JList<String> listServicios;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
