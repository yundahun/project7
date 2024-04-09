package arraylist;

import java.util.ArrayList;

public class Quiz3 {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("AA");
		list.add("BB");
		list.add("CC");
		list.add("DD");
		list.add("EE");
		
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.print(str + " ");
		}
		
		System.out.println();
		
		for (String string : list) {
			System.out.print(string + " ");
		}
		
		System.out.println();
		
		// 뒤부터 삭제
		list.remove(4);
		list.remove(3);
		list.remove(2);
		list.remove(1);
		list.remove(0);

		System.out.print(list);
		
		// 앞부터 삭제
		list.remove(0);
		list.remove(0);
		list.remove(0);
		list.remove(0);
		list.remove(0);
	}
}
