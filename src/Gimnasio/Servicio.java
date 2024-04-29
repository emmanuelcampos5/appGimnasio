package Gimnasio;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Servicio {

    private String nombreServicio;
    private int costoMensual;
    private String horario;
    private boolean estadoActivo;

    public static List<Servicio> ListServicio = new ArrayList();

    public Servicio(String nombreServicio, int costoMensual, String horario) {
        this.nombreServicio = nombreServicio;
        this.costoMensual = costoMensual;
        this.horario = horario;
        this.estadoActivo = true;
    }

    public Servicio() {

    }

    public String getNombreServicio() {
        return nombreServicio;
    }

    public void setNombreServicio(String nombreServicio) {
        this.nombreServicio = nombreServicio;
    }

    public int getCostoMensual() {
        return costoMensual;
    }

    public void setCostoMensual(int costoMensual) {
        this.costoMensual = costoMensual;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public boolean getEstadoActivo() {
        return estadoActivo;
    }

    public void setEstadoActivo(boolean estadoActivo) {
        this.estadoActivo = estadoActivo;
    }

    //This method adds four Servicio objects to the ListServicio list
    public void setServicios() {
        ListServicio.add(new Servicio("Ejercicio con maquinas", 15000, ""));
        ListServicio.add(new Servicio("Ejercicios funcionales", 10000, ""));
        ListServicio.add(new Servicio("Aerobicos", 15000, ""));
        ListServicio.add(new Servicio("Calistenia", 15000, ""));
    }  

    public int buscaServicio(List<Servicio> ListServicio, String nombreServicio) {
        for (int i = 0; i < ListServicio.size(); i++) {
            if (ListServicio.get(i).getNombreServicio().equalsIgnoreCase(nombreServicio)) {
                return i;
            }
        }
        return -1;
    }

    public void agregaServicio(List<Servicio> ListServicio, Servicio servicio) {
        if (buscaServicio(ListServicio, servicio.getNombreServicio()) == -1) {
            ListServicio.add(servicio);
            JOptionPane.showMessageDialog(null, "Servicio agregado correctamente.");
        } else {
            JOptionPane.showMessageDialog(null, "El servicio ya está registrado.");
        }
    }

    public void modificaServicio(List<Servicio> ListServicio, int pos, Servicio servicio, boolean estadoActivo) {
        ListServicio.get(pos).setNombreServicio(servicio.getNombreServicio());
        ListServicio.get(pos).setCostoMensual(servicio.getCostoMensual());
        ListServicio.get(pos).setHorario(servicio.getHorario());
        ListServicio.get(pos).setEstadoActivo(estadoActivo);
        JOptionPane.showMessageDialog(null, "Datos modificados");
    }
    
    //This method is a boolean method that checks if all the services in the ListServicio have non-empty values for their "horario" property
    public boolean verificarHorariosServicios(){
        for(int i = 0;i < ListServicio.size();i++){
            if(ListServicio.get(i).getHorario().equals("")){                
                return false;
            }
        }
        return true;
    }
}
