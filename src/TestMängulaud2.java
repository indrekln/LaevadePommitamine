
public class TestMängulaud2 {

	public static void main(String[] args) {
		Mängulaud2.arvutiMängulaud[1] = 1; // Mängulaua väärtuste muutmine (nt laevade paigutamisel).
		Mängulaud2.arvutiMängulaud[11] = 2;
		Mängulaud2.arvutiMängulaud[31] = 3;
		Mängulaud2.mängijaMängulaud[1] = 1;
		Mängulaud2.mängijaMängulaud[11] = 2;
		Mängulaud2.mängijaMängulaud[31] = 3;
		Mängulaud2.mängulauaPrint();  // Mängulaudade massiivide väljastamine.
		System.out.println();
		Mängulaud2.nähtavMängulaud(Mängulaud2.arvutiMängulaud, Mängulaud2.mängijaMängulaud);
	}

}
