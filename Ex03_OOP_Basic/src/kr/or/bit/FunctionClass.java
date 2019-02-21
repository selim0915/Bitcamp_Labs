package kr.or.bit;
/*
 * �Լ��� ����� �ּҴ����̴�.
 * �Լ��� ����
 * 
 * 1. void�̸鼭 parameter�� �����ϴ� ��
 * 		=> public void print(String str) { System.out.println(str); }
 * 2. void�̸鼭 parameter�� ���°�
 * 		=> public void print() { System.out.println("hi"); }
 * 3. return type�� �����ϸ鼭 parameter�� �����ϴ� ��
 * 		=> public int call(int i) { return i+100; }  
 * 4. return type�� �����ϸ鼭 parameter�� ���´�
 * 		=> public int call() { return 100; } 
 * 
 * void: ��ȯ ���� ���ٸ� �ǹ� : retrun value�� ����.
 * return Type: [8���� �⺻Ÿ��] + String + ����� ���� class + �迭(Array) + Collection + Interface
 * �Լ��� retrun tyPe(ex public int calc(){ return 100;}
 * �ݵ�� ���ȿ� {return }������ ������ �־�� �Ѵ�.
 * 
 * parameter(�Ű�����): [8���� �⺻Ÿ��] + String + ����� ���� class 
 * 							+ �迭(Array) + Collection + Interface
 * 
 * �Լ��� �ݵ�� ȣ�� �Ǿ�� ���� �Ѵ�.
 */

public class FunctionClass {
	
	//�Լ��̸��� �ǹ��ִ� �ܾ��� �����̾�� �Ѵ�. �� �ȴ�.
	public void m() {
		System.out.println("�Ϲ� �Լ�: void, param(x)");
	}

	public void m2(int i) {
		System.out.println("param value: "+ i);
		System.out.println("�Ϲ� �Լ�: void, param(o)");
	}
	
	//m3()�� ȣ���ϸ� 100�� ���� �޴´�.
	public int m3() {
		return 100;
	}
	
	//���� �������� ���� �ʴ� ���� ���� �� �� �ִ�.
	public int m4(int data) {
		return data+100;
	}
	
	/*
	 * private ������ �Լ���?
	 * ��ǹ�: class���ο��� �ٸ� �Լ��� �����ִ� ���� �� �ҋ�, 
	 * 			�ٸ� �������� ������ �������� ����� �Ѱ��� �Լ��� ��Ƽ� ����� �����ϴ� ����
	 * 
	 */
	private int operationMethod(int data) {
		return data *100;
	}
	
	public int sum(int data) {
		return operationMethod(data); //���� �ڵ尡 ����
	}
	
	public int sum2(int data) {
		int result = operationMethod(data);
		return result;
	}
	
	//Ȯ���Լ�: �Ķ������ ������ �������� ��
	// ��ü �Ķ���� ������ �� ���;� �Ѵ�.
	public int sum3(int i, int j, int k) {
		return i + j + k;
	}
	
	// Quiz
	//a��b ���߿� ū���� �����ϴ� �Լ�
	public int max(int a, int b) {
		return (a>b) ? a:b;
//		int result =0;
//		if(a>b) {
//			result = a;
//		} else if(a<b){
//			result = b;
//		} else {
//			System.out.println("���� ����.");
//		}
//		return result;
	}
	
	public String concat(String s, String s2, String s3) {
		return s + "/" +s2 + "/"+s3 ;
	}
	
	//----------------------------------------------------------------//
	
	//Ŭ������ Ÿ���̴�.
	//public int call() { return 100; }
	//public Tv call() { Tv t = new Tv(); return t;}
	//public Tv call() { return new Tv(); }//Ŭ����Ÿ���� Ŭ������ ���� �޴´�. (�ּҰ��� �������ִ� ��)
	
	//public void call(Tv t) {System.out.println(t.name); }
	//Tv tt = new Tv();
	//tt.name="�Ｚ";
	//call(tt);

	public Tv objMethod() {
		//TvŸ���� ���� �ּҰ��� ���Ϲ޴´�.0
//		Tv tt = new Tv(); //heap����� �ּҰ� tt �Ҵ�
//		tt.brandname = "������";
//		return tt;
		
		return new Tv(); //heap����� �ּҰ� ����
	}
	
	public void objMethod2(Tv t) {
		System.out.println("Tv Ÿ�� ����:" + t);
		System.out.println("ä�� ����: " + t.ch);
		System.out.println("�귣���̸�: " + t.brandname);
	}
	
	
	
	
	
	
	
	
}
