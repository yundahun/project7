package arraylist;

import java.util.ArrayList;

public class Quiz2 {

	public static void main(String[] args) {

		ArrayList<Boolean> list = new ArrayList<Boolean>();
		
		list.add(true);
		list.add(true);
		list.add(false);
			
		for (int i = 0; i < list.size(); i++) {
			boolean bool = list.get(i);
			System.out.print(bool + " ");			
		}
		
		boolean firstValue = list.get(0);
		
		int lastIndex = list.size() - 1;
		boolean lastValue = list.get(lastIndex);
	}
}
