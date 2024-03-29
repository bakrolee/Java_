package kr.co.greenart;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;
import java.util.Random;

import javax.swing.Spring;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import kr.co.greenart.model.car.Car;
import kr.co.greenart.model.car.CarRepository;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {kr.co.greenart.config.RootConfig.class})
public class CarRepoTest {
	@Autowired
	private CarRepository repository;
	
	@Test
	public void initTest() {
		assertNotNull(repository);
	}
	
	@BeforeClass
	public static void addTestData() {
		// 테스트 클래스 수행 전에 실행됨. // static 선언
		// 해당 클래스가 생성되기 전 제일 먼저 1번 실행되게 함.
	}
	
	@Test
	public void create() {
		Random r = new Random();
		Car car = new Car();
		car.setModel("새 모델" + r.nextInt(10000));
		car.setPrice(1000);
		
		int result = repository.add(car);
		assertEquals(1, result);
	}
	
	@Test
	public void read() {
		List<Car> list = repository.getAll();
		
		assertNotNull(list);
	}
	
	@Test
	public void update() {
		int result = repository.update(new Car(1, "변경", 300));
		
		assertEquals(1, result);
	}
}






