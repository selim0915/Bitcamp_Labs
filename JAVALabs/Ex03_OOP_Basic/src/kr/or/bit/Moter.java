package kr.or.bit;

public class Moter {

	private String brandname;
	private int modelnum;
	private static int su;
	
	//�ʱ�ȭ�� ��ǳ���� Ŭ�����ȿ��� �Ķ��Ÿ ���� �޾� �ʱ�ȭ �ؾ��Ѵ�.
	
	
	
	
	
	public void info() {
		count();
		System.out.println("�귣���: "+ brandname 
				+ " ,�𵨸�: "+modelnum
				+ " ,���� ��: "+su);
	}
	
	public void count() {
		su++;
	}
	
}

