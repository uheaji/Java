package ch03;

public class For04 {

	static void starPoint(int num) {
		for (int i = 0; i < num; i++) {
			System.out.print("*");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// 1��
		for (int i = 5; i > 0; i--) {
			For04.starPoint(i);
		}

		System.out.println();

		// 2��
		for (int i = 0; i < 4; i++) {
			For04.starPoint(i);
		}

		System.out.println();

		// 3��
		for (int i = 1; i < 4; i = i + 2) {
			For04.starPoint(i);
		}

	}
}
