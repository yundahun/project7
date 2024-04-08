package array;

public class Quiz6 {

	public static void main(String[] args) {
		
		int[] intArray = new int[] { 5, 20, 100, 30 , 77};
		
		int findIndex = 0;
		
		for (int i = 0; i < 5; i++) {
			
			if (intArray[i] == 20) {
				findIndex = i;
				System.out.println(findIndex);
				break;
			}
		}
	}

}
