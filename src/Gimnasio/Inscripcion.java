package Gimnasio;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.JOptionPane;

public class Inscripcion extends Persona {

    private int codigoCliente;
    private List<Servicio> serviciosInscritos;
    private int mensualidad;

    public static List<Inscripcion> ListInscripcion = new ArrayList();

    //It calls the generarCodigo() method, which generates a unique code for the Inscripcion object. This code is used to identify the inscription.It calls the calcularMontoTotal() method, which calculates the total monthly cost 
    public Inscripcion(String cedula, String nombre, String apellido, String telefono, List<Servicio> serviciosInscritos) {
        super(cedula, nombre, apellido, telefono);
        this.serviciosInscritos = new ArrayList<>(serviciosInscritos);
        generarCodigo();
        calcularMontoTotal();
    }

    public Inscripcion() {

    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public int getMensualidad() {
        return mensualidad;
    }

    public void setMensualidad(int mensualidad) {
        this.mensualidad = mensualidad;
    }

    public List<Servicio> getServiciosInscritos() {
        return serviciosInscritos;
    }

    public void setServiciosInscritos(List<Servicio> listServicio) {
        serviciosInscritos = listServicio;               
    }

    public boolean verificarCodigoCliente(int codigoCliente) {
        for (int i = 0; i < ListInscripcion.size(); i++) {
            if (this.codigoCliente == codigoCliente) {
                return false;
            }
        }
        return true;
    }

    //This method generates a random code (integer) for a client. It ensures that the generated code is unique by checking if it is already in use
    public void generarCodigo() {
        Random random = new Random();
        int codigo;
        do {
            codigo = random.nextInt(900) + 100;
        } while (!verificarCodigoCliente(codigo));
        codigoCliente = codigo;
    }

    public int buscaInscripcion(List<Inscripcion> ListInscripcion, String cedulaCliente) {
        for (int i = 0; i < ListInscripcion.size(); i++) {
            if (ListInscripcion.get(i).getCedula().contains(cedulaCliente)) {
                return i;
            }
        }
        return -1;
    }

    public void agregaInscripcion(List<Inscripcion> ListInscripcion, Inscripcion inscripcion) {
        if (buscaInscripcion(ListInscripcion, inscripcion.getCedula()) == -1) {
            ListInscripcion.add(inscripcion);
            JOptionPane.showMessageDialog(null, "Inscripcion realizada correctamente.");
        } else {
            JOptionPane.showMessageDialog(null, "El cliente ya está inscrito.");
        }
    }

    public void modificaInscripcion(List<Inscripcion> ListInscripcion, int pos, Inscripcion inscripcion, boolean estadoActivo) {
        ListInscripcion.get(pos).setNombre(inscripcion.getNombre());
        ListInscripcion.get(pos).setApellido(inscripcion.getApellido());
        ListInscripcion.get(pos).setTelefono(inscripcion.getTelefono());
        ListInscripcion.get(pos).setServiciosInscritos(inscripcion.getServiciosInscritos());
        ListInscripcion.get(pos).calcularMontoTotal();
        ListInscripcion.get(pos).setEstadoActivo(estadoActivo);
        JOptionPane.showMessageDialog(null, "Datos modificados");
    }

    //This method returns a string containing the names of instructors who are assigned to a specific Servicio
    public String profesorAsignado(Servicio servicio) {
        String mensaje = "";     
        Instructor instructor = new Instructor();

        for (Instructor instructorAsignado : instructor.ListInstructor) {
            if (instructorAsignado.getServiciosAsignados().contains(servicio) && instructorAsignado.getEstadoActivo()) {
                mensaje += instructorAsignado.getNombre() + " " + instructorAsignado.getApellido() + ", ";
            }
        }
        return mensaje;
    }
    
    public void removerServiciosInactivos(List<Inscripcion> ListInscripcion, Servicio servicio){
        for(Inscripcion inscripcion: ListInscripcion){
            if(inscripcion.serviciosInscritos.contains(servicio)){
                inscripcion.serviciosInscritos.remove(servicio);
                inscripcion.calcularMontoTotal();
            }
        }
    }
    
    //method calculates the total monthly cost (mensualidad) for a set of Servicio objects (serviciosInscritos)
    public void calcularMontoTotal(){
        mensualidad = 0;
        for(Servicio servicio: serviciosInscritos){
            mensualidad += servicio.getCostoMensual();
        }
    }   
}
