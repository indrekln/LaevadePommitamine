package K15032016;

public class ArvutiPommid {
	public static int arvutiPommiKoordinaadid (int[] m�ngulaud) { //Kui arvuti pole veel laevale pihta saanud, valib pommitamise asukoha juhuslikult
		int arvutipommiKoordinaat = -1;
		while (true) {
			arvutipommiKoordinaat = (int) Math.round(Math.random()*99); 
			if (M�ngulaud.m�ngijaM�ngulaud[arvutipommiKoordinaat]<2) { //arvuti leiab pommi asukoha, kuhu pole veel tulistatud
				break;
			} else {
				arvutipommiKoordinaat = -1;
			}
		}
		return arvutipommiKoordinaat;
	} 

	public static int arvutiPommiKoordinaadid (int[] m�ngulaud, int eelnevKoordinaat) { // Kui arvuti on laevale pihta saanud, otsib j�rgneva 4 k�igu ajal l�hedusest (4 suunas) 	
		int arvutipommiKoordinaat = -1;  // v��rtus, mis j��b koordinaadiks, kui sobivat kohta ei leita
		while (true) {
			arvutipommiKoordinaat = eelnevKoordinaat-1;
			if (m�ngulaud[arvutipommiKoordinaat]<2 && arvutipommiKoordinaat>=0 && arvutipommiKoordinaat<100) {
				break;
			} else {
				arvutipommiKoordinaat = eelnevKoordinaat+1;
				if (m�ngulaud[arvutipommiKoordinaat]<2 && arvutipommiKoordinaat>=0 && arvutipommiKoordinaat<100) {
					break;
				} else {
					arvutipommiKoordinaat = eelnevKoordinaat-10;
					if(m�ngulaud[arvutipommiKoordinaat]<2 && arvutipommiKoordinaat>=0 && arvutipommiKoordinaat<100) {
						break;
					} else {
						arvutipommiKoordinaat = eelnevKoordinaat+10;
						if(m�ngulaud[arvutipommiKoordinaat]<2 && arvutipommiKoordinaat>=0 && arvutipommiKoordinaat<100) {
							break;
						} else {
							arvutiPommiKoordinaadid(m�ngulaud);
						}
					}
				}
			}
		}
		return arvutipommiKoordinaat;
	}
	
	public static int getArvutiPommiKoordinaadid(int[] m�ngulaud, int eelnevKoordinaat) {
		  return arvutiPommiKoordinaadid(m�ngulaud, eelnevKoordinaat);
		 }
	public static int getArvutiPommiKoordinaadid(int[] m�ngulaud) {
		  return arvutiPommiKoordinaadid(m�ngulaud);
		 }
}
