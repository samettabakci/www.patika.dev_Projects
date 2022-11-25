import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);	
		System.out.print("Birinci kenar uzunluğu: ");
		int side1 = s.nextInt();
		System.out.print("İkinci kenar uzunluğu: ");
		int side2 = s.nextInt();
		System.out.println("Üçüncü kenar uzunluğu: ");
		int side3 = s.nextInt();
		double u =(side1+side2+side3)/2;
		double area = Math.sqrt(u*(u-side1)*(u-side2)*(u-side3));
		System.out.println("Verilen üçgenin alanı= "+area);
	}
}
