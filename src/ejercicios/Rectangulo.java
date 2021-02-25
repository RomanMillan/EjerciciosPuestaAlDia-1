package ejercicios;

public class Rectangulo {
	private int longitud= 1;
	private int ancho = 1;
	
	public Rectangulo(int lonitud, int ancho) {
		super();
		this.longitud = lonitud;
		this.ancho = ancho;
	}

	public int getLonitud() {
		return longitud;
	}

	public void setLonitud(int longitud) {
		if (longitud > 1 || longitud <20) {
			this.longitud = longitud;
		}
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		if (ancho > 1 || ancho < 20) {
			this.ancho = ancho;
		}
	}
	
	public int perimetro(int longitud, int ancho) {
		return (this.longitud + this.ancho) * 2; 
	}
	
	public int area(int longitud, int ancho) {
		return this.longitud * this.ancho;
	}
}
