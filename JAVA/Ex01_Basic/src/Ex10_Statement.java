
public class Ex10_Statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * ���
		 * ���ǹ�(�б⹮): if(if, else if, if), switch(), case break..
		 * �ݺ���:for(�ݺ�Ƚ��), while(����), do while() ��������
		 * break(���Ż��), continue(�Ʒ����� skip) 
		 * 
		 */
		
		int count = 0; //local variable�� �ʱ�ȭ �ʼ�
		if (count<1) {
			System.out.println("True�Դϴ�");
		}
		
		if(count<1)System.out.println("true����");
		
		char data ='A'; 
		switch(data) { //���ǰ����� �ü��ִ°�: [����], [char], [String]
			case 'A': System.out.println("���ں�");
				break;
			default : System.out.println("default");
		}
		
		//�ݺ���
		int sum =0;
		for(int i=0; i<=10; i++) {
			//System.out.println("i: "+i);
			sum += i;
		}
		System.out.println("1���� 10������ �� sum: "+sum);
		
		//for���� �̿��Ͽ� 1~10���� Ȧ���� ��
		int sum2=0;
		for(int i=1; i<=10; i+=2) {
			sum2 += i;
		}
		System.out.println("1���� 10������ Ȧ�� �� sum: "+sum2);
		
		//for���� �̿��Ͽ� 1~100���� ¦���� ��
		int sum3=0;
		for(int i=1; i<=100; i++) {
			if(i % 2==0) {
				sum3 += i;
			}
		}
		System.out.println("1���� 10������ Ȧ�� �� sum: "+sum3);
		
		//������
		//for��(��ø) >>�࿭
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.printf("[%d]*[%d]=[%d]\t",i,j,i*j);
				//System.out.println(i + "*" + j + "=" + (i*j));
			}
			System.out.println();
		}
		System.out.println();
		
		// *(break(Ż��), continue(��ŵ))
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				if(i==j) {
					//continue; //�Ʒ������� �Ѿ��
					break;// �����
				}
				System.out.printf("[%d]*[%d]=[%d]\t",i,j,i*j);
				//System.out.println(i + "*" + j + "=" + (i*j));
			}
			System.out.println();
		}
		System.out.println();
		
		
		for(int i=2; i<=9; i++) {
			for(int j=1; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
//		for(int i=100; i>=0; i--) { //���۰��� ū������ �Ҽ��� �ִ�.
//			System.out.println("i: "+i);
//			
//		}
		
		//�Ǻ���ġ
		System.out.println("�Ǻ���ġ");
		int a=0, b=1, c=0;
		for(int i=0; i<10; i++) {
			a=b;
			b=c;
			c=a+b;
			System.out.println(""+c);
		}
		
		
	}

}
