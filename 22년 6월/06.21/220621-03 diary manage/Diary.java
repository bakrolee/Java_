import java.time.LocalDate;
import java.util.Collections;
import java.util.Comparator;

public class Diary implements Comparable<Diary> {
	private LocalDate day;
//	private int date;
	private String title;
	private String weather;
	private String content;
	
	public Diary(LocalDate day) {
		super();
		this.day = day;
	}
	
	public Diary(LocalDate day, String title, String weather, String content) {
		super();
		this.day = day;
		this.title = title;
		this.weather = weather;
		this.content = content;
	}

	public LocalDate getDay() {
		return day;
	}

	public void setDay(LocalDate day) {
		this.day = day;
	}

//	public Diary(int date, String title, String weather, String content) {
//		super();
//		this.date = date;
//		this.title = title;
//		this.weather = weather;
//		this.content = content;
//	}
//
//	public int getDate() {
//		return date;
//	}
//
//	public void setDate(int date) {
//		this.date = date;
//	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWeather() {
		return weather;
	}

	public void setWeather(String weather) {
		this.weather = weather;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "일기 [날짜=" + day + ", 제목=" + title + ", 날씨=" + weather + "]\n";
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Diary))
			return false;
		Diary other = (Diary) obj;
		if (day == null) {
			if (other.day != null)
				return false;
		} else if (!day.equals(other.day))
			return false;
		return true;
	}

	@Override
	public int compareTo(Diary o) {
		return day.compareTo(o.day);  // LocalDate에서도 compareTo가 재정의 되어있음.
	}

//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (!(obj instanceof Diary))
//			return false;
//		Diary other = (Diary) obj;
//		if (date != other.date)
//			return false;
//		return true;
//	}
	

}
