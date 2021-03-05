package ejercicios;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		try {
			Cuenta cb = new Cuenta(20,"5454");
			
			int elec = 0;
			
			while(elec != 4) {
				System.out.println("1 Hacer un reintegro. \n"
						+ "2 Hacer un ingreso \n"
						+ "3 Consultar el saldo y numero de reintegros e ingresos. \n"
						+ "4 Finalizar las operaciones");
				 elec = teclado.nextInt();
				
				 switch (elec) { 
				case 1: {
					System.out.print("Introduce la cantidad a reintegrar: ");
					double reintegro = teclado.nextDouble();
					cb.reintegro(reintegro);
					System.out.println("\n");
					break;
				}
				case 2:{
					System.out.print("Introduce la cantidad: ");
					double ingreso = teclado.nextDouble();
					cb.ingresos(ingreso);
					System.out.println("\n");
					break;
				}
				case 3:{
					double reintegros = cb.getNumReintegros();
					double ingresos = cb.getNumIngresos();
					double saldo = cb.getSaldo();
					System.out.println("El saldo en cuenta es: " + saldo);
					System.out.println("El numero de reintegros: " + reintegros);
					System.out.println("El numero de ingresos: " + ingresos);
					System.out.println("\n");
					break;
				}
				
				default:
					throw new IllegalArgumentException("Unexpected value: " + elec);
				}
			}
		}
		catch(Exception roman){
			System.out.println(roman.getMessage());
		}
	}
}
