import kr.or.bit.Card;

public class Ex05_Static_CardMake {

	public static void main(String[] args) {

		Card c3 = new Card();
		c3.number = 10;
		c3.kind = "��";
		c3.cardInfo();
		
		Card c = new Card();
		c.number = 1;
		c.kind = "��";
		//*������� �߰� , �Ʒ��� �ٰ��� �ٲ�(�����ڿ�)
		c.h =500;
		c.w =200;
		c.cardInfo();
		
		Card c2 = new Card();
		c2.number = 10;
		c2.kind = "��";
		c2.cardInfo();
		
		// �̶� �䱸������ �ٲ�ٸ�?
		// ī�� ũ�� ���� ����. h=500, w=200
		// class������ �ѹ� ������ ������ �� ����, �� �ϳ��� 53���� �ݺ��ؼ� �����ؾ� �Ѵ�.
		// static �ڿ��� ����ϸ�, �ѹ��� ������ ���� ��� ���� �ٲܼ� �ִ�.
	}

}
