package calculomedia;
import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double n1, n2, media;
		
		System.out.print("Digite o primeiro numero: ");
		n1 = scanner.nextDouble();
		System.out.print("Digite o segundo numero: ");
		n2 = scanner.nextDouble();
		media = (n1 + n2)/ 2;
		System.out.println("Media: " + media);
		scanner.close();
	}
}
