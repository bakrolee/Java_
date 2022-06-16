import java.util.Arrays;

class Member implements Comparable<Member> {
	String name;
	int height;
	int weight;
	
	public Member(String name, int height, int weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
//	public double compare(Member member) {
//		return height - member.height; //  (기준) 내 키가 크면 양수/ 내 키가 작으면 음수 / 키가 같으면 0
//	}
	
	@Override
	public int compareTo(Member o) {
		return this.height - o.height;
	}
}

public class Main {
	public static void main(String[] args) {
		Member[] members = { new Member("키큰놈", 190, 60), 
							new Member("키작은놈", 130, 30), new Member("중간쯔음", 176, 65) };
		
//		System.out.println(members[0].compareTo(members[1]));
		Arrays.sort(members);
		System.out.println(members[0].height);
		System.out.println(members[1].height);
		System.out.println(members[2].height);
		
		
	}
}
