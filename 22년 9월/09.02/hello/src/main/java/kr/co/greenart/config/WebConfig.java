package kr.co.greenart.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
@ComponentScan("kr.co.greenart")
public class WebConfig implements WebMvcConfigurer {
	@Override
	// css, js, 그림파일,등... 정적자원 편하게 관리 가능
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		// 이건 사용자가 /resources/~~주소로 요청하면 resources폴더로 이동하게 함.
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/"); 
		
	}

	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		// requestmapping을 한 반환값을 통해 view 찾음. 
		// viewResolve에서 view 페이지들을 찾기 때문.
		registry.jsp("/WEB-INF/views/", ".jsp");
	}
}
