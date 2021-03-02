package ejercicios;

public class Cuenta {
	private double saldo;
	private double ncc;
	private double numIngresos;
	private double numReintegros;
	
	public Cuenta(String ncc) {
		
	}
	public Cuenta(double saldo, String ncc) throws Exception {
		super();
		if (saldo <0 || saldo == 0) {
			throw new Exception();
			
		}else {
			this.saldo = saldo;
			this.numIngresos = 1;
		}
	}
	

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return super.toString();
		}
		public double getSaldo() {
			return saldo;
		}
		public double getNcc() {
			return ncc;
		}
		public double getNumIngresos() {
			return numIngresos;
		}
		public double getNumReintegros() {
			return numReintegros;
		};
		
	public void reintegro(double cantidad) {
		saldo = saldo - cantidad;
		this.numReintegros++;
	}
	public void ingresos (double cantidad) {
		saldo = saldo + cantidad;
		this.numIngresos++;
	}
}
