import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Lütfen Notlarınızı Giriniz.");
		System.out.print("Matematik : ");
		int matematik = s.nextInt();
		System.out.print("Fizik : ");
		int fizik = s.nextInt();
		System.out.print("Kimya : ");
		int kimya = s.nextInt();
		System.out.print("Türkçe : ");
		int turkce = s.nextInt();
		System.out.print("Tarih : ");
		int tarih = s.nextInt();
		System.out.print("Müzik : ");
		int muzik = s.nextInt();
		
		int toplam = matematik+fizik+kimya+turkce+tarih+muzik;
		float ortalama = toplam/6;
		String sonuc = ortalama>=60 ? "Sınıfı Geçti" : "Sınıfta Kaldı";
		System.out.println(sonuc);
	}
}
