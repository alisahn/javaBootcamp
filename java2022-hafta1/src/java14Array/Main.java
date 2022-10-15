package java14Array;

public class Main {

	public static void main(String[] args) {
		String[] ogrenciler = new String[3];
		ogrenciler[0] = "Ali";
		ogrenciler[1] = "Tugay";
		ogrenciler[2] = "Abdullah";
		System.out.println(ogrenciler.length);
		
		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println(i+1 +".öğrenci :"+ ogrenciler[i]);
		}

	}

}
