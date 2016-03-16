package K15032016;

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
		//System.out.println(Arrays.toString(Mängulaud.arvutiMängulaud)); //arvuti mängulaua massiiv laevadega
		//Mängulaud.nähtavMängulaud(Mängulaud.arvutiMängulaud, Mängulaud.mängijaMängulaud); // arvuti mängulauale on lisatud laevad (mida ei näe)
		
		// Laevade paigutamine mängija mängulauale kasutades klassi Paigutus meetodeid)
		ArrayList<Integer> b = laevadMerel2.laevastik();
		for (int j=0; j<b.size(); j++) {
			int index2 = b.get(j);
			Mängulaud.mängijaMängulaud[index2] ++;
		}

		Mängulaud.nähtavMängulaud();  //Mängulaua algseisu kuvamine (mängija väljal laevad nähtavad, arvuti omal varjatud)
		System.out.println();
		
		
		int pihtasKoordinaat = -1;
		for(int t=0; t<100; t++) {
			
			// Mängija pommitab
			int p1 = KüsiKoordinaat.getKoordinaadid(); //kasutaja sisestab pommitamise asukoha
			if (Mängulaud.arvutiMängulaud[p1]<2) {
				Mängulaud.arvutiMängulaud[p1]+=2;
			}
			Mängulaud.nähtavMängulaud();
			System.out.println();
			System.out.println("Arvuti käik ...");
			System.out.println();
			
			
			// Arvuti pommitab
			if (pihtasKoordinaat < 0) {  // Kui arvuti pole veel laeva tabanud
				int p2 = ArvutiPommid.getArvutiPommiKoordinaadid(Mängulaud.mängijaMängulaud); //Arvuti pommitab juhuslikku koordinaati
				if (p2 > 0) {		 //õnnestub leida juhuslikult sobiv koht
					Mängulaud.mängijaMängulaud[p2]+=2;
					if (Mängulaud.mängijaMängulaud[p2]==3) {  // võtab järgmise käigu ajaks teadmiseks, kui sai laevale pihta
					pihtasKoordinaat = p2;
					}
				}
			} else {  //Arvuti pommitab pihta eelmise käigus pihta saanud koordinaadi ümbrust (4 koordinaati)
				int p2 = ArvutiPommid.getArvutiPommiKoordinaadid(Mängulaud.mängijaMängulaud, pihtasKoordinaat);
				if (p2 < 0) {  // ei leia sobivad pommitamise kohta ümbrusest enam
					p2 = ArvutiPommid.getArvutiPommiKoordinaadid(Mängulaud.mängijaMängulaud); //Arvuti pommitab juhuslikku koordinaati
				} else {
					Mängulaud.mängijaMängulaud[p2]+=2;
					if (Mängulaud.mängijaMängulaud[p2]==3) {  // võtab järgmise käigu ajaks teadmiseks, kui sai laevale pihta
						pihtasKoordinaat = p2;
					}
				}
			}
			Mängulaud.nähtavMängulaud();
		}

		// pommitamise kontroll, kas laev on põhjas ja vaja ümbruse koordinaatidele ka +2 liita st meetod pommitamiskoha ja ümbruse checkimiseks ning vastava mängulaua massiivi muutmiseks
		
		System.out.println();
		//Mängulaud.nähtavMängulaud();
		//Siia peaks tulema ka see, et arvuti pommitab mingi süsteemi alusel mingit mängja mängulaua punkti ...
		//Tsükli Lõpp
	}
}

