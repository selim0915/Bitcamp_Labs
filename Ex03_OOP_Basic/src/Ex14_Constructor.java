import kr.or.bit.Employee;

public class Ex14_Constructor {

	public static void main(String[] args) {

		Employee emp = new Employee(); // default������ ȣ��
		emp.empInfo();
		System.out.println(emp.getEname());
		
		Employee emp2 = new Employee(201901,"ȫ�浿","������");
		emp2.empInfo();
		System.out.println(emp2.getEname());
		emp2.setJob("������");
		emp2.empInfo();
		
		//Array�� ����ؼ� ���3���� ����� ������.
		//��ü�迭(8����+String+array+Ŭ����)
		//Employee[] emp3 = new Employee[3];
		Employee[] emp3 = {new Employee(1,"A","IT"), 
				new Employee(2,"B","SALES"),new Employee(3,"C","IT")};
		for(Employee e:emp3) {
			e.empInfo();
		}
		
		
		
	}

}
