package array;

public class Quiz5 {

	public static void main(String[] args) {
		
		int[] intArray = {5, 20, 100, 30, 77};
		
		int max = 0;
		max = intArray[0];
		
		for (int i = 1; i < 5; i++) {
			
			if (intArray[i] > max) {
				max = intArray[i];
			}
		}
		System.out.println(max);
	}

}
