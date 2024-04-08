package array;

import java.util.Arrays;

public class Quiz4 {

	public static void main(String[] args) {
		
		int[] intArray = new int[5];
		
		
		int cnt = 0; // 인덱스를 저장할 변수
		
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " ");
			}
		}
		
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				intArray[cnt] = i;
				cnt ++; // 0~4
			}
		}
		System.out.println(Arrays.toString(intArray));
	}

}
