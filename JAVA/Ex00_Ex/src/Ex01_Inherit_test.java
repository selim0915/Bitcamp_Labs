/*
요구사항
스마트폰 판매 점이다.
스마트폰의 종류는 총 3개(갤럭시s10, 아이폰7, V40)이고 가격은(1000,2000,500)으로 책정되어있다.
단, 스마트폰의 가게가 오픈할때 가격을 변동 할 수 있다.
고객
카트 (Cart)
카트에는 매장에 있는 모든 전자제품을 담을 수 있다 
카트의 크기는 고정되어 있다 (10개) : 1개  , 2개 담을 수 있고 최대 10개까지 담을 수 있다
고객이 물건을 구매 하면 ... 카트에 담는다
구매자는 돈을 직접 입력 할 수 있다.(Money)
구매 (Buy)
구매와 동시에 구매한 물품이 카트에 담긴다.
만약 Money가 부족할 시 구매 불가.
계산 (Calculate)
계산이 완료되면 구매한 물품, 총 구매가격, 총 보너스가 출력된다.
 */
class Smart{
	int price;
	int bouns;

	public Smart(int price) {
		this.price = price;
		this.bouns = price/10;
	}
}

class s10 extends Smart{
	s10(){
		super(1000);
	}

	@Override
	public String toString() {
		return "s10";
	}
}

class i7 extends Smart{
	i7(){
		super(2000);
	}
	
	@Override
	public String toString() {
		return "i7";
	}
}

class v40 extends Smart{
	v40(){
		super(500);
	}
	
	@Override
	public String toString() {
		return "v40";
	}
}

class Buyer{
	int money;
	int bonus;
	Smart[] ca = new Smart[10];
	int index =0;
	int sum=0;
	
	Buyer(int money){
		this.money = money;
	}
	
	void buy(Smart smart) {
		
		if(index == 10) { //10이면
			System.out.println("장바구니 초과");
		} else if(this.money > smart.price) {
			ca[index++] = smart;
			this.money -= smart.price;
			this.sum += smart.price; //return;
			this.bonus += smart.bouns;
			
			System.out.println(smart.toString()+"를 구매함");
			System.out.println(this.money+"원 남음");
			System.out.println("포인트: "+this.bonus);
			System.out.println("금액2: " +this.sum);
			
		} else {
			System.out.println("금액이 부족합니다.");
		}
	}
	
	void calculate() {
		for(int i=0; i<index; i++) {
			System.out.println("산 물건: " +ca[i].toString());
			System.out.println("금액: " +ca[i].price);
			System.out.println("포인트: " +ca[i].bouns);
		}
	}
}

public class Ex01_Inherit_test {

	public static void main(String[] args) {
		s10 s = new s10();
		i7 i = new i7();
		v40 v = new v40();
		
		Buyer b = new Buyer(5000);
		b.buy(s);
		b.buy(i);
		b.buy(v);
		b.buy(i);
		System.out.println();
		b.calculate();
		
	}

}
