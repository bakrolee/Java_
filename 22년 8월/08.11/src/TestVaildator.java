import hr.PersonValidator;

public class TestVaildator {
	public static void main(String[] args) {
		PersonValidator pv = new PersonValidator();
		pv.isValidName("asd한국어");
		pv.isValidName("만둘 둘댜");
//		pv.isValidAge("3332439842");
//		pv.isValidEmail("aasdf234@123b.com");
	}
}
