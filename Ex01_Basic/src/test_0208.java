import java.util.Random;
import java.util.Scanner;

public class test_0208 {

	public static void main(String[] args) {

		//1���� 20������  ���� �߿��� 2 �Ǵ� 3�� ����� �ƴ� ���� ������ ���ϴ� ���α׷��� �ۼ��ϼ���
		int sum=0;
		for(int i=1; i<=20; i++) {
			if(i %2 !=0) {
				if(i%3 !=0) {
					sum += i;
				}
			}
		}
		System.out.println("1~20���� 2�ǹ����, 3�ǹ���� �ƴ� ����: "+sum);
		
		int sum2 = 0;
		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 0 || i % 3 == 0)
				continue;
			sum2 += i;
		}
		System.out.println("sum2: "+ sum2);
		
		
		
		//�ΰ��� �ֻ����� ������ �� ���� ���� 6�� �Ǵ� ��� ����� ���� ����ϴ� ���α׷��� �ۼ��ϼ���
		for(int i=1; i<=6; i++) {
			for(int j=1; j<=6; j++) {
				if ((i+j)==6)
				System.out.printf("(%d, %d)\n",i,j);
			}
		}
		
		//���� , ���� ,�� ���� �� ����� ���ؼ� �ۼ��ϼ��� (IF)
		//��ǻ�Ͱ� �ڵ����� ���� ���� , ���� , �� �� ���ؼ� ����ڰ� ���� �Է� �ؼ� ó�� �ϼ���
		//( ���� ��� : ����=> 1   , ���� => 2  , �� => 3)
		Scanner sc = new Scanner(System.in);
		System.out.print("����=> 1   , ���� => 2  , �� => 3 �� �ϳ��� ���ڸ� �Է��ϼ���\n user: ");
		int user = Integer.parseInt(sc.nextLine());
		
		Random r =new Random();
		int computer = r.nextInt(3)+1;
		System.out.println("computer: " + computer);
		
		if (computer==user) {
			System.out.println("�����ϴ�.");
		} else if (computer==1 && user==2 || computer==2 && user==3 || computer==3 && user==1) {
			System.out.println("user�� �̰���ϴ�.");
		} else if (computer==1 && user==3 || computer==2 && user==1 ||computer==3 && user==2 ) {
			System.out.println("computer�� �̰���ϴ�.");
		} else {
			System.out.println("����=> 1   , ���� => 2  , �� => 3 �� �Է����� �ʾҽ��ϴ�.");
		}
		
		for(int i=1; i<=100; i++) {
			for(int j=i; j<=100; j++) {
				System.out.println(j+"\t");
			}
			System.out.println();
		}
		
		
	}

}
