package java21MukemmelSayi;

public class Ma {
	
	public static void main(String[] args) {
		int sayi = 28;
		int total = 0;
		
		for(int i = 1; i<sayi; i++) {
			if (sayi % i == 0) {
				total += i;
			}
		}
		
		if (total == sayi) {
			System.out.println("Mükemmel Sayıdır");
			
		}
		else {
			System.out.println("Mükemmel sayı değildir");
		}
	}
	
}
