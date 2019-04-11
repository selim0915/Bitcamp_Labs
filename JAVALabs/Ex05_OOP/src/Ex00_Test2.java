/*
 * ī���� ������ �����ϴ� �ַ�� ����
* =================================
* ī��� 2������ Ŀ�ǿ� 2������ ���� �Ȱ� �ֽ��ϴ�.
*
* Ŀ�ǿ� ���� ���� ������ ������ ������ �ֽ��ϴ�.
* Ŀ�Ǵ� Americano, CaffeLatte��� �̸��� ������ �ֽ��ϴ�.
* ���� Chamomile, MilkTea��� �̸��� ������ �ֽ��ϴ�.
* Coffee Ŭ������ Tea Ŭ������ �����Ѵ�.
* Ŀ�� 2������ �� 2������ Coffee Ŭ������ Tea Ŭ������ ����Ѵ�.
* ex) Americano - 2000��, MilkTea - 3000��
*
* �ùķ��̼� �ó�����
* ī�� : ���� ������ ������ �ִ�.
* �� : ������� ���� 5000��
* ī��� ����(Drink)�� �Ǵ�. ���Ḧ �ȸ� ������ �����Ѵ�.
* ������ 0���� �����Ѵ�.
* ���Ḧ �Ĵ� �Լ��� sell �ϳ��� ����� ����Ѵ�.
* ���Ḧ �ȸ� � ���Ḧ �Ǹ��ߴ��� ����ϰ�
���� ������ ������ ����Ѵ�.
 */

class Coffee extends drink {
	Coffee(int price) {
		super(price);
	}
}

class Americano extends Coffee {
	public Americano() {
		super(2000);
	}

	@Override
	public String toString() {
		return "�Ƹ޸�ī��";
	}
}

class CaffeLatte extends Coffee {
	public CaffeLatte() {
		super(3000);
	}
	
	@Override
	public String toString() {
		return "ī���";
	}
}

class tea extends drink {

	tea(int price) {
		super(price);
	}
	
	
}

class Chamomile extends tea {
	public Chamomile() {
		super(4000);
	}
	@Override
	public String toString() {
		return "ī���";
	}
}

class MilkTea extends tea {
	public MilkTea() {
		super(5000);
	}
	@Override
	public String toString() {
		return "��ũƼ";
	}
}

class drink {
	int price;

	public drink(int price) {
		this.price = price;
	}
}

class cafe {
	/*
	 * �ùķ��̼� �ó����� ī�� : ���� ������ ������ �ִ�.
	 *  �� : ������� ���� 5000�� ī��� ����(Drink)�� �Ǵ�.
	 *   ���Ḧ �ȸ������ �����Ѵ�. 
	 *   ������ 0���� �����Ѵ�.
	 *    ���Ḧ �Ĵ� �Լ��� sell �ϳ��� ����� ����Ѵ�. 
	 *    ���Ḧ �ȸ� � ���Ḧ �Ǹ��ߴ��� ����ϰ� ���� ������ ������ ����Ѵ�.
	 */

	int sales = 0;

	public void sell(drink d) {
		this.sales += d.price;
		System.out.println(d.toString()+"�� "+d.price+"�ȾҴ�!");
	}

}

public class Ex00_Test2 {

	public static void main(String[] args) {
		Americano a = new Americano();
		CaffeLatte c = new CaffeLatte();
		Chamomile c2 = new Chamomile();
		MilkTea m = new MilkTea();
		
		cafe p = new cafe();
		p.sell(a);
		p.sell(c);
		p.sell(c2);
		p.sell(m);
		
	}

}
