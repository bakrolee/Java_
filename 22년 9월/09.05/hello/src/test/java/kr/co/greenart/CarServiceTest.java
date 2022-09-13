package kr.co.greenart;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import kr.co.greenart.config.RootConfig;
import kr.co.greenart.model.car.Car;
import kr.co.greenart.model.car.CarService;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = RootConfig.class)
@Transactional
// @TransactionConfigurationRollback(Spring 4버전 이하에서)
public class CarServiceTest {
	@Autowired
	private CarService service;
	
	@Test(expected = DataAccessException.class)
	public void bulkInsert() {
		List<Car> list = Arrays.asList(new Car(0, "AAA", 100)
				, new Car(0, "BBB", 100)
				, new Car(0, "AAA", 100)
				, new Car(0, "CCC", 100));
		
		int[] result = service.bulkInsert(list);
		assertNull(result);
	}
	
	@Test
	@Rollback(value = true) // 무조건 롤백함.
	public void delete() {
		int result = service.delete(2);
		
		assertEquals(1, result);
	}
}
