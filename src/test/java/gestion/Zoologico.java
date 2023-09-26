package gestion;

import java.util.ArrayList;
import java.util.List;

public class Zoologico {
    private String nombre;
    private String ubicacion;
    private List<Zona> zonas= new ArrayList<>();

    public Zoologico(String nombre, String ubicacion) {
        this.nombre=nombre;
        this.ubicacion=ubicacion;
        this.zonas=new ArrayList<Zona>();
    }
    public Zoologico() {
        this.nombre=null;
        this.ubicacion=null;
        this.zonas = new ArrayList<>();
    }

    public void setNombre(String nombre) {
        this.nombre=nombre;
    }

    public String getNombre() {
        return (this.nombre);
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion=ubicacion;
    }

    public String getUbicacion() {
        return (this.ubicacion);
    }

    public void agregarZonas(Zona zona) {
        this.zonas.add(zona);
    }

    public int cantidadTotalAnimales() {
        int Total=0;
        for (Zona i : this.zonas) {
            int x= i.cantidadAnimales();
            Total= Total + x;
        }
        return (Total);
    }
    public List<Zona> getZona() {
        return zonas;
    }
}