package contenumero;

import java.util.Arrays;

public class principal {

	public static void main(String[] args) {
		long inici = System.currentTimeMillis();
		int num = 2565;
		//int num = 1000000000;
		int[] array = new int[500000];
		for(int i = 0;i<array.length;i++){
			array[i]=i;
		}
		if(Arrays.binarySearch(array, num)>0){
			System.out.println("El numero es troba a l'array");
		}
		else{
			System.out.println("El numero no es troba a l'array");
		}
		long acabat = System.currentTimeMillis();
	System.out.println("El programa ha trigat: " + ((acabat - inici)) + " ms");	
	}

}
