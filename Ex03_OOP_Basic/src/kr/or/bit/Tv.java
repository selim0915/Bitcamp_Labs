package kr.or.bit;
/*
 * �䱸���� ����
 * TV�� ä�������� ������ �ִ�. (���� ��� 1~250�������� ä��)
 * TV�� �귣�� �̸��� ������ �ִ�. (���� ��� �Ｚ, LG)
 * TV�� ä����ȯ ����� ������ �ִ�. (ä���� �����Ҽ��ִ�. *�� �ܰ辿��) -���2�� �ʿ�
 * TV�� ������ ������ �ִ�. (on/off)
 */
public class Tv {
	 public int ch; //public int ch =1;
	 public String brandname;
	 public boolean power; //true-on, false-off;
	 
	 public void ch_up() {
		 //member filed ���°�
		 if(power == true) {
			 ch++;
		 } else {
			 System.out.println("���� ��������");
		 }
	 }
	 
	 public void ch_down() {
		 if(power == true) {
			 ch--;
		 } else {
			 System.out.println("���� ��������");
		 }
	 }
	 
	 public void power_on() {
		 power = true;
	 }
	 
	 public void power_off() {
		 power =  false;
	 }
}
