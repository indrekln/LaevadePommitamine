

public class Mängulaud {
	static int veergudearv;
	static int ridadearv;

	public static int[][] maatriks(int veergudearv, int ridadearv) { //tehakse esialgse -1-dega mängulauamaatriks
		int[][] laud = new int[veergudearv][ridadearv];
		for(int rida=0; rida<ridadearv; rida++) {
			for(int veerg=0; veerg<veergudearv; veerg++) {
				laud[rida][veerg]=-1;
			}
		}
		return laud;
	}
	public static void nähtavLaud(int[][] maatriks) { //Muudab -1, 0 ja 1 sisaldava maatriksi elemendid märkideks
		for(int i=1; i<veergudearv+1; i++) {
			System.out.print("\t"+i);
		}
		System.out.println();
		for(int rida=0; rida<ridadearv; rida++) {
			System.out.print(rida+1);
			for(int veerg=0; veerg<veergudearv; veerg++) {
				if(maatriks(veergudearv,ridadearv)[rida][veerg]==1) {
					System.out.print("\t"+"X");
				}
				else {
					if(maatriks(veergudearv,ridadearv)[rida][veerg]==0) {
						System.out.print("\t"+"*");
					}
					else {
						System.out.print("\t"+"~");
					}	
				}
			}
			System.out.println();
		}
	}
}
