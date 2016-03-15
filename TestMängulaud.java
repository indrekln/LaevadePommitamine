import java.util.ArrayList;
import java.util.Arrays;


public class TestM‰ngulaud {

	public static void main(String[] args) {
		/*M‰ngulaud2.arvutiM‰ngulaud[1] = 1; // M‰ngulaua v‰‰rtuste muutmine (nt laevade paigutamisel).
		M‰ngulaud2.arvutiM‰ngulaud[11] = 2;
		M‰ngulaud2.arvutiM‰ngulaud[31] = 3;
		M‰ngulaud2.m‰ngijaM‰ngulaud[1] = 1;
		M‰ngulaud2.m‰ngijaM‰ngulaud[11] = 2;
		M‰ngulaud2.m‰ngijaM‰ngulaud[31] = 3;
		M‰ngulaud2.m‰ngulauaPrint();  // M‰ngulaudade massiivide v‰ljastamine.*/
		System.out.println();
		
		M‰ngulaud.n‰htavM‰ngulaud(M‰ngulaud.arvutiM‰ngulaud, M‰ngulaud.m‰ngijaM‰ngulaud);
		
		ArrayList<Integer> a = Paigutus.laevastik(); // Laevade paigutamine arvuti m‰ngulauale
		for (int i=0; i<a.size(); i++) {
			int index1 = a.get(i);
			M‰ngulaud.m‰ngijaM‰ngulaud[index1] ++;
		}
		//System.out.println(Arrays.toString(M‰ngulaud2.m‰ngijaM‰ngulaud));
		
		M‰ngulaud.n‰htavM‰ngulaud(M‰ngulaud.arvutiM‰ngulaud, M‰ngulaud.m‰ngijaM‰ngulaud);
		
		ArrayList<Integer> b = Paigutus.laevastik(); // Laevade paigutamine m‰ngija m‰ngulauale
		for (int j=0; j<b.size(); j++) {
			int index2 = b.get(j);
			M‰ngulaud.arvutiM‰ngulaud[index2] ++;
		}
		System.out.println(Arrays.toString(M‰ngulaud.arvutiM‰ngulaud));
		

		//M‰ngulaud2.laevadePaigutusLauale(Paigutus.laevastik(), M‰ngulaud2.m‰ngijaM‰ngulaud);
		M‰ngulaud.n‰htavM‰ngulaud(M‰ngulaud.arvutiM‰ngulaud, M‰ngulaud.m‰ngijaM‰ngulaud);
		
		//M‰ngulaud2.laevadePaigutusLauale(M‰ngulaud2.m‰ngijaM‰ngulaud);
		 
	
	}
}
