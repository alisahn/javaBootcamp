package java23SayiBulma;

public class Main {

	public static void main(String[] args) {
		int[] sayilar = {1,2,5,8,9,10};
		int aranacak = 5;
		boolean exist = false;
		for (int i : sayilar) {
			if (aranacak==i) {
				exist = true;
				break;
			}
		}
		
		if (exist == true) {
			System.out.println("Sayı bulundu");
		}
		else {
			System.out.println("SAyı bulunamadı");
		}

	}

}
