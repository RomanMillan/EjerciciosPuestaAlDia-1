package ejercicios;

public class Cuenta {
	private double saldo;
	private String ncc;
	private int numIngresos;
	private int numReintegros;
	
	public Cuenta(String ncc) {
		
	}
	public Cuenta(double saldo, String ncc) throws Exception {
		super();
		if (saldo <=0) {
			throw new Exception("Saldo no permitido");
		}
		this.saldo = saldo;
		this.numIngresos = 1;
		this.ncc = ncc;
		this.numReintegros = 0;
		}
		
		public double getSaldo() {
			return saldo;
		}
		public String getNcc() {
			return ncc;
		}
		public double getNumIngresos() {
			return numIngresos;
		}
		public double getNumReintegros() {
			return numReintegros;
		};
		
	public void reintegro(double cantidad) throws Exception {
		if (saldo < cantidad || cantidad <=0) {
			throw new Exception("Cantidad no valida");
		}
		saldo = saldo - cantidad;
		this.numReintegros++;
	} 
	public void ingresos (double cantidad)throws Exception {
		if (cantidad <=0) {
			throw new Exception("Cantidad no valida");
		}
		saldo = saldo + cantidad;
		this.numIngresos++;
	}
	
	@Override
	public String toString() {
		return "Cuenta [saldo=" + saldo + ", ncc=" + ncc + ", numIngresos=" + numIngresos + ", numReintegros="
				+ numReintegros + "]";
	}
	
}
