//���� <-> ���
//����: ���ϴ� ��
//���: ������ �ʴ� ��

//�ý��ۿ��� �ѹ� ���� �������� ������� ���ƾ� �ɰ� ex)�ý��� ���� ��ȣ
//�Ϲ� ��ļ����� ���� �������� ���� ���� ���ƾ� �Ұ� ex)������, �ֹι�ȣ, PI

//����� ������ �빮��
//java: final int NUM =100;
//c#: const int NUM =100;


//fianl Ű����
//Ŭ�����տ�: final class Car{} : >> ��� �Ұ� (extenads �Ұ�)   Ŭ������ fianl�� �ٿ����� ��� �Ұ�..
//�Լ� �տ�: public final void print(){} : >> ��� ���迡�� ������ �Ҽ� ����. final���� ������ ���ϰ� �ϴ� ���, private, fianl 2����..

class Vcard{
	final String KIND = "heart";
	final int NUM=10;
	void method() {
		//�ý��� ����� static, final double PI=3.1415.. �̷��� ���� �Ǿ��մ�.
		//�������� �� ��ġ��..
		System.out.println(Math.PI);
	}
}

//����: VcardŸ������ ����� ��� ��ü�� �ᱹ ���� ������� ������. OO
//��ü���� �ٸ� ������� ���� �;��..! 
//=>
//���: ���� �ѹ� �����Ǹ� ���� ���Ѵ�..
//�ʵ� ������ ���� �Ҵ����� �ʰ�, �����ڷ� ���� �޵�, ����Ʈ �����ڸ� ������ �ʾƾ� �Ѵ�.
class Vcard2{
	final String KIND; //��ü ����� �ʱ�ȭ ���ؼ�..
	final int NUM;
	
//	Vcard2(){
//		this.KIND = "heart";
//		this.NUM =10;
//	}
	
	//���������� �ʱ�ȭ �� �� �ִ� �ڵ�� ������ �شٸ�??..?(�Ķ���� ������ )
	Vcard2(String kind, int num){
		this.KIND=kind;
		this.NUM =num;
	}
}

public class Ex07_Final {

	public static void main(String[] args) {
		Vcard v = new Vcard();
		//v.KIND ="AAA";
		System.out.println(v.KIND);
		v.method();
		
		Vcard2 v2 = new Vcard2("space", 1);
		System.out.println(v2.KIND +"/" + v2.NUM);
		
		Vcard2 v3 = new Vcard2("heart", 10);
		System.out.println(v3.KIND +"/" + v3.NUM);
	}

}
