

public class ArvutiKoordinaat {
	public static int arvutiPommiKoordinaadid (int[] mängulaud) { //Kui arvuti pole veel laevale pihta saanud, valib pommitamise asukoha juhuslikult
		int arvutipommiKoordinaat = Mäng.mängijaPommitamata.get((int) Math.round(Math.random()*Mäng.mängijaPommitamataHulk));
		return arvutipommiKoordinaat;
	} 

	public static int arvutiPommiKoordinaadid (int[] mängulaud, int eelnevKoordinaat) { // Kui arvuti on laevale pihta saanud, otsib järgneva 4 käigu ajal lähedusest (4 suunas) 	
		int arvutipommiKoordinaat = Mäng.mängijaPommitamata.get((int) Math.round(Math.random()*Mäng.mängijaPommitamataHulk));
		while (true) {
			arvutipommiKoordinaat = eelnevKoordinaat-1;
			if (arvutipommiKoordinaat>=0 && arvutipommiKoordinaat<100) {
				if (mängulaud[arvutipommiKoordinaat]<2) {
					break;
				}
			} 
			arvutipommiKoordinaat = eelnevKoordinaat+1;
			if (arvutipommiKoordinaat>=0 && arvutipommiKoordinaat<100) {
				if (mängulaud[arvutipommiKoordinaat]<2) {
					break;
				}
			} 
			arvutipommiKoordinaat = eelnevKoordinaat-10;
			if(arvutipommiKoordinaat>=0 && arvutipommiKoordinaat<100) {
				if (mängulaud[arvutipommiKoordinaat]<2) {
					break;
				}
			}
			arvutipommiKoordinaat = eelnevKoordinaat+10;
			if(arvutipommiKoordinaat>=0 && arvutipommiKoordinaat<100) {
				if (mängulaud[arvutipommiKoordinaat]<2) {
					break;
				}
			}
			arvutipommiKoordinaat = Mäng.mängijaPommitamata.get((int) Math.round(Math.random()*Mäng.mängijaPommitamataHulk));
			System.out.println("Täiega feil");
			break;
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
