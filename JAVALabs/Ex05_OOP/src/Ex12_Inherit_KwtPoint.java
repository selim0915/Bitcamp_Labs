
class Product{//������ǰ
	int price;
	int bonuspoint;
	
	Product(int price){
		this.price = price;
		this.bonuspoint = (int)(this.price/10.0);
	}
}

class KtTv extends Product{
	KtTv(){
		super(5000);
	}

	@Override
	public String toString() {
		return "KtTv";
	}
}

class Audio extends Product{
	Audio(){
		super(100);
	}

	@Override
	public String toString() {
		return "Audio";
	}
}

class Notebook extends Product{
	Notebook(){
		super(200);
	}

	@Override
	public String toString() {
		return "Notebook";
	}
}

class Buyer{
	int money =10000;
	int bonuspoint =0;
	
	/*
	 * �������� �����
	 * �������� (�ܾ�-��ǰ����, ����Ʈ���� ����)
	 * �����ڴ� ���忡 �ִ� ��� ��ǰ�� ���� �� �� �־�� �Ѵ�.
	 * ���������ϴ� �Լ� ����� 
	 * KtTv, Audio, Notebook
	 * 
	 * 
	 * 
	 * 2��
	 * ���忡 ��ǰ�� 1000���� �ٸ� ��ǰ�� �����.
	 * ������ ���� ���忡 �ڵ� ��ġ
	 * ����> ��> ����
	 * ktTv, Audio, Notebook ������ ��ǰ�� ���� �Ұ�..!
	 * => ��ǰ�� �߰� �Ǿ��� ������ �����Լ��� �����ؾ� �Ѵ�.
	 * 
	 * 2������ ���� �޼ҵ� �̸��� ���� ���״� (�޼�������ε�)
	 * 3�� ���� => ������
	 */
	
//	void ktTvBuy(KtTv ktTv) {
//		//�����Ѵٴ� �̾߱�� ��ǰ������ �����;��Ѵ�.
//		if(this.money < ktTv.price) {
//			System.out.println("�ܾ׺���"); return;
//		}
//		
//		this.money -= ktTv.price;
//		this.bonuspoint += ktTv.bonuspoint;
//		
//		System.out.println("������ ������ : "+ktTv.toString());
//	}
//	
//	void audioBuy(Audio audio) {
//		//�����Ѵٴ� �̾߱�� ��ǰ������ �����;��Ѵ�.
//		if(this.money < audio.price) {
//			System.out.println("�ܾ׺���"); return;
//		}
//		
//		this.money -= audio.price;
//		this.bonuspoint += audio.bonuspoint;
//		
//		System.out.println("������ ������ : "+audio.toString());
//	}
//	
//	void notebookBuy(Notebook notebook) {
//		//�����Ѵٴ� �̾߱�� ��ǰ������ �����;��Ѵ�.
//		if(this.money < notebook.price) {
//			System.out.println("�ܾ׺���"); return;
//		}
//		
//		this.money -= notebook.price;
//		this.bonuspoint += notebook.bonuspoint;
//		
//		System.out.println("������ ������ : "+notebook.toString());
//	}
	
	void Buy(Product product) {
		if(this.money < product.price) {
			System.out.println("�ܾ׺���"); return;
		}
		
		this.money -= product.price;
		this.bonuspoint += product.bonuspoint;
		
		System.out.println("������ ������ : "+product.toString());
	}
	
}

public class Ex12_Inherit_KwtPoint {

	public static void main(String[] args) {
		
//		KtTv tv =new KtTv();
//		System.out.println(tv.toString());
//		System.out.println(tv.price);
//		System.out.println(tv.bonuspoint);
		
		KtTv tv =new KtTv();
		Audio audio = new Audio();
		Notebook notebook = new Notebook(); //��ǰ����
		
		Buyer b =new Buyer();
		System.out.println(b.money);
		System.out.println(b.bonuspoint); //���� ��
		
		b.Buy(notebook);
		b.Buy(audio);
		b.Buy(tv);
		
		System.out.println(b.money);
		System.out.println(b.bonuspoint); //���� ��
	}

}
