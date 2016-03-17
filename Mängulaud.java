
public class Mängulaud {
	static int[] arvutiMängulaud = new int[100]; //Arvuti mängulaud, kus kőikide koordinaatide väärtus on 0.
	static int[] mängijaMängulaud = new int[100]; // Mängija mänguväli, kus kőik väärtused 0. 


	public static void nähtavMängulaud() { // Meetod nähtava mängulaua genereerimiseks: parameetriteks mängulauad, milles väärtused 0 - tühi, 1 - laevaga, 2 - tulistatud,3 - pihtas
		int arvutiTabamused = 0;
		int mängijaTabamused = 0;
		System.out.println("\tA R V U T I\t\t       M Ä N G I J A");   // Mängulaua pealkiri
		System.out.print("      Tabamusi: ");
		for (int i = 0; i < arvutiMängulaud.length; i++){
			if (arvutiMängulaud[i] == 3){
				arvutiTabamused++;
			}
		}
		System.out.print(arvutiTabamused + "/20\t\t      Tabamusi: ");
		for (int i = 0; i < mängijaMängulaud.length; i++){
			if (mängijaMängulaud[i] == 3){
				mängijaTabamused++;
			}
		}
		System.out.println(mängijaTabamused + "/20");
		System.out.println("    A B C D E F G H I J  "+"\t"+"    A B C D E F G H I J  ");
		int m = 0;
		for (int i = 1; i < 11; i++) {   // Reahaaval arvuti ja mängija mängulaudade genereerimine
			if (i<10) {
				System.out.print(" ");
			}
			System.out.print(i + "  ");
			// Arvuti mängulaua osa genereerimine
			for (int j = m; j < m+10; j++) {    
				if (arvutiMängulaud[j] == 0 || arvutiMängulaud[j] == 1) {	// arvuti mängulaua väärtus 0 (~) pommitamata koht - tühi vői peidetud  arvuti laeva koht 
					System.out.print("~ ");
				} else {
					if (arvutiMängulaud[j] == 2) {			// 2 (*) - pommitatud/tulistatud, aga laevata koht
						System.out.print("* ");
					} else {
						if (arvutiMängulaud[j] == 3) {
							System.out.print("X ");			// 3 (X) - pihtas laev
						}
					}
				}	
		    }
			if (i<10) {
				System.out.print(" ");
			}
			System.out.print(" "+i + "\t");
			if (i<10) {
				System.out.print(" ");
			}
		    System.out.print(i+"  ");
		    // Mängija mängulaua osa genereerimine
			for (int k = m; k < m+10; k++) {
				if (mängijaMängulaud[k] == 0) {   // 0 (~) - tühi, tulistamata, laevata koht 
					System.out.print("~ ");
				} else {
					if (mängijaMängulaud[k] == 1) {    // 1 (L) - mängija laevaga koht
						System.out.print("L ");
					} else {
						if (mängijaMängulaud[k] == 2) {  // 2 (*) - tulistatud, aga laevata koht
							System.out.print("* ");
						} else {
							if (mängijaMängulaud[k] == 3) {  // 3 (X) - tulisatud, pihtas mängija laev
								System.out.print("X ");
							}
						}
					}	
				}
		    }
			if (i<10) {
				System.out.print(" ");
			}
			System.out.print(" "+i);
			System.out.println();
			m+=10;
		}
		System.out.println("    A B C D E F G H I J  "+"\t"+"    A B C D E F G H I J  ");
	}
	
	public static int pihtasaanudKoordinaadid(int[] mängulaud) { // meetod pihtapommitatud kooridnaatide arvu leidmiseks
		int arv = 0;   // pihtasaanud koordinaatide arv
		for (int väärtus: mängulaud) {
			if (väärtus==3) {
				arv++;
			}
		}
		return arv;
	}
	
	public static int getPihtasaanudKoordinaadid(int[] mängulaud) {
		return pihtasaanudKoordinaadid(mängulaud);
	}
}
