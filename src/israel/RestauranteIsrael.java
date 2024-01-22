package israel;

/**
 * La clase RestauranteIsrael gestiona los comensales del restaurante Israel y el stock de su almacén
 * @author Alek Suso
 * 
 * @version 1.0
 */

public class RestauranteIsrael {
	
	private int patatas;
	
	private int calamares;
	
	/**
	 * Constructor de la clase RestauranteIsrael con dos parámetros de entrada
	 * @param a Representa la cantidad de patatas iniciales
	 * @param b Representa la cantidad de calamares iniciales
	 */
	
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

	/**
	 * Método que permite añadir una cantidad de calamares especificada.
	 * @param c Cantidad de calamares añadidos.
	 */
	
	public void addCalamares(int c) {
		this.setCalamares(this.getCalamares() + c);
	}

	/**
	 * Método que permite añadir una cantidad de patatas especificada
	 * @param d Cantidad de patatas añadidas.
	 */
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

	/**
	 * Método que regresa el número de patatas.
	 * @return El número de patatas.
	 */
	
	public int getPatatas() {
		return patatas;
	}
	
	/**
	 * Método que modifica el número de patatas totales.
	 * @param patatas El número de patatas totales.
	 */
	
	public void setPatatas(int patatas) {
		this.patatas = patatas;
	}

	/**
	 * Método que regresa el número de calamares.
	 * @return El número de calamares.
	 */
	
	public int getCalamares() {
		return calamares;
	}

	/**
	 * Método que modifica el número de calamares totales.
	 * @param patatas El número de calamares totales.
	 */
	
	public void setCalamares(int calamares) {
		this.calamares = calamares;
	}
}