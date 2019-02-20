/*
 * �ڹٴ� �⺻������ �����ϴ� 8���� �⺻Ÿ���� ������ �ִ�.
 * 8���� �⺻Ÿ������ ���� ������ �� �ִ�.
 * tip) ��, �ּҰ��� ������ �� �ִ�.
 * 
 * ����) ����(��������, 0, ��������) -> byte(-128~127)
 * 							-> char(�ѹ��ڸ� ǥ���ϴ� �ڷ���: �ѹ���2byte), nuicode
 * 							-> short(c����� ȣȯ��)
 * 							-> int (-21��~21��) *java���� ���������� �⺻Ÿ���� �ȴ�, 4byte
 * 							-> long(8byte) int���� ū ���� �ٷ�
 * 		�Ǽ�(�ε��Ҽ���)  -> float(4byte), double(8byte)
 * 					-> ���е��� ���� = ǥ�������� ũ�� (double�� �� ������ ŭ)
 * 					-> *java���� �Ǽ������� �⺻Ÿ���̴�.
 * 		boolean(true, false) -> ���α׷��� ���� ������ �� ����Ѵ�.
 * 							
 * ����) ���ڿ��� ǥ���� � Ÿ�Կ� ������? ex "ȫ�浿"
 * 		String -> String�� Ŭ�����̴�.
 * 				-> String�� ���� ������ String s = new String("hello");
 * 				-> ��κ� ����ϴ� ���� String s = "hello";
 * 
 * ��Ÿ��: ��Ÿ���� ���� ���� Ÿ��(����, ��)
 * ����Ÿ��: Ŭ����, �迭(���� �ּ� ������ ����ȴ�)
 * 
 * class = ���赵 = Ÿ�� (Ŭ������ Ÿ���̴�)
 * class�� ���� Ÿ���� ��� ���� ū Ÿ���̴�.
 * class�� �ݵ�� �޸𸮿� �÷����� ����ؾ��Ѵ�. (Ŭ������ ���迪���̶�)
 */
class Car{
	String color; // �ڵ����� ������ ��ڴ�.
	int window; // �ڵ����� â�������� ��ڴ�.
}
/*
 * �ּ����� ���赵���� (��������)�Ӽ�+(�⺻)���� �� ������ �־�� �Ѵ�.
 * �Ӽ��� ���������� ������ ǥ���Ѵ�.
 * �޸�(�����Լ�?)
 */

public class Ex03_DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car();
		System.out.println("c��� ������ ��: " + c); //Car@15db9742 ������ �ּҰ� ��� => ����Ÿ��
		int i =200;
		System.out.println("i��� ������ ��: " + i); //200 i���� ���
		
		Car c2;
		c2=c;
		System.out.println("c2��� ������ ��: " + c2);
		System.out.println("c==c2: " + (c==c2) + "\n");
		
		int j;
		//j=i;
		System.out.println("i��� ������ ��: " + i);
		//System.out.println("j��� ������ ��: " + j);
		j=1000;
		System.out.println("i��� ������ ��: " + i);
		System.out.println("j��� ������ ��: " + j);
		
		Car c3;
		c3 = new Car();
		//���������̱� ������ �Ȱ��� ���������� ����� �Ҵ��� �и��� �� �ִ�.
		System.out.println("c3��� ������ ��: " + c3); //Car@6d06d69c �ٸ� �ּҰ�
		c3.color = "gold";
		c3.window = 10;
		System.out.println("c3 : " + c3.color +" : "+ c3.window); 
		
		int a, b;
		a=10;
		b=20;
		
		int k =1111;
		int k2 = k;
		k =2222;
		System.out.println("k: "+k+ ", k2: "+k2+ "\n");
		
		//int scope(-21~21)
		//int number = 10000000000; //������ ����
		// *���� ���ͷ��� ǥ�������� int ���̴�.
		long number = 10000000000L; //���� ���ͷ�(�⺻)�� Long���� �����ϰ� ������.
		System.out.println("longŸ��: "+number);
		
		//char�� ���������� �������� ������ �ִ�.(2byte)
		//char�� ���ڸ� ǥ���� �� �ִ�.
		// 1. �ѹ��ڸ� ����� �� 2byte�� �����ߴ�.
		// 2. �ѱ� ����(2byte), ������, ����, Ư������, ����(1byte)
		
		//java ���ڿ�:"��", String="��"
		//java ����: char = '��'
		//char�� �α��ڸ� �� �� ����.
		char single = '��';
		System.out.println(single);
		char ch = 'A'; // �α��� �̻� ������ ������
		System.out.println((int)ch);// casting = Ÿ�Ժ�ȯ //�ƽ�Ű �ڵ�ǥ��
		//A=65; ,a=97;
		char ch2='a';
		System.out.println(ch2);
		System.out.println((int)ch2);
		//�ݴ��� ���
		int ch3 =65;
		char ch4 = (char)ch3; //����� ����ȯ
		System.out.println(ch4);
		int cint2 = ch4; //�Ͻ��� ����ȯ (��� �����Ϸ��� ��ȯ�����ִ°�, �������ϵǱ� �Ѵ�)
		
		
		/*
		 * today point
		 * ������ ���� [��]���� [Ÿ��]�� �߿��ϰ� �����Ѵ�.
		 * Ÿ���� ũ�⸦ Ȯ���Ѵ�.
		 * ū Ÿ�Կ� ���� Ÿ���� ���� �� �ִ�.
		 * ���� Ÿ�Կ��� ū Ÿ���� ���� �� ����.
		 */
		
		int intvalue =103029970;
		byte bytevalue = (byte)intvalue; //�ս��� �����.
		System.out.println(bytevalue); //��������? ���� �ٲ��.
		
		int intvalue2 =10; //�������ͷ����� �׻� 4byte ��ŭ ���� �ִ��� �������
		byte bytevalue2 = (byte)intvalue2; //��� ��������ȯ�� �ϸ� �����ȿ� �ִ� �����̱� ������ ���� �ٲ��� ����
		System.out.println(bytevalue2+ "\n"); 
		//��, �Ʒ� ��� �׷��� ������� �ʴ°��� ����.
		
		//String(���ڿ� Ÿ��)
		// String str = new String("ȫ�浿");
		// String�� ����ɶ����� *�Ϲ� �ڷ���(��Ÿ��)ó�� ����ص� ������ ����.
		String str = "hello";
		System.out.println(str);
		String str2 = str + "hi";
		System.out.println(str2);
		String str3 = "1000";
		String str4 = "10";
		String result = str3 + str4; // ���ڿ�+���ڿ� (+)�� ���տ����ڷ� ���
		System.out.println(result+ "\n");
		
		System.out.println("100"+100); //���ڿ�+���� �� ���ڰ� ���ڷ� ���Ѵ�. // ���� ���߿� �������� ���ؼ� �ϳ��� Ÿ������ �ٲ�
		System.out.println(100+"100");
		System.out.println(100+100+"100");
		System.out.println(100+(100+"100"));
		System.out.println(100+"100"+100+ "\n");
		
		//�Ǽ�(�ε��Ҽ���)
		//float(4byte)
		//double(8byte) *�Ǽ��� �⺻ ���ͷ��� double(���е��� �� ���� ����)
		float f = 3.14f;//���̻� F,f�� �ٿ��� folatŸ������ ���
		float f2 = 1.123456789f;
		System.out.println(f);
		System.out.println(f2); //1.1234568 7�ڸ����� ���(�ݿø�)
		
		double d = 1.123456789123456789;
		System.out.println(d); //1.1234567891234568 16�ڸ�(�ݿø�)
		double d2 = 100;
		System.out.println(d2); //�����Ϸ��� ���������� �ڵ����� ����ȯ (�Ͻ��� ����ȯ)
		//������ ���� �Ǽ������� �޾Ƶ� �Ǽ������� �ٲ���
		
		/*
		 * 123123 ���ڸ��ͷ��� int�� �Ǵ�
		 * 1.123123 �Ǽ����ͷ��� double�� �Ǵ�
		 */
		
		double d3 = 100;
		int i5 =100;
		double result2 = d3 +i5;
		// 1. double result2 = d3+i5; //=> ������ �սǾ��� �����
		// 2. int result2 = (int) d3+i5; //=> ������ ������ ���� �� ������, ���� �սǵ� �� �ִ�.
		// 3. int result2 = (int)(d3+i5); //=> ������ ������ ���� �� ������, ���� �սǵ� �� �ִ�.
		
		/*
		 * ����Ÿ��+ūŸ�� => ūŸ��
		 * int+double = double
		 * int+short =int
		 * Ÿ�԰� ����ȯ >> ������ ������ ���� ���� ���� ������ Ÿ���� ����.
		 */
		
		int i6 = 100;
		byte b2 = (byte)i6;
		System.out.println(i6);
		
		byte b3 = 20;
		int i7 = b3; //������ ����ȯ �Ǿ���. (casting)
	}

}
