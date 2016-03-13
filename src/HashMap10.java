import java.util.HashMap;
import java.util.Scanner;

public class HashMap10 {

	
	public static void main(String[] args) {
		
		//mängulaud koosneb 100st elemendist, vaikimisi väärtused 0
	    int[] mängulaud = new int[100];

	    //tähe väärtusele pannakse vastama number - vajalik veerunumbrite saamiseks
		HashMap<String, Integer> veerud = new HashMap<>();
		veerud.put("a", 0);
		veerud.put("b", 1);
		veerud.put("c", 2);
		veerud.put("d", 3);
		veerud.put("e", 4);
		veerud.put("f", 5);
		veerud.put("g", 6);
		veerud.put("h", 7);
		veerud.put("i", 8);
		veerud.put("j", 9);
		
		veerud.put("A", 0);
		veerud.put("B", 1);
		veerud.put("C", 2);
		veerud.put("D", 3);
		veerud.put("E", 4);
		veerud.put("F", 5);
		veerud.put("G", 6);
		veerud.put("H", 7);
		veerud.put("I", 8);
		veerud.put("J", 9);
		System.out.println(veerud);

		//Kasutajalt küsitakse koordinaat
		Scanner tulista = new Scanner(System.in); //Kasutajalt info t
		System.out.print("Sisesta koordinaat (kujul B5): ");
	    String koordinaatSisend = tulista.next();
	    
	    String veerutähis = "" + koordinaatSisend.charAt(0);
	    int veerg = veerud.get(veerutähis);
	    int rida = Character.getNumericValue(koordinaatSisend.charAt(1)) - 1;
	    int koordinaat = veerg + 10*rida;
	    
	    System.out.println(veerg);
	    System.out.println(rida);
	    System.out.println(koordinaat);
	    
	}

}
