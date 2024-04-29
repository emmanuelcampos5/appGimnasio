
package Gimnasio;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class Instructor extends Persona{   
    
    private List<Servicio> serviciosAsignados;
    
    public static List<Instructor>ListInstructor= new ArrayList();

    // Constructor
    public Instructor(String cedula, String nombre,String apellido, String telefono, List<Servicio> serviciosAsignados) {
        super(cedula, nombre, apellido, telefono);
        this.serviciosAsignados = new ArrayList<>(serviciosAsignados);
    }
    
    public Instructor(){
        
    }
    
    public List<Servicio> getServiciosAsignados() {
        return serviciosAsignados;
    }

    public void setServiciosAsignados(List<Servicio> listServicio) {
        serviciosAsignados  = listServicio;
    }
    
    public void removerServiciosInactivos(List<Instructor> ListInstructor, Servicio servicio){
        for(Instructor instructor: ListInstructor){
            if(instructor.serviciosAsignados.contains(servicio)){
                instructor.serviciosAsignados.remove(servicio);
            }
        }
    }
    
    public int buscaInstructor(List<Instructor> ListInstructor, String cedulaInstructor){
        for(int i=0; i<ListInstructor.size(); i++)              
            if(ListInstructor.get(i).getCedula().contains(cedulaInstructor))
                return i;
        return -1;        
    }
    
    public void agregaInstructor(List<Instructor> ListInstructor, Instructor instructor) {    
        if(buscaInstructor(ListInstructor, instructor.getCedula()) == -1){
            ListInstructor.add(instructor);
            JOptionPane.showMessageDialog(null,"Instructor inscrito correctamente.");
        }else{
            JOptionPane.showMessageDialog(null,"El instructor ya está registrado.");
        }
    }
    
    public void modificaInstrutor(List<Instructor> ListInstructor, int pos, Instructor instructor, boolean estadoActivo) {         
        ListInstructor.get(pos).setNombre(instructor.getNombre());
        ListInstructor.get(pos).setApellido(instructor.getApellido());
        ListInstructor.get(pos).setTelefono(instructor.getTelefono());
        ListInstructor.get(pos).setServiciosAsignados(instructor.getServiciosAsignados());
        ListInstructor.get(pos).setEstadoActivo(estadoActivo);
        JOptionPane.showMessageDialog(null,"Datos modificados");
    }        
}
