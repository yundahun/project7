package array;

public class Quiz2 {

	public static void main(String[] args) {
		int[] intArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		System.out.println(intArray[0]);
		
		// 배열의 마지막 인덱스는 배열크기 - 1 이다 => 9
		int lastIndex = intArray.length - 1; // 9
		
		System.out.println(lastIndex);
		System.out.println(intArray[lastIndex]);
	}

}
