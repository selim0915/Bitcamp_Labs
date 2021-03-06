package kr.or.bit;

import java.util.Scanner;

public class Movie2 {

	public static void main(String[] args) {
		Movie2 m = new Movie2();
		m.selectMovieMenu();
		//m.moviePrint();
	}

	private String[][] arr;
	private Scanner sc;
	private String movieSe;
	private boolean test;

	public Movie2() {
		this.arr = new String[6][12];
		this.sc = new Scanner(System.in);
	}

	private String showMenu() {
		System.out.println("*********************");
		System.out.println("1. 좌리 예매하기");
		System.out.println("2. 남은자리 확인");
		System.out.println("3. 프로그램 종료");
		System.out.println("*********************");
		System.out.print("원하는 메뉴 선택(1~3) : ");
		String selectnum = sc.nextLine();
		return selectnum;
	}

	public void selectMovieMenu() {
		movieSelect();
		// 메뉴 설정....
		escape: while (true) {
			switch (showMenu()) {
			case "1":
				moviePrint();
				movieReservation();
				break;
			case "2":
				moviePrint();
				break;
			case "3":
				System.out.println("프로그램 종료");
				break escape; // escape 지점으로 탈출..
			}
		}
	}

	public void movieSelect() {
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				temp++;
				arr[i][j] = String.valueOf(temp);
			}
		}
	}

	public void movieReservation() {

		Scanner sc = new Scanner(System.in);

		System.out.print("예매 좌석 개수를 선택하세요(ex. 3명이면 [3입력]) : ");

		int temp = Integer.parseInt(sc.nextLine());

		System.out.printf("[%d]명의 좌석을 예매합니다.\n", temp);
		System.out.print("좌석을 입력하세요(ex.11,12,13) : ");
		String temp2 = sc.nextLine();
		String[] temp3 = null;

		int myRow = 0;
		int myCol = 0;
		temp3 = temp2.split(",");
		/*
		 * for (int i = 0; i < temp3.length; i++) { for (int j = 0; j < temp3.length-1;
		 * j++) { if(Integer.parseInt(temp3[j]) > Integer.parseInt(temp3[j+1])) { String
		 * result=""; result = temp3[j]; temp3[j] = temp3[j+1]; temp3[j+1] = result; } }
		 * }
		 */
		for (int i = 0; i < temp3.length; i++) {
			myRow = (Integer.parseInt(temp3[i]) % arr[0].length == 0) ? Integer.parseInt(temp3[i]) / arr[0].length - 1
					: Integer.parseInt(temp3[i]) / arr[0].length;

			myCol = (Integer.parseInt(temp3[i]) % arr[0].length == 0) ? arr[0].length - 1
					: Integer.parseInt(temp3[i]) % arr[0].length - 1;

			if (arr[myRow][myCol].equals("X")) {
				System.out.printf("이미 예약된 좌석입니다.\n", temp3[i]);
				return;
			}
		}

		for (int i = 0; i < temp3.length; i++) {
			myRow = (Integer.parseInt(temp3[i]) % arr[0].length == 0) ? Integer.parseInt(temp3[i]) / arr[0].length - 1
					: Integer.parseInt(temp3[i]) / arr[0].length;

			myCol = (Integer.parseInt(temp3[i]) % arr[0].length == 0) ? arr[0].length - 1
					: Integer.parseInt(temp3[i]) % arr[0].length - 1;

			System.out.printf("[%s]번 좌석에 예약되었습니다.\n", arr[myRow][myCol]);
			arr[myRow][myCol] = "X";
		}

	}

	public void moviePrint() {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("[%2s]", arr[i][j]);
			}
			System.out.println();
		}
	}

}