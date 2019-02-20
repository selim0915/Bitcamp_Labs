package kr.or.bit;

import java.util.Scanner;

class Seat {// �ڸ�
	private int seatRow; // �ڸ���
	private int seatCol; // �ڸ���
	private boolean reserved; // �ڸ� ���� ����

	public int getSeatRow() {
		return seatRow;
	}

	public void setSeatRow(int seatRow) {
		this.seatRow = seatRow;
	}

	public int getSeatCol() {
		return seatCol;
	}

	public void setSeatCol(int seatCol) {
		this.seatCol = seatCol;
	}

	public boolean isReserved() {
		return reserved;
	}

	public void setReserved(boolean reserved) {
		this.reserved = reserved;
	}
}

class Reservation {
	private Scanner sc;
	private Seat mySeat;
	private static Seat[][] seats;
	static {
		seats = new Seat[3][3];
		for (int i = 0; i < seats.length; i++) {
			for (int j = 0; j < seats[i].length; j++) {
				Seat seat = new Seat();
				seats[i][j] = seat;
				seat.setSeatRow(i + 1);
				seat.setSeatCol(j + 1);
			}
		}
	}

	public Reservation() {
		sc = new Scanner(System.in);
	}

	private void reserveSeat() { // �ڸ� ����
		if (mySeat != null) {
			System.out.println("�¼� ������ �̿��ϼ���. (1 ~ 3)");
		} else {
			try {
				System.out.println("���ϴ� �¼��� ���� �Է��ϼ���. (1 ~ 3)");
				int row = Integer.parseInt(sc.nextLine()) - 1; // 1�� ���� ���������� [0]�� ���� �����ϱ� ���� -1
				System.out.println("���ϴ� �¼��� ��ȣ�� �Է��ϼ���.");
				int col = Integer.parseInt(sc.nextLine()) - 1;
				if ((row >= 0 && row <= 2) && (col >= 0 && col <= 2)) {
					if (seats[row][col].isReserved()) {
						System.out.println("�̹� ����� �¼��Դϴ�.");
					} else {
						mySeat = seats[row][col];
						mySeat.setReserved(true);
						System.out.printf("�����Ͻ� �¼�, %d�� %d��° �¼� ���Ű� �Ϸ�Ǿ����ϴ�.\n", mySeat.getSeatRow(),
								mySeat.getSeatCol());
					}
				} else {
					throw new Exception();
				}
			} catch (Exception e) {
				System.out.println("�ùٸ� ���ڸ� �Է����ּ���.");
			}
		}
		/*
		 * (�� �ڸ� ����) // mySeat != null "�ڸ� ������ �̿��ϼ���"
		 * 
		 * (����) // mySeat == null �ڸ� �� �Է� �ڸ� �� �Է� seat[��][��] => ����� ���� �� �ڸ� = ������ �ڸ�
		 */
	}

	private void mySeat() { // �� �ڸ� Ȯ��
		if (mySeat != null) {
			System.out.printf("�����Ͻ� �ڸ��� %d�� %d��° �ڸ��Դϴ�\n", mySeat.getSeatRow(), mySeat.getSeatCol());
		} else {
			System.out.println("�����Ͻ� �ڸ��� �����ϴ�.");
		}
	}

	private void checkSeat() { // �� �ڸ� Ȯ��
		System.out.println("�̹� ����� �ڸ��� X�� ǥ�õ˴ϴ�");
		System.out.println();
		System.out.println("     [=======Screen=======]");
		System.out.println();
		for (int i = 0; i < seats.length; i++) {
			System.out.printf("%d��\t   ", i + 1);
			for (int j = 0; j < seats[i].length; j++) {
				if (seats[i][j].isReserved()) {
					System.out.print("[X]");
				} else {
					System.out.printf("[%d]", seats[i][j].getSeatCol());
				}
			}
			System.out.println();
		}
		/*
		 * (�� �ڸ�)
		 * 
		 * ��ȣ ǥ��
		 * 
		 * (���� �ִ� �ڸ�) X ǥ�� "[1][2][3]" "[4][X][6]" "[7][8][9]"
		 */
	}

	private void changeSeat() { // �ڸ� ����
		if (mySeat == null) {
			System.out.println("�¼� ���Ÿ� ���� ���ּ���.");
		} else {
			try {
				System.out.println("������ �¼��� ���� �Է��ϼ���. (1 ~ 3)");
				int row = Integer.parseInt(sc.nextLine()) - 1;
				System.out.println("������ �¼��� ��ȣ�� �Է��ϼ���. (1 ~ 3)");
				int col = Integer.parseInt(sc.nextLine()) - 1;
				if ((row >= 0 && row <= 2) && (col >= 0 && col <= 2)) {
					if (seats[row][col].isReserved()) {
						System.out.println("�̹� ����� �¼��Դϴ�.");
					} else {
						mySeat.setReserved(false);
						mySeat = seats[row][col];
						mySeat.setReserved(true);
						System.out.printf("�����Ͻ� �¼�, %d�� %d��° �¼����� ���� �Ϸ�Ǿ����ϴ�.\n", mySeat.getSeatRow(),
								mySeat.getSeatCol());
					}
				} else {
					throw new Exception();
				}
			} catch (Exception e) {
				System.out.println("�ùٸ� ���ڸ� �Է����ּ���.");
			}
		}
		/*
		 * (�� �ڸ� ����) "�¼� ���Ÿ� ���� ���ּ���"
		 * 
		 * (�� �ڸ� ����) ������ �ڸ� �����ϼ��� �ڸ� �� �Է� �ڸ� �� �Է� ���� �� �ڸ� ���� => ���� �� �ڸ� = ���Ӱ� ������ �ڸ�
		 */
	}

	private void menuUI() { // �޴� �׸�
		System.out.println("��ȭ ����");
		System.out.println();
		System.out.println("1. �¼� ����");
		System.out.println("2. �� �ڸ� Ȯ��");
		System.out.println("3. �� �ڸ� Ȯ��");
		System.out.println("4. �ڸ� ����");
		System.out.println("5. ����");
		System.out.println();
	}

	private int menuSelect() { // �޴����� �Է��� ��ȣ �޴� �Լ�
		int menu = 0;
		do {
			try {
				menuUI();
				menu = Integer.parseInt(sc.nextLine());
				if (menu >= 1 && menu <= 5) {
					break;
				} else {
					throw new Exception("�Է� �� ����");
				}
			} catch (Exception e) {
				System.out.println("1~5�� ���� �Է����ּ���.");
				System.out.println();
			}
		} while (true);
		return menu;
	}

	public void reservation() { // �����ϱ�
		Main: while (true) {
			switch (menuSelect()) {
			case 1:
				reserveSeat();
				System.out.println();
				break;
			case 2:
				mySeat();
				System.out.println();
				break;
			case 3:
				checkSeat();
				System.out.println();
				break;
			case 4:
				changeSeat();
				System.out.println();
				break;
			case 5:
				System.out.println("���Ÿ� �����մϴ�.");
				System.out.println();
				break Main;
			}
		}
	}
}

public class Movie {

	public static void main(String[] args) {
		// 1�� ����� ���Ÿ� ������
		// 2�� ����� ���Ÿ� ������
		// 1�� ����� �ٽ� ���� �ý����� �̿��ϴ� ��Ȳ

		Reservation r1 = new Reservation();
		r1.reservation();
		Reservation r2 = new Reservation();
		r2.reservation();
		r1.reservation();

//	private int[][] move;
//	private Scanner sc;
//	private static int su;
//
//	
//	//��ü �ּҰ��Ҵ��ϰ� 1~25���� �ִ� �� �޼ҵ�(�ʱ�ȭ)
//	Movie(){
//		sc = new Scanner(System.in);
//		move = new int[5][5];
//	}
//	
//	//��ü �ּҰ��Ҵ��ϰ� 1~25���� �ִ� �� �޼ҵ�(�ʱ�ȭ)
//	private void moveNum() {
//		for(int i=0; i<move.length; i++) {
//			for(int j=0; j<move[i].length; j++) {
//				
//				
//			}
//		}
//	}
//	
//	//�޴��� ����ϴ� �޼ҵ� 
//	private void moveMenu() {
//		System.out.println("***********");
//		System.out.println("1. �ڸ� �����ϱ�");
//		System.out.println("2. �ڸ� Ȯ���ϱ�");
//		System.out.println("3. ������");
//	}
//	
//	//��ȭ�� �ڸ� ���
//	private void movePrint(int[][] move) {
//		for (int i = 0; i < move.length; i++) {
//			for (int j = 0; j < move[i].length; j++) {
//				move[i][j] = j+1+i*5;
//				System.out.print(move[i][j] + "\t");
//			}
//			System.out.println();
//		}
//	}
//	
//	//����ڰ� ���ϴ� �ڸ��� �Է¹޴� �޼ҵ�(�ݺ�) 
//	public void moveInput(Scanner sc) {
//		int user = Integer.parseInt(sc.nextLine());
//	}
//	
//	
//	//����ڰ� �Է��� �ڸ��� ��������� ����, ������������� �ڸ��ֽ��ϴ� �ȳ�
//	
//	

	}

}
