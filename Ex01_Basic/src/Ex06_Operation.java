
public class Ex06_Operation {

	public static void main(String[] args) {
		int result = 100/100;
		System.out.println(result);
		
		result = 13/2;
		System.out.println(result);
		
		result = 13%2;
		System.out.println(result);
		
		//������ ������(++, --) 1������ or 1�� ����
		//����1�� ��ġ, ��ġ ����
		int i =10;
		++i; //��ġ����
		System.out.println(i);
		i++;
		System.out.println(i);
		
		// *��ġ�� ��ġ�� �����ڿ� �����ϸ� �� Ư���� ��Ÿ����.
		int i2 = 5;
		int j2 =4;
		int result2 = i2 + ++j2;
		System.out.println(result2);
		
		result2 = i2 + j2++; //i2=5, j2=4
		System.out.println(result2);
		System.out.println(j2);
		
		/*
		 * POINT
		 * �ڹ��� ���� ��Ģ
		 * ������ ��� ������ int�� ��ȯ �� ó��
		 * �����Ϸ��� byte+byte �� int+int�� �Ǵ�
		 */
		
		byte b =100; //-128~127
		byte c =1;
		byte d = (byte)(b+c);
		// 1. byte d = (byte)(b+c); ���̰� �߻�
		// 2. int d = b+c; ū ������ �Űܴ�Ҵ�. ��������
		System.out.println("d: "+d);
		
		/*
		 * byte+short => int+int
		 * char+char => int+int
		 * int���� ���� ������ int�� ���� ��ȯ�ȴ�.
		 * 
		 * byte+short => int+int ��� int
		 * char+int => int+int ��� int
		 * int +long => long+long ��� long
		 * 
		 * ������ �Ǽ����
		 * float +int => float + float ��� float
		 * long + float => float + float ��� float
		 * float + double => double+double ��� double 
		 */
		
		float num2 = 10.45F;
		int num3 = 20;
	    float result5= num2 + num3 ;
		System.out.println((int)result5);
		
		//char�� ����Ÿ�� //char�� ����� ������ ǥ���ȴ�.
		char c2 = '!';
		char c3 = '!';
		System.out.println(c2); //!
		System.out.println(c2+c3); //66
		char result6 = (char) (c2+c3);
		System.out.println(result6);
		
		//���
		//������, �����
		int sum = 0;
		for(int j=1; j<=100; j++) {
			//System.out.println(j);
			sum += j;
		}
		System.out.println("sum: "+sum);
		
		int sum2 = 0;
		for(int j=0; j<=100; j+=2) {
			//System.out.println(j);
			sum2 += j;
		}
		System.out.println("sum2: "+sum2);
		
		// ==������ ��(value)�� ���ϴ� ������
		//javascript (===)
		if(10==10.0f) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		// ���� ���ϱ� ������ ==���ϸ� true�� ���´�
		
		//!����������
		if('A'!= 65) {
			System.out.println("false: ������ �ƴϴ�");
		} else {
			System.out.println("true: ���� ���̴�");
		}
		
		//*�ϱ�����
		//���ó�� ���� ������(���׿�����)
		int p = 10;
		int k = -10;
		int result8 = (p==k) ? p:k;
		// ���ǽ��� true�� �տ� ��
		// ���ǽ��� false�� �ڿ� ���� �����Ѵ�.
		System.out.println("result8: "+result8);
		
		if(p==k) {
			result8 =p;
		} else {
			result8 =k;
		}
		System.out.println("result8: "+result8);

		//������ (|[or]  &[and])
		/*
		 *  ����ǥ
		 * 0: false
		 * 1: true
		 * or: ���� �ϳ��� ���̿��� ��
		 * and: �Ѵ� ���̿��� ��
		 * 		  or	and
		 * 0  0   0		 0
		 * 0  1   1		 0
		 * 1  0   1		 0
		 * 1  1   1	 	 1
		 * 
		 * sql(oracle)
		 * select * from emp where job='sales' and sal >2000; 
		 * select * from emp where job='sales' or sal >2000; 
		 */
		int x=3;
		int y=5;
		System.out.println("x|y: "+ (x|y));
		System.out.println("x&y: "+ (x&y));
		// ������ 3�� 2���� ������ ��ȯ
		// 128	64	32	8	4	2	1
		// 0	0	0	0	0	1	1  //3
		// 0	0	0	0	1	0	1  //5
		// 0	0	0	0	1	1	1  //or��� //7
		// 0	0	0	0	0	0	1  /and��� //1
		
		/*
		 * *�� ������
		 * ||(or), &&(and)
		 *  ����Ÿ�� boolean��
		 *  
		 */
		if(10>0 && -1>1 && 100>2 && 1 > -1) {
			System.out.println("true-&&");
		} else {
			System.out.println("false-&&");
		}
		if(10>0 || -1>1 || 100>2 || 1 > -1) {
			System.out.println("true-||");
		} else {
			System.out.println("false-||");
		}
	}
}













