import java.time.LocalDate;

public class TestManage {
	public static void main(String[] args) {
		DiaryManage m = new DiaryManageImpl();
		
		m.add(new Diary(LocalDate.now(), "6월 21일 일기", "맑음", "적을 말이 없네"));
		m.add(new Diary(LocalDate.of(2022, 6, 20), "6월 20일 일기", "맑음", "내용 222"));
		m.add(new Diary(LocalDate.of(2022, 6, 19), "6월 20일 일기", "흐림", "내용 222"));
		
		System.out.println(m.list());
		
		m.edit(LocalDate.now(), "수정된 내용");
		
		System.out.println(m.list().get(0).getContent());
		
		m.deletFirst();
		
		System.out.println(m.list().size());
		
		DiaryManageImpl m2 = (DiaryManageImpl) m;
		m2.start();
		System.out.println(m2.list());
	}
}
