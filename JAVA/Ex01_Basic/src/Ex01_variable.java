// main �Լ��� ������ �ִ� Ŭ���� -> ���α׷��� �������� ������ �ִ� Ŭ����
// C# : public static void Main()
// ���� : variable
// ���� Scope (��ȿ����): ����Ǵ� ��ġ�� ����
// 1. instance variable : ��ü���� class Test{ private int age; }
// 2. local variable    : �������� (�Լ� �ȿ� ����� ����)
// class Test { public void run() {int speed = 0;} }
// ���������� �׻� �ʱⰪ�� �ʿ��ϴ�
// 3. static variable   : �������� (��ü �� ���� �ڿ�)


//���赵 == Ŭ���� == Ÿ��(����� ���� Ÿ��)

class Test {
	int iv; // instance variable (Ŭ���� ��)
	        // �� ������ �ʱ�ȭ�� ���� �ʾƵ� �ȴ�. �⺻��(default value)�� ������ �ִ�.
	        // Why: �ʱ�ȭ�� ���� �ʾƵ� ��� �����ϰ� ������? ��ü���� �ٸ� ���� ������ �ϱ� ����
	
	void print() {
		int i = 100; // �Լ� �ȿ� �ִ� ���� : ��������
		             // �Լ��� ȣ��Ǹ� �׶� stack �޸𸮿� �����ǰ� �Լ��� ����Ǹ� ���� �Ҹ�ȴ�
		             // ���������� �ݵ�� �ʱ�ȭ�� �ؾ� �Ѵ�. (�ϱ�) <- Stack �޸𸮿� �����Ǵ� �����ʹ� �ʱ�ȭ �ʿ�
		System.out.println(i);
	}
	
	void write() {
		System.out.println("iv ��������(��ü): " + iv);
		// System.out.println(i);
		// Error : i ������ scope : print() �Լ� ����
		int i = 200; // ������ ����
		// int iv = 300; Error�� �ƴ����� �ǹ̰� ����.
	}
	
	String print2(int i) {
		return "���ϸ�";
	}
}

public class Ex01_variable { 

	public static void main(String[] args) {
		int s = 5; // local variable ��������(main�Լ� ��) >> ����� ���ÿ� �ʱ�ȭ
		System.out.println("�������� s : " + s);
		
		int s2;   // �����
		s2 = 100; // �ʱ�ȭ
		System.out.println(s2);
		
		s2 = 300; // Overwrite
	}

}
