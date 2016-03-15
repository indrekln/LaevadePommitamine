import java.util.ArrayList;

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
		//System.out.println(Arrays.toString(M�ngulaud.arvutiM�ngulaud)); //arvuti m�ngulaua massiiv laevadega
		//M�ngulaud.n�htavM�ngulaud(M�ngulaud.arvutiM�ngulaud, M�ngulaud.m�ngijaM�ngulaud); // arvuti m�ngulauale on lisatud laevad (mida ei n�e)
		
		// Laevade paigutamine m�ngija m�ngulauale kasutades klassi Paigutus meetodeid)
		ArrayList<Integer> b = laevadMerel2.laevastik();
		for (int j=0; j<b.size(); j++) {
			int index2 = b.get(j);
			M�ngulaud.m�ngijaM�ngulaud[index2] ++;
		}
		// System.out.println(Arrays.toString(M�ngulaud.m�ngijaM�ngulaud));  // M�ngija m�ngulaua massiiv laevadega
		M�ngulaud.n�htavM�ngulaud(M�ngulaud.arvutiM�ngulaud, M�ngulaud.m�ngijaM�ngulaud);  //M�ngulaua algseisu kuvamine (m�ngija v�ljal laevad n�htavad, arvuti omal varjatud)
	
		// ... Siia peaks tulema kasutajalt pommitamiskoha k�simine Scanneriga ja HashMapi abil koordinaadiks �mber teisendus, meetod pommitamiskoha ja �mbruse checkimiseks ning vastava m�ngulaua massiivi muutmiseks ...
		// ... Samuti m�ngulaua uuendatud pildi kuvamine st uuesti: M�ngulaud.n�htavM�ngulaud(M�ngulaud.arvutiM�ngulaud, M�ngulaud.m�ngijaM�ngulaud);
	}
}
