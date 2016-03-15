import java.util.ArrayList;

public class Mäng {
	static Paigutus laevadMerel1 = new Paigutus(); // arvuti laevade koordinaadid
	static Paigutus laevadMerel2 = new Paigutus(); // mängija laevade koordinaadid

	public static void main(String[] args) {
		System.out.println("Mäng algab ...");
		System.out.println();
		
		// Laevade paigutamine arvuti mängulauale kasutades klassi Paigutus meetodeid)
		ArrayList<Integer> a = laevadMerel1.laevastik(); 
		for (int i=0; i<a.size(); i++) {
			int index1 = a.get(i);
			Mängulaud.arvutiMängulaud[index1] ++;
		}
		//System.out.println(Arrays.toString(Mängulaud.arvutiMängulaud)); //arvuti mängulaua massiiv laevadega
		//Mängulaud.nähtavMängulaud(Mängulaud.arvutiMängulaud, Mängulaud.mängijaMängulaud); // arvuti mängulauale on lisatud laevad (mida ei näe)
		
		// Laevade paigutamine mängija mängulauale kasutades klassi Paigutus meetodeid)
		ArrayList<Integer> b = laevadMerel2.laevastik();
		for (int j=0; j<b.size(); j++) {
			int index2 = b.get(j);
			Mängulaud.mängijaMängulaud[index2] ++;
		}
		// System.out.println(Arrays.toString(Mängulaud.mängijaMängulaud));  // Mängija mängulaua massiiv laevadega
		Mängulaud.nähtavMängulaud(Mängulaud.arvutiMängulaud, Mängulaud.mängijaMängulaud);  //Mängulaua algseisu kuvamine (mängija väljal laevad nähtavad, arvuti omal varjatud)
	
		// ... Siia peaks tulema kasutajalt pommitamiskoha küsimine Scanneriga ja HashMapi abil koordinaadiks ümber teisendus, meetod pommitamiskoha ja ümbruse checkimiseks ning vastava möngulaua massiivi muutmiseks ...
		// ... Samuti mängulaua uuendatud pildi kuvamine st uuesti: Mängulaud.nähtavMängulaud(Mängulaud.arvutiMängulaud, Mängulaud.mängijaMängulaud);
	}
}
