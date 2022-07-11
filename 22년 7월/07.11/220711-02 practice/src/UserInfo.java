import java.io.Serializable;

public class UserInfo implements Serializable{
	private int number;
	private String name;
	private String phone;
	private String email;
	
	public UserInfo(int number, String name, String phone, String email) {
		super();
		this.number = number;
		this.name = name;
		this.phone = phone;
		this.email = email;
	}
	
	
	
	@Override
	public String toString() {
		return "UserInfo [number=" + number + ", name=" + name + ", phone=" + phone + ", email=" + email + "]";
	}

	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
