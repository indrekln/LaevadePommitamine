import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Laev {
	private int[] koordinaadid;
	private boolean[] tabamused; // tabamused.length PEAKS olema sama mis koordinaadid[].length

	public int[] getKoordinaadid() { //koordinaatide getter
		return koordinaadid;
	}

	public boolean pommitatud(int koordinaat) { //tabamuste getter
		for (int i = 0; i< this.koordinaadid.length; i++)
			if (this.koordinaadid[i] == koordinaat) {
				if (this.tabamused[i] == true) return true;
			}
		return false;
	}
	
	public boolean[] getPommitatudArray() { //tabamuste getter
		return this.tabamused;
	}
	
	public boolean põhjas() { //pihtas-põhjas getter
		for (int i = 0; i< this.tabamused.length; i++)
			if (this.tabamused[i] == false) {
				return false;
			}
		return true;
	}
	
	public void pommita(int koordinaat) { //tabamuste setter ehk pommitamine
		int i = 0;
		for (i = 0; i< this.koordinaadid.length; i++)
			if (this.koordinaadid[i] == koordinaat) {
				this.tabamused[i] = true;				
			}
	}
	
	public Laev(int[] koordinaadid, boolean[] tabamused) {
		this.koordinaadid = koordinaadid;
		this.tabamused = tabamused;
		if (this.koordinaadid.length != this.tabamused.length) 
			System.out.println("Koordinaatide ja tabamuste nimekirja pikkus ei ole võrdne!");
	}
	
	public boolean eiOleKoordinaat (int uuritavKoordinaat) {
		for (int koordinaat : koordinaadid) {
			if (uuritavKoordinaat == koordinaat) {return false;}
		}
		return true;
	}
	
	public HashSet<Integer> naaberkoordinaadid(int[] koordinaadid) {
		
		ArrayList<Integer> naabriteTööversioon = new ArrayList<Integer>();
		for (int koordinaat : koordinaadid) {
			int uusNW = koordinaat-9;
			int uusN = koordinaat-10;
			int uusNE = koordinaat - 11;
			int uusE = koordinaat - 1;
			int uusW = koordinaat + 1;
			int uusSW = koordinaat + 11;
			int uusS = koordinaat + 10;
			int uusSE = koordinaat +9;
			int[] uued = {uusNW, uusN, uusNE, uusE, uusW, uusSW, uusS, uusSE};
			for (int element : uued) {
				if ( 	element>0 && 
						element<100 && 
						eiOleKoordinaat(element)
						) //siia lisada merepiiri loogika, uus % 9 != 0 pole vist piisav
					{naabriteTööversioon.add(element);
					}
			}
		}
		
		return new HashSet<Integer>(naabriteTööversioon);
	}

	@Override
	public String toString() {
		return "Koordinaadid: " + Arrays.toString(koordinaadid) + ", Tabamused: " + Arrays.toString(tabamused)
				+ ", Põhjas?: " + põhjas() + ".";
	}

	
}

	
	
	
	
	
	
