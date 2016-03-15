import java.util.HashSet;
public class Test2 {

	public static void main(String[] args) {
		int[] lodjaKoordinaadid = {0};
		boolean[] lodjaTabamused = {false};
		int[] lahingulaevaKoordinaadid = {22,23,24,25};
		boolean[] lahingulaevaTabamused = {false,false,false,false};
		Laev lahingulaev = new Laev(lahingulaevaKoordinaadid,lahingulaevaTabamused);
		Laev lodi = new Laev(lodjaKoordinaadid,lodjaTabamused);
		System.out.println("Lodi Enne: " + lodi);
		System.out.println("Lahingulaev Enne: " + lahingulaev);
		System.out.println("Pommitame 0@lodi ja 24@lahingulaev...");
		lodi.pommita(0);
		lahingulaev.pommita(24);
		System.out.println("Lodi pärast: " + lodi);
		System.out.println("Lahingulaev pärast: " + lahingulaev);
		System.out.println("Kas lahingulaev@24 on pommitatud? Vastus: " + lahingulaev.pommitatud(24) + ".");
		System.out.println("Kas lahingulaev@23 on pommitatud? Vastus: " + lahingulaev.pommitatud(23) + ".");
		System.out.println("Testime getKoordinaadid ja getPommitatudArray: ");
		int [] getKoordinaadidNäide = lahingulaev.getKoordinaadid();
		boolean [] getPommitatudArrayNäide = lahingulaev.getPommitatudArray();
		if (getKoordinaadidNäide.length == getPommitatudArrayNäide.length)
			System.out.println("Lahingulaev:");
		for (int i = 0; i<getKoordinaadidNäide.length;i++){
			System.out.println("Koordinaat: " + getKoordinaadidNäide[i] + ", Pommitatud: " + getPommitatudArrayNäide[i] + ".");
		}
		System.out.println("Lahingulaeva koordinaadid, mis ei ole naaberkoordinaadid: " );
		HashSet<Integer> lahingulaevaNaaberkoordinaadid = lahingulaev.naaberkoordinaadid(lahingulaev.getKoordinaadid());
		for (int element : lahingulaevaNaaberkoordinaadid) {
			System.out.print(element + ", ");
		}
	}
}