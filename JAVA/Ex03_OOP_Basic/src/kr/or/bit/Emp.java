package kr.or.bit;
/*
 * ������: ȫ�浿
 * ��¥: 2019-02-08
 * ����: Emp.java(�������)
 * 
 * class= ���赵=Ÿ��
 * ���赵�� �⺻ ������Ҵ�: ��������, ��������..+��������)
 * �Ӽ�(����, �ʵ�) + ���(�Լ�, �޼ҵ�)
 */
public class Emp {
	public int empno; //���(���� > ���� > member field (instance variable) > ��ü����
	public String ename;
	public String job;
	
	private int sal; //�޿� (ĸ��ȭ, ����ȭ:�����Ҵ�)�� ����.
	
	//sal ���� write(set:��������), read(get:���������)
	public int getSal() { //�о���� ģ��
		return sal;
	}
	
	public void setSal(int sal) { //�����ٰ� ���� ģ�� //���ϰ��� �ʿ����
		if(sal <0) {
			this.sal = 0;
		} else {
			this.sal = sal; //���� �Ҵ� //���� �߿�
		}
	}
	
	private int mgr;

	//ĸ��ȭ �� ����ʵ忡 ���� �о�� �ҷ����� ģ������ ���� ���Ͷ�� �θ���.
	public int getMgr() {
		return mgr;
	}

	public void setMgr(int mgr) {
		this.mgr = mgr;
	}
	
	public String getEmpInfo() {
		return empno + "/" + ename + "/" + job + "/" + sal;
	}
	
	
	
}
