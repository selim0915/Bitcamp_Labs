import java.util.Scanner;

public class Ex11_Statement {

	public static void main(String[] args) {
		
		//while
		//while(true) {
		//	System.out.println("True");
		//}
		
		int i=10;
		while(i>=10) {
			System.out.println(i);
			//�ݵ�� ���ο��� �������� ó���ؾ��Ѵ�.
			i--;
		}
		
		int sum=0;
		int j=1;
		while(j<=100) {
			sum+=j;
			j++;
		}
		System.out.println("1���� 100������ sum: " + sum);
		
		//while ������
		i=1; 
		while(i<=9) {
			j=2;
			while(j<=9) {
				System.out.println(i+"*"+j+"="+(i*j));
				j++;
			}
			System.out.println();
			i++;
		}
		
		//do while(������ ����) -������ �ѹ� ����, �� ���� ���� �Ǵ�
		//do {���๮} while(���ǽ�)
		
		//>>�޴�����
		//>>1, �λ�
		//>>2,�޿�
//		Scanner sc = new Scanner(System.in);
//		int inputdata =0;
//		do {
//			System.out.println("�����Է�: 0~10����");
//			inputdata = Integer.parseInt(sc.nextLine());
//		} while(inputdata>10); //while true �̸� ��� �ݺ�(���ǽ��� ���� ������ ��� �ݺ�) , ���� �ƴϸ� do �ٽ� ���ư�.
//		System.out.printf("����� �Է��� ���ڴ� %d �Դϴ�.", inputdata);
		
		int a=1;
		do {
			System.out.println(a);
			a++;
		}while(a<=10);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		int b=1;
		do {
			System.out.println(b);
			b++;
		}while(b<=10);
	}

}
