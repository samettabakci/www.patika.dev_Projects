import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Gidilecek Mesafeyi km cinsinden  yazınız: ");
		double distance = s.nextDouble();
		double openingFee = 10;
		double kmPrice= 2.20;
		double price = openingFee+(distance*kmPrice);
		if(price<20)price=20;
		System.out.println("Ödenmesi gereken tutar: "+price+"TL");
	}
}
