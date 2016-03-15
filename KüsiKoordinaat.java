import java.util.HashMap;
import java.util.Scanner;

public class K�siKoordinaat {

	//t�he v��rtusele pannakse vastama number - vajalik veerunumbrite saamiseks
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
	
	//V�tab sisendiks kasutaja antud koordinaadid s�nena
	//Tagastab koordinaadi t�isarvuna
	private static int koordinaadid(){
		
		abiTabel(veerud);
		//Kasutajalt k�sitakse koordinaat
		Scanner tulista = new Scanner(System.in);
		System.out.print("Sisesta koordinaat (kujul E7): ");
		String sisend = tulista.next();

		if (sisend.length() == 2){
			String veerut�his = "" + sisend.charAt(0);
			if (veerud.containsKey(veerut�his.toLowerCase())) {
				int veerg = veerud.get(veerut�his.toLowerCase());
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
			String veerut�his = "" + sisend.charAt(0);
			if (veerud.containsKey(veerut�his.toLowerCase())) {
				int veerg = veerud.get(veerut�his.toLowerCase());
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