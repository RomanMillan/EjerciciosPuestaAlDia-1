package ejercicios;

public class Rectangulo {
	private int longitud;
	private int ancho;
	
	public Rectangulo(int lonitud, int ancho) {
		super();
		this.setAncho(ancho);
		this.setLonitud(lonitud);
	}

	public int getLonitud() {
		return longitud;
	}

	public void setLonitud(int longitud) {
		if (longitud < 1 || longitud > 20) {
			this.longitud = 1;
		}else {
			this.longitud = longitud;
		}
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		if (ancho < 1 || ancho > 20) {
			this.ancho = 1;
		}else {
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
