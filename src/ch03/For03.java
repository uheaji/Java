package ch03;

public class For03 {

	static void starPoint(int num) {
		for (int i = 0; i < num; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		for (int i = 0; i < 6; i++) {
				For03.starPoint(i);
		}
		
//		for (int i = 1; i < 6; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

	}

}
