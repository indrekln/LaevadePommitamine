import java.util.Random; //Laevade suvaliseks paigutamiseks

public class Laevad {

	public static void joonistaLaud() {

		String[] reaTähed = {"  ","A","B","C","D","E","F","G","H","I","J"}; 

		System.out.println("\tA R V U T I\t\t       M Ä N G I J A");
		//Joonistame veergude tähed
		for (int i = 0; i < 11; i++){
			System.out.print(" " + reaTähed[i]);}
		System.out.print("\t\t");
		for (int i = 0; i < 11; i++){
			System.out.print(" " + reaTähed[i]);}
		System.out.println();
		
		for (int i = 1; i < 11; i++){
			System.out.print(i + "  ");
			System.out.print("                  \t"); //Asendada laevadega.
			System.out.print(i + "\t");
			System.out.print(i + "                     \t"); //Asendada laevadega.
			System.out.print(i);
			System.out.println();}

		for (int i = 0; i < 11; i++){
			System.out.print(" " + reaTähed[i]);}
		System.out.print("\t\t");
		for (int i = 0; i < 11; i++){
			System.out.print(" " + reaTähed[i]);}
		System.out.println();
}
	
	public static void main(String[] args) {
		
		//Määrame mängulaua suuruseks 10x10, kasutame sõnede järjendit
		String[][] mängulaud = new String[10][10];
		
		//Loome laevade jaoks kaks sõnede järjendit. Lauale peab tulema 10 laeva:
		//1x4 ruutu, 2x3 ruutu, 3x2 ruutu, 4x1 ruut.
		//Igal laeval on neli väärtust: rida, veerg, pikkus, suund.
		String[][] arvutiLaevad = new String[10][4];
		String[][] mängijaLaevad = new String[10][4];
		
		joonistaLaud();
		
		
		
	}

}
