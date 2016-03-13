
import java.util.Scanner;

public class Mäng {
	
	public static void main(String[] args) {
		
		/*Mängija laevade paigutamine, koordinaatide valik
		int[][] mängijaLaevad = new int[10][];
		Scanner scan = new Scanner(System.in); //Kasutajalt info oma laevade paigutuse kohta (praegu eeldab, et sisestaja järgib juhiseid ja ei pane laevu kattuma!!)
		for(int l=1; l<11; l++) {
			if (l<5) {
				System.out.println("Sisesta 1 ruudu pikkuse laeva koordinaadid xy (kujul nt 23): ");
			} else {
				if(l>4 && l<8) {
					System.out.println("Sisesta 2 ruudu pikkuse laeva koordinaadid xy eraldatuna tühikutega (kujul nt 23 24): ");
				} else {
					if(l>7 && l<10) {
						System.out.println("Sisesta 3 ruudu pikkuse laeva koordinaadid xy eraldatuna tühikutega (kujul nt 23 24 25): "); 
					} else {
						System.out.println("Sisesta 4 ruudu pikkuse laeva koordinaadid xy eraldatuna tühikutega (kujul nt 23 24 25 26): "); 
					}
				}
			}
			String laevadeKoordinaadid = scan.next();
			String[] reajupid = laevadeKoordinaadid.split(" ");
			int[] laev = new int[reajupid.length];
			for(int j=0; j<reajupid.length; j++) {
				laev[j] =  Integer.valueOf(reajupid[j].trim());
			}
			mängijaLaevad[l] = laev;
	    }
	    */
		
		Mängulaud.veergudearv = 9;
		Mängulaud.ridadearv = 9;
		
		/* Arvuti laevade koordinaatide genereerimine ja paigutamine väljakule ...
		int[][] arvutiLaevad = new int[10][];
		int j=1;
		while(j<5) {  // Laevade (pikkusega 1) koordinaatide genereerimine
			int[] arvutilaev1 = Laev.arvutiLaevaKoordinaadid(1);
			boolean check1 = false;  //kontrollitakse, kas selliste koordinaatidega laevapunkt on juba kasutusel.
			for(int[] olemasolevlaev: arvutiLaevad) {
				if(arvutilaev1 == olemasolevlaev) {
					check1=true;
				}
			}
			if (check1 == false) {
				arvutiLaevad[j] = arvutilaev1;
				j++;
			}
		}
		while(j>4 && j<8) {  //Laevade (pikkusega 2) koordinaatide genereerimine ja kontroll, kas koordinaadid on vabad
			int[] arvutilaev2 = Laev.arvutiLaevaKoordinaadid(2);
			boolean check2 = false;
			for(int s = 0; s<arvutiLaevad.length; s++) {
				for(int r = 0; r<arvutiLaevad[s].length; r++) {
					for(int t = 0; t<arvutilaev2.length; t++) {
						if(arvutilaev2[t] == arvutiLaevad[s][r]) {
							check2=true;
						}
					}				
				}
			}
			if (check2 == false) {
				arvutiLaevad[j] = arvutilaev2;
				j++;
			}
		}
		while(j>7 && j<10) {  //Laevade (pikkusega 3) koordinaatide genereerimine ja kontroll kas koordinaadid on vabad.
			int[] arvutilaev3 = Laev.arvutiLaevaKoordinaadid(3);
			boolean check3 = false;
			for(int s = 0; s<arvutiLaevad.length; s++) {
				for(int r = 0; r<arvutiLaevad[s].length; r++) {
					for(int t = 0; t<arvutilaev3.length; t++) {
						if(arvutilaev3[t] == arvutiLaevad[s][r]) {
							check3=true;
						}
					}				
				}
			}
			if (check3 == false) {
				arvutiLaevad[j] = arvutilaev3;
				j++;
			}
		}
		//Laeva (pikkusega 4) koordinaatide genereerimine ja kontroll, kas koordinaadid on vabad.
		int[] arvutilaev4 = Laev.arvutiLaevaKoordinaadid(4);
		boolean check4 = false;
		for(int s = 0; s<arvutiLaevad.length; s++) {
			for(int r = 0; r<arvutiLaevad[s].length; r++) {
				for(int t = 0; t<arvutilaev4.length; t++) {
					if(arvutilaev4[t] == arvutiLaevad[s][r]) {
						check4=true;
					}
				}				
			}
		}
		if (check4 == false) {
			arvutiLaevad[j] = arvutilaev4;
				j++;
		}
		*/
		
		//Mänguväljaku genereerimine ja kuvamine ...
		Mängulaud.maatriks(9, 9);
		Mängulaud.nähtavLaud(Mängulaud.maatriks(9,9));
		//scan.close();
	}
}		
		// Tulistamine
		//Scanner scan = new Scanner(System.in); //Kasutajalt info t
		//System.out.println("Sisesta millist ruutu tulistad (kujul näiteks H5 või A7): ");
	    //?   = scan.nextInt();

	
