package javinha;
import java.util.Scanner;
public class Aplicacao {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Cliente c1, c2;
		
		c1 = new Cliente(21,"c1"); // criando novo objeto
		c1.imprimirCliente();
		c1.setCodigo(45); // mudando o codigo 
		c1.imprimirCliente();
		
		c2 = new Cliente(30,"c2"); // criando novo objeto
		c2.imprimirCliente();
		
	}

}
