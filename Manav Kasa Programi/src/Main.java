import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		double armut=2.14, elma=3.67, domates=1.11, muz=0.95, patlican=5.00;
		Scanner s = new Scanner(System.in);
		System.out.print("Armut Kaç kilo? : ");
		double armutKg = s.nextDouble();
		System.out.print("Elma kaç kilo? : ");
		double elmaKg = s.nextDouble();
		System.out.print("Domates kaç kilo? : ");
		double domatesKg = s.nextDouble();
		System.out.print("Muz kaç kilo? : ");
		double muzKg = s.nextDouble();
		System.out.print("Patlıcan kaç kilo? : ");
		double patlicanKg = s.nextDouble();
		System.out.println("Ödenecek Tutar= "+((armut*armutKg)+(elma*elmaKg)+(domates*domatesKg)+(muz*muzKg)+(patlican*patlicanKg))+"TL");
	}
}
