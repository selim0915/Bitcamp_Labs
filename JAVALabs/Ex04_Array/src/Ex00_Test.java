
public class Ex00_Test {
	public static void main(String[] args) {

		int[][] move = new int[5][5];
		System.out.println(move[0][0]);
		System.out.println(move[2][1]);

		move[0][0] = 100;
		move[0][1] = 200;
		move[1][0] = 300;
		move[1][1] = 400;
		move[2][0] = 500;
		move[2][1] = 600;

		System.out.println(move.length); // length�� ���� ���̸� �˷��ش�.
		System.out.println(move[0].length); 
		
		
		//���
		// i==0 if(i==0) 
		for (int i = 0; i < move.length; i++) {
			for (int j = 0; j < move[i].length; j++) {
				move[i][j] = j+1+i*5;
				System.out.print(move[i][j] + "\t");
			}
			System.out.println();
			
		}
		
	}
}
