import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class DiaryManageImpl implements DiaryManage {
	private List<Diary> list;

	// 생성자
	public DiaryManageImpl() {
		list = new ArrayList<>();
	}

	@Override
	public void add(Diary d) {
		list.add(d);
	}

	@Override
	public List<Diary> list() { // getter와 같은 역할 (리턴타입 void 안 됨)
		return list;
	}

	@Override
	public void edit(LocalDate day, String content) {
		int index = list.indexOf(new Diary(day)); // 날짜만 가진 생성자 만들어줌.
		if (index >= 0) {
			Diary d = list.get(index);
			d.setContent(content);
		}
	}

	@Override
	public void deletFirst() {
		if (!list.isEmpty()) {
			list.remove(0);
		}
	}
	
	public void start() {
		System.out.println("시작");
	}

//	List<Diary> list = new LinkedList<>();
//	Scanner scan = new Scanner(System.in);
//	
//	// 일기 등록
//	public Diary input() {
//		System.out.println("날짜");
//		int date = scan.nextInt();
//		scan.nextLine();
//		System.out.println("제목");
//		String title = scan.nextLine();
//		System.out.println("날씨");
//		String weather = scan.nextLine();
//		System.out.println("내용");
//		String content = scan.nextLine();
//		
//		return new Diary(date, title, weather, content);
//	}
//	
//	public void register() {
//		while (true) {
//			Diary temp = input();
//			if (list.contains(temp)) {
//				System.out.println("중복된 날짜입니다. 다른 날짜를 선택해주세요.");
//				System.out.println("현재 등록된 일기: " + list.size());
//			} else {
//				list.add(temp);
//				System.out.println("현재 등록된 일기: " + list.size());
//			}
//			
//			System.out.println("그만 등록하시겠습니까? (0번 입력시 종료)");
//			int num = scan.nextInt();
//			if (num == 1) {
//				return;
//			}
//		}
//	}
//	
//	// 목록 보기 (날짜순)
//	public void sortDate() {
//		List<Diary> listDate = list;
//		Comparator<Diary> comparator = new Comparator<Diary>() {
//			@Override
//			public int compare(Diary o1, Diary o2) {
//				return o1.getDate() - o2.getDate();
//			}
//		};
//		Collections.sort(listDate, comparator);
//		System.out.println(listDate);
//	}
//	
//	// 목록보기 (내용길이순)
//	public void sortContent() {
//		List<Diary> listContent = list;
//		Comparator<Diary> comparator = new Comparator<Diary>() {
//			@Override
//			public int compare(Diary o1, Diary o2) {
//				return o1.getContent().length() - o2.getContent().length();
//			}
//		};
//		Collections.sort(listContent, comparator);
//		System.out.println(listContent);
//	}
//	
//	
//	// 일기 수정
//	public void setDairy() {
//		System.out.println("일기 목록(날짜)");
//		for (int i = 0; i < list.size(); i++) {
//			int date = list.get(i).getDate();
//			System.out.println((1 + i) + "번 : " + date);
//		}
//		
//		System.out.println("수정하실 날짜(번호)를 선택해주세요.");
//		int sel = scan.nextInt() - 1;
//		scan.nextLine();
//		
//		System.out.println("수정하실 내용을 입력해주세요.");
//		String content = scan.nextLine();
//		list.get(sel).setContent(content);
//	}
//	
//	// 일기 삭제
//	public void remove() {
//		list.remove(0);
//		System.out.println("현재 남은 일기수: " + (list.size() - 1));
//	}
//	
//	
//	public void start() {
//		System.out.println("일기 관리 프로그램입니다.");
//		while (true) {
//			System.out.println("===== 프로그램 목록 =====");
//			System.out.println("1.일기 등록, 2.목록보기(날짜순 / 내용길이순), 3.일기 수정, 4.일기 삭제, 5.프로그램 종료");
//			int sel = scan.nextInt();
//			
//			switch (sel) {
//			case 1:
//				register();
//				break;
//			case 2:
//				System.out.println("1.날짜순 보기, 2.내용 길이순 보기");
//				int num = scan.nextInt();
//				if (num == 1) {
//					sortDate();
//					break;
//				} else {
//					
//					break;
//				}
//			case 3:
//				break;
//			case 4:
//				break;
//			case 5:
//				System.out.println("프로그램 종료");
//				return;
//			}
//		}
//	}

}
