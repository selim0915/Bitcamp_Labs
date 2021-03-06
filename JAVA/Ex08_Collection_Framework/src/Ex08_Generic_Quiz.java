import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import kr.or.bit.Emp;

class CopyEmp {
	private int empno;
	private String ename;
	private int sall;

	public CopyEmp(int empno, String ename, int sall) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.sall = sall;
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

	public int getSall() {
		return sall;
	}

	public void setSall(int sall) {
		this.sall = sall;
	}

}

public class Ex08_Generic_Quiz {

	public static void main(String[] args) {
		// 1. Emp클래스를 사용해서 사원3명을 생성하세요.
		// 단 ArrayList를 사용하세요.
		List<Emp> emp = new ArrayList<>();
		emp.add(new Emp(1, "김", "it"));
		emp.add(new Emp(2, "우", "de"));
		emp.add(new Emp(3, "신", "en"));

		// 2.3명의 사원정보(사번, 이름, 직종)을 개선된 for문으로 사용하세요.
		// 단 toString은 사용금지
		for (Emp e : emp) {
			System.out.println(e.getEmpno() + "/" + e.getEname() + "/" + e.getJob());
		}
		System.out.println();

		// 3.3명의 사원정보(사번, 이름, 직종)을 일반 for문으로 사용하세요.
		// 단 toString은 사용금지
		for (int i = 0; i < emp.size(); i++) {
			System.out.println(emp.get(i).getEmpno() + "/" + emp.get(i).getEname() + "/" + emp.get(i).getJob());
		}
		System.out.println();

		// 4. CopyEmp라는 클래스를 만드세요. (구조는 Emp와 같은데 job삭제 => sall추가)
		// getter setter 구현
		// ArratList<>사용해서 사원 3명을 만드세요.
		// 출력
		// 100, "김", 1000
		// 200, "이", 2000
		// 300, "박", 3000
		List<CopyEmp> cemp = new ArrayList<CopyEmp>();
		cemp.add(new CopyEmp(100, "김", 1000));
		cemp.add(new CopyEmp(200, "이", 2000));
		cemp.add(new CopyEmp(300, "박", 3000));

		for (CopyEmp ce : cemp) {
			System.out.println(ce.getEmpno() + "/" + ce.getEname() + "/" + ce.getSall());
		}
		System.out.println();

		// 5. 200번 사원의 급여를 5000으로 수정 해서 출력하세요.
		// 일반 for문 사용
		// cemp.get(1).setSall(5000);

		for (int i = 0; i < cemp.size(); i++) {
			if (cemp.get(i).getEmpno() == 200) {
				cemp.get(i).setSall(5000);
			}
			System.out.println(cemp.get(i).getEmpno() + "/" + cemp.get(i).getEname() + "/" + cemp.get(i).getSall());
		}
		System.out.println();

		// 6.300번 사원의 이름을 "궁굼해"로 숭정해서 출력하세요
		// 변경 for문사용
//		cemp.get(2).setEname("궁굼해");
//		for(CopyEmp ce : cemp) {
//			System.out.println(ce.getEmpno()+"/"+ce.getEname()+"/"+ce.getSall());
//		}
//		System.out.println();

		for (CopyEmp ce : cemp) {
			if (ce.getEmpno() == 300) {
				ce.setEname("궁굼해");
			}
			System.out.println(ce.getEmpno() + "/" + ce.getEname() + "/" + ce.getSall());
		}
		System.out.println();
		
		
		//7. 사원정보를 Iterator 인터페이스를 사용해서 출력하세요.
		Iterator<CopyEmp> list = cemp.listIterator();
		while(list.hasNext()) {
			System.out.println(list.next().getEmpno()
									+"/"+list.next().getEname()+"/"
									+list.next().getSall());
		}
		
		
		
	}

}
