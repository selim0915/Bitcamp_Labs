import kr.or.bit.test0211;

public class test20211 {

	public static void main(String[] args) {
		
		
		//Ŭ������ ���� = new Ŭ������();
		
		test0211 t = new test0211();
		
		System.out.println(t.ball);
		
		t.ballstart();
		
		System.out.println(t.ball);
		
		
		String answer = (1+1==2)? "����"+"!!" : "��";
		System.out.println(answer);
		
		
		//���� ������
		// 1. �� ���� ���Ƿ� ���� �� ���� �� ū���� ����϶�.
		int a = 10;
		int b = 11;
		int result = (a>b)? a:b;
		System.out.println("�� ���� ū ���� result: "+result);
		
		// 2. 0 �� 2�� ���ٴ� ���� �´��� Ʋ������ ����ϴ� ���׿����ڽ��� ������
		String result2 = (0==2)? "�´�" : "Ʋ����";
		System.out.println("0==2�� result2: "+result2);
		
		
		//������
		t.age=40;
		t.setName("woo");
		System.out.println("����:"+t.age+" ,�̸�:"+t.getName());
		
		
		//����Լ�
		t.add();
		t.add2();
		t.add3(2, 3);
		t.add4(2, 3);
		
	}

}
