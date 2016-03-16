package K15032016;

public class ArvutiPommid {
	public static int arvutiPommiKoordinaadid (int[] mängulaud) { //Kui arvuti pole veel laevale pihta saanud, valib pommitamise asukoha juhuslikult
		int arvutipommiKoordinaat = -1;
		while (true) {
			arvutipommiKoordinaat = (int) Math.round(Math.random()*99); 
			if (Mängulaud.mängijaMängulaud[arvutipommiKoordinaat]<2) { //arvuti leiab pommi asukoha, kuhu pole veel tulistatud
				break;
			} else {
				arvutipommiKoordinaat = -1;
			}
		}
		return arvutipommiKoordinaat;
	} 

	public static int arvutiPommiKoordinaadid (int[] mängulaud, int eelnevKoordinaat) { // Kui arvuti on laevale pihta saanud, otsib järgneva 4 käigu ajal lähedusest (4 suunas) 	
		int arvutipommiKoordinaat = -1;  // väärtus, mis jääb koordinaadiks, kui sobivat kohta ei leita
		while (true) {
			arvutipommiKoordinaat = eelnevKoordinaat-1;
			if (mängulaud[arvutipommiKoordinaat]<2 && arvutipommiKoordinaat>=0 && arvutipommiKoordinaat<100) {
				break;
			} else {
				arvutipommiKoordinaat = eelnevKoordinaat+1;
				if (mängulaud[arvutipommiKoordinaat]<2 && arvutipommiKoordinaat>=0 && arvutipommiKoordinaat<100) {
					break;
				} else {
					arvutipommiKoordinaat = eelnevKoordinaat-10;
					if(mängulaud[arvutipommiKoordinaat]<2 && arvutipommiKoordinaat>=0 && arvutipommiKoordinaat<100) {
						break;
					} else {
						arvutipommiKoordinaat = eelnevKoordinaat+10;
						if(mängulaud[arvutipommiKoordinaat]<2 && arvutipommiKoordinaat>=0 && arvutipommiKoordinaat<100) {
							break;
						} else {
							arvutiPommiKoordinaadid(mängulaud);
						}
					}
				}
			}
		}
		return arvutipommiKoordinaat;
	}
	
	public static int getArvutiPommiKoordinaadid(int[] mängulaud, int eelnevKoordinaat) {
		  return arvutiPommiKoordinaadid(mängulaud, eelnevKoordinaat);
		 }
	public static int getArvutiPommiKoordinaadid(int[] mängulaud) {
		  return arvutiPommiKoordinaadid(mängulaud);
		 }
}
