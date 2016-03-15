import java.util.ArrayList;
import java.util.Arrays;


public class M‰ngulaud {
	static int[] arvutiM‰ngulaud = new int[100]; //Arvuti m‰ngulaud, kus kıikide koordinaatide v‰‰rtus on 0.
	static int[] m‰ngijaM‰ngulaud = new int[100]; // M‰ngija m‰nguv‰li, kus kıik v‰‰rtused 0.
	
	public static void m‰ngulauaPrint() {  //Meetod esialgsete m‰ngulaudade massiivide v‰ljaprintimiseks
		System.out.println(Arrays.toString(arvutiM‰ngulaud));
		System.out.println(Arrays.toString(m‰ngijaM‰ngulaud));
	} 
	
	public static int[] laevadePaigutusLauale (ArrayList<Integer> laevastik, int[] m‰ngulaud) {
		for (int i=0; i<laevastik.size(); i++) {
			int index = laevastik.get(i);
			System.out.println(laevastik.get(i));
			m‰ngulaud[index] = 1;
		}
		return m‰ngulaud;
	}
	
	public static void n‰htavM‰ngulaud(int[] m‰ngulaud1, int[] m‰ngulaud2) { // Meetod n‰htava m‰ngulaua genereerimiseks: parameetriteks m‰ngulauad, milles v‰‰rtused 0 - t¸hi, 1 - laevaga, 2 - tulistatud,3 - pihtas
		System.out.println("\tA R V U T I\t\t\tM ƒ N G I J A");   // M‰ngulaua pealkiri
		System.out.println();
		System.out.println("    A B C D E F G H I J  "+"\t"+"    A B C D E F G H I J  ");
		int m = 0;
		for (int i = 1; i < 11; i++) {   // Reahaaval arvuti ja m‰ngija m‰ngulaudade genereerimine
			if (i<10) {
				System.out.print(" ");
			}
			System.out.print(i + "  ");
			// Arvuti m‰ngulaua osa genereerimine
			for (int j = m; j < m+10; j++) {    
				if (arvutiM‰ngulaud[j] == 0 || arvutiM‰ngulaud[j] == 1) {	// arvuti m‰ngulaua v‰‰rtus 0 (~) pommitamata koht - t¸hi vıi peidetud  arvuti laeva koht 
					System.out.print("~ ");
				} else {
					if (arvutiM‰ngulaud[j] == 2) {			// 2 (*) - pommitatud/tulistatud, aga laevata koht
						System.out.print("* ");
					} else {
						if (arvutiM‰ngulaud[j] == 3) {
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
		    // M‰ngija m‰ngulaua osa genereerimine
			for (int k = m; k < m+10; k++) {
				if (m‰ngijaM‰ngulaud[k] == 0) {   // 0 (~) - t¸hi, tulistamata, laevata koht 
					System.out.print("~ ");
				} else {
					if (m‰ngijaM‰ngulaud[k] == 1) {    // 1 (L) - m‰ngija laevaga koht
						System.out.print("L ");
					} else {
						if (m‰ngijaM‰ngulaud[k] == 2) {  // 2 (*) - tulistatud, aga laevata koht
							System.out.print("* ");
						} else {
							if (m‰ngijaM‰ngulaud[k] == 3) {  // 3 (X) - tulisatud, pihtas m‰ngija laev
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