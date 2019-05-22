class Vtest {
	int iv;
	void print() {
		System.out.println("instance variable: " + iv);
	}
}

class Apt {
	String color; // String은 클래스이지만 당분간 문자열 타입으로 생각
	Apt(String color) { 
	    // 특수한 함수 : 함수의 이름이 클래스 이름과 같다
		// 생성자 함수(constructor)
		// 목적 : instance variable의 초기화를 강제
		this.color = color;
	}
	
	void aptPrint() {
		System.out.println("색상: " + color);
	}
}


public class Ex02_variable {

	public static void main(String[] args) {
		Vtest t = new Vtest();
		t.print();
		
		Vtest t2 = new Vtest();
		t2.iv = 300;
		t2.print();
		
		Apt sk = new Apt("gold");
		sk.aptPrint();
		
		Apt naver = new Apt("green");
		naver.aptPrint();
	}

}
