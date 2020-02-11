package Zoo;

public class Terrestres extends Animales {
	
	
	//ATRIBUTOS
	private int cantidadPatas;
	private String tipoAlimentacion;
	private int horasSueño;
	
	
	//CONSTRUCTOR
	public Terrestres(String nombre, String paisOrigen, String fechaIngreso, int cantidadPatas, String tipoAlimentacion, int horasSueño) {
		super(nombre, paisOrigen, fechaIngreso);

		this.cantidadPatas = cantidadPatas;
		this.tipoAlimentacion = tipoAlimentacion;
		this.horasSueño = horasSueño;
	}

	public Terrestres () {
	}

	//GETTERS SETTERS
	public int getCantidadPatas() {
		return cantidadPatas;
	}
	public void setCantidadPatas(int cantidadPatas) {
		this.cantidadPatas = cantidadPatas;
	}
	public String getTipoAlimentacion() {
		return tipoAlimentacion;
	}
	public void setTipoAlimentacion(String tipoAlimentacion) {
		this.tipoAlimentacion = tipoAlimentacion;
	}
	public int getHorasSueño() {
		return horasSueño;
	}
	public void setHorasSueño(int horasSueño) {
		this.horasSueño = horasSueño;
	}


	//TOSTRING
	@Override
	public String toString() {
		return "Terrestres [cantidadPatas=" + cantidadPatas + ", tipoAlimentacion=" + tipoAlimentacion + ", horasSueño="
				+ horasSueño + ", getNombre()=" + getNombre() + ", getPaisOrigen()=" + getPaisOrigen()
				+ ", getFechaIngreso()=" + getFechaIngreso() + "]";
	}

}