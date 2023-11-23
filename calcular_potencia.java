import java.util.Scanner;
public class calcular_potencia {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

	
		float total;
		System.out.print("Introduce la base");
		float base = sc.nextFloat();
		System.out.print("Introduce el exponente");
		float exponente = sc.nextFloat();
		total=1;
		if (exponente==0) {
			total=1;}		
		while (exponente>0) {
			total = (total*base);
			exponente --;}		
		if (exponente<0) {
			while (exponente<0) {
				total=(total*base);
				exponente ++;}
		total=1/total;}
System.out.printf("%f", total);
sc.close();
	}

}
