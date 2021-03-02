package ejercicios;

public class Main {

	public static void main(String[] args) {
		Rectangulo rec = new Rectangulo(5,3);
		
		int perimetro = rec.perimetro(5, 3);
		int area = rec.area(5, 3);
		System.out.println("El perimetro es: " + perimetro + " y el area: " + area);
	}
}
