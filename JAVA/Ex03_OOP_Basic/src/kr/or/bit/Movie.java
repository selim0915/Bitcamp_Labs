package kr.or.bit;


/*
* ��ȭ�� ���� �� �ݵ�� ��ȭ�� ���� �帣, ����̸�, �����̸�, �����⵵, ��ȭ������ ���� ��. => �ʵ����
* �帣, ����̸�, �����̸�, �����⵵, ��ȭ������ ������ �� ����. => setter����x
* ��ȭ�� �� ������ �ѹ��� ����� �� �ִ� ����� �־�� �Ѵ�. =>info�޼��� ����
* ��ȭ ������ ���� ������ ����� �� �ִ�. =>getter����o
*/

public class Movie {
	private String moviename;
	private String Genre;
	private String actor;
	private String director;
	private String date;
	
	public Movie(String moviename, String genre, String actor, String director, String date) {
		this.moviename = moviename;
		this.Genre = genre;
		this.actor = actor;
		this.director = director;
		this.date = date;
	}
	
	
	public String getMoviename() {
		return moviename;
	}
	public String getGenre() {
		return Genre;
	}
	public String getActor() {
		return actor;
	}
	public String getDirector() {
		return director;
	}
	public String getDate() {
		return date;
	}
	
	public void movieInfo() {
		System.out.println("����: " + moviename);
		System.out.println("�帣: " + Genre);
		System.out.println("����̸�: " + actor);
		System.out.println("�����̸�: " + director);
		System.out.println("������¥: " + date);
	}
	
}
