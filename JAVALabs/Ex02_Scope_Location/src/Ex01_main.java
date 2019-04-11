import kr.or.bit.Apt;
import kr.or.bit.Emp;

/*
 * ������?
 * Ŭ���� = ���赵 = Ÿ���̴�.
 * Ŭ������ �������: �ʵ�(������, ���°�, ������), �Լ�(���)
 * ������(������): public, private, default(�����ʴ°�), protected(���)
 * 
 * 1. public class Test{}
 * 
 * 2. class Test{} >> default �����ڰ� �����Ǿ���.
 * (default ������:  ���� ���� �ȿ� ��������, �ٸ������� ������ ���Ұ�
 * 
 * 3. default class�� : ���� �������� �ٸ�Ŭ������ ��������, ���� �������� ���, ���� �������� ���� ��
 * 
 * 4. �ϳ��� �ڹ������� (a.java) �������� Ŭ������ ���� �� �ִ�.
 * >> Ex01_main.java
 * >> class Test{} //�׷��� �ϳ��� Ŭ������ ���ο� Ŭ������ ���� ���°� �����ʴ�.
 * >> �� �ϳ��� �ڹ����Ͽ� �������� Ŭ������ ���鋞, public�� �ϳ��� ���
 */

class Test{ //default class Test
	int i; //default int i
	
	void print() { //default void print() 
		System.out.println("default");
	}
}

public class Ex01_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		p.name ="����";
		
		//kr.or.bit���� �ִ� CarŬ���� ����\
		Apt apt = new Apt();
		apt.aptname= "����";
		
		Test t = new Test();
		t.i =100;
		
		Emp e = new Emp();
		e.setEmpno(-8888);
		System.out.println(e.getEmpno());
		
		e.mgr = -8888;
		System.out.println(e.mgr);
	}

}
