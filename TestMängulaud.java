import java.util.ArrayList;
import java.util.Arrays;


public class TestMängulaud {

	public static void main(String[] args) {
		/*Mängulaud2.arvutiMängulaud[1] = 1; // Mängulaua väärtuste muutmine (nt laevade paigutamisel).
		Mängulaud2.arvutiMängulaud[11] = 2;
		Mängulaud2.arvutiMängulaud[31] = 3;
		Mängulaud2.mängijaMängulaud[1] = 1;
		Mängulaud2.mängijaMängulaud[11] = 2;
		Mängulaud2.mängijaMängulaud[31] = 3;
		Mängulaud2.mängulauaPrint();  // Mängulaudade massiivide väljastamine.*/
		System.out.println();
		
		Mängulaud.nähtavMängulaud(Mängulaud.arvutiMängulaud, Mängulaud.mängijaMängulaud);
		
		ArrayList<Integer> a = Paigutus.laevastik(); // Laevade paigutamine arvuti mängulauale
		for (int i=0; i<a.size(); i++) {
			int index1 = a.get(i);
			Mängulaud.mängijaMängulaud[index1] ++;
		}
		//System.out.println(Arrays.toString(Mängulaud2.mängijaMängulaud));
		
		Mängulaud.nähtavMängulaud(Mängulaud.arvutiMängulaud, Mängulaud.mängijaMängulaud);
		
		ArrayList<Integer> b = Paigutus.laevastik(); // Laevade paigutamine mängija mängulauale
		for (int j=0; j<b.size(); j++) {
			int index2 = b.get(j);
			Mängulaud.arvutiMängulaud[index2] ++;
		}
		System.out.println(Arrays.toString(Mängulaud.arvutiMängulaud));
		

		//Mängulaud2.laevadePaigutusLauale(Paigutus.laevastik(), Mängulaud2.mängijaMängulaud);
		Mängulaud.nähtavMängulaud(Mängulaud.arvutiMängulaud, Mängulaud.mängijaMängulaud);
		
		//Mängulaud2.laevadePaigutusLauale(Mängulaud2.mängijaMängulaud);
		 
	
	}
}
