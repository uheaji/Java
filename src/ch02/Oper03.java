package ch02;

public class Oper03 {
	public static void main(String[] args) {
		// 비교 연산 (결과는 boolean)
		// 비교연산 ==, <, > --> boolean
		System.out.println(1==1);
		System.out.println(1==2);
		
		boolean s = (1==1);
		
		// 예제 2-7 (비교 연산)
		System.out.println('a'>'b');
		System.out.println(3>=2);
		System.out.println(-1<0);
		System.out.println(3.45<=2);
		System.out.println(3==2);
		System.out.println(3!=2);
		System.out.println(!(3!=2));
		
		// (논리 연산) 
		System.out.println((3>2) && (3>4));
		System.out.println((3!=2) ^ (-1>0));
		System.out.println((3!=2) || (-1>0));
	}

}
