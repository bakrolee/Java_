import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintPhone {
	public static void main(String[] args) {
		ObjectOutputStream oos = null;
//		ObjectInputStream ois = null;
		PrintWriter pw = null;
		
		File file = new File("d:\\filetest\\practice\\userInfo.dat");
		File file2 = new File("d:\\filetest\\practice\\userPhone.txt");
		
		List<UserInfo> list = new ArrayList<>();
		
		try {
			oos = new ObjectOutputStream(new FileOutputStream(file));
			
			Scanner scan = new Scanner(System.in);
			int num = 1;
			while (num != 0) {
				System.out.println("사용자 정보 입력");
				System.out.print("번호 : ");
				int number = scan.nextInt();
				scan.nextLine();
				System.out.print("이름 : ");
				String name = scan.nextLine();
				System.out.print("폰번호 : ");
				String phone = scan.nextLine();
				System.out.print("이메일 : ");
				String email = scan.nextLine();
				UserInfo info = new UserInfo(number, name, phone, email);
				list.add(info);
				oos.writeObject(info);
				
				System.out.println("더 정보 입력하시겠습니까? (0 누르면 종료)");
				num = scan.nextInt();
			}
			oos.flush();
			
			System.out.println("사용자 번호를 입력");
			System.out.print("번호 : ");
			int number = scan.nextInt();
			scan.nextLine();
			
			String phone = "";
			
			for (int i = 0; i < list.size(); i++) {
				if (number == list.get(i).getNumber()) {
					phone = list.get(i).getPhone();
				}
			}
			pw = new PrintWriter(file2);
			pw.println(phone);
			
			pw.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (oos != null) {
				try {
					oos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (pw != null) {
				pw.close();
			}
		}
		
	}
}
