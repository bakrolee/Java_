import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RestaurantConsoleApp {
	private RestaurantAccess acc;

	public RestaurantConsoleApp(RestaurantAccess acc) {
		this.acc = acc;
	}

	public void menu() {
		System.out.println("1.추가, 2.목록, 3.삭제, 4.수정, 5.검색(제목)");
		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();
		switch (num) {
		case 1:
			add();
			break;
		case 2:
			list();
			break;
		case 3:
			delete();
			break;
		case 4:
			update();
			break;
		case 5:
			search();
			break;
		default:
			break;
		}
	}

	private void add() {
		try {
			int result = acc.someAdd(makeList());
			System.out.println(result + "개 음식점이 추가되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 여러 음식점 만들기
	public List<Restaurant> makeList() {
		List<Restaurant> list = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		System.out.println("몇 개 추가?");
		int num = scan.nextInt();
		scan.nextLine();
		for (int i = 0; i < num; i++) {
			System.out.print("상호명: ");
			String name = scan.nextLine();
			System.out.print("전화번호: ");
			String phoneNumber = scan.nextLine();
			System.out.print("주소: ");
			String address = scan.nextLine();
			list.add(new Restaurant(name, phoneNumber, address));
		}
		return list;
	}

	private void list() {
		try {
			List<Restaurant> list = acc.list();
			for (Restaurant r : list) {
				System.out.println(r);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void delete() {
		Scanner scan = new Scanner(System.in);
		list();
		System.out.println("삭제할 번호?");
		int sel = scan.nextInt();
		try {
			int result = acc.delete(sel);
			System.out.println("삭제된 행 개수: " + result);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void update() {
		Scanner scan = new Scanner(System.in);
		list();
		System.out.print("수정할 번호?");
		int id = scan.nextInt();
		scan.nextLine();
		System.out.print("상호명: ");
		String name = scan.nextLine();
		System.out.print("전화번호: ");
		String phoneNumber = scan.nextLine();
		System.out.print("주소: ");
		String address = scan.nextLine();

		try {
			int result = acc.update(new Restaurant(id, name, phoneNumber, address));
			System.out.println("수정된 행 개수: " + result);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	private void search() {
		Scanner scan = new Scanner(System.in);
		list();
		System.out.print("검색할 번호?");
		int id = scan.nextInt();

		try {
			Restaurant rest = acc.search(id);
			System.out.println(rest);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		RestaurantConsoleApp app = new RestaurantConsoleApp(new RestaurantAccess());
		app.menu();
	}
}
