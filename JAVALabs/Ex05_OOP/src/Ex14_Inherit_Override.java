/*
 * 
 */
class Parent{
	int x =100;
	void pmethod() {
		System.out.println("parent method");
	}
}

class Child3 extends Parent{
	int y =200;
	
	int x =2000; //c#: ������, ���������ϱ� 
	
	void parent_x() {
		System.out.println(super.x); //�θ� �׸��ٸ� �޼���, �����ڸ� �̿��ϸ� super�� ����ؼ� ȣ���Ѵ�.
	}
	
	@Override
	void pmethod() {
		System.out.println("�θ� �Լ� ������");
	}
	
	void parent_method() {
		super.pmethod();
	}
}

public class Ex14_Inherit_Override {

	public static void main(String[] args) {
		Child3 ch = new Child3();
		Parent pa =ch; //������
		//pa.y ���� �ȵȴ�.. 
		//��� ���迡�� �θ�Ÿ���� ���������� �ڽ�Ÿ���� ���������� ������ �ִ� �ּҸ� ���� �� ����.?
		System.out.println("ch.x: "+ch.x);
		ch.parent_x();
		ch.pmethod(); //�������ϸ� �������� �޼��尡 ����
		pa.pmethod(); //�θ� ������ �ϸ� �������� �޼��尡 ����
		
		ch.parent_method(); //���ο� �޼��带 ������ �ؼ� super�� ����Ͽ� �θ��Լ��� ȣ���Ѵ�.
	}

}
