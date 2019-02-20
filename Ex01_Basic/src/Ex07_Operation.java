//������, ���

public class Ex07_Operation {

	public static void main(String[] args) {
		int sum = 0;
		// ���Կ����� (+=, -=, *=, /=) ���������� ����� ��.
		sum += 1; // sum = sum+1;
		sum -= 1; // sum = sum-1;
		System.out.println("sum: " + sum);

		// ������ ��������
		// a+, b+, f
		// 90�� �̻� a, 95�� �̻� a+

		int score = 90;
		String grade = ""; // ���ڿ� �ʱ�ȭ
		System.out.println("����� ������: " + score);

		if (score >= 90) {
			// System.out.println("score1: "+"a");
			grade = "a";
			if (score >= 95) {
				grade += "+";
			} else {
				grade += "-";
			}
		} else if (score >= 80) {
			// System.out.println("score2: "+"b");
			grade = "b";
			if (score >= 85) {
				grade += "+";
			} else {
				grade += "-";
			}
		} else if (score >= 70) {
			// System.out.println("score3: "+"c");
			grade = "c";
			if (score >= 75) {
				grade += "+";
			} else {
				grade += "-";
			}
		} else {
			// System.out.println("score4: "+"f");
			grade = "f";
		}
		System.out.println("����� ������: " + grade);

		// �Լ��ȿ��� sysout > ctrl + space
		// System.out.println();

		// �ڵ�����
		// ctrl + shift + f
		
		//switch
		int data = 100;
		switch (data) {
		case 100: System.out.println("100�Դϴ�"); 
			break;
		case 200: System.out.println("200�Դϴ�"); 
			break;
		case 300: System.out.println("300�Դϴ�"); 
			break;
		default: System.out.println("default");
		}
		
		switch(data) {
		case 100: System.out.println("100�Դϴ� ^^");
		case 90: System.out.println("90�Դϴ� ^^");
		case 80: System.out.println("80�Դϴ� ^^");
		default: System.out.println("default");
		}
		
		
		int month =2;
		String res = "";
		
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12: res="31";
			break; 
		case 4:
		case 6:
		case 9:
		case 11: res="30";
			break;
		case 2:res="29";
			break;
		default: res ="���� �ƴմϴ�.";
		}
		System.out.println(month+"���� "+ res +"�ϱ��� �Դϴ�.");
		
		/*
		 *  �������� (https://docs.oracle.com/javase/8/docs/api/index.html)
		 * package (����: �� ������ ����) 
		 * package���� interface, class�� ��� �ִ�. //���а迭
		 * java.lang.Math(MathŬ����) //�������������, �θ� �����ΰ�, �ڿ��� ������ ������ �ִ°� 
  		 * random()
		 * pseudorandom double greater than or equal to 0.0 and less than 1.0. 
		 * ���� �߻��� double�� ����� ����. (0.0<= vlaue <1.0)=> 0.99999(�Ҽ����� 15�ڸ�?) 
		 * *��Ģ������ Ŭ������ new�λ���Ѵ�. �׷��� class�� static�ڿ��� ������ �ִٸ� new���̵� ��밡���ϴ�.
		 * Java.lang.Math m = new java.lang.Math()
		 * m.random()
		 * 
		 * java.lang.Math (�տ� �κ��� �����ϴ� ����?)
		 * java.lang�� java���Ͽ� default�� ����Ǿ��ִ�.
		 */	
		
		System.out.println("Math.random(): " + Math.random());
		System.out.println("Math.random()*10: " + Math.random()*10);
		//�Ҽ��� *10 �̵�
		System.out.println("(int)Math.random()*10: " + (int)(Math.random()*10));
		//0~9����
		System.out.println("((int)(Math.random()*10)+1)): " + ((int)(Math.random()*10)+1));
		//1~10����
		
		int jumsu = ((int)(Math.random()*10)+1)*100;
		System.out.println(jumsu);
		System.out.println();
		
		/*
		 * Q
		 * ������� �ϴ� �ý����� ��ȭ�� ��ǰ ��÷ �ý���
		 * ��ǰ ��÷�� 1000����
		 * ��ǰ Tv, NoteBook, �����, �ѿ켼Ʈ, ����
		 * ��ǰ ��÷�� 900����
		 * ��ǰ NoteBook, �����, �ѿ켼Ʈ, ����
		 * ��ǰ ��÷�� 800����
		 * ��ǰ �����, �ѿ켼Ʈ, ����
		 * ��ǰ ��÷�� 700����
		 * ��ǰ �ѿ켼Ʈ, ����
		 * ��ǰ ��÷�� 600����
		 * ��ǰ ����
		 * �� �ܴ� 100~500������ ĩ��
		 * 
		 * ����ڰ� �����ϰ� 100~1000���� ������ ���´�.
		 */
		int num = ((int)(Math.random()*10)+1)*100;
		String present ="";
		
		switch(num) {
		case 1000: present +="TV "; 
		case 900: present +="NoteBook ";
		case 800: present +="����� ";
		case 700: present +="�ѿ켼Ʈ ";
		case 600: present +="���� ";
			break;
		default: present="ĩ�� ";
		}
		System.out.println("��÷��ȣ��: "+num +" �Դϴ�.");
		System.out.println("��÷�� ��ǰ��: "+present+"�Դϴ�.");
		
		
	}

}
