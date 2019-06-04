package org.lab.entities;

import java.util.Date;

public class Llave {
    private String llave;
    private String nombre;
    private Date fecha;
    
    public static String getTable(){ return "llaves"; }

    public Llave() {
    }

    public Llave(String llave, String nombre, Date fecha) {
        this.llave = llave;
        this.nombre = nombre;
        this.fecha = fecha;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getLlave() {
        return llave;
    }

    public void setLlave(String llave) {
        this.llave = llave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre + " " + fecha;
    }
    
        
}
