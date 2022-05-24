public class LoopBreak {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				break;  // 반복 종료
			}
			System.out.println(i);
		}
		System.out.println("프로그램 종료");
		
		for (int i = 10; i < 20; i++) {
			if (i % 10 == 5) {
				continue;  // 현재 단계를 건너띄게 됨 (다시 위로 돌아가서 진행)
			}
			System.out.println(i);
		}
		System.out.println("프로그램 종료");
		
		
		int i = 20;
		while (i < 30) {
			if (i == 25) {
				continue;	// 만나는 순간 i < 30 조건식으로 올라감 -> 검토 (무한루프) : 24에서 멈춤.
			}
			System.out.println(i);
			i++;	//  i++로 못 도달하므로 for과 결과 다름.
		}
		
		System.out.println("프로그램 종료");
	}
}