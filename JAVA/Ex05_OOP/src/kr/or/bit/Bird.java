package kr.or.bit;


//Protected����: ��Ӱ��迡�� ������
//����� �ʿ��ϴٸ� ������ �ϼ���.. �Ƹ� �ʿ��Ұ̴ϴ�..

//����: �����մ�, ������
public class Bird {
	public void fly() {
		System.out.println("i am fly");
	}
	
	//������ �ϸ� ���ھ�..
	protected void movefast() {
		fly();
	}
}
