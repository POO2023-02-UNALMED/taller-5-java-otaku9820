package zooAnimales;
import java.util.ArrayList;

public class Mamifero extends Animal{
    private  static ArrayList<Mamifero>listado=new ArrayList<>();
    public static  int caballos=0;
    public static int leones=0;
    private boolean pelaje;
    private  int patas;

    public Mamifero() {
        super();
        Mamifero.listado.add(this);
    }

    public Mamifero(String nombre,int edad,String habitat,String genero,boolean pelaje,int patas){
        super(nombre,edad,habitat,genero);
        this.pelaje=pelaje;
        this.patas=patas;
        Mamifero.listado.add(this);
    }

    public static ArrayList<Mamifero> getListado() {
        return listado;
    }

    public  static void setListado(ArrayList<Mamifero> listado) {
        Mamifero.listado = listado;
    }

    public static int getCaballos() {
        return caballos;
    }

    public static void setCaballos(int caballos) {
        Mamifero.caballos = caballos;
    }

    public static int getLeones() {
        return leones;
    }

    public static void setLeones(int leones) {
        Mamifero.leones = leones;
    }

    public boolean isPelaje() {
        return pelaje;
    }

    public void setPelaje(boolean pelaje) {
        this.pelaje = pelaje;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }
    public static Mamifero crearCaballo(String nombre,int edad,String genero) {

        Mamifero caballo= new Mamifero(nombre,edad,"Pradera",genero,true,4);
        Mamifero.caballos++;
        return caballo;


    }
    public static Mamifero crearLeon(String nombre,int edad,String genero) {
        Mamifero leon= new Mamifero(nombre,edad,"selva",genero,true,4);
        Mamifero.leones++;
        return leon;
    }
    public static int cantidadMamiferos() {
        return Mamifero.listado.size();
    }
}