package java13DoWhile;

public class Main {

	public static void main(String[] args) {
		int i = 100;
		
		do {
			System.out.println(i);
			i+=2;
		} while (i<10);
		
		//yukarıdan aşağıya okuyarak gittiğinde önce kontrol etmeden i'yi yazdırır ve daha sonra kontrol eder
		
		System.out.println("do while sonlandı");

	}

}
