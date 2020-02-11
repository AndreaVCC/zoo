package Zoo;

public class Terrestres extends Animales {
	
	
	//ATRIBUTOS
	private int cantidadPatas;
	private String tipoAlimentacion;
	private int horasSue�o;
	
	
	//CONSTRUCTOR
	public Terrestres(String nombre, String paisOrigen, String fechaIngreso, int cantidadPatas, String tipoAlimentacion, int horasSue�o) {
		super(nombre, paisOrigen, fechaIngreso);

		this.cantidadPatas = cantidadPatas;
		this.tipoAlimentacion = tipoAlimentacion;
		this.horasSue�o = horasSue�o;
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
	public int getHorasSue�o() {
		return horasSue�o;
	}
	public void setHorasSue�o(int horasSue�o) {
		this.horasSue�o = horasSue�o;
	}


	//TOSTRING
	@Override
	public String toString() {
		return "Terrestres [cantidadPatas=" + cantidadPatas + ", tipoAlimentacion=" + tipoAlimentacion + ", horasSue�o="
				+ horasSue�o + ", getNombre()=" + getNombre() + ", getPaisOrigen()=" + getPaisOrigen()
				+ ", getFechaIngreso()=" + getFechaIngreso() + "]";
	}

}