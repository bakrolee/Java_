// 3번
// 영화
// 제목, 평점, 감독, 발표된 연도
// 모든 값을 콘솔 출력하는 기능

public class Movie {
	String title;
	double score;
	String director;
	int year;
	
	void printMovie() {
		System.out.printf("제목: %s, 평점: %.02f, 감독: %s, 발표연도: %d", title, score, director, year);
	}
}