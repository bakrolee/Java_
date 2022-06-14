// 회원 관리 프로그램
// 회원을 콘솔입력으로 등록할 수 있게. 최대 10명.
// 중복 등록이 되면 안 됨. (기준 = '이름  and 키 and 몸무게'가 동일하면 중복)
// bmi기준에 따라 집계를 해서 목록을 보여주기

// 회원 = 이름, 키, 몸무게

// BMI 지수
// BMI 공식 = 몸무게(kg) / 키^2(m)

// 회원에 대해 bmi지수를 보여주면서
// 고도 비만 : 35 이상
// 중(重)도 비만 (2단계 비만) : 30 - 35 미만
// 경도 비만 (1단계 비만) : 25 - 30 미만
// 과체중 : 23 - 25 
// 정상 : 18.5 - 23 미만
// 저체중 : 18.5 미만

public class Main {
	public static void main(String[] args) {
		MembershipManage m = new MembershipManage();
		m.Start();
	}
}
