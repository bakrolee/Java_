public class CupNoodle {
	private String production;
	private String name;
	private int price;

	public CupNoodle(String company, String name, int price) {
		this.production = company;
		this.name = name;
		this.price = price;
	}

	public String getCompany() {
		return production;
	}

	public void setCompany(String company) {
		this.production = company;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "CupNoodle [production=" + production + ", name=" + name + ", price=" + price + "]";
	}
	
	public void printNoodle() {
		System.out.println(this.toString());
	}

	@Override
	public int hashCode() {		// 객체를 나타낼 수 있는 숫자표현 (16진수)
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((production == null) ? 0 : production.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {				//  자기자신과 참조 같은지 검사
			return true;
		}
		if (!(obj instanceof CupNoodle)) {
			return false;
		}
		CupNoodle other = (CupNoodle) obj;
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (production == null) {
			if (other.production != null) {
				return false;
			}
		} else if (!production.equals(other.production)) {
			return false;
		}
		return true;
	}

	

//	@Override
//	public boolean equals(Object o) {
//		if (o instanceof CupNoodle) {
//			CupNoodle otherCupNoodle = (CupNoodle) o;
//			return production.equals(otherCupNoodle.production) && name.equals(otherCupNoodle.name);
//		} else {
//			return false;
//		}
//	}
	

	
}



