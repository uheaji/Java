package ch13;

class Another implements Runnable { // Runnable 타입이 되어야한다.

	// 실행단위 코드블록 = 스택(스레드)
	@Override
	public void run() {
		System.out.println("새로운 스레드 실행됨");
		for (int i = 1; i < 11; i++) {
			try {
				System.out.println("run : " + i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("새로운 스레드 종료");
	}
}

public class Thread01 {

	public static void main(String[] args) {
		System.out.println("main 스레드 실행됨");
		
		// 새로운 스레드 실행 1. 스레드 객체 생성, 2. 타켓 설정 3. 실행
		Thread t1 = new Thread(new Another());
		t1.start(); // 독립적인 스레드 실행
		
		for (int i = 1; i < 11; i++) {
			try {
				System.out.println("main : " + i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("main스레드 종료");
	}// end of main

}
