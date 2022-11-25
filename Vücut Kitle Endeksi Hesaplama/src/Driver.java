import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("LÜtfen kilonuzu giriniz: ");
		float weight = scanner.nextFloat();
		System.out.print("LÜtfen boyunuzu metre cinsinden giriniz: ");
		float height = scanner.nextFloat();
		System.out.println("Vücut kitle endeksiniz: "+weight/(height*height));
	}
}
