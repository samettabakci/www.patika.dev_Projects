import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("KDV'si hesaplanacak tutarı giriniz: ");
		double money = s.nextDouble();
		if(money>=0&&money<=1000) {
			System.out.println("KDV'siz Fiyat= "+money);
			System.out.println("KDV'li Fiyat= "+money*1.18);
			System.out.println("KDV Tutarı= "+money*0.18);
		}
		if(money>1000) {
			System.out.println("KDV'siz Fiyat= "+money);
			System.out.println("KDV'li Fiyat= "+money*1.08);
			System.out.println("KDV Tutarı= "+money*0.08);
		}
	}
}
