/*
 * �䱸����
 * 
 * �츮ȸ��� ����⸦ �ֹ�, ����, �Ǹ��ϴ� ȸ���Դϴ�.
 * �츮ȸ��� ����⸦ �����ϴ� ���赵�� �ۼ��Ϸ��� �մϴ�.
 * 
 * ������� �䱸����
 * 1. ����⸦ �����ϸ� ������� �̸��� ��ȣ�� �ο��ؾ� �մϴ�. (ex "�����װ�", 112)
 * 2. ����Ⱑ ����Ǹ� ������� �̸��� ��ȣ�� �°� �ο������ Ȯ�� �ϴ� ����� �ʿ��մϴ�. (�������)
 * 3. ����Ⱑ ��� �� ������ ����⿡ ��������� Ȯ�� �Ҽ� �ֽ��ϴ�.
 * 
 */
package kr.or.bit;

public class Airplane {
	private String aname;
	private int anumber;
	private static int asu;
	
	//public AirPlane() {}
	
	public Airplane(String aname, int anumber) {
		this.aname = aname;
		this.anumber = anumber;
		asu++;
	}
	
	public void airplaneInfo() {
		System.out.println("����� �̸�: "+aname+" ,��ȣ: "+anumber);
	}
	
	public void airplaneCount() {
		System.out.println("�� ���� ����� ��: " + asu);
	}
}
	
