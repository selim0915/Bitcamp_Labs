
public class Ex06_Operation {

	public static void main(String[] args) {
		int result = 100/100;
		System.out.println(result);
		
		result = 13 / 2;
		System.out.println(result);
		
		result = 13 % 2;
		System.out.println(result); // ������
		
		// ������ ������ (++, --) 1�� �����ϰų� 1�� ����
		int i = 10;
		++i; // ��ġ ����
		System.out.println(i);
		i++; // ��ġ ����
		System.out.println(i);
		// ���� �� ���� ���ؼ� ��ġ�� ��ġ�� ������ ȿ��
		
		
		// Point ��ġ�� ��ġ�� �����ڿ� �����ϸ� ������ �巯����.
		int i2 = 5;
		int j2 = 4;
		int result2 = i2 + ++j2; // j2 1 ���� �� ����
		System.out.println(result2);
		// i2 >> 5, j2 >> 5, result2 >> 10
		
		result2 = i2 + j2++;
		System.out.println(result2);
		System.out.println(j2);
		// i2 >> 5, j2 >> 6, result2 >> 10
		
		// Point 
		// Java�� ���� ��Ģ
		// ������ ��� ������ int�� ��ȯ �� ó��
		// byte + byte => �����Ϸ��� int + int�� ����
		byte b = 100; // -128 ~ 127
		byte c = 1;
		byte d = (byte)(b + c); // 101�� 127 �̸��̱� ������ ���⼭�� ���� ������
		// 1. byte d = (byte)(b + c); (X)
		// 2. int d = b + c;          (O)
		System.out.println("d: " + d);
		
		// byte + short => int + int
		// char + char => int + int
		// Point : ���꿡�� int���� ���� Ÿ���� int�� �ٲ㼭 ó��(long�� �� ũ�� ������ ����)
		// byte, char, short => int�� �ٲپ ó��
		// byte + short => int + int >> ����� int
		// char + int => int + int >> ����� int
		// int + long => long + long >> ����� long
		
		// ������ �Ǽ��� ���� >> ������ �Ǽ�
		// float + int => float + float >> ����� float
		// long + float => float + float >> ����� float
		// float + double => double + double >> ����� double
		
		float num2 = 10.45f;
		int num3 = 20;
		// num2 + num3
		int result5 = (int)(num2 + num3);
		System.out.println(result5);
		
		// char�� ���� Ÿ�� (���������� �������� ������ �ִ�)
		char c2 = '!';
		char c3 = '!';
		
		// c2 + c3?
		// char result6 = c2 + c3; int = int + int
		int result6 = c2 + c3;
		System.out.println(result6); // 66 (!!�� �ƴ�)
		System.out.println((char)result6); // ASCII �ڵ尪���� �ǵ����� A : 65, a : 97
		
		// ���
		// �߼ұ�� ���蹮�� (������) => �����
		
		int sum = 0;
		for (int j = 1; j <= 100; j++) {
			// System.out.println(j);
			if (j % 2 == 0) {
				sum = sum + j;
			}
		}
		
		System.out.println("sum : " + sum);
		
		// == ������ (��(value) �� ������)
		// JavaScript (===)
		
		if (10 == 10.0f) {
			System.out.println("True");
		} else {
			System.out.println("False");
		} // True (Ÿ���� �ƴ϶� ���� ���Ѵ�.)
		
		// ! ����������
		if ('A' != 65) {
			System.out.println("���� ���� �Ƴ�");
		} else {
			System.out.println("���� ���̾�");
		}
		
		// �ϱ�
		// ���ó�� ���� ������(���׿�����)
		int p = 10;
		int k = -10;
		int result8 = (p==k)? p : k;
		String result9 = (p==k)? "P" : "K";
		// ? ���� ���ǽ��� true��� : �տ� �ִ� ����
		// ? ���� ���ǽ��� false��� : �ڿ� �ִ� ����
		System.out.println("result8: " + result8);
		System.out.println("result9: " + result9);
		
		if (p == k) {
			result8 = p;
		} else {
			result8 = k;
		}
		
		/*
		 ����ǥ
		 0: false
		 1: true
		       OR   AND
		 0 0   0     0
		 0 1   1     0
		 1 0   1     0
		 1 1   1     1
		 
		 sql(oracle)
		 select *
		 from emp
		 where job = 'sales' or sal > 2000;
		  
		 */
		// ������ ( | (or), & (and) )
		// 0�� 1�� bit ����
		int x = 3;
		int y = 5;
		System.out.println("x|y : " + (x|y));
		System.out.println("x&y : " + (x&y));
		// 10���� 3,5�� 2���� ������ ��ȯ
		// 128 64 32 16 8 4 2 1 (2����)
		//   0  0  0  0 0 0 1 1 (3)
		//   0  0  0  0 0 1 0 1 (5)
		//   0  0  0  0 0 1 1 1 (3|5 = 7)
		//   0  0  0  0 0 0 0 1 (3&5 = 1)
		
		// POINT ������ ( ||(or), &&(and) ) ������ return boolean
		// �߿��� ����
		// if (10 > 0 && -1 > 1 && 100 > 2 && 1 > -1) { ���๮ }
		// if (10 > 0 || -1 > 1 || 100 > 2 || 1 > -1) { ���๮ }
		// short circuit
		
		
	}

}
