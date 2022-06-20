import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main10 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("사과", "포도", "오렌지", "배", "수박", "딸기"));
		
		// 콘솔 입출력
		// 과일 목록 보여주기
		// 고객에게 과일 주기 (제일 앞에거부터 줌)
		// 재고 과일 추가하기 (제일 마지막에 추가, 최대 진열장 10개까지)
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("과일 가게");
			System.out.println("1.과일목록, 2.과일 주기, 3.과일 추가, 4.프로그램 종료");
			int sel = scan.nextInt();
			
			switch (sel) {
				case 1:
					System.out.println("===== 과일 목록 =====");
					System.out.println(list);
					break;
				case 2:
					if (list.isEmpty()) {
						System.out.println("남은 과일이 없습니다.");
						break;
					}
					list.remove(0);
					System.out.println("===== 남은 과일 목록 =====");
					System.out.println(list);
					break;
				case 3:
					if (list.size() >= 10) {
						System.out.println("진열장이 꽉 찼습니다.");
						break;
					}
					System.out.println("추가할 과일? ");
					scan.nextLine();
					String add = scan.nextLine();
					list.add(add);
					break;
				case 4:
					return;
			}
		}
	}
}
