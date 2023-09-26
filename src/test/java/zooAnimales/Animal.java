package zooAnimales;
import java.util.ArrayList;

public class Ave extends Animal{
	private static ArrayList<Ave> listado = new ArrayList<Ave>();
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;

	public Ave(String nombre,int edad,String habitat,String genero,String colorPlumas){
		super(nombre,edad,habitat,genero);
		this.colorPlumas = colorPlumas;
		listado.add(this);
	}

	public Ave(){
		listado.add(this);
	}

	public static int cantidadAves(){
		return listado.size();
	}

	@Override
	public String movimiento(){
		return "volar";
	}

	public static Ave crearHalcon(String nombre,int edad,String genero){
		Ave halcon = new Ave(nombre,edad,"montanas",genero,"cafe glorioso");
		halcones += 1;
		return halcon;
	}

	public static Ave crearAguila(String nombre,int edad,String genero){
		Ave aguila = new Ave(nombre,edad,"montanas",genero,"blanco y amarillo");
		aguilas += 1;
		return aguila;
	}

	public static ArrayList<Ave> getListado(){
		return listado;
	}

	public static void setListado(ArrayList<Ave> listado){
		Ave.listado = listado;
	}

	public String getColorPlumas(){
		return this.colorPlumas;
	}

	public void setColorPlumas(String colorPlumas){
		this.colorPlumas = colorPlumas;
	}
}