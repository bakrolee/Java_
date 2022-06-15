package membership2;

public class Member implements Comparable<Member> {
	private String name;
	private double height;  // 단위 (m)
	private double weight;  // 단위 (kg)
	
	public Member(String name, double height, double weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	// 회원 출력
	public void printMember() {
		System.out.println("이름: " + name + ", 키: " + height + ", 몸무게: " + weight);
	}

	// BMI 구하기
	public double getBMI() {
		return weight / (height * height);
	}

	// 중복 방지
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Member)) {
			return false;
		}
		Member other = (Member) obj;
		if (Double.doubleToLongBits(height) != Double.doubleToLongBits(other.height)) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (Double.doubleToLongBits(weight) != Double.doubleToLongBits(other.weight)) {
			return false;
		}
		return true;
	}
	
	// 키 순으로 비교
	@Override
	public int compareTo(Member o) {
		if (height > o.height) {
			return 1;
		} else if (height < o.height) {
			return -1;
		} else {
			return 0;
		}
	}
}







