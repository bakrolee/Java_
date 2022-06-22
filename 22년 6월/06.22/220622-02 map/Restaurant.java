import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Restaurant {
	private Map<String, Integer> menu = new LinkedHashMap<>();
	private Map<String, Integer> order = new HashMap<>();
	private int sum = 0;

	public void nowMenu() {
		menu.put("짜장면", 2500);
		menu.put("짬뽕", 4000);
		menu.put("볶음밥", 4000);
	}

	public void printMenu() {
		Iterator<String> iter = menu.keySet().iterator();
		int i = 1;
		while (iter.hasNext()) {
			String key = iter.next();
			Integer value = menu.get(key);
			System.out.println(i + ". " + key + ":" + value + "원");
			i++;
		}
	}

	public void addMenu() {
		Scanner scan = new Scanner(System.in);
		System.out.print("추가할 메뉴 이름? ");
		String name = scan.nextLine();
		System.out.print("가격? ");
		Integer price = scan.nextInt();
		menu.put(name, price);
	}
	
	public Map<String, Integer> countMenu(String input) {
//		Map<String, Integer> order = new HashMap<>();
		Integer count = order.get(input);
		if (count == null) {
			order.put(input, 1);
		} else {
			order.put(input, count + 1);
		}
		return order;
	}

	public void order() {
		Scanner scan = new Scanner(System.in);
		printMenu();
		while (true) {
			System.out.printf("주문할 메뉴 이름을 입력해주세요. (주문 종료하려면 0 입력)");
			String input = scan.nextLine();
			if (input.equals("0")) {
				break;
			} else if (menu.containsKey(input)) {
				countMenu(input);
				sum += menu.get(input);
			} else {
				System.out.println("없는 메뉴입니다. 다시 입력해주세요.");
			}
		}
		System.out.println(order);
	}

	public void pay() {
		System.out.println("계산할 총 금액: " + sum);
	}
	
	public void start() {
		nowMenu();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("중국집 프로그램입니다.");
		
		while (true) {
			System.out.println("===== 목록 =====");
			System.out.println("1.메뉴보기, 2.메뉴추가, 3.주문하기, 4.계산하기, 0.프로그램 종료");
			int sel = scan.nextInt();
			switch (sel) {
			case 1:
				printMenu();
				break;
			case 2:
				addMenu();
				break;
			case 3:
				order();
				break;
			case 4:
				pay();
				break;
			case 0:
				System.out.println("프로그램 종료합니다.");
				return;
			}
		}
	}

}
