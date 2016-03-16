package K15032016;

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
		//System.out.println(Arrays.toString(M�ngulaud.arvutiM�ngulaud)); //arvuti m�ngulaua massiiv laevadega
		//M�ngulaud.n�htavM�ngulaud(M�ngulaud.arvutiM�ngulaud, M�ngulaud.m�ngijaM�ngulaud); // arvuti m�ngulauale on lisatud laevad (mida ei n�e)
		
		// Laevade paigutamine m�ngija m�ngulauale kasutades klassi Paigutus meetodeid)
		ArrayList<Integer> b = laevadMerel2.laevastik();
		for (int j=0; j<b.size(); j++) {
			int index2 = b.get(j);
			M�ngulaud.m�ngijaM�ngulaud[index2] ++;
		}

		M�ngulaud.n�htavM�ngulaud();  //M�ngulaua algseisu kuvamine (m�ngija v�ljal laevad n�htavad, arvuti omal varjatud)
		System.out.println();
		
		
		int pihtasKoordinaat = -1;
		for(int t=0; t<100; t++) {
			
			// M�ngija pommitab
			int p1 = K�siKoordinaat.getKoordinaadid(); //kasutaja sisestab pommitamise asukoha
			if (M�ngulaud.arvutiM�ngulaud[p1]<2) {
				M�ngulaud.arvutiM�ngulaud[p1]+=2;
			}
			M�ngulaud.n�htavM�ngulaud();
			System.out.println();
			System.out.println("Arvuti k�ik ...");
			System.out.println();
			
			
			// Arvuti pommitab
			if (pihtasKoordinaat < 0) {  // Kui arvuti pole veel laeva tabanud
				int p2 = ArvutiPommid.getArvutiPommiKoordinaadid(M�ngulaud.m�ngijaM�ngulaud); //Arvuti pommitab juhuslikku koordinaati
				if (p2 > 0) {		 //�nnestub leida juhuslikult sobiv koht
					M�ngulaud.m�ngijaM�ngulaud[p2]+=2;
					if (M�ngulaud.m�ngijaM�ngulaud[p2]==3) {  // v�tab j�rgmise k�igu ajaks teadmiseks, kui sai laevale pihta
					pihtasKoordinaat = p2;
					}
				}
			} else {  //Arvuti pommitab pihta eelmise k�igus pihta saanud koordinaadi �mbrust (4 koordinaati)
				int p2 = ArvutiPommid.getArvutiPommiKoordinaadid(M�ngulaud.m�ngijaM�ngulaud, pihtasKoordinaat);
				if (p2 < 0) {  // ei leia sobivad pommitamise kohta �mbrusest enam
					p2 = ArvutiPommid.getArvutiPommiKoordinaadid(M�ngulaud.m�ngijaM�ngulaud); //Arvuti pommitab juhuslikku koordinaati
				} else {
					M�ngulaud.m�ngijaM�ngulaud[p2]+=2;
					if (M�ngulaud.m�ngijaM�ngulaud[p2]==3) {  // v�tab j�rgmise k�igu ajaks teadmiseks, kui sai laevale pihta
						pihtasKoordinaat = p2;
					}
				}
			}
			M�ngulaud.n�htavM�ngulaud();
		}

		// pommitamise kontroll, kas laev on p�hjas ja vaja �mbruse koordinaatidele ka +2 liita st meetod pommitamiskoha ja �mbruse checkimiseks ning vastava m�ngulaua massiivi muutmiseks
		
		System.out.println();
		//M�ngulaud.n�htavM�ngulaud();
		//Siia peaks tulema ka see, et arvuti pommitab mingi s�steemi alusel mingit m�ngja m�ngulaua punkti ...
		//Ts�kli L�pp
	}
}

