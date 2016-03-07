public class Laev {
	private int reakoordinaat1;
	private int veerukoordinaat1;
	private int reakoordinaat2;
	private int veerukoordinaat2;
	private int reakoordinaat3;
	private int veerukoordinaat3;
	private int pikkus;
	
	public Laev(int pikkus, int reakoordinaat1, int veerukoordinaat1) {
		this.pikkus = pikkus;
		this.reakoordinaat1 = reakoordinaat1;
		this.veerukoordinaat1 = veerukoordinaat1;
	}
	public Laev(int pikkus, int reakoordinaat1, int veerukoordinaat1, int reakoordinaat2, int veerukoordinaat2) {
		this.pikkus = pikkus;
		this.reakoordinaat1 = reakoordinaat1;
		this.veerukoordinaat1 = veerukoordinaat1;
		this.reakoordinaat2 = reakoordinaat2;
		this.veerukoordinaat2 = veerukoordinaat2;
	}
	public Laev(int pikkus, int reakoordinaat1, int veerukoordinaat1, int reakoordinaat2, int veerukoordinaat2, int reakoordinaat3, int veerukoordinaat3) {
		this.pikkus = pikkus;
		this.reakoordinaat1 = reakoordinaat1;
		this.veerukoordinaat1 = veerukoordinaat1;
		this.reakoordinaat2 = reakoordinaat2;
		this.veerukoordinaat2 = veerukoordinaat2;
		this.reakoordinaat3 = reakoordinaat3;
		this.veerukoordinaat3 = veerukoordinaat3;
	}
	public Laev(int pikkus) {
		this.pikkus = pikkus;
	}
	
	public int getReakoordinaat1() {
		return reakoordinaat1;
	}
	public int getVeerukoordinaat1() {
		return veerukoordinaat1;
	}
	public int getReakoordinaat2() {
		return reakoordinaat2;
	}
	public int getVeerukoordinaat2() {
		return veerukoordinaat2;
	}
	public int getReakoordinaat3() {
		return reakoordinaat3;
	}
	public int getVeerukoordinaat3() {
		return veerukoordinaat3;
	}
	public int getPikkus() {
		return pikkus;
	}

	public void setReakoordinaat1(int reakoordinaat1) {
		this.reakoordinaat1 = reakoordinaat1;
	}
	public void setVeerukoordinaat1(int veerukoordinaat1) {
		this.veerukoordinaat1 = veerukoordinaat1;
	}
	public void setReakoordinaat2(int reakoordinaat2) {
		this.reakoordinaat2 = reakoordinaat2;
	}
	public void setVeerukoordinaat2(int veerukoordinaat2) {
		this.veerukoordinaat2 = veerukoordinaat2;
	}
	public void setReakoordinaat3(int reakoordinaat3) {
		this.reakoordinaat3 = reakoordinaat3;
	}
	public void setVeerukoordinaat3(int veerukoordinaat3) {
		this.veerukoordinaat3 = veerukoordinaat3;
	}
	public void setPikkus(int pikkus) {
		this.pikkus = pikkus;
	}
	
	public int[] laevadeKoordinaadid() {
		int[] koordinaadid = new int[2*pikkus];
		if(pikkus==1) {
			koordinaadid[0] = (int) Math.round(Math.random()*(Mängulaud.ridadearv-1));
			koordinaadid[1] = (int) Math.round(Math.random()*(Mängulaud.ridadearv-1));
			return koordinaadid;
		}
		else {
			koordinaadid[0] = (int) Math.round(Math.random()*(Mängulaud.ridadearv-pikkus)-(pikkus-1)); //laeva esimene punkt pannakse äärtest piisavale kaugusele
			koordinaadid[1] = (int) Math.round(Math.random()*(Mängulaud.ridadearv-pikkus)-(pikkus-1)); 
			int suund = (int) Math.round(Math.random()*4); //0 - üles, 1 - alla, 2 - vasakule, 3 - paremale.
			if (suund == 0) {		// laeva suund üles
				for(int i=2, j=1; i<koordinaadid.length; i+=2, j++) {
					koordinaadid[i] = koordinaadid[0]-j;
					koordinaadid[i+1] = koordinaadid[1];
				}
			}
			else {
				if (suund == 1) {	// laeva suund alla
					for(int i=2, j=1; i<koordinaadid.length; i+=2, j++) {
						koordinaadid[i] = koordinaadid[0]+j;
						koordinaadid[i+1] = koordinaadid[1];
					}
				}
				else {
					if (suund == 2) {  //laeva suund vasakule
						for(int i=2, j=1; i<koordinaadid.length; i+=2, j++) {
							koordinaadid[i] = koordinaadid[0];
							koordinaadid[i+1] = koordinaadid[1]-j;
						}
					}
					else {   // laeva suund ==3 ehk suund paremale
						for(int i=2, j=1; i<koordinaadid.length; i+=2, j++) {
							koordinaadid[i] = koordinaadid[0];
							koordinaadid[i+1] = koordinaadid[1]+j;
						}
					}
				}
			}
		return koordinaadid;
		}
	}
}