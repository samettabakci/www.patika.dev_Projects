import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Dairenin yarı çapını giriniz: ");
		double r = s.nextDouble();
		System.out.print("Hesaplanacak dilimin merkez açısını giriniz: ");
		double a = s.nextDouble();
		System.out.println("Dairenin alanı= "+Math.PI*r*r);
		System.out.println("Dairenin Çevresi= "+2*Math.PI*r);
		System.out.println("Daire diliminin alanı= "+(Math.PI*(r*r)*a)/360);
	}
}
