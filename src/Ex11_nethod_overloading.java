import java.util.Arrays;

/*
 * ��ü ���� ����� Ư¡
 * ���,ĸ��,����
 * 
 * ĸ��ȭ, ����ȭ: private 
 * [method overloading]
 * �ϳ��� �̸����� �������� ����� �ϴ� �Լ�(ex println())
 * ���: println()
 * Ư¡: ������� ������ ���� �ʴ´�.
 * 		�׷��� �� ����? => �����ڰ� ���ϰ� ����ϱ� ���ؼ�
 * ���� ����ұ�? ����� ����ұ�?
 * => �Լ��� ����� ������, 
 * 
 * ����: �Լ��� �̸��� ����, �Ķ������ ������ Ÿ���� �ٸ��� �Ѵ�.
 * 1.�Լ� �̸��� ���ƾ� �Ѵ�.
 * 2.prameter ����, type�� �޶���Ѵ�.
 * 3.return type�� �����ε��� �Ǵ� ������ �ƴϴ�
 * 4.parameter�� ������ �ٸ��� �����Ѵ�.
 */
class Human {
	String name;
	int age;
}

class OverTest {
	int add(int i) {
		return 100 + i;
	}

	String add(String s) {
		return "hello " + s;
	}

	int add(int i, int j) {
		return i + j;
	}

	void add(int i, String s) {
		System.out.println("�����ε�");
	}

	void add(String s, int i) {
		System.out.println("�����ε�"); // �ڹ��� �����ε��� �Ķ������ ������ �ٸ��� �����Ѵ�.
	}

	// *
	void add(Human h) { // Ŭ������ Ÿ���̴�.
		h.name = "ȫ�浿";
		h.age = 100;
		System.out.println(h); // �޸��� �ּҰ��� ����ִٰ� �����ϸ� �ۼ� //�ּҰ� ���
		// ������ ����Ҷ� �ּҰ��� �������Ѵ�. (���ٸ�..)
	}

	// �ȵǴ°�
	// void add(int k) {} //���� �Ķ����, �����̸��� ����ģ��.

	/*
	 * �����ε�: �ϳ��� �̸����� ���� ����� �ϴ°� �Ķ���Ϳ� Ÿ���� ������ �޼ҵ带 �����.
	 * 
	 * [Array] int[] source = {1,2,3,4,5};
	 */
	int[] add(int[] param) { // parameter�� int[]�� �ּҰ��� �ްڴ�.
		int[] target = new int[param.length];
		for (int i = 0; i < param.length; i++) {
			target[i] = param[i] + 1;
		}
		return target; // int Ÿ���� �迭�� �ּҰ��� ����
	}
	
	int[] add(int[]so, int[]so2) {
		//so�Լ��� �迭 2�� ũ��� ���
		int[] arr1 = new int[so.length];
		
		for (int i = 0; i < so.length; i++) {
			so2[i] = so[i]*2;
		}
		
		return so2;
	}

}

public class Ex11_nethod_overloading {

	public static void main(String[] args) {
		System.out.println();

//		OverTest ot = new OverTest();
//		//���� �޼ҵ�
//		System.out.println(ot.add(0));
//		
//		ot.add(100,"h");
//		ot.add("h",100);
//		
//	    Human human = new Human();
//	    ot.add(human);
//	    System.out.println(human.name);
//	    System.out.println(human.age);
//	    
//	    ot.add(new Human()); //���ο� �޸հ�ü�� �����, ()�ȿ��� ���ο� �޸��� �ּҰ��� �Էµȴ�.
		// �׷��� �Ʊ� �ּҰ��̶� �ٸ���,

		// ������ �߱⶧���� �ȵȴ�.
		// System.out.println(ot.add(3.1));

		OverTest ot = new OverTest();
		int[] source = {10,20,30,40,50};
		System.out.println(source);
		
		int[] target = ot.add(source);
		
		for(int i=0; i<target.length; i++) {
			System.out.println(target[i]);
		}
		
		int[] aa = {10,20,30,40,50};
		int[] bb = {90,80,70,60,50};
		ot.add(aa, bb);
		System.out.println(Arrays.toString(aa));
		System.out.println(Arrays.toString(bb));
		
	}

}
