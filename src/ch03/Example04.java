package ch03;

import java.util.Scanner;

public class Example04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println(" ���� 3�� �Է�>>");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();

		int mid;
		if (((num1 > num2) && (num1 < num3)) || ((num1 < num2) && (num1 > num3))) {
			mid = num1;
			System.out.println("�߰� ���� " + mid);
		} else if (((num2 > num1) && (num2 < num3)) || ((num2 < num1) && (num2 > num3))) {
			mid = num2;
			System.out.println("�߰� ���� " + mid);
		} else {
			mid = num3;
			System.out.println("�߰� ���� " + mid);
		}
	}
}
