import java.util.Arrays;
import java.util.Random;

//import java.util.Arrays;
public class LaevChar {
	//EESM2RK: tekitada yks laev String[10][10] m2ngulauale
	//Kas oleks lihtsam, kui m2nguv2li oleks alguses boolean[10][10]
	//ja siis lisada "pimesi" laevu ja kontrollida, et uus laev ei kattuks
	//olemasolevatega (nt kui alguses on 1 laev, siis tabeli summa on 1
	//ja kui lisada sinna neljane laev, siis tabeli summa peaks olema 1+4=5
	//see eeldab, et kui laev satub tyhjale kohale, siis toimub muutus
	//ja kui laev satub laevale, siis samuti (true + false = true; true+true = false)
	private int laeva_pikkus; //see parameeter peaks olema kas 4, 3, 2 v6i 1
	static char laeva_suembol = '#'; // feel free to edit (vbl on parem kui on boolean 1 vs 0?)
	
	char[] tee_laev_suembolitena() {
		
		//EESM2RK: TAGASTADA 10x10 maatriksil laev (07.03. seisuga String[10][10])
		//ETAPID:
		//1. TEKITADA LAEVALE PIKKUSE JA JUHUSLIKKUSE ALUSEL ORIENTATSIOON
		//2. MAHUTADA LAEV MAATRIKSISSE L2HTUVALT
		//2.1. MAATRIKSI PIIRIDEST
		//2.2. LAEVA PIKKUSEST
		//2.3. LAEVA ASETUSEST
		
		//KUI LAEVA PIKKUS ON TEADA, SIIS ON VAJA ANDA LAEVALE ORIENTATSIOON
		//ANNAME LAEVALE ORIENTATSIOONI VALIKUST ' - \ / | ' MUUTUJASSE LAEVA_ORIENTATSIOON:
		
		char tagasta_laeva_orientatsioon() {
				char laeva_orientatsioon = new char;
				// java RANDINT:
				private int min4random = 0;
				private int max4random = 3;
				private Random r = new Random();
				private int randint0to3 = r.nextInt(max4random - min4random + 1) + min4random; 
				//---------------------------------------------------------------
				switch (randint0to3){
				case 0: laeva_orientatsioon = '-';return laeva_orientatsioon;
				case 1: laeva_orientatsioon = '-';return laeva_orientatsioon;
				case 2: laeva_orientatsioon = '-';return laeva_orientatsioon;
				case 3: laeva_orientatsioon = '-';return laeva_orientatsioon;
				}
			}
		
		//--------------------------------------------------------------------------------
	
	int x_span() { 
		//oskame kontrollida, et laeva pikkus on 1...4 ja orientatsioon on hulgas "-|/|"?
		if (this.laeva_pikkus == 1 || this.laeva_orientatsioon == '|') return 1;
		return laeva_pikkus;
	}
	int y_span() {
		//oskame kontrollida, et laeva pikkus on 1...4 ja orientatsioon on hulgas "-|/|"?
		if (this.laeva_pikkus == 1 || this.laeva_orientatsioon == '-') return 1;
			return this.laeva_pikkus;
	}
	
		
		//LAEVALE ON VAJA KA ANDA ASUKOHT, MIS ARVESTAB LAEVA PIKKUSE JA ORIENTATSIOONIGA:
		
		char[][] laev_suembolitena = new char[10][10]; //PANEME LAEVA KOHE 10X10 KAARDI KIHILE
		
		//TEKITAME JUHUSLIKE ARVUDE GENERAATORI ABIGA LAEVALE X- JA Y- KOORDINAADID:
		
		private int laeva_NW_x_koordinaat; //1x1 laeva puhul suva, horisontaalse 4x1 puhul 10-4;
		private int laeva_NW_y_koordinaat; // 1x1 laeva puhul suva, vertikaalse 4x1 puhul 10-4;
		
		
		for (int x = laeva_NW_x_koordinaat;x < this.x_span(); x++) {
			for (int y = laeva_NW_y_koordinaat; y<this.y_span(); y++){
			laev_suembolitena[x][y] = laeva_suembol;
			}
		}
		return laev_suembolitena;
		}
	LaevChar (
			int laeva_pikkus, 
			char laeva_orientatsioon, 
			int laeva_NW_x_koordinaat, 
			int laeva_NW_y_koordinaat){
		this.laeva_pikkus = laeva_pikkus;
		this.laeva_orientatsioon = laeva_orientatsioon;
		this.laev_suembolitena = tee_laev_suembolitena();
		}

	@Override
	public String toString() {
		String laev_stringina = new String(laev_suembolitena);
		return "LaevChar [laeva_pikkus=" + laeva_pikkus + ", laev_suembolitena=" + laev_stringina
				+ "]";
	}

	public static void main (String[] args){
		int laeva_pikkus = 4;
		LaevChar LipuLaev = new LaevChar(laeva_pikkus);
		System.out.println(LipuLaev);
	}
}