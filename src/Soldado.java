
public class Soldado {
	private int rango;
	private TipoSoldado nombre;
	private int velocidad;

	public Soldado(TipoSoldado nombre,int rango,int velocidad){
		this.rango=rango;
		this.nombre=nombre;
		this.velocidad=velocidad;
	}

	public int getRango() {
		return rango;
	}

	public void setRango(int rango) {
		this.rango = rango;
	}

	public TipoSoldado getNombre() {
		return nombre;
	}

	public void setNombre(TipoSoldado nombre) {
		this.nombre = nombre;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	
}

