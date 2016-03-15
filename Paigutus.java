import java.util.ArrayList;

public class Paigutus {

	// Meres olevate laevade koordinaadid - kontrolliks, kas ruut on hõivatud
	static ArrayList<Integer> laevadMerel = new ArrayList<>();
	static ArrayList<Integer> merepiir = new ArrayList<>();

	// Kontrollib, kas laeva jaoks on ruudud vabad
	// Kui on vaba, tagastab TRUE; kui ei, tagastab FALSE
	static boolean vabaMeri(ArrayList<Integer> laev) {
		//System.out.println("vabaMeri test");
		for (int i = 0; i < laev.size(); i++) {
			if (merepiir.contains(laev.get(i)) == true || laevadMerel.contains(laev.get(i)) == true) {
				//System.out.println("Hõivatud ruut: " + laev.get(i));
				return false; 
			}
		}
		return true;
	}


	static ArrayList<Integer> laevMerele(ArrayList<Integer> laev) {
		//ArrayList<Integer> laevadMeres = new ArrayList<>();
		laevadMerel.addAll(laev);
		return null;
	}

	static ArrayList<Integer> merepiirLaevale(ArrayList<Integer> laev) {
		for (int i = 0; i < laev.size(); i++) {
			if (laev.get(i) > 10 && laev.get(i) < 90 && laev.get(i) % 10 != 0 && laev.get(i) != 9) { //laev ei ole mängulaua servas
				merepiir.add(laev.get(i) - 11);
				merepiir.add(laev.get(i) - 10);
				merepiir.add(laev.get(i) - 9);
				merepiir.add(laev.get(i) - 1);
				merepiir.add(laev.get(i) + 1);
				merepiir.add(laev.get(i) + 11);
				merepiir.add(laev.get(i) + 10);
				merepiir.add(laev.get(i) + 9);
				/*if (i == 0) {
					merepiir.add(laev.get(i) - 11);
					merepiir.add(laev.get(i) - 10);
					merepiir.add(laev.get(i) - 9);
				}
				if (i + 1 == laev.size()) {
					merepiir.add(laev.get(i) + 11);
					merepiir.add(laev.get(i) + 10);
					merepiir.add(laev.get(i) + 9);
				}*/
			}				
			if (laev.get(i) < 10) { //laev on esimesel real
				if (laev.get(i) % 10 != 0 && laev.get(i) % 10 != 9){ //lisab laeva külgedele ja alla jäävad meretükid
					merepiir.add(laev.get(i) - 1);
					merepiir.add(laev.get(i) + 1);
					merepiir.add(laev.get(i) + 9);
					merepiir.add(laev.get(i) + 10);
					merepiir.add(laev.get(i) + 11);
				}
				if (laev.get(i) % 10 == 0) { //laev on esimeses veerus
					merepiir.add(laev.get(i) - 10); //lisab laeva kohale jääva meretüki  
					merepiir.add(laev.get(i) - 9); //lisab laeva kohale paremale jääva meretüki  
				}
				if (laev.get(i) % 10 == 9) { //laev on viimases veerus
					merepiir.add(laev.get(i) - 10); //lisab laeva kohale jääva meretüki  
					merepiir.add(laev.get(i) - 11); //lisab laeva kohale vasakule jääva meretüki  
				}
			}
			if (laev.get(i) > 89) { //laev on viimasel real
				if (laev.get(i) % 10 != 0 && laev.get(i) % 10 != 9){ //lisab laevakülgedele ja kohale jäävad meretükid
					merepiir.add(laev.get(i) - 11);
					merepiir.add(laev.get(i) - 10);
					merepiir.add(laev.get(i) - 9);
					merepiir.add(laev.get(i) - 1);
					merepiir.add(laev.get(i) + 1);
				}
				if (laev.get(i) % 10 == 0) { //laev on esimeses veerus
					merepiir.add(laev.get(i) - 10);
					merepiir.add(laev.get(i) - 9);
					merepiir.add(laev.get(i) + 1); //lisab laevast paremale jääva meretüki  
				}
				if (laev.get(i) % 10 == 9) { //laev on viimases veerus
					merepiir.add(laev.get(i) - 11);
					merepiir.add(laev.get(i) - 10);
					merepiir.add(laev.get(i) - 1); //lisab laevast vasakule jääva meretüki
				}
			}
		}
		return null;
	}

	//Tagastab laeva alguskoordinaadi
	static int algusKoordinaat(boolean vertikaalne, int pikkus) {
		int laevaVeerg;
		int laevaRida;

		// Leiame laevale võimaliku alguskoordinaadi, väldime üle lauaserva minemist
		if (vertikaalne){
			laevaVeerg = (int)Math.round(Math.random() * (9.1));
			laevaRida = (int)Math.round(Math.random() * (9.1 - pikkus));
		}
		else {
			laevaVeerg = (int)Math.round(Math.random() * (9.1 - pikkus));
			laevaRida = (int)Math.round(Math.random() * (9.1));
		}
		int laevaKoordinaat = laevaVeerg + laevaRida * 10;

		ArrayList<Integer> kontroll = new ArrayList<>();
		kontroll.add(laevaKoordinaat);

		if (vabaMeri(kontroll) == false){
			//System.out.println("Uus alguskoordinaat, sest: " + kontroll);
			algusKoordinaat(vertikaalne, pikkus);
		}
		//System.out.println("Laevad Meres: " + laevadMeres);
		return laevaKoordinaat;
	}

	// Loob laeva vastavalt antud pikkusele ja suunale
	static ArrayList<Integer> looLaevad(boolean vertikaalne, int pikkus) {
		ArrayList<Integer> laev = new ArrayList<>();
		int XY = algusKoordinaat(vertikaalne, pikkus);
		for (int i = 0; i < pikkus; i++) {
			if (vertikaalne) {
				laev.add(XY + 10 * i);
			}
			else {
				laev.add(XY + 1 * i);
			}
		}
		//System.out.println(laev);
		if (vabaMeri(laev) == false) {
			// System.out.println("Meri kinni, sest: " + laev);
			looLaevad(vertikaalne, pikkus);
		}
		else {
			laevMerele(laev);
			merepiirLaevale(laev);
		}
		return laev;
	}
	public static ArrayList<Integer> laevastik() {
		int n = 1;
		for (int i = 4; i > 0; i--){
			for (int j = 0; j < n; j++) {
				looLaevad(Math.random() < 0.49, i); // Laeva suund: boolean vertikaalne
			}
			n++;
		}
		return laevadMerel;
	}
	
	public static void main(String[] args) {
		
		// Loome 100 ruuduga mängulaua, mille vaikeväärtused on 0
		int[] mängulaud = new int[100];

		// Laevade arv ja pikkus: 4x1, 3x2, 2x3, 1x4
//		int n = 1;
//		for (int i = 4; i > 0; i--){
//			for (int j = 0; j < n; j++) {
//				looLaevad(Math.random() < 0.49, i); // Laeva suund: boolean vertikaalne
//			}
//			n++;
//		}
		System.out.println("Laevastik: " + laevastik());
		//System.out.println("Laevu meres: " + laevadMeres.size());
		System.out.println("Laevad meres: " + laevadMerel);
		
		
		
		
		//Lisab laevad mängulauale
		for (int i = 0; i < laevadMerel.size(); i++) {
			mängulaud[laevadMerel.get(i)]++;
		}
		
		//Joonistab mängulaua (testimiseks)
		int m = 0;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++){
				System.out.print(mängulaud[m] + " ");
				m++;
			}
			System.out.println();
		}
		
	}
	
}