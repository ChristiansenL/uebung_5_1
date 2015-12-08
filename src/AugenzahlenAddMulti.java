
public class AugenzahlenAddMulti {

	int[] wuerfel1 = new int[6];
	int[] wuerfel2 = new int[6];
	int[] array = new int [13];

	for (int zaehler = 0; zaehler < 1000; zaehler++) {
		
		int x = Zufall.getZufallInt(1, 6);
		int y = Zufall.getZufallInt(1, 6);
		
		int z = x+y;
		array[z-1]++;
		
	}

	for (int y = 0; y < 13; y++) {
		System.out.println(y + ": " + array[y]);
	}
	
}
