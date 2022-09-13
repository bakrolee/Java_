package kr.co.greenart.config;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@PropertySource(value = "classpath:kr/co/greenart/config/mysql.properties")
//@ComponentScan("kr.co.greenart.model.car")
@EnableTransactionManagement
public class RootConfig {
	@Value("${jdbc.drivername}")
	private String drivername;
	@Value("${jdbc.url}")
	private String url;
	@Value("${jdbc.username}")
	private String username;
	@Value("${jdbc.password}")
	private String password;
	
	// 메소드로 Bean 등록하는 것이 무엇인가? (원리)
//	private Map<String, Object> map = new HashMap<>();
//	
//	public RootConfig() {
//		map.put("db", dataSource());
//		map.put("jdbc", jdbcTemplate((DataSource) map.get("db")));
//	}
	
	@Bean
	public DataSource dataSource() {
		BasicDataSource ds = new BasicDataSource();
		ds.setDriverClassName(drivername);
		ds.setUrl(url);
		ds.setUsername(username);
		ds.setPassword(password);
		
		return ds;
	}
	
	@Bean
	@Autowired	// 메소드 위에 작성시, 필요한 의존성을 주입해 줌. 
	public JdbcTemplate jdbcTemplate(DataSource ds) { // 빈이 필요할 경우, 파라미터에 적어도 그 객체를 찾아서 넣어줌.
		return new JdbcTemplate(ds);
	}
	
	@Bean // 트랜젝션 매니저
	@Autowired
	public PlatformTransactionManager txManager(DataSource ds) {
		return new DataSourceTransactionManager(ds);
	}
	
	@Bean
	@Autowired
	public NamedParameterJdbcTemplate namedParameterJdbcTemplate(DataSource ds) {
		return new NamedParameterJdbcTemplate(ds);
	}
}


















