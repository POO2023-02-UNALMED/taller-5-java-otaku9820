package gestion;

import zooAnimales.Animal;

import java.util.ArrayList;
import java.util.List;

public class Zona {
    private String nombre;
    private Zoologico zoo;
    private List<Animal> animales ;

    public Zona(String nombre, Zoologico zoo) {
        this.nombre=nombre;
        this.zoo=zoo;
    }

    public Zona() {
        this(null,null);
    }

    public void setNombre(String nombre) {
        this.nombre=nombre;
    }

    public String getNombre() {
        return (this.nombre);
    }

    public void setZoo(Zoologico zoo) {
        this.zoo=zoo;
    }

    public Zoologico getZoo() {
        return (this.zoo);
    }

    public void agregarAnimales(Animal animal) {
        this.animales.add(animal);
        animal.agregarZona(this);
    }

    public int cantidadAnimales() {
        return (this.animales.size());
    }

}