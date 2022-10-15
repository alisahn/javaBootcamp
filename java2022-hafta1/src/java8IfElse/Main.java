package java8IfElse;

public class Main {

	public static void main(String[] args) {
		int sayi = 25;
		if (sayi < 20) {
			System.out.println("Sayi 20'den kucuktur");			
		}else if (sayi >20) {
			System.out.println("Sayi 20'den buyuktur");
		}else {
			System.out.println("Sayi 20'ye eşittir");
		}
		
		
		/* Kaydolma işlemi temel kontrolleri yapmaya çalıştım.
		 * mukerrerKayitMi = true yaparak veya şifreleri değiştirerek hangi bloğun çalıştığı test edilebilir.		
		 */
		boolean mukerrerKayitMi = true;
		String gelenSifre1 = "123456";
		String gelenSifre2 = "12345";
		String mesaj = "";
		
		if (mukerrerKayitMi == true) {
			mesaj = "Bu hesap zaten mevcut";
		} else  {
			if (gelenSifre1==gelenSifre2) {
				mesaj = "Şifreler Eşleşti";
			} else {
				mesaj = "Şifreler eşleşmiyor";
			}

		}
		
		System.out.println(mesaj);

	}

}
