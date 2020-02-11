package Zoo;

public class Acuaticos extends Animales{
	
	//ATRIBUTOS
	private String tipoAmbiente; 	//dulce o salada
	private int numeroAletas;
	private String nivelAgresividad; 	//De 1 - 3
	
	
	//CONSTRUCTOR
	public Acuaticos(String nombre, String paisOrigen, String fechaIngreso, String tipoAmbiente, int numeroAletas, String nivelAgresividad) {
		super(nombre, paisOrigen, fechaIngreso);
		
		this.tipoAmbiente = tipoAmbiente;
		this.numeroAletas = numeroAletas;
		this.nivelAgresividad = nivelAgresividad;
	}
	
	public Acuaticos () {
	}
	
	//GETTERS SETTERS
	public String getTipoAmbiente() {
		return tipoAmbiente;
	}
	//Entrego el tipo de ambiente segun la opcion elegida (D o S)
	public void setTipoAmbiente(String tipoAmbiente) {
		if (tipoAmbiente.equals("D")) {
			this.tipoAmbiente = "Es de agua dulce";
		}else if (tipoAmbiente.equals("S")) {
			this.tipoAmbiente = "Es de agua salada";
		}
	}
	
	public int getNumeroAletas() {
		return numeroAletas;
	}
	public void setNumeroAletas(int numeroAletas) {
		this.numeroAletas = numeroAletas;
	}
	
	public String getNivelAgresividad() {
		return nivelAgresividad;
	
	}
	public void setNivelAgresividad(int nivelAgresividad) {
		
		switch (nivelAgresividad) {
		case 1: {
			this.nivelAgresividad = "bajo";
			break;
		}
		case 2: {
			this.nivelAgresividad = "media";
			break;
		}
		case 3: {
			this.nivelAgresividad = "alta";
			break;
		}
		default:
			this.nivelAgresividad = "Mal ingresada";
			
		}
		
	}


	
	
	
	//TOSTRING
	@Override
	public String toString() {
		return "Acuaticos [tipoAmbiente=" + tipoAmbiente + ", numeroAletas=" + numeroAletas + ", nivelAgresividad="
				+ nivelAgresividad + ", getNombre()=" + getNombre() + ", getPaisOrigen()=" + getPaisOrigen()
				+ ", getFechaIngreso()=" + getFechaIngreso() + "]";
	}

		
	
}
