package kr.or.bit;

//Emp e = new Emp();
public class Emp {
	private int empno;
	private String ename;
	
	//zŬ�����̸��� �Ȱ��� �̸�, 
	public Emp() {
		System.out.println("default.....");
	}
	
	public Emp(int empno, String ename) {
		//�������� ����Ʈ���� overloading construtor
		this.empno = empno;
		this.ename = ename;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}
	
	public void empInfo() {
		System.out.println(empno+"/"+ename);
	}
}
