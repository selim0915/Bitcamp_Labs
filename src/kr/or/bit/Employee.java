package kr.or.bit;
/*
 * ����� ���, �̸�, ������ ������ �ִ�. = > ��Ģ(ĸ��ȭ) =>setter, getter
 *��� ������ default�� ���=9999, �̸�=�ƹ���, ����=����
 *Employee e =new Employee();
 *������ �Լ��� ����Ͽ� (�� ��� ������) ���, �̸�,������ �Է��Ͽ� ��� ������ �����ϸ�,
 * ����� ������ �� ����� ������ ���,�̸�,������  ���� ������ �� �ִ�.
 * ��������� ���, �̸�, ���� �� �ѹ��� Ȯ�� �� �� �ְ�, ������ ������ Ȯ���� �Ұ��ϴ�.
 * ����� �̸������� ���� ��ȸ �����ϴ�. ��������� �ݵ�� "��"�� �ٿ��� �Ѵ�.
 */
public class Employee {
	private int empno;
	private String ename;
	private String job;
	
	public Employee() {
		empno = 9999;
		ename = "�ƹ���";
		job = "����";
	}
	
	public Employee(int no, String name, String jobdata) {
		//overloading constructor
		empno = no;
		ename = name;
		job = jobdata;
	}
	
//	public int getEmpno() {
//		return empno;
//	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	
	public String getEname() {
		return ename+"��";
	}

	public void setEname(String ename) {
		this.ename = ename;
	}
	
//	public String getJob() {
//		return job;
//	}
	
	public void setJob(String job) {
		this.job = job;
	}
	
	public void empInfo() {
		System.out.printf("���[%d], �̸�[%s], ����[%s]\n",empno,ename,job);
	}
	
}
