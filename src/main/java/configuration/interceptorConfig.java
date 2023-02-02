
package configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import interceptor.GeneralInterceptor;


@Configuration
public class interceptorConfig  implements WebMvcConfigurer {

	@Autowired
	private GeneralInterceptor generalInterceptor;
	@Override
	public void addInterceptors(InterceptorRegistry registry) {

	      registry.addInterceptor(generalInterceptor).addPathPatterns("/student/**");
	      registry.addInterceptor(generalInterceptor).addPathPatterns("/course/**");
	      registry.addInterceptor(generalInterceptor).addPathPatterns("/**");
	      
	   }
}
