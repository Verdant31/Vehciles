import java.util.Scanner;



public class Console {

	private static Scanner leitor = new Scanner(System.in);
	
	// método para entrada de int
	public static int lerInt() {
		int valor = leitor.nextInt();
		leitor.nextLine();
		return valor;		
	}

	
	// sobrecarga do método lerInt
	public static int lerInt(String txt) {
		if(txt.equals("")) {
			txt = "Informe um valor int: ";
		}
		System.out.print(txt);
		return lerInt();
	}
	
	
	// método de entrada de  float
	public static float lerFloat() {
		float valor = leitor.nextFloat();
		leitor.nextLine();
		return valor;
	}
	
	public static float lerFloat(String txt) {
		if(txt.equals("")) {
			txt = "Informe um valor float: ";
		}
		System.out.print(txt);
		return lerFloat();
	}

	// método de entrada de  String
	public static String lerString() {
		String valor = leitor.nextLine();
		return valor;
	}
	
	public static String lerString(String txt) {
		if(txt.equals("")) {
			txt = "Informe um valor textual: ";
		}
		System.out.print(txt);
		return lerString();
	}
	
	
}