package israel;

public class RestauranteIsrael {
	
	private int patatas;
	
	private int calamares;
	
	public RestauranteIsrael(int a, int b) {
		this.setPatatas(a);
		this.setCalamares(b);
	}

	int cantP() {
		int a = this.getPatatas() * 3;
		return a;
	}

	int cantC() {
		int ch = this.getCalamares() * 6;
		return ch;
	}

	public void addCalamares(int c) {
		this.setCalamares(this.getCalamares() + c);
	}

	public void addPatatas(int d) {
		this.setPatatas(this.getPatatas() + d);
	}

	
	public static void main(String[] args) {
		RestauranteIsrael r1 = new RestauranteIsrael(50, 60);
		System.out.println("Cantidad de calamares: " + r1.getCalamares());
		System.out.println("Cantidad de patatas: " + r1.getPatatas());
		calculaComensales(r1);
		r1.addCalamares(1);
		r1.addPatatas(80);
		System.out.println("\nPedido Recibido!! Stock actual: ");
		System.out.println(r1.getPatatas() + " patatas.\n" + r1.getCalamares() + " calamares");
		calculaComensales(r1);
	}

	private static void calculaComensales(RestauranteIsrael r1) {
		if (r1.cantP() <= r1.cantC()) {
			System.out.println(
					"\nIsrael puede dar de comer a " + r1.cantP() + " personas con raciones de patatas máximo");
		} else {
			System.out.println(
					"\nIsrael puede dar de comer a " + r1.cantC() + " personas con raciones de calamares máximo");
		}
	}

	public int getPatatas() {
		return patatas;
	}
	
	public void setPatatas(int patatas) {
		this.patatas = patatas;
	}

	public int getCalamares() {
		return calamares;
	}

	
	public void setCalamares(int calamares) {
		this.calamares = calamares;
	}

}