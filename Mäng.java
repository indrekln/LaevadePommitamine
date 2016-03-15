import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class M�ng {
	static Paigutus laevadMerel1 = new Paigutus(); // arvuti laevade koordinaadid
	static Paigutus laevadMerel2 = new Paigutus(); // m�ngija laevade koordinaadid

	public static void main(String[] args) {
		System.out.println("M�ng algab ...");
		System.out.println();
		
		// Laevade paigutamine arvuti m�ngulauale kasutades klassi Paigutus meetodeid)
		ArrayList<Integer> a = laevadMerel1.laevastik(); 
		for (int i=0; i<a.size(); i++) {
			int index1 = a.get(i);
			M�ngulaud.arvutiM�ngulaud[index1] ++;
		}
		System.out.println(Arrays.toString(M�ngulaud.arvutiM�ngulaud)); //arvuti m�ngulaua massiiv laevadega
		//M�ngulaud.n�htavM�ngulaud(M�ngulaud.arvutiM�ngulaud, M�ngulaud.m�ngijaM�ngulaud); // arvuti m�ngulauale on lisatud laevad (mida ei n�e)
		
		// Laevade paigutamine m�ngija m�ngulauale kasutades klassi Paigutus meetodeid)
		ArrayList<Integer> b = laevadMerel2.laevastik();
		for (int j=0; j<b.size(); j++) {
			int index2 = b.get(j);
			M�ngulaud.m�ngijaM�ngulaud[index2] ++;
		}
		//System.out.println(Arrays.toString(M�ngulaud.m�ngijaM�ngulaud));  // M�ngija m�ngulaua massiiv laevadega
		M�ngulaud.n�htavM�ngulaud(M�ngulaud.arvutiM�ngulaud, M�ngulaud.m�ngijaM�ngulaud);  //M�ngulaua algseisu kuvamine (m�ngija v�ljal laevad n�htavad, arvuti omal varjatud)
		
		//M�ngijalt k�sitakse infot tulistatava punkti kohta kujul nt "A7". J�rgnev tegevus peaks k�ima mingi ts�klina, kuni m�ng l�bi (laevad p�hjas vm).
		Scanner scan = new Scanner(System.in);
		System.out.println();
		System.out.println("Palun sisesta tulistatava ruudu koordinaadid (kujul nt E8); ");
		String punktiKoordinaadid = scan.next();	
		
		// siia vahele peaks tulema HashMap, mis E7 vm m�ngulaua kooridnaadiks/indeksiks teisendab
		// samuti pommitamise kontroll, kas laev on p�hjas ja vaja �mbruse koordinaatidele ka +2 liita st meetod pommitamiskoha ja �mbruse checkimiseks ning vastava m�ngulaua massiivi muutmiseks
		
		int c = 5;			//HashMapist saadav n�idistulemus, kui m�ngija sisestab "E7".
		M�ngulaud.arvutiM�ngulaud[c]+=2; //pommitamise testimiseks lihtsalt, hiljem kustutab �ra selle ...
		M�ngulaud.arvutiM�ngulaud[2]+=2;
		M�ngulaud.arvutiM�ngulaud[4]+=2;
		M�ngulaud.arvutiM�ngulaud[6]+=2;
		M�ngulaud.arvutiM�ngulaud[8]+=2;
		M�ngulaud.arvutiM�ngulaud[10]+=2;
		scan.close();
		System.out.println();
		M�ngulaud.n�htavM�ngulaud(M�ngulaud.arvutiM�ngulaud, M�ngulaud.m�ngijaM�ngulaud);
		
		//Siia peaks tulema ka see, et arvuti pommitab mingi s�steemi alusel mingit m�ngja m�ngulaua punkti ...
		//Ts�kli L�pp

	}
}
