class Tv{
	boolean power;
	int ch;
	
	void power() {
		this.power = !this.power;
	}
	
	void chUp() {
		this.ch++;
	}
	
	void chDown() {
		this.ch--;
	}
}

class Vcr{ //���� �÷��̾�
	boolean power;
	
	void power() {
		this.power = !this.power;
	}
	
	void play() {
		System.out.println("����ϱ�");
	}
	
	void stop() {
		System.out.println("����");
	}
	
	void rew() {
		System.out.println("�ǰ���");
	}
	
	void ff() {
		System.out.println("��������");
	}
}
//���赵: tv, vcr �� ������ �ִ�.
//vcr��ɰ� tv����� �� ���� ���赵�� �ۼ� �� �ּ���,
//tvVcr��ǰ�� ����� �;��

//���赵 ����..
//class TVVcr extends tv, vcr{} (xxxxx:���߻�� �ȵ�)

//Tv extends Vcr
//TvVcr extends Tv (������ ���)

//��������: ���1�� ����ϱ�
//�������� Ŭ������ �����ִ� �� ���, ���� 2�� ���̴�.
//���: TvVcr�� ���� �� � ���� ����ϰ� � ���� �����ϴ��� ������..
// => �̷���, �ֱ��(tv)�� �������(vcr)�� �Ǵ�����.
//������ ���� Ŭ������ ��ӹ޴� ���� ����.

class TvVcr extends Tv {
	Vcr vcr;
	
	TvVcr(){
		vcr = new Vcr(); //���԰���
	}
}

//class ���Ǳ�{
//	�����[] ���� = ["���̴�","�ݶ�"]
//}
//
//class �����{
//	
//}

public class Ex03_Inherit_Single {

	public static void main(String[] args) {
		TvVcr t = new TvVcr();
		t.power();
		System.out.println("Ƽ�� ���� ����:" + t.power);
		t.chUp();
		t.chUp();
		System.out.println("Ƽ�� ä��: "+ t.ch);
		
		t.vcr.power(); //���԰��� �ҷ�����
		//t.vcr.power();
		System.out.println("vcr ���� ����:" + t.vcr.power);
		
		t.vcr.play();
		t.vcr.stop();
		t.vcr.power();
		t.power();
		System.out.println("Ƽ�� ���� ����:" + t.power);
		System.out.println("vcr ���� ����:" + t.vcr.power);
	}

}
