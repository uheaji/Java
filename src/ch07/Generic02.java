package ch07;

import java.util.ArrayList;
import java.util.List;

public class Generic02 {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>(); // ctrl + shift + o ; import
		list1.add("사과");
		list1.add("딸기");
		
		int size = list1.size();
		for (int i = 0; i < size; i++) { // 배열은 length
			System.out.println(list1.get(i));
		}
		
		list1.add("바나나"); // 추가
		System.out.println(list1.get(2));
		
		list1.add(1, "참외"); // 중간에 요소 삽입하면 한칸 밀려난다.
		System.out.println(list1.get(1));
		
		list1.remove(1); // 요소 삭제
		System.out.println(list1.get(1)); // 참외가 삭제되어서 딸기가 다시출력.
		
		list1.clear(); // 모든요소 삭제
		System.out.println(list1.size());
	}

}
