import java.util.ArrayList;

public class Paigutus {

	// Meres olevate laevade koordinaadid - kontrolliks, kas ruut on hõivatud
	private ArrayList<Integer> laevadMerel = new ArrayList<>();
	private ArrayList<Integer> merepiir = new ArrayList<>();

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
	public ArrayList<Integer> merepiirLaevale(ArrayList<Integer> laev) {
		ArrayList<Integer> puhver = new ArrayList<>();
		for (int i = 0; i < laev.size(); i++) {
			if (laev.get(i) < 10) { //laev on esimesel real
				if (laev.get(i) % 10 != 0 && laev.get(i) % 10 != 9){ //laev pole esimeses ega viimases veerus
					//lisab laeva külgedele ja alla jäävad meretükid
					puhver.add(laev.get(i) - 1);
					puhver.add(laev.get(i) + 1);
					puhver.add(laev.get(i) + 9);
					puhver.add(laev.get(i) + 10);
					puhver.add(laev.get(i) + 11);
				}
				if (laev.get(i) % 10 == 0) { //laev on esimesel real ja esimeses veerus
					puhver.add(laev.get(i) + 1);
					puhver.add(laev.get(i) + 10);
					puhver.add(laev.get(i) + 11);
				}
				if (laev.get(i) % 10 == 9) { //laev on esimesel real ja viimases veerus
					puhver.add(laev.get(i) - 1);  
					puhver.add(laev.get(i) + 9);
					puhver.add(laev.get(i) + 10);
				}
			}
			if (laev.get(i) > 89) { //laev on viimasel real
				if (laev.get(i) % 10 != 0 && laev.get(i) % 10 != 9){ //laev pole esimeses ega viimases veerus 
					//lisab laevakülgedele ja kohale jäävad meretükid
					puhver.add(laev.get(i) - 11);
					puhver.add(laev.get(i) - 10);
					puhver.add(laev.get(i) - 9);
					puhver.add(laev.get(i) - 1);
					puhver.add(laev.get(i) + 1);
				}
				if (laev.get(i) % 10 == 0) { //laev on viimasel real ja esimeses veerus
					puhver.add(laev.get(i) - 10);
					puhver.add(laev.get(i) - 9);
					puhver.add(laev.get(i) + 1);  
				}
				if (laev.get(i) % 10 == 9) { //laev on viimasel real ja viimases veerus
					puhver.add(laev.get(i) - 11);
					puhver.add(laev.get(i) - 10);
					puhver.add(laev.get(i) - 1);
				}
			}
			if (laev.get(i) % 10 == 0 && laev.get(i) > 10 && laev.get(i) < 90) { //laev on esimeses veerus
				puhver.add(laev.get(i) - 10);
				puhver.add(laev.get(i) - 9);
				puhver.add(laev.get(i) + 1);
				puhver.add(laev.get(i) + 10);
				puhver.add(laev.get(i) + 11);
			}
			if (laev.get(i) % 10 == 9 && laev.get(i) > 10 && laev.get(i) < 90) { //laev on viimases veerus
				puhver.add(laev.get(i) - 11);
				puhver.add(laev.get(i) - 10);
				puhver.add(laev.get(i) - 1);
				puhver.add(laev.get(i) + 9);
				puhver.add(laev.get(i) + 10);
			}
			if (laev.get(i) > 10 && laev.get(i) < 90 && laev.get(i) % 10 != 0 && laev.get(i) != 9) { //laev ei ole mängulaua servas
				puhver.add(laev.get(i) - 11);
				puhver.add(laev.get(i) - 10);
				puhver.add(laev.get(i) - 9);
				puhver.add(laev.get(i) - 1);
				puhver.add(laev.get(i) + 1);
				puhver.add(laev.get(i) + 11);
				puhver.add(laev.get(i) + 10);
				puhver.add(laev.get(i) + 9);
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
