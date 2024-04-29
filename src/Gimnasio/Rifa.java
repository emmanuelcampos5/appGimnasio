package Gimnasio;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Rifa extends Persona implements Comparable<Rifa>{

    private int codigoCliente;
    private Date fechaRifa;

    public static List<Rifa> listRifas = new ArrayList<>();

    public Rifa(int codigoCliente, String cedula, String nombre, String apellido, String telefono) {
        super(cedula, nombre, apellido, telefono);
        this.codigoCliente = codigoCliente;
        this.fechaRifa = new Date();
    }

    public Rifa() {

    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public Date getFechaRifa() {
        return fechaRifa;
    }

    //This method is a getter method that returns the date and time of the Rifa object in a formatted string.
    public String getFechaRifaFormato() {
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        return formatoFecha.format(fechaRifa);
    }
    
    /*This method is likely implementing the Comparable interface, which allows objects of the class to be compared based on a certain property
    In this case, the Rifa class implements the compareTo method to compare Rifa objects based on their fechaRifa property*/ 
    public int compareTo(Rifa rifa) {
        return rifa.getFechaRifa().compareTo(this.fechaRifa);
    }

    public void agregaRifa(List<Rifa> ListRifas, Rifa rifa) {
        if (rifa != null) {
            ListRifas.add(rifa);
        }
    }
}
