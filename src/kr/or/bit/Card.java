package kr.or.bit;
/*
 * *���� ���� ����: �䱸������ �׻� ���Ѵ�. �䱸���׿� �°� �����ϴ� ���α׷��� ������ �Ѵ�.
 * 
 * �츮 ȸ���ī�带 ���� �Ǹ��ϴ� ȸ���Դϴ�.
 * ���� ���㿡 ���� ī�� 53���� �����ϰ� �Ǿ����ϴ�.
 * 
 * �䱸����
 * ī��� ���� ī���ȣ�� ������ �ְ�, �׸��� ��絵 ������ �ִ�.
 * ī��� ũ�⸦ ������ �ִ�. (ũ��: ���̿� �ʺ� ������ �ִ�.)
 * ī���� ������ Ȯ���ϴ� ����� ������ �ִ�.
 * 
 */
public class Card {
	public int number;
	public String kind;
	
	//���ī�忡 ũ��� ����
//	public int h =50;
//	public int w =20;
	public static int h=50;
	public static int w=20;
	
	//���(����)
	public void cardInfo() {
		System.out.printf("ī���ȣ: %d, ���: %s, ����: %d, ����: %d\n",number, kind, h,w);
	}
}
