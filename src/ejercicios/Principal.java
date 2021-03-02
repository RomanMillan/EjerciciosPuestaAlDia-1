package ejercicios;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		Cuenta cb = new Cuenta(20,"5454");
		
		System.out.println("1 Hacer un reintegro. \n"
				+ "2 Hacer un ingreso \n"
				+ "3 Consultar el saldo y número de reintegros e ingresos. \n"
				+ "4 Finalizar las operaciones");
		int elec = teclado.nextInt();
		while(elec != 4) {
			if (elec == 1) {
				double result = cb.getSaldo();
				System.out.println(result);
				System.out.println("1 Hacer un reintegro. \n"
						+ "2 Hacer un ingreso \n"
						+ "3 Consultar el saldo y número de reintegros e ingresos. \n"
						+ "4 Finalizar las operaciones");
				elec = teclado.nextInt();
			}else if(elec == 2){
				System.out.println("Introduce la cantidad: ");
				double cantidad = cb.
			}else if (elec == 3) {
				
			}
			
		}
	}

}
