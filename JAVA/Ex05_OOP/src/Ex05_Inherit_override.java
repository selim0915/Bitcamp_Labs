import java.util.Arrays;

import kr.or.bit.Emp;

class Test{
	void print() {
		System.out.println("�θ��Լ� _Test");
	}
}

class Test2 extends Test{

	@Override
	void print() {
		System.out.println("�ڽ��Լ�_test2_������ �������");
	}
	
	void print(String s) {
		System.out.println("�����ε�!!"+s);
	}
	
}
public class Ex05_Inherit_override {

	public static void main(String[] args) {
		Test2 test = new Test2();
		test.print(); //������
		test.print("�����ε���");
		
		System.out.println(test); //default�� toString ������ �ִ�.
		System.out.println(test.toString());
		
		//Emp Ŭ�������� Object ������ toString() ������
		Emp e = new Emp(9999,"�ƹ���");
		String str = e.toString();
		System.out.println(str);
		
		
		//�� �༮�� object�� toString�� ������ �ؼ� ������ �־�����!
		int[] arr = {11,12,13,14,15};
		String result = Arrays.toString(arr);
		System.out.println(result);
	}

}
