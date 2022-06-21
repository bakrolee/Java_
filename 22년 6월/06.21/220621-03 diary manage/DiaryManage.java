import java.time.LocalDate;
import java.util.List;

public interface DiaryManage {
	// (일기를) 등록하기
	void add(Diary d);
	
	//목록보기
	List<Diary> list();
	
	//수정하기 - 일기 하나의 날짜를 선택해서, 내용을 수정할 것. 
	void edit(LocalDate day, String content);
	
	//삭제하기
	void deletFirst();
}
