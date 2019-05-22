//하나의 클래스
//this: 객체 자신을 가르키는 this(this.name, this.age)
//this: 생성자를 호출하는 this (this(100,"홍길동"))

//상속관계에서는..
//super가 있다.~
//super: 부모의 주소를 담고 있다.: 상속 관계에서 부모자원에 접근하는 방법
//this와 역할이 동일
//1. super: 상속관계에서 부모 자원 접근(변수,메소드)
//2. super: 상속관꼐에서 부모자원의 생성자를 명시적으로 호출
//c# : base

class Base{
	String basename;
	Base(){
		System.out.println("Base 클래스 기본 생성자");
	}
	Base(String basename){
		this.basename = basename;
		System.out.println("this.basename: "+this.basename);
	}
	void baseMethod() {
		System.out.println("Base.baseMethod()");
	}
}

class Derived extends Base{
	String dname;
	Derived() {
		System.out.println("Derived 클래스 기본 생성자");
	}
	Derived(String dname){
		//super(); //부모의 default생성자 호출
		super(dname); //부모의 overloading 된 생성자 호출
		this.dname = dname;
		System.out.println("this.dname: "+this.dname);
	}
	
	@Override
	void baseMethod() {
		System.out.println("부모 함수를 재정의 하였습니다.");
	}
	
	//갑자기 재정의해도 부모의 메소드가 쓰고싶을때,
	//... 별도의 함수를 만들어서 슈퍼로 가져오지 않는 이상.. 가져올수 없다...
	//주소로 접근해서 자원을 가져오자!
	void P_method() {
		super.baseMethod();
	}
}

public class Ex06_Inherit_super {

	public static void main(String[] args) {
		//Derived d = new Derived();
		//d.basename
		//d.dname
		
		Derived d = new Derived("홍길동");
		d.baseMethod();
	}

}
