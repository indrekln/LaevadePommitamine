import java.util.HashMap;
import java.util.Scanner;

public class KüsiKoordinaat {

	//tähe väärtusele pannakse vastama number - vajalik veerunumbrite saamiseks
	private static HashMap<String, Integer> veerud = new HashMap<>();

	private static int koordinaat = 0;

	private static void abiTabel(HashMap<String, Integer> tabel){
		tabel.put("a", 0);
		tabel.put("b", 1);
		tabel.put("c", 2);
		tabel.put("d", 3);
		tabel.put("e", 4);
		tabel.put("f", 5);
		tabel.put("g", 6);
		tabel.put("h", 7);
		tabel.put("i", 8);
		tabel.put("j", 9);
	}
	
	//Võtab sisendiks kasutaja antud koordinaadid sõnena
	//Tagastab koordinaadi täisarvuna
	private static int koordinaadid(){
		
		abiTabel(veerud);
		//Kasutajalt küsitakse koordinaat
		Scanner tulista = new Scanner(System.in);
		System.out.print("Sisesta koordinaat (kujul E7): ");
		String sisend = tulista.next();

		if (sisend.length() == 2){
			String veerutähis = "" + sisend.charAt(0);
			if (veerud.containsKey(veerutähis.toLowerCase())) {
				int veerg = veerud.get(veerutähis.toLowerCase());
				int rida = Character.getNumericValue(sisend.charAt(1)) - 1;
				koordinaat = veerg + 10*rida;
				tulista.close();
				return koordinaat;
			}
			else {
				System.out.println("Vigane sisend!");
				koordinaadid();
			}
		}
		if (sisend.length() == 3 && sisend.charAt(1) == '1' && sisend.charAt(2) == '0'){
			String veerutähis = "" + sisend.charAt(0);
			if (veerud.containsKey(veerutähis.toLowerCase())) {
				int veerg = veerud.get(veerutähis.toLowerCase());
				koordinaat = veerg + 90;
				tulista.close();
				return koordinaat;
			}
			else {
				System.out.println("Vigane sisend!");
				koordinaadid();
			}
		}
		else {
			System.out.println("Vigane sisend!");
			koordinaadid();
		}
		tulista.close();
		return koordinaat;
	}

	public static int getKoordinaadid() {
		return koordinaadid();
	}
}