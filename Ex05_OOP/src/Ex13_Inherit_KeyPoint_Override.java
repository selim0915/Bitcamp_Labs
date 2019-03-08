/*
�䱸����
īƮ (Cart) =>zkxm roror
īƮ���� ���忡 �ִ� ��� ������ǰ�� ���� �� �ִ� +> 
īƮ�� ũ��� �����Ǿ� �ִ� (10��) : 1��  , 2�� ���� �� �ְ� �ִ� 10������ ���� �� �ִ�
���� ������ ���� �ϸ� ... īƮ�� ��´�

���뿡 ���� ��ü ���
������� �ʿ�
summary() ��� �߰��� �ּ���
����� ������ �����̸� �� �������� ����
�� �����ݾ� ��� ���
hint) īƮ ������ ��� ���� (Buy())
hint) Buyer ..>> summary()  main �Լ����� ����Ҷ�

�����ڴ� default �ݾ��� ������ �ְ� �ʱ�ݾ��� ������ �� �� �ִ�
*/

class Product2 { // ������ǰ
	int price;
	int bonuspoint;

	// Product() { }
	Product2(int price) {
		this.price = price;
		this.bonuspoint = (int) (this.price / 10.0);
	}
}

class KtTv2 extends Product2 {
	KtTv2() {
		super(500);
	}

	@Override
	public String toString() {
		return "KtTv2";
	}
}

class Audio2 extends Product2 {
	Audio2() {
		super(100);
	}

	@Override
	public String toString() {
		return "Audio2";
	}
}

class Notebook2 extends Product2 {
	Notebook2() {
		super(100);
	}

	@Override
	public String toString() {
		return "Notebook2";
	}
}

class Buyer2 {
	int money = 10000;
	int bonuspoint = 0;
	Product2[] cart = new Product2[10];
	int index = 0;
	//int end=cart.length;
	
	Buyer2(){
		this(10000,0);
	}
	
	Buyer2(int money, int bonuspoint){
		this.money = money;
		this.bonuspoint = bonuspoint;
	}

	void Buy(Product2 product2) { // ���� (��ǰ����) //KtTv parameter �� ...
		if (this.money < product2.price) {
			System.out.println("���� �ܾ��� �����մϴ� ^^");
			return; // ���� ������ ���� ����
		}

		// ��ȿ�� ���� //Cart ���� ����
		if (this.index >= 10) {
			System.out.println("��ٱ��ϰ� ���� ��!");
			return;
		}

		// *īƮ�� ���
		cart[index++] = product2; // ��ġ������.. //���� �� �ε��� ��ȣ ����
           
//		for(int i=0; i<cart.length; i++) {
//			if (cart[i] == null)
//			cart[i] = product2;
//			break;
//		}
		
		// �� ��������
		this.money -= product2.price;
		this.bonuspoint += product2.bonuspoint;
		System.out.println("������ ������ : " + product2.toString());
		System.out.println("�����ܿ�: "+ this.money);
		System.out.println("���� ����Ʈ: "+ this.bonuspoint);
	}

	// ���� ������ ���.
	// ������ �Ѿ��� �θ� ������ �־�� �Ѵ�.
	// ������ ���
	void Summary(Product2 product2) {
		int totalprice =0; 
		int totalbonuspoint =0;
		String productlist ="";
		
		for(int i=0; i<index; i++) {
			totalprice += cart[i].price; //���� ����
			totalbonuspoint += cart[i].bonuspoint; // ���� ����Ʈ
			productlist += cart[i].toString()+" "; //������ ����
		}
		
//		for(Product2 ca : cart) {
//			System.out.println(ca.price);
//		}
		
		System.out.println("------------");
		System.out.printf("���Ź��� �Ѿ�: [%d]\n", totalprice);
		System.out.printf("���Ź��� ����Ʈ: [%d]\n", totalbonuspoint);
		System.out.printf("���Ź��� �̸�: [%s]\n", productlist);
	}
}

public class Ex13_Inherit_KeyPoint_Override {

	public static void main(String[] args) {
		// �����
		Buyer2 buyer = new Buyer2();
		
		//��ǰ
		KtTv2 tv = new KtTv2();
		Audio2 audio = new Audio2();
		Notebook2 notebook = new Notebook2();

		//īƮ�� ���
		buyer.Buy(notebook);
		buyer.Buy(audio);
		buyer.Buy(tv);
		buyer.Buy(tv);
		//������ ���
		buyer.Summary(notebook);
	}

}
