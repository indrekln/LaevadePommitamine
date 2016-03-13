import java.util.Arrays;

public class Laev {
	private int[] laevaKoordinaadid;
	
	public Laev(int[] laevaKoordinaadid) {
		super();
		this.laevaKoordinaadid = laevaKoordinaadid;
	}

	public int[] getLaevaKoordinaadid() {
		return laevaKoordinaadid;
	}

	public void setLaevaKoordinaadid(int[] laevaKoordinaadid) {
		this.laevaKoordinaadid = laevaKoordinaadid;
	}


	public static int[] arvutiLaevaKoordinaadid(int pikkus) { // Arvuti laevade koordinaatide määramine
		int[] koordinaadid = new int[pikkus];
		if (pikkus==1) { // laev pikkusega 1 koordinaatide määramine
			int x0 = (int) Math.round(Math.random()*9-1);
			int y0 = (int) Math.round(Math.random()*9-1);
			koordinaadid[0] = x0+y0;
			return koordinaadid;
		}
		else { //pikemate laevade koordinaatide määramine
			int x0 = (int) Math.round(Math.random()*(9-2*(pikkus-1))-(pikkus)); //laeva esimene punkt pannakse äärtest piisavale kaugusele
			int y0 = (int) Math.round(Math.random()*(9-2*(pikkus-1))-(pikkus)); // xy
			koordinaadid[0] = x0+y0;
			int suund = (int) Math.round(Math.random()*4); //Laeva suund: 0 - üles, 1 - alla, 2 - vasakule, 3 - paremale.
			if (suund == 0) {		// laeva suund üles
				for(int i=1; i<pikkus; i++) {
					int x = x0;
					int y = y0-i;
					koordinaadid[i] = x+y;
				}
			}
			else {
				if (suund == 1) {	// laeva suund alla
					for(int i=1; i<pikkus; i++) {
						int x = x0;
						int y = y0+i;
						koordinaadid[i] = x+y;
					}
				}
				else {
					if (suund == 2) {  //laeva suund vasakule
						for(int i=1; i<pikkus; i++) {
							int x = x0-i;
							int y = y0;
							koordinaadid[i] = x+y;
						}
					}
					else {   // laeva suund ==3 ehk suund paremale
						for(int i=1; i<pikkus; i++) {
							int x = x0+1;
							int y = y0;
							koordinaadid[i] = x+y;
						}
					}
				}
			}
		return koordinaadid;
		}
	}

	@Override
	public String toString() {
		return "Laev [laevaKoordinaadid=" + Arrays.toString(laevaKoordinaadid) + "]";
	}
}