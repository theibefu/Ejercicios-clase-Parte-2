import java.util.Scanner;

public class Restasimple {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduce un numero");
		long num1 = teclado.nextLong();
		System.out.println("introduce un numero");
		long num2 = teclado.nextLong();
		if(num1>num2) System.out.printf("El resultado es: %d", (num1-num2));
		else if(num2>num1) System.out.printf("El resultado es %d", (num1-num2));
		else if(num2==num1) System.out.printf("Los numeros son iguales");
teclado.close();
	}
	

}
