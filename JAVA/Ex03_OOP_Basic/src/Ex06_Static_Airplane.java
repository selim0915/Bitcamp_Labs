import kr.or.bit.Airplane;

/*
 * �䱸����
 * 
 * �츮ȸ��� ����⸦ �ֹ�, ����, �Ǹ��ϴ� ȸ���Դϴ�.
 * �츮ȸ��� ����⸦ �����ϴ� ���赵�� �ۼ��Ϸ��� �մϴ�.
 * 
 * ������� �䱸����
 * 1. ����⸦ �����ϸ� ������� �̸��� ��ȣ�� �ο��ؾ� �մϴ�. (ex "�����װ�", 112)
 * 2. ����Ⱑ ����Ǹ� ������� �̸��� ��ȣ�� �°� �ο������ Ȯ�� �ϴ� ����� �ʿ��մϴ�. (�������)
 * 3. ����Ⱑ ��� �� ������ ����⿡ ��������� Ȯ�� �Ҽ� �ֽ��ϴ�.
 * 
 */
public class Ex06_Static_Airplane {

	public static void main(String[] args) {
		
//		Airplane a = new Airplane();
//		a.airPrint("����",1);
//		//a.airCount();
//		
//		Airplane a2 = new Airplane();
//		a2.airPrint("�ƽþ�",2);
//		//a2.airCount();
//		
//		Airplane a3 = new Airplane();
//		a3.airPrint("����",3);
//		//a3.airCount();
		
		Airplane air = new Airplane("����", 707);
		air.airplaneInfo();
		air.airplaneCount();
		
	}

}
