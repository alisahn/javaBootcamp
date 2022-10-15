package java16BoyutluDizi;

public class Main {

	public static void main(String[] args) {
		String[][] sehirler = new String[3][3];
		sehirler[0][0] = "İstanbul";
		sehirler[0][1] = "Antalya";
		sehirler[0][2] = "Kırklareli";
		sehirler[1][0] = "İzmir";
		sehirler[1][1] = "Denizli";
		sehirler[1][2] = "Çanakkale";
		sehirler[2][0] = "Edirne";
		sehirler[2][1] = "Tekirdağ";
		sehirler[2][2] = "Balıkesir";
		
		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <=2 ; j++) {
				System.out.println(sehirler[i][j]);
				
			}
			System.out.println("--------------");
			
		}

	}

}
