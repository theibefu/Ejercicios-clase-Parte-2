import java.util.Scanner;

public class CalculadoraEuros {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Que cantidad de pesetas desea cambiar a euros?");
		float pesetas = teclado.nextFloat();
		if (pesetas>0)
			{System.out.printf("Son %.2f €", (pesetas/166.386));
			}
		else {System.out.printf("El valor de pesetas establecido no es correcto");
		}
teclado.close();
	}

}
