package membership2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Membership {
	Scanner scan = new Scanner(System.in);

	Member[] members = new Member[10];
	int[] bmi = new int[6];

	public Membership(Member[] members) {
		this.members = members;
	}

	// 회원 정보 입력
	public Member inputMember() {
		System.out.println("회원 정보를 등록해주세요.");
		System.out.print("이름: ");
		String name = scan.nextLine();
		System.out.print("키: ");
		double height = scan.nextDouble();
		System.out.print("몸무게: ");
		double weight = scan.nextDouble();

		return new Member(name, height, weight);
	}

	// 중복방지
	public boolean antiOverlap(Member m, int i) {
		if (i > 0) {
			for (int j = 0; j < i; j++) {
				if (members[j].equals(m)) {
					return true;
				}
			} return false;
		} 
		return false;
	}

	// 회원 등록
	public Member[] registerMembership() {
		Member[] temp = new Member[1];
		for (int i = 0; i < 10; i++) {
			Member m = inputMember();
			// 중복 방지
			if (antiOverlap(m, i)) {
				i--;
				continue;
			}
			temp[i] = m;
			members = temp;
			System.out.printf("현재 등록된 회원: %d명\n", i + 1);
			// 최대 인원 제한
			if (i == 9) {
				break;
			}
			System.out.println("더 등록하시겠습니까?");
			System.out.println("1.회원 추가 등록하기  2.종료");
			int sel = scan.nextInt();
			scan.nextLine();
			if (sel == 2) {
				break;
			}
			
			temp = Arrays.copyOf(temp, temp.length + 1);
		}
		
		return members;
	}

	// BMI 등급 분류
	public int[] sortBMI() {
		int count0 = 0;
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		int count5 = 0;

		for (int i = 0; i < members.length; i++) {
			System.out.println("확인: " + members[i]);
			double figure = members[i].getBMI();

			if (figure >= 35) {
				count0++;
				bmi[0] = count0; // 고도비만
			} else if (figure >= 30) {
				count1++;
				bmi[1] = count1; // 중도비만
			} else if (figure >= 25) {
				count2++;
				bmi[2] = count2; // 경도비만
			} else if (figure >= 23) {
				count3++;
				bmi[3] = count3; // 과체중
			} else if (figure >= 18.5) {
				count4++;
				bmi[4] = count4; // 정상
			} else {
				count5++;
				bmi[5] = count5; // 저체중
			}
		}
		return bmi;
	}

	public void printTotalBMI() {
		sortBMI();
		for (int i = 0; i < bmi.length; i++) {
			switch (i) {
			case 0:
				System.out.printf("고도비만: %d명", bmi[0]);
				break;
			case 1:
				System.out.printf("중도비만: %d명", bmi[1]);
				break;
			case 2:
				System.out.printf("경도비만: %d명", bmi[2]);
				break;
			case 3:
				System.out.printf("과체중: %d명", bmi[3]);
				break;
			case 4:
				System.out.printf("정상: %d명", bmi[4]);
				break;
			case 5:
				System.out.printf("저체중: %d명", bmi[5]);
				break;
			}
			System.out.println();
		}
	}

	// 회원 전체 출력
	public void printMembership() {
		for (Member m : members) {
			m.printMember();
		}
	}

	// 키순 정렬 메소드
	public void sortHeight() {
		Arrays.sort(members);
		printMembership();
	}
	
	// 몸무게순 정렬 메소드
	public void sortWeight() {
		Arrays.sort(members, new SortWeight());
		printMembership();
	}
	
	// 이름순 정렬 메소드
//	class NameComparator implements Comparator<Member> {
//		@Override
//		public int compare(Member o1, Member o2) {
//			return o1.getName().compareTo(o2.getName());
//		}
//		
//		public void sortName() {
//			Arrays.sort(members, new NameComparator());
//			printMembership();
//		}
//	}
	
	Comparator<Member> nameCom = new Comparator<Member>() {
		@Override
		public int compare(Member o1, Member o2) {
			return o1.getName().compareTo(o2.getName());
		}
		
		public void sortName() {
			Arrays.sort(members, nameCom);
			printMembership();
		}
	};
	
	
}




