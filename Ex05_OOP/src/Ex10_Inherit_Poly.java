//������
//��� ���迡���Ǵ�����

//������: �������� ����, ���¸� ������ �ִ� �ɷ�
//tip: c#:�������ȿ� overloading, override ����
//java: [��Ӱ���]���� �ϳ��� [��������]�� �������� Ÿ���� ���� �� �ִ�. (�������ȿ� overloading, override ���� ����XX)
//���⼭ ���ϴ� [��������]�� [����Ÿ��]�� �̾߱��մϴ�.
//����Ŭ���� Ÿ���� ���������� �������� �ڽ�Ŭ���� ��ü�� �ּҸ� ���� �� �ִ�.

//java: �ڽ��� �θ𿡰� ���Ǿ��� �帰��.
class Tv2{ //�θ�(�Ϲ�ȭ, �߻�ȭ�� �����ڿ�)
	boolean power;
	int ch;
	
	void power() {
		this.power =!power;
	}
	void chUp() {
		ch++;
	}
	void chDown() {
		ch--;
	}
}

class CapTv extends Tv2{ //�ڱ⸸�� ������ ��� (��üȭ, Ư��ȭ)
	String text;
	String caption() {
		return this.text="���� �ڸ����Դϴ�.";
	}
}

public class Ex10_Inherit_Poly {

	public static void main(String[] args) {
		CapTv tv = new CapTv();
		tv.power();
		System.out.println("����: "+tv.power);
		tv.chUp();
		System.out.println("ä������: "+tv.ch);
		System.out.println("�ڸ�ó��: "+tv.caption());
		
		//Tv2 tv2 = new Tv2(); //tv�� ��ü�� ���θ���
		//�̹� heap�޸𸮿��� tv2Ÿ�� ��ü�� �ε�Ǿ��ִ�.
		
		Tv2 tv2 = tv; //�ڽ�Ÿ���� �ּҸ� �θ�Ÿ�Կ��� �� ����..
		//�̷���, �ڽİ� ������ �ʰ� �θ�(�ڽ�)�͸� ���δ�.
		System.out.println("�ּҰ�: "+tv.toString());
		System.out.println("�ּҰ�: "+tv2.toString());
		
		
		
		
		
	}

}
