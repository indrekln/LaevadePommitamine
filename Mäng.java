import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

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
		System.out.println(Arrays.toString(Mängulaud.arvutiMängulaud)); //arvuti mängulaua massiiv laevadega
		//Mängulaud.nähtavMängulaud(Mängulaud.arvutiMängulaud, Mängulaud.mängijaMängulaud); // arvuti mängulauale on lisatud laevad (mida ei näe)
		
		// Laevade paigutamine mängija mängulauale kasutades klassi Paigutus meetodeid)
		ArrayList<Integer> b = laevadMerel2.laevastik();
		for (int j=0; j<b.size(); j++) {
			int index2 = b.get(j);
			Mängulaud.mängijaMängulaud[index2] ++;
		}
		//System.out.println(Arrays.toString(Mängulaud.mängijaMängulaud));  // Mängija mängulaua massiiv laevadega
		Mängulaud.nähtavMängulaud(Mängulaud.arvutiMängulaud, Mängulaud.mängijaMängulaud);  //Mängulaua algseisu kuvamine (mängija väljal laevad nähtavad, arvuti omal varjatud)
		
		//Mängijalt küsitakse infot tulistatava punkti kohta kujul nt "A7". Järgnev tegevus peaks käima mingi tsüklina, kuni mäng läbi (laevad põhjas vm).
		Scanner scan = new Scanner(System.in);
		System.out.println();
		System.out.println("Palun sisesta tulistatava ruudu koordinaadid (kujul nt E8); ");
		String punktiKoordinaadid = scan.next();	
		
		// siia vahele peaks tulema HashMap, mis E7 vm mängulaua kooridnaadiks/indeksiks teisendab
		// samuti pommitamise kontroll, kas laev on põhjas ja vaja ümbruse koordinaatidele ka +2 liita st meetod pommitamiskoha ja ümbruse checkimiseks ning vastava mängulaua massiivi muutmiseks
		
		int c = 5;			//HashMapist saadav näidistulemus, kui mängija sisestab "E7".
		Mängulaud.arvutiMängulaud[c]+=2; //pommitamise testimiseks lihtsalt, hiljem kustutab ära selle ...
		Mängulaud.arvutiMängulaud[2]+=2;
		Mängulaud.arvutiMängulaud[4]+=2;
		Mängulaud.arvutiMängulaud[6]+=2;
		Mängulaud.arvutiMängulaud[8]+=2;
		Mängulaud.arvutiMängulaud[10]+=2;
		scan.close();
		System.out.println();
		Mängulaud.nähtavMängulaud(Mängulaud.arvutiMängulaud, Mängulaud.mängijaMängulaud);
		
		//Siia peaks tulema ka see, et arvuti pommitab mingi süsteemi alusel mingit mängja mängulaua punkti ...
		//Tsükli Lõpp

	}
}
