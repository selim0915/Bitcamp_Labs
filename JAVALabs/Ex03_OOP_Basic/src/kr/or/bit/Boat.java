package kr.or.bit;
/*
 * ��� �̸��� ���� ���� �ִ� ž���ο��� ���ݰ� ���� ���԰� ���ԵǾ���Ѵ�. => �ʵ����
*�谡 ��������� �̸��� ���� �� , ž���ο� , ���� , ���԰� �ݵ�� ���ԵǾ�� �Ѵ�. =>������
*�谡 ��������� ���� ������ ���� �Ұ��ϴ�. => setter����x
 */
public class Boat {
	private String name;
	private int door;
	private int maxp;
	private int price;
	private int ton;
	
	public Boat(String name, int door, int maxp, int price, int ton) {
		this.name = name;
		this.door = door;
		this.maxp = maxp;
		this.price = price;
		this.ton = ton;
	}

	public String getName() {
		return name;
	}

	public int getDoor() {
		return door;
	}

	public int getMaxp() {
		return maxp;
	}

	public int getPrice() {
		return price;
	}

	public int getTon() {
		return ton;
	}
}
