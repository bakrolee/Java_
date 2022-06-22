import java.util.HashMap;

public class Main {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("일", 1);
		map.put("이", 2);
		map.put("삼", 3);
		map.put("사", 4);
		
		System.out.println(map.size());
		
		System.out.println(map.get("일"));
		System.out.println(map.get("이"));
		System.out.println(map.get("오"));
		
		if (!map.containsKey("이")) {
			map.put("이", 2222);
		}
		System.out.println(map.get("이"));  // 중복된 값 입력시, 새로 입력한 값으로 덮어씌워진다.
	}
}
