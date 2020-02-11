package Zoo;

public class Animales {
	
	//ATRIBUTOS
	private String nombre;
	private String paisOrigen;
	private String fechaIngreso;
	
	
	
	//CONSTRUCTOR
	public Animales(String nombre, String paisOrigen, String fechaIngreso) {
		this.nombre = nombre;
		this.paisOrigen = paisOrigen;
		this.fechaIngreso = fechaIngreso;
	}
	
	public Animales (){
		this.nombre = "";
		this.paisOrigen = "";
		this.fechaIngreso = "";
	}


	//GETTERS SETTERS
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPaisOrigen() {
		return paisOrigen;
	}
	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}
	public String getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}


	//STRING
	@Override
	public String toString() {
		return "Animales [nombre=" + nombre + ", paisOrigen=" + paisOrigen + ", fechaIngreso=" + fechaIngreso + "]";
	}
	
	

}
