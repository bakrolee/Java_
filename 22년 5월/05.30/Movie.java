public class Movie {
	String title;
	double score;
	String director;
	int publishYear;
	
	public Movie(String t	// 생성자 - 리턴타입 없음, 클래스랑 똑같이 생김
					, double s
					, String d
					, int p) { 
		// 필드 초기화
		title = t;
		score = s;
		director = d;
		publishYear = p;
	}
	
	void pritnAll() {
		System.out.println("제목: " + title);
		System.out.println("평점: " + score);
		System.out.println("감독: " + director);
		System.out.println("발표년도: " + publishYear);
	}
}
	