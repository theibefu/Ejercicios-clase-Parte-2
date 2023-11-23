import java.util.Scanner;
import java.util.Random;
public class num_secreto {

	public static void main(String[] args) {
		Random numSecreto;
		numSecreto = new Random();
		int numOculto;
		numOculto = 1+numSecreto.nextInt(9);
		
		Scanner sc = new Scanner(System.in);
		
		int numIntentos= 5;
		int numero;
		while (numIntentos>0) {
			System.out.print("Introduce un numero");
		numero = sc.nextInt();

	
		if(numero==numOculto) {
			System.out.printf("ENHORABUENA :), el numero oculto era %d\n", numOculto);
			break;
		}
			else {
				numIntentos--;
			}
		}
		
		if (numIntentos == 0){
			System.out.printf("no has acertado el numero :(");
		}
		System.out.printf(" Le quedaban estos intentos: %d\n", numIntentos);
		sc.close();
	}

}
