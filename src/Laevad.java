import java.util.Random; //Laevade suvaliseks paigutamiseks

public class Laevad {

	public static void joonistaLaud() {

		String[] reaT�hed = {"  ","A","B","C","D","E","F","G","H","I","J"}; 

		System.out.println("\tA R V U T I\t\t       M � N G I J A");
		//Joonistame veergude t�hed
		for (int i = 0; i < 11; i++){
			System.out.print(" " + reaT�hed[i]);}
		System.out.print("\t\t");
		for (int i = 0; i < 11; i++){
			System.out.print(" " + reaT�hed[i]);}
		System.out.println();
		
		for (int i = 1; i < 11; i++){
			System.out.print(i + "  ");
			System.out.print("                  \t"); //Asendada laevadega.
			System.out.print(i + "\t");
			System.out.print(i + "                     \t"); //Asendada laevadega.
			System.out.print(i);
			System.out.println();}

		for (int i = 0; i < 11; i++){
			System.out.print(" " + reaT�hed[i]);}
		System.out.print("\t\t");
		for (int i = 0; i < 11; i++){
			System.out.print(" " + reaT�hed[i]);}
		System.out.println();
}
	
	public static void main(String[] args) {
		
		//M��rame m�ngulaua suuruseks 10x10, kasutame s�nede j�rjendit
		String[][] m�ngulaud = new String[10][10];
		
		//Loome laevade jaoks kaks s�nede j�rjendit. Lauale peab tulema 10 laeva:
		//1x4 ruutu, 2x3 ruutu, 3x2 ruutu, 4x1 ruut.
		//Igal laeval on neli v��rtust: rida, veerg, pikkus, suund.
		String[][] arvutiLaevad = new String[10][4];
		String[][] m�ngijaLaevad = new String[10][4];
		
		joonistaLaud();
		
		
		
	}

}
