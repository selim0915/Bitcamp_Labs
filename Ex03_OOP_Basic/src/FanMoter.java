import kr.or.bit.Fan;

public class FanMoter {

	public static void main(String[] args) {
		
		Fan f = new Fan();
		
		f.setBrand("�Ｚ");
		f.setColor("����");
		f.setModelname("���ۼ�ǳ��");
		f.setPrice(30000);
		
		System.out.println("�귣��: "+ f.getBrand());
		System.out.println("����: "+ f.getColor());
		System.out.println("�𵨸�: "+ f.getModelname());
		System.out.println("����: "+ f.getPrice());
		
		System.out.println();
		
		f.poweron();
		System.out.println("��������: "+ f.power);
		f.poweroff();
		System.out.println("��������: "+ f.power);
		
		System.out.println();
		
		f.levelMethod(1);
		f.levelMethod(2);
		f.levelMethod(3);
		f.levelMethod(4);
	}

}
