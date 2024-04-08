package array;

public class Quiz3 {

	public static void main(String[] args) {
		
		int[] intArray = { 10, 15, 20, 25, 30};
		
		int sum = 0; // 합을 저장할 변수 선언
		
		for (int i = 0; i < intArray.length; i++) {  // i < 5
			sum += intArray[i];
		}
		System.out.println(sum);
	}

}
