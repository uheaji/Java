package ch02;

public class Oper03 {
	public static void main(String[] args) {
		// �� ���� (����� boolean)
		// �񱳿��� ==, <, > --> boolean
		System.out.println(1==1);
		System.out.println(1==2);
		
		boolean s = (1==1);
		
		// ���� 2-7 (�� ����)
		System.out.println('a'>'b');
		System.out.println(3>=2);
		System.out.println(-1<0);
		System.out.println(3.45<=2);
		System.out.println(3==2);
		System.out.println(3!=2);
		System.out.println(!(3!=2));
		
		// (�� ����) 
		System.out.println((3>2) && (3>4));
		System.out.println((3!=2) ^ (-1>0));
		System.out.println((3!=2) || (-1>0));
	}

}
