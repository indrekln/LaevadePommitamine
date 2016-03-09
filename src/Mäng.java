import java.util.Scanner;

public class M�ng {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //Kasutajalt info m�nguv�lja suuruse kohta
		System.out.println("Sisesta m�nguv�lja ridade ja veergude arv");
	    int reaVeeruArv = scan.nextInt();
		
		M�ngulaud.veergudearv = reaVeeruArv;
		M�ngulaud.ridadearv = reaVeeruArv;
		
		//Arvuti 6 laeva koordinaatide genereerimine(2 suurusega 1, 2 suurusega 2 ja 2 suurusega 3), paigutamine v�ljakule ...
		Laev laev1 = new Laev(1);
		Laev laev2 = new Laev(1);
		Laev laev3 = new Laev(2);
		Laev laev4 = new Laev(2);
		Laev laev5 = new Laev(3);
		Laev laev6 = new Laev(3);
		
		int[] laev1_koordinaadid = laev1.laevadeKoordinaadid(); // Arvuti laevade koordinaadid
		while(true) {
			int[] laev2_koordinaadid = laev2.laevadeKoordinaadid();
			int c = 0;
			for(int el1 : laev2_koordinaadid) {
				for(int el2 : laev1_koordinaadid) {
					if (el1==el2) {
						c = 1;
					}
				}
			}
			if (c == 0) {
				break;
			}
		}
		while(true) {
			int[] laev3_koordinaadid = laev3.laevadeKoordinaadid();
			int c = 0;
			for(int el1 : laev1_koordinaadid) {
				for(int el3 : laev3_koordinaadid) {
					if (el1==el3) {
						c = 1;
					}
				}
			}
			int[] laev2_koordinaadid = laev2.laevadeKoordinaadid();
			for(int el2 : laev2_koordinaadid) {
				for(int el3 : laev3_koordinaadid) {
					if (el2==el3) {
						c = 1;
					}
				}
			}
			if (c == 0) {
				break;
			}
		}
		
		int[] laev3_koordinaadid = laev3.laevadeKoordinaadid();
		int[] laev4_koordinaadid = laev4.laevadeKoordinaadid();
		int[] laev5_koordinaadid = laev5.laevadeKoordinaadid();
		int[] laev6_koordinaadid = laev6.laevadeKoordinaadid();
		
		// M�nguv�ljaku genereerimine ja kuvamine ...
		M�ngulaud.maatriks(M�ngulaud.veergudearv, M�ngulaud.ridadearv);
		M�ngulaud.n�htavLaud(M�ngulaud.maatriks(M�ngulaud.veergudearv,M�ngulaud.ridadearv));
		scan.close();
		
		// Tulistamine
		//Scanner scant = new Scanner(System.in); //Kasutajalt info t
		//System.out.println("Sisesta m�nguv�lja ridade ja veergude arv");
	    //int reaVeeruArvt = scan.nextInt();
		
		
		
	}
}
