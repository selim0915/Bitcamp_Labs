package kr.or.bit;

public class Cleaner {
	
	public String brand; //����ȸ��
	public String modelname; //�𵨸�
	public String color; //����
	public String Producedata; //��������
	public int batterysize; //���͸�ũ��
	//public int Electricity; //���� �Һ� ����
	
	public int level; //���Է�(�ܰ躰)
	public boolean power; //����
	public int batterynow; //�ܿ� ���͸�(����)
	public int motorspeed; //���� ���ͼӵ�

	public Motor motor; //����
	public Brush brush; //�귯��
	public Charge charge; //������
	public Filter filter; //����
	
	//���� on/off
	public void poweron() {
		power = true;
	}
	
	public void poweroff() {
		power = false;
	}
	
	//���� �ܰ�
	public void levelmethod(int a) {
		if(a ==1) {
			level = 1;
		} else if(a ==2) {
			level =2;
		} else if(a==3) {
			level =3;
		} else {
			System.out.println("1,2,3 ���� �Է�");
		}
	}
	
	//�귯�� ��ü
	public void brushmethod(String a) {
		System.out.println(a+ "�� ��ü �Ǿ����ϴ�.");
	}
	
	 	
}
