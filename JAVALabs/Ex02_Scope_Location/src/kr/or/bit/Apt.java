package kr.or.bit;

public class Apt { //��� �ۺ�
	public String aptname; //public
	int door; //default
	private int window; //private (ĸ��ȭ)
	
	//�����Ҵ�
	//�����Ҵ��� ���� �����Ҵ��� ���� ������ ��ȣ..�� �Ѵܴ�..
	public void write_window(int w) { //ĸ��ȭ �� �ڿ��� write����� �Լ�
		if(w==0) {
			window = 100;
		} else {
			window = w;
		}
	}
	
	public int read_window() { //ĸ��ȭ �� �ڿ��� read����� �Լ�
		return window;
	}
}
