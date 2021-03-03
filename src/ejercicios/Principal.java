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
					double result = cb.getSaldo();
					System.out.println(result);
					System.out.println("1 Hacer un reintegro. \n"
							+ "2 Hacer un ingreso \n"
							+ "3 Consultar el saldo y numero de reintegros e ingresos. \n"
							+ "4 Finalizar las operaciones");
					elec = teclado.nextInt();
					break;
				}
				case 2:{
					System.out.println("Introduce la cantidad: ");
					double cantidad = cb.getNumIngresos();
					System.out.println("1 Hacer un reintegro. \n"
							+ "2 Hacer un ingreso \n"
							+ "3 Consultar el saldo y numero de reintegros e ingresos. \n"
							+ "4 Finalizar las operaciones");
							elec = teclado.nextInt();		
							break;
				}
				case 3:{
					double reintegros = cb.getNumReintegros();
					double ingresos = cb.getNumIngresos();
					System.out.println("1 Hacer un reintegro. \n"
							+ "2 Hacer un ingreso \n"
							+ "3 Consultar el saldo y numero de reintegros e ingresos. \n"
							+ "4 Finalizar las operaciones");
					elec = teclado.nextInt();
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
