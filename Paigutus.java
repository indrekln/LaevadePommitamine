
import java.util.ArrayList;

public class Paigutus {

	// Meres olevate laevade koordinaadid - kontrolliks, kas ruut on h�ivatud
	private ArrayList<Integer> laevadMerel = new ArrayList<>();
	private ArrayList<Integer> merepiir = new ArrayList<>();

	public static int[] vähenda(int[] algne, int element){
	    int[] lühem = new int[algne.length - 1];
	    System.arraycopy(algne, 0, lühem, 0, element );
	    System.arraycopy(algne, element+1, lühem, element, algne.length - element-1);
	    return lühem;
	}
	
	// Kontrollib, kas laeva jaoks on ruudud vabad
	// Kui on vaba, tagastab TRUE; kui ei, tagastab FALSE
	public boolean vabaMeri(ArrayList<Integer> laev) {
		for (int i = 0; i < laev.size(); i++) {
			if (merepiir.contains(laev.get(i)) == true || laevadMerel.contains(laev.get(i)) == true) {
				return false; 
			}
		}
		return true;
	}

	//Määrab igale laevale merepiiri ja tagastab selle
	public static ArrayList<Integer> merepiirLaevale(ArrayList<Integer> laev) {
		ArrayList<Integer> puhver = new ArrayList<>();
		for (int i = 0; i < laev.size(); i++) {
			if (laev.get(i) < 10) { //laev on esimesel real
				if (laev.get(i) % 10 != 0 && laev.get(i) % 10 != 9){ //laev pole esimeses ega viimases veerus
					//lisab laeva külgedele ja alla jäävad meretükid
					if (!puhver.contains(laev.get(i) - 1)){puhver.add(laev.get(i) - 1);}
					if (!puhver.contains(laev.get(i) + 1)) {puhver.add(laev.get(i) + 1);}
					if (!puhver.contains(laev.get(i) + 9)) {puhver.add(laev.get(i) + 9);}
					if (!puhver.contains(laev.get(i) + 10)) {puhver.add(laev.get(i) + 10);}
					if (!puhver.contains(laev.get(i) + 11)) {puhver.add(laev.get(i) + 11);}
				}
				if (laev.get(i) % 10 == 0) { //laev on esimesel real ja esimeses veerus
					if (!puhver.contains(laev.get(i) + 1)) {puhver.add(laev.get(i) + 1);}
					if (!puhver.contains(laev.get(i) + 10)) {puhver.add(laev.get(i) + 10);}
					if (!puhver.contains(laev.get(i) + 11)) {puhver.add(laev.get(i) + 11);}
				}
				if (laev.get(i) % 10 == 9) { //laev on esimesel real ja viimases veerus
					if (!puhver.contains(laev.get(i) - 1)) {puhver.add(laev.get(i) - 1);}
					if (!puhver.contains(laev.get(i) + 9)) {puhver.add(laev.get(i) + 9);}
					if (!puhver.contains(laev.get(i) + 10)) {puhver.add(laev.get(i) + 10);}
				}
			}
			if (laev.get(i) > 89) { //laev on viimasel real
				if (laev.get(i) % 10 != 0 && laev.get(i) % 10 != 9){ //laev pole esimeses ega viimases veerus 
					//lisab laevakülgedele ja kohale jäävad meretükid
					if (!puhver.contains(laev.get(i) - 11)) {puhver.add(laev.get(i) - 11);}
					if (!puhver.contains(laev.get(i) - 10)) {puhver.add(laev.get(i) - 10);}
					if (!puhver.contains(laev.get(i) - 9)) {puhver.add(laev.get(i) - 9);}
					if (!puhver.contains(laev.get(i) - 1)) {puhver.add(laev.get(i) - 1);}
					if (!puhver.contains(laev.get(i) + 1)) {puhver.add(laev.get(i) + 1);}
				}
				if (laev.get(i) % 10 == 0) { //laev on viimasel real ja esimeses veerus
					if (!puhver.contains(laev.get(i) - 10)) {puhver.add(laev.get(i) - 10);}
					if (!puhver.contains(laev.get(i) - 9)) {puhver.add(laev.get(i) - 9);}
					if (!puhver.contains(laev.get(i) + 1)) {puhver.add(laev.get(i) + 1);}
				}
				if (laev.get(i) % 10 == 9) { //laev on viimasel real ja viimases veerus
					if (!puhver.contains(laev.get(i) - 11)) {puhver.add(laev.get(i) - 11);}
					if (!puhver.contains(laev.get(i) - 10)) {puhver.add(laev.get(i) - 10);}
					if (!puhver.contains(laev.get(i) - 1)) {puhver.add(laev.get(i) - 1);}
				}
			}
			if (laev.get(i) % 10 == 0 && laev.get(i) > 9 && laev.get(i) < 90) { //laev on esimeses veerus
				if (!puhver.contains(laev.get(i) - 10)) {puhver.add(laev.get(i) - 10);}
				if (!puhver.contains(laev.get(i) - 9)) {puhver.add(laev.get(i) - 9);}
				if (!puhver.contains(laev.get(i) + 1)) {puhver.add(laev.get(i) + 1);}
				if (!puhver.contains(laev.get(i) + 10)) {puhver.add(laev.get(i) + 10);}
				if (!puhver.contains(laev.get(i) + 11)) {puhver.add(laev.get(i) + 11);}
			}
			if (laev.get(i) % 10 == 9 && laev.get(i) > 9 && laev.get(i) < 90) { //laev on viimases veerus
				if (!puhver.contains(laev.get(i) - 11)) {puhver.add(laev.get(i) - 11);}
				if (!puhver.contains(laev.get(i) - 10)) {puhver.add(laev.get(i) - 10);}
				if (!puhver.contains(laev.get(i) - 1)) {puhver.add(laev.get(i) - 1);}
				if (!puhver.contains(laev.get(i) + 9)) {puhver.add(laev.get(i) + 9);}
				if (!puhver.contains(laev.get(i) + 10)) {puhver.add(laev.get(i) + 10);}
			}
			if (laev.get(i) > 10 && laev.get(i) < 90 && laev.get(i) % 10 != 0 && laev.get(i) != 9) { //laev ei ole mängulaua servas
				if (!puhver.contains(laev.get(i) - 11)) {puhver.add(laev.get(i) - 11);}
				if (!puhver.contains(laev.get(i) - 10)) {puhver.add(laev.get(i) - 10);}
				if (!puhver.contains(laev.get(i) - 9)) {puhver.add(laev.get(i) - 9);}
				if (!puhver.contains(laev.get(i) - 1)) {puhver.add(laev.get(i) - 1);}
				if (!puhver.contains(laev.get(i) + 1)) {puhver.add(laev.get(i) + 1);}
				if (!puhver.contains(laev.get(i) + 9)) {puhver.add(laev.get(i) + 9);}
				if (!puhver.contains(laev.get(i) + 10)) {puhver.add(laev.get(i) + 10);}
				if (!puhver.contains(laev.get(i) + 11)) {puhver.add(laev.get(i) + 11);}
			}
		}
		for (int i = 0; i < laev.size(); i++) {
			puhver.remove(laev.get(i));
		}
		return puhver;
	}

	//Tagastab laeva alguskoordinaadi
	public int algusKoordinaat(boolean vertikaalne, int pikkus) {
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
			algusKoordinaat(vertikaalne, pikkus);
		}
		return laevaKoordinaat;
	}

	// Loob laeva vastavalt antud pikkusele ja suunale
	public ArrayList<Integer> looLaevad(boolean vertikaalne, int pikkus) {
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
		if (vabaMeri(laev) == false) {
			looLaevad(vertikaalne, pikkus);
		}
		else {
			laevadMerel.addAll(laev);
			merepiir.addAll(merepiirLaevale(laev));
			//System.out.println("merepiirLaevale(laev): " + merepiirLaevale(laev) + "| laev: " + laev);
		}
		return laev;
	}

	//
	public ArrayList<Integer> laevastik() {
		int n = 1;
		for (int i = 4; i > 0; i--){
			for (int j = 0; j < n; j++) {
				looLaevad(Math.random() < 0.49, i); // Laeva suund: boolean vertikaalne
			}
			n++;
		}
		return laevadMerel;
	}
	
	public static ArrayList<Integer> pihtasPõhjas (int[] m, ArrayList<Integer> l) { //m = mängulaud, l = laevad
		ArrayList<Integer> joonistatavMerepiir = new ArrayList<>();
		ArrayList<Integer> uppunudLaev0 = new ArrayList<>();
		ArrayList<Integer> uppunudLaev1 = new ArrayList<>();
		ArrayList<Integer> uppunudLaev2 = new ArrayList<>();
		ArrayList<Integer> uppunudLaev3 = new ArrayList<>();
		ArrayList<Integer> uppunudLaev4 = new ArrayList<>();
		ArrayList<Integer> uppunudLaev5 = new ArrayList<>();
		ArrayList<Integer> uppunudLaev6 = new ArrayList<>();
		ArrayList<Integer> uppunudLaev7 = new ArrayList<>();
		ArrayList<Integer> uppunudLaev8 = new ArrayList<>();
		ArrayList<Integer> uppunudLaev9 = new ArrayList<>();
		if (m[l.get(0)] + m[l.get(1)] + m[l.get(2)] + m[l.get(3)] == 12){
			uppunudLaev0.add(l.get(0));
			uppunudLaev0.add(l.get(1));
			uppunudLaev0.add(l.get(2));
			uppunudLaev0.add(l.get(3));
			joonistatavMerepiir.addAll(merepiirLaevale(uppunudLaev0));
		}
		if (m[l.get(4)] + m[l.get(5)] + m[l.get(6)] == 9){
			uppunudLaev0.add(l.get(4));
			uppunudLaev0.add(l.get(5));
			uppunudLaev0.add(l.get(6));
			joonistatavMerepiir.addAll(merepiirLaevale(uppunudLaev1));
		}
		if (m[l.get(7)] + m[l.get(8)] + m[l.get(9)] == 9){
			uppunudLaev0.add(l.get(7));
			uppunudLaev0.add(l.get(8));
			uppunudLaev0.add(l.get(9));
			joonistatavMerepiir.addAll(merepiirLaevale(uppunudLaev2));
		}
		if (m[l.get(10)] + m[l.get(11)] == 6){
			uppunudLaev0.add(l.get(10));
			uppunudLaev0.add(l.get(11));
			joonistatavMerepiir.addAll(merepiirLaevale(uppunudLaev3));
		}
		if (m[l.get(12)] + m[l.get(13)] == 6){
			uppunudLaev0.add(l.get(12));
			uppunudLaev0.add(l.get(13));
			joonistatavMerepiir.addAll(merepiirLaevale(uppunudLaev4));
		}
		if (m[l.get(14)] + m[l.get(15)] == 6){
			uppunudLaev0.add(l.get(14));
			uppunudLaev0.add(l.get(15));
			joonistatavMerepiir.addAll(merepiirLaevale(uppunudLaev5));
		}
		if (m[l.get(16)] == 3){
			uppunudLaev0.add(l.get(16));
			joonistatavMerepiir.addAll(merepiirLaevale(uppunudLaev6));
		}
		if (m[l.get(17)] == 3){
			uppunudLaev0.add(l.get(17));
			joonistatavMerepiir.addAll(merepiirLaevale(uppunudLaev7));
		}
		if (m[l.get(18)] == 3){
			uppunudLaev0.add(l.get(18));
			joonistatavMerepiir.addAll(merepiirLaevale(uppunudLaev8));
		}
		if (m[l.get(19)] == 3){
			uppunudLaev0.add(l.get(19));
			joonistatavMerepiir.addAll(merepiirLaevale(uppunudLaev9));
		}
		System.out.println(joonistatavMerepiir);
		return joonistatavMerepiir;
	}
	
	public ArrayList<Integer> getLaevadMerel() {
		return laevadMerel;
	}

	public ArrayList<Integer> getMerepiir() {
		return merepiir;
	}

	@Override
	public String toString() {
		return "Paigutus [laevadMerel=" + laevadMerel + ", merepiir=" + merepiir + "]";
	}
}
