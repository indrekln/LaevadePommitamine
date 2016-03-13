import java.util.Arrays;

public class Mängulaud2 {
	static int[] arvutiMängulaud = new int[100]; //Arvuti mängulaud, kus kõikide koordinaatide väärtus on 0.
	static int[] mängijaMängulaud = new int[100]; // Mängija mänguväli, kus kõik väärtused 0.
	
	public static void mängulauaPrint() {  //Meetod esialgsete mängulaudade massiivide väljaprintimiseks
		System.out.println(Arrays.toString(arvutiMängulaud));
		System.out.println(Arrays.toString(mängijaMängulaud));
	} 
	
	public static void nähtavMängulaud(int[] mängulaud1, int[] mängulaud2) { // Meetod nähtava mängulaua genereerimiseks: parameetriteks mängulauad, milles väärtused 0 - tühi, 1 - laevaga, 2 - tulistatud,3 - pihtas
		System.out.println("\tA R V U T I\t\t\tM Ä N G I J A");   // Mängulaua pealkiri
		System.out.println();
		System.out.println("    A B C D E F G H I J  "+"\t"+"    A B C D E F G H I J  ");
		int m = 0;
		for (int i = 1; i < 11; i++) {   // Reahaaval arvuti ja mängija mängulaudade genereerimine
			if (i<10) {
				System.out.print(" ");
			}
			System.out.print(i + "  ");
			// Arvuti mängulaua osa genereerimine
			for (int j = m; j < m+10; j++) {    
				if (arvutiMängulaud[j] == 0 || arvutiMängulaud[j] == 1) {	// arvuti mängulaua väärtus 0 (~) pommitamata koht - tühi või peidetud  arvuti laeva koht 
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
}