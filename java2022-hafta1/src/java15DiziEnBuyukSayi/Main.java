package java15DiziEnBuyukSayi;

public class Main {

	public static void main(String[] args) {
		double[] sayilar = {1.2, 4.3, 5.6, 2.4};
		double total = 0;
		double max = sayilar[0];
		
		for (int i = 0; i < sayilar.length; i++) {
			total+= sayilar[i];
			if(sayilar[i]>max) {				
				max = sayilar[i];
			}
		}
		System.out.println("Toplam: "+ total);
		System.out.println("En büyük sayı:"+max);
	}

}
