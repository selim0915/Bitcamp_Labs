//static method
/*
 * �Ϲ��Լ��� �Ϲ��ڿ��� static�ڿ��� ��� ����Ҽ��ִ�.
 * static�Լ��� static�ڿ��� ����� �����ϴ�.
 * 
 */
class StaticClass{
	int iv;
	static int cv;
	
	//�Ϲ��Լ�
	void m() {
		//�Ϲ��Լ� m()���� iv���� ó���� �� �ִ� (��)
		iv =100;
		//�Ϲ��Լ� m()���� cv���� ó���� �� �ִ� (��)
		// static �ڿ��� �Ϲ��ڿ����� ����(�׻�) �޸𸮿� �ε�ȴ�.
		cv=200;
		
		System.out.println("iv: "+iv+ "cv: "+cv);
	}
	
	static void sm() {
		//�Ϲ��ڿ��� iv�ڿ��� ����� �� �ִ� (x)
		//iv =200; sm()�Լ��� �׻� �Ϲ��ڿ����� ���� memory�ε�
		//���������� ����
		//�������� ���߸� ������ ����.
		cv=300;
		System.out.println("cv: "+cv);
	}
}

public class Ex07_Static_Method {

	public static void main(String[] args) {


//		StaticClass s = new StaticClass();
//		s.m();
//		//StaticClass.cv=200;
//		s.sm();
		
		StaticClass.sm();
	}

}
