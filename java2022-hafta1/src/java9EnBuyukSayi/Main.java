package java9EnBuyukSayi;

public class Main {

	public static void main(String[] args) {
		int sayi1 = 22;
		int sayi2 = 27;
		int sayi3 = 3;
		int enBuyuk = sayi1;
		
		if (enBuyuk < sayi2) {
			enBuyuk = sayi2;
		}
		if (enBuyuk<sayi3) {
			enBuyuk = sayi3;
		}
		
		System.out.println("En buyuk sayi =" +enBuyuk);

	}

}