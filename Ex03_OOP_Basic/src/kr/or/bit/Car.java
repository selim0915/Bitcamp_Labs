package kr.or.bit;
/*
 * ������(������, ������) = modifier
 * public : ����(����,��Ű�� ������� ��� �ڿ��� �����ϰڴ�) 
 * private: ����(ĸ��ȭ, ����ȭ: Ŭ���� ���ο��� ����, ��������(��ü) ���Ұ� �� �ڿ�) 
 * 
 * *��ü���� Ư¡: ĸ��ȭ, ����ȭ*
 * 1.	Ŭ���� ���ο��� private int age;
 * 1.1 	private: �����Ҵ��� ���� �����Ҵ��� ���ؼ� �ڿ� ��ȣ
 * 1.2 	�������� �ǵ� = ���ϴ� ���� ó���� �� �ְ� �ϰڴ�. age������ 1~200 ������ ���ǰ� �ϰڴ�. => ������ �Լ�ǥ�� ����
 * 1.3 	ĸ��ȭ �� �ڿ��� �����Ҵ��� ó���ϴ� Ư���� �Լ�(setter, getter)
 * 		private member field �� read, write�� �Ҽ� �ִ� �Լ�
 * 1.4 	private int age;
 * 		-setter
 * 		-getter
 * 		//�ʿ信 ���� setter, getter �ϳ����� ������ �� �ִ�.
 */
public class Car {
	private int window;
	private int speed;

	public int getWindow() { //read
		return window;
	}

	public void setWindow(int window) { //write
		this.window = window;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		//�����Ҵ�
		if(speed <0) {
			this.speed = speed;
		} else {
			this.speed = speed;
		}
	}
	
	//���ǵ带 �ø��� ���
	public void speedUp() {
		speed +=10;
	}
	
	public void speedDown() {
		if(speed >0) {
			speed-=5;
		} else {
			speed=0;
		}
	}
	
}
