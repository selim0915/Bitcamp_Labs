package kr.or.bit;

public class Program {

	public static void main(String[] args) {
		//��� 1���� �����ϰ� �ʹ�.
		Emp emp = new Emp();
		emp.empno = 7788;
		emp.ename = "smith";
		emp.job = "manager";
		
		emp.setSal(8000);
		
//		int sal = emp.getSal();
//		System.out.println("�޿�����: " +sal); //�����ϸ� �ʱⰪ 0�� ��������.
		
		String result = emp.getEmpInfo();
		System.out.println(result);
		
	}

}
