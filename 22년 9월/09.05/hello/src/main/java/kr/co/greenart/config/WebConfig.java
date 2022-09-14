package kr.co.greenart.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import kr.co.greenart.controller.MyInterceptor;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"kr.co.greenart"})
public class WebConfig implements WebMvcConfigurer {
	@Autowired
	private MyInterceptor interceptor;
	
	@Bean
	public MultipartResolver multipartResolver() {
		CommonsMultipartResolver resolver = new CommonsMultipartResolver();
		resolver.setDefaultEncoding("UTF-8");
		return resolver;
	}
	
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

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(interceptor).addPathPatterns("/my/**");
	}
	
	
}
