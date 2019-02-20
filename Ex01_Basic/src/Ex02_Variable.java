
class Vtest{
	int iv;
	void print() {
		System.out.println("instance variable: "+iv);
	}
}

class Apt{
	String color; // ��� String�� Ŭ�����̴�. ��������
	
	// �Լ� (�� Ư��, ����: �Լ��̸��� Ŭ������ �Ȱ��Ƽ�) = �������Լ�(constructor)
	// ������: �Ķ���� ���� �̿��Ͽ� ���������� �ʱ�ȭ��Ŵ
	// Apt(){}; = defualt constructor
	Apt(String color2){ //(String color) = �Ķ��Ÿ
		this.color = color2;
		// this �� ��ü�� ����Ų��.
	}
	
	void aptPrint() {
		System.out.println("����: " + this.color);
	}
	
}

public class Ex02_Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vtest t = new Vtest();
		t.print();
	
		Vtest t2 = new Vtest();
		t2.iv=300;
		t2.print();
		
		Apt sk = new Apt("gold");
		sk.aptPrint();
		
		Apt never = new Apt("red");
		never.aptPrint();
	}

}
