class Tv {
	int ch;
	String company;
}

public class Study_Memory {

	public static void tvInfo(Tv tv) {
		System.out.println("���� ä�� : " + tv.ch + "��, ������ : " + tv.company);
	}

	public static void changeCh(int i) {
		System.out.println("���� ä�� : " + i);
		i = 24;
		System.out.println("�ٲ� ä�� : " + i);
	}

	public static void changeCom(Tv tv) {
		System.out.println("���� ������ : " + tv.company);
		tv.company = "LG";
		System.out.println("���� ������ : " + tv.company);
	}

	public static void main(String[] args) {
		Tv a = new Tv();
		a.ch = 16;
		a.company = "�Ｚ";
		tvInfo(a);

		changeCh(16);
		tvInfo(a);

		changeCom(a);
		tvInfo(a);
	}
}