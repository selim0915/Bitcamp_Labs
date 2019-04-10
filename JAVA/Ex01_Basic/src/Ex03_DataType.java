/*
Java�� �ý��ۿ��� �⺻������ �����ϴ� 8���� �⺻ Ÿ���� ������ �ִ�.
8���� �⺻ Ÿ���� ���� �����Ѵ�.
Tip) [��]�� [�ּҰ�]�� ������ �� �ִ�.

���� -> ����(���� ����, 0, ���� ����) -> byte(-128~127)
                             -> char(�� ���ڸ� ǥ���ϴ� �ڷ���: �� ���� 2byte), unicode
                             -> short(C����� ȣȯ��)
                             -> int(-21��~21��) ** Java ���� ������ �⺻Ÿ��(4byte)
                             -> long(8byte) int���� ū ��
   -> �Ǽ�(�ε��Ҽ���) -> float(4byte), double(8byte)
                   ���е��� ����(ǥ�� ������ ũ��) ** Java �Ǽ��� ���� �⺻ Ÿ���� double
   -> boolean(true, false) : ���α׷��� �� ����
   
���ڿ��� ǥ��: ȫ�浿, �ȳ��ϼ��� ��
String�� Ŭ���� : String s = new String("�ȳ��ϼ���");
���� ���� : String s = "�ȳ��ϼ���";
String�� ���ؼ� ������ ����� �ֱ������ String�� intó�� ����.

�� Ÿ��: �޸𸮿� ���� (����, ��)
���� Ÿ��: Ŭ����, �迭 �� / �޸� ���� �ּ�(����)

class == ���赵 == Ÿ��(type)
class�� ���� Ÿ���� ��Ƴ��� ū Ÿ��

class�� �ݵ�� �޸𸮿� �÷����� ��� = new
static void main �Լ��� ���� Ŭ������ new�� �����ص� �ȴ�.
*/

// ���赵�� �Ϸ��� �ּ��� �Ӽ�(���� ����)�� ����(�⺻) ������ ������ �־�� �Ѵ�.
// �Ӽ��� ���� ������ ����

class Car {
	String color; // �ڵ����� ����
	int window;   // �ڵ����� â�� ����
}

public class Ex03_DataType {

	public static void main(String[] args) {
		Car c = new Car(); // ���� Ÿ��
		System.out.println("c��� ������ ��: " + c);
		// Car@15db9742 �ּҰ� >> ���� Ÿ��
		
		Car c2;
		c2 = c;
		System.out.println("c2��� ������ ��: " + c2);
		System.out.println(c==c2);
		
		Car c3; // ����
		c3 = new Car(); //�Ҵ� �и�
		System.out.println("c3��� ������ ��: " + c3);
		c3.color = "gold";
		c3.window = 10;
		System.out.println(c3.color + ":" + c3.window);
		
		int i = 200; // �� Ÿ��
		System.out.println(i);
		// 200 �޸𸮿� �� 200�� ������� >> �� Ÿ��
		
		int j; // ����
		j = i;
		j = 1000; 
		// i���� ��ȭ�� ����.
		
		int a, b; // �ݵ�� �ʱ�ȭ �۾� �ʿ�
		a = 10;
		b = 20;
		
		int k = 1111;
		int k2 = k;
		k = 2222;
		
		// int ( -21�� ~ 21�� )
		// int number = 10000000000; ����(������ ����)
		// ���� ���ͷ��� ǥ�� ������ [int]������. (Today's Point)
		// ���� ���ͷ� >> ǥ�� ���ڰ�
		// ���̻� L
		long number = 10000000000L; // ���� ���ͷ� ���� long���� �������Ѿ� �Ѵ�.
		System.out.println("long Ÿ�� : " + number);
		
		// char : �������� ������ �ִ�.(2byte)
		// ���ڸ� ǥ���ϴ� Ÿ��
		// 1. �� ���� = 2byte ����
		// 2. �ѱ� �� �� = 2byte
		// 3. ������, ����, Ư������, ����: 1byte
		// �ѱ�, ���� ��� 2byte�� ���� : unicode
		
		// Java ���ڿ� : "��" : String s = "��", String s2 = "dsdsdfsdgsdg";
		// Java ���� : char c = '��'
		
		char single = '��';
		System.out.println(single);
		char ch = 'A';
		System.out.println(ch);
		System.out.println((int)ch); // casting Ÿ�Ժ�ȯ // �ƽ�Ű �ڵ�ǥ 10���� ��
		// A : 65, a : 97
		
		char ch2 = 'a';
		System.out.println(ch2);
		System.out.println((int)ch2);
		
		int ch3 = 65;
		char c4 = (char)ch3; // ����� ����ȯ >> �Ͻ��� ����ȯ�� ����
		System.out.println(c4);
		
		int cint2 = c4; // �Ͻ��� ����ȯ ����� �����Ϸ��� �˾Ƽ� (int)c4;
		
		// Today's Point
		// ������ ������ �ִ� [���� ���� ����] [������ Ÿ����] ���� �Ѵ�.
		// Ÿ���� ũ�⸦ ����
		// ū Ÿ�Կ��� ���� Ÿ���� ���� ���� �� �ִ�. (long <- int, int <- char)
		// ���� Ÿ�Կ��� ū Ÿ�԰��� ���� �� ����.
		
//		int intvalue = 103029970;
//		byte bytevalue = (byte)intvalue; // ���� ������.
//		System.out.println(bytevalue); // �����Ⱚ

		int intvalue = 10; // 4����Ʈ
		byte bytevalue = (byte)intvalue; // ���� : 4����Ʈ�� int�� 1����Ʈ�� byte�� �� �� ����.
		System.out.println(bytevalue); // �ս��� �������� �ʴ´�. �׷��� �̷� ���� ������ �� ��.
		
		// String(���ڿ�) Ÿ��
		// String str = new String("ȫ�浿");
		// Point : String�� �Ϲ� �� Ÿ��ó�� �ᵵ �ƹ� ���� ����.
		
		String s = "A";
		s += "B";
		s += "C";
		s += "D";
		System.out.println(s);
		// String�� ������Ű�� heap�޸𸮿� �����ȴ�. �̷� ���� StringBuilder�� ���� ���� ���ɿ� ����.
		
		String str = "hello world";
		System.out.println(str);
		
		String str2 = str + "�������";
		System.out.println(str2);
		
		String str3 = "1000";
		String str4 = "10";
		
		String result = str3 + str4; // + >> ���ڿ��� ���ڿ��� ���� ���� ������
		System.out.println(result);
		
		System.out.println("100" + 100); // 100100
		System.out.println(100 + "100"); // 100100, ���� �������
		System.out.println(100 + 100 + "100"); // 200100
		System.out.println(100 + (100 + "100")); // 100100100, ��ȣ����
		System.out.println(100 + "100" + 100); // 100100100, �պ���

		// �Ǽ�(�ε��Ҽ���)
		// float(4byte)
		// double(8byte) ** �Ǽ��� �⺻ ���ͷ��� double(���е��� ����: �Ҽ��θ� �� ���� ǥ���Ѵ�)
		
		float f = 3.14f; // ���̻� (F, f)
		float f2 = 1.123456789f;
		System.out.println(f2); // 1.1234568 // float�� �ݿø��� �Ѵ�. (�뷫 7�ڸ�����)
		
		double d = 1.123456789123456789;
		System.out.println(d); // 1.1234567891234568 // �ݿø� ó�� 16�ڸ� ǥ��
		
		double d2 = 100;
		// �����Ϸ��� ���������� �ڵ� ����ȯ(�Ͻ��� ����ȯ) 
		// double d2 = (double)100;
		
		// 1232123 >> ���� ���ͷ��� ������ : int
		// 1.123123 >> �Ǽ� ���ͷ��� ������ : double
		
		// Quiz
		double d3 = 100;
		int i5 = 100;
		
		// int result2 = d3 + i5;
		// 1. ������ �ս� ���� ���� �� �ִ�
		// double result2 = d3 + i5;
		 
		// 2. ������ ���� �� ������ ���� �սǵ� �� �ִ�.
		// int result2 = (int)d3 + 15;
		
		// 3. ���� �սǵ� �� �ִ�.
		int result2 = (int)(d3 + i5);
		
		
		//Today's Point
		// ���� Ÿ�� + ū Ÿ�� => ū Ÿ��
		// int + double -> double
		// int + short -> int
		// Ÿ�� �� ����ȯ >> ������ ������ ���� ���� ���� ������ Ÿ������ �Ǵ�
		
		int i6 = 100;
		byte b2 = (byte)i6;
		System.out.println(b2);
		
		byte b3 = 20;
		int i7 = b3; // ���������� ����ȯ, �����Ϸ��� int i7 = (int)b3; >> Casting
		System.out.println(i7);

	}

}



