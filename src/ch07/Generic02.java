package ch07;

import java.util.ArrayList;
import java.util.List;

public class Generic02 {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>(); // ctrl + shift + o ; import
		list1.add("���");
		list1.add("����");
		
		int size = list1.size();
		for (int i = 0; i < size; i++) { // �迭�� length
			System.out.println(list1.get(i));
		}
		
		list1.add("�ٳ���"); // �߰�
		System.out.println(list1.get(2));
		
		list1.add(1, "����"); // �߰��� ��� �����ϸ� ��ĭ �з�����.
		System.out.println(list1.get(1));
		
		list1.remove(1); // ��� ����
		System.out.println(list1.get(1)); // ���ܰ� �����Ǿ ���Ⱑ �ٽ����.
		
		list1.clear(); // ����� ����
		System.out.println(list1.size());
	}

}
