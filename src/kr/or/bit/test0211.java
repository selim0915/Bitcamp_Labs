package kr.or.bit;

public class test0211 {

	//������
	public int age;
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// ����Լ�
	public void add() {
		int result = 2+3;
		//System.out.println("1. 2��3�� ���ϸ�: " +result);
	}
	
	public int add2() {
		int result = 2+3;
		System.out.println("2. 2��3�� ���ϸ�: " +result);
		return result;
	}
	
	public void add3(int a, int b) {
		int result = a+b;
		System.out.println("3. a��b�� ���ϸ�: " +result);
	}
	
	public int add4(int a, int b) {
		int result = a+b;
		System.out.println("4. a��b�� ���ϸ�: " +result);
		return result;
	}
	
	
	//----------------------------------------------
	public boolean ball;
	
	public void ballstart() {
		
	}
}
