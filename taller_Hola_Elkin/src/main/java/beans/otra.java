package beans;

public class otra {
	
	public int numero1;
	public int numero2;

	

	public int getNumero1() {
		return numero1;
	}
	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}
	public int getNumero2() {
		return numero2;
	}
	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}
	public void setNumeros(int n1, int n2) {
		this.numero1 = n1;
		this.numero2 = n2;
	}
	public int sumar()
	{
		return numero1+numero2;
	}
}
