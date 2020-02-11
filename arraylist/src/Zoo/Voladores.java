package Zoo;

public class Voladores extends Animales {

	//ATRIBUTOS
	private String colorPluma;
	private	String tamano;
	private Boolean migrante;
	
	
	//CONSTRUCTOR
	public Voladores(String nombre, String paisOrigen, String fechaIngreso, String colorPluma, String tamano, Boolean migrante) {
		super(nombre, paisOrigen, fechaIngreso);
		
		this.colorPluma = colorPluma;
		this.tamano = tamano;
		this.migrante = migrante;
	}
	public Voladores () {
	}


	//GETTERS SETTERS
	public String getColorPluma() {
		return colorPluma;
	}
	public void setColorPluma(String colorPluma) {
		this.colorPluma = colorPluma;
	}
	public String getTamano() {
		return tamano;
	}
	public void setTamano(String tamano) {
		this.tamano = tamano;
	}
	public Boolean getMigrante() {
		return migrante;
	}
	public void setMigrante(Boolean migrante) {
		this.migrante = migrante;
	}

	
	//TOSTRING
	@Override
	public String toString() {
		return "Voladores [colorPluma=" + colorPluma + ", tamano=" + tamano + ", migrante=" + migrante
				+ ", getNombre()=" + getNombre() + ", getPaisOrigen()=" + getPaisOrigen() + ", getFechaIngreso()="
				+ getFechaIngreso() + "]";
	}
	
	
	
}