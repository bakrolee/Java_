import java.util.Scanner;

public class TestManage {
	public static void main(String[] args) {
		BookManager bm = new BookManager();
		
		System.out.println("도서관리자 프로그램입니다.");
		while(true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("기능선택. 1.도서추가, 2.전체목록, 3.검색, 4.삭제, 5.수정, 0.종료");
			int sel = scan.nextInt();
			switch (sel) {
			case 1:
				bm.addBook();
				break;
			case 2:
				bm.printBooks();
				break;
			case 3:
				bm.searchBook();
				break;
			case 4:
				bm.removeBook();
				break;
			case 5:
				bm.editBook();
				break;
			case 0:
				System.out.println("프로그램 종료");
				return;
			}
		}
	}
}
