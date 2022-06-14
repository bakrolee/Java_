import java.util.Scanner;

public class MembershipManage {
	Member[] members = new Member[10];
	Membership ms = new Membership(members);

	public void Start() {
		Scanner scan = new Scanner(System.in);

		System.out.println("회원 관리 프로그램입니다.");
		
		while(true) {
			System.out.println("목록을 선택해주세요.");
			System.out.println("1.회원등록, 2.BMI통계 확인, 3.프로그램 종료");
			int sel = scan.nextInt();
			
			switch (sel) {
				case 1:
					ms.registerMembership();
					System.out.println();
					continue;
				case 2:
					ms.printTotalBMI();
					System.out.println();
					continue;
				case 3:
					System.out.println("프로그램을 종료합니다.");
					return;
			}
		}
	}
}
