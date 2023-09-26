package zooAnimales;

import java.util.ArrayList;
public class Anfibio extends Animal{
    private static ArrayList<Anfibio>listado=new ArrayList<>();
    public static int ranas=0;
    public static int salamandras=0;
    private String colorPiel;
    private boolean venenoso;

    public Anfibio() {
        super();
        Anfibio.listado.add(this);
    }

    public Anfibio(String nombre,int edad,String habitat,String genero,String colorPiel,boolean venenoso) {
        super(nombre,edad,habitat,genero);
        this.colorPiel = colorPiel;
        Anfibio.listado.add(this);

    }

    public  static ArrayList<Anfibio> getListado() {
        return Anfibio.listado;
    }
    public static void setListado(ArrayList<Anfibio> listado) {
        Anfibio.listado = listado;
    }
    public static int getRanas() {
        return ranas;
    }
    public static void setRanas(int ranas) {
        Anfibio.ranas = ranas;
    }
    public static int getSalamandras() {
        return salamandras;
    }
    public static void setSalamandras(int salamandras) {
        Anfibio.salamandras = salamandras;
    }
    public String getColorPiel() {
        return colorPiel;
    }
    public void setColorPiel(String colorPiel) {
        this.colorPiel = colorPiel;
    }
    public boolean isVenenoso() {
        return venenoso;
    }
    public void setVenenoso(boolean venenoso) {
        this.venenoso = venenoso;
    }
    public String movimiento() {
        return "saltar";
    }
    public static Anfibio crearRana(String nombre,int edad,String genero) {
        Anfibio rana=new Anfibio(nombre,edad,"selva",genero,"rojo",true);
        Anfibio.ranas++;
        return rana;
    }
    public static  Anfibio crearSalamandra(String nombre,int edad,String genero) {
        Anfibio salamandra=new Anfibio(nombre,edad,"selva",genero,"negro y amarillo",false);
        Anfibio.salamandras++;
        return salamandra;
    }
    public static int cantidadAnfibios() {
        return Anfibio.listado.size();
    }
}